# Lab 1.12-1.14 — Objects, Constructors, and Instance Methods

Seven short methods in `ObjectLab.java`. The instructions for each one are in
the comment block directly above the method, so read them there — this page is
just the map.

Plan on 30 to 45 minutes.

## What you will practice

- Telling a class, the blueprint, from an object, one instance of it.
- Writing an object creation statement and naming its four parts:
  `Rectangle big = new Rectangle(3, 4);`
- Picking the right constructor out of two overloaded signatures.
- Calling instance methods with the dot operator, and telling a `void` one
  that changes an object from a value-returning one that reports on it.
- Seeing that a constructor call interrupts the statements around it.
- Knowing what a reference variable actually stores, which is why `b = a`
  makes a second name and not a second object.
- Knowing what `null` is, and what calling a method on it does.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/ObjectLab.java`. That is the only file you change.
1. Read the three small classes at the top — `Rectangle`, `Counter` and
   `Timer`. They are your blueprints, and you do not change them.
1. Work down the file. Each part is marked with a comment that starts with
   `TODO`; replace the placeholder line under it with your own code.

To run your program and see your output:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## The parts

| Part | Method | What it is about |
| --- | --- | --- |
| 1 | `rectangleArea(int, int)` | `new`, and the dot operator |
| 2 | `bothAreas(int, int)` | two overloaded constructors |
| 3 | `countAfterAdding(int, int)` | a `void` method that changes an object |
| 4 | `announceBuild(int)` | a constructor interrupts the statements |
| 5 | `aliasTotal(int, int)` | two names, one object |
| 6 | `compareTwoWays(String, String)` | `==` versus `.equals` |
| 7 | `nullReport(String, String)` | `null` means no object at all |

## Before you turn it in

- [ ] Every `TODO` comment has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors.
- [ ] Every object you use was built with `new`. Count the `new` calls in a
      part and you have counted its objects.
- [ ] Part 4 prints exactly three lines and you wrote only two of them. If
      `building` is missing, you never built the `Timer`.
- [ ] Part 5 uses `new` exactly twice. If it appears three times, step 2 built
      an object instead of making a second name.
- [ ] Parts 6 and 7 return lowercase `"true"` and `"false"` joined by one
      space, with nothing before or after.
- [ ] You did not change `Rectangle`, `Counter` or `Timer`.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.
- [ ] You may change `main` however you like. It is not graded.

## Optional extension, not graded

Add this to `main` and run it:

```java
String missing = null;
System.out.println("about to ask how long it is");
System.out.println(missing.length());
System.out.println("this line never runs");
```

It compiles cleanly, so this is not a syntax error. Write down the complete
output — everything that really printed before the program stopped — then name
the error exactly and say the moment it happened.
