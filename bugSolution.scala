```scala
import scala.util.Try

case class User(id: Int, name: String, age: Int)

val users = List(User(1, "John Doe", 30), User(2, "Jane Doe", 25))

val result = users.map { user =>
  if (user.id -1 == 0) 0 // Handle the division by zero case
  else user.age / (user.id - 1) 
}

println(result) // Output: List(0, 25)
```