```scala
import scala.util.Try

case class User(id: Int, name: String, age: Int)

val users = List(User(1, "John Doe", 30), User(2, "Jane Doe", 25))

val result = users.map { user =>
  Try(user.age / (user.id - 1))
    .toOption
    .getOrElse(0) // Handle potential division by zero
}

println(result) // Output: List(0, 25)
```