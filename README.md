Mu
==

A small expression parser, using ANTLR 4. It supports most basic operators
and `for`-, `while`- and `log`- (print) statements. It is just a basic
demonstration of how to use the `-visitor` functionality of ANTLR 4.

Getting Started:
----------------

1. Install ANTLR v4 ([manual](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4))
1. git clone git://github.com/franzolin/Mu.git
1. Generate ANTLR files `antlr4 Mu.g4 -no-listener -visitor -o app`
1. Copy visitor implementation `cp *.java app`
1. Compile `javac app/*.java`
1. `cd app && java Run`

Script and Result:
------------------

To run [the demo script](https://github.com/franzolin/Mu/test.mu):

```
n = 9;

while n > 0 {

  # expressions can be surrounded by parenthesis, of course
  if (n % 2 == 0) {
    log n + " -> even";
  }
  else {
    log n + " -> odd";
  }

  n = n - 1;
}
```

which will print the following to your console:

```
9.0 -> odd
8.0 -> even
7.0 -> odd
6.0 -> even
5.0 -> odd
4.0 -> even
3.0 -> odd
2.0 -> even
1.0 -> odd
```

Also see [this stackoverflow Q&A](http://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners).

Note
----
I needed just use a java, because this create this fork. Inspire in this [project](https://github.com/shmatov/antlr4-calculator)
