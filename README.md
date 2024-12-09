# Scala: Potential Division by Zero in User Data Processing

This repository demonstrates a potential division by zero error in a Scala program that processes user data. The program calculates age divided by (id -1). When id equals 1, the calculation results in a division by zero.

The initial code uses `Try` and `toOption` to handle the exception, but this might not be the most effective solution in all scenarios.  The program demonstrates the improved code which handles zero values in the more efficient way.

## Bug Description
The bug lies in the calculation `user.age / (user.id - 1)`. If a user's `id` is 1, this will result in a `java.lang.ArithmeticException: / by zero`.  The `Try` approach catches this, but returns a default value which may not always be desirable. This may lead to unexpected results and should be more gracefully addressed.

## Solution
The solution provides a more robust way to handle the potential division by zero, by adding a check before the calculation, or using a different function that handles it gracefully.