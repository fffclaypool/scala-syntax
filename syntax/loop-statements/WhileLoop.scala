/* while Loop
Repeats a statement or group of statements while a given condition is true.
It tests the condition before executing the loop body. A while loop statement
repeatedly executes a target statement as long as a given condition is true.
The following is a syntax for while loop.

  while(condition){
    statement(s);
  }

Here, statement(s) may be a single statement or a block of statements. The
condition may be any expression, and true is any nonzero value. The loop
iterates while the condition is true. When the condition becomes false,program
control passes to the line immediately following the loop. Key point of the
while loop is that the loop might not ever run. When the condition is tested
and the result is false, the loop body will be skipped and the first statement
after the while loop will be executed.
 */

/* do-while Loop
Unlike while loop, which tests the loop condition at the top of the loop, the
do-while loop checks its condition at the bottom of the loop. A do-while loop
is similar to a while loop, except that a do-while loop is guaranteed to execute
at least one time. The following is the syntax for do-while loop.

  do {
    statement(s);
  } while( condition );

Notice that the conditional expression appears at the end of the loop, so the
statement(s) in the loop execute once before the condition is tested. If the
condition is true, the flow of control jumps back up to do, and the statement(s)
in the loop execute again. This process repeats until the given condition becomes
false.
 */

// Try the following example program to understand loop control statements
// (while statement) in Scala Programming Language.
object Demo {
  def main(args: Array[String]) = {
    var a = 10;
    var b = 10;

    // println a
    while (a < 20) {
      println("Value of a:" + a);
      a = a + 1;
    }

    println("")

    // println b
    do {
      println("Value of b:" + b);
      b = b + 1;
    } while (b < 20)
  }
}

/* Output
Value of a:10
Value of a:11
Value of a:12
Value of a:13
Value of a:14
Value of a:15
Value of a:16
Value of a:17
Value of a:18
Value of a:19
Value of b:10
Value of b:11
Value of b:12
Value of b:13
Value of b:14
Value of b:15
Value of b:16
Value of b:17
Value of b:18
Value of b:19
 */
