/**
 * AP CSA Lab 1.12-1.14 - Objects, Constructors, and Instance Methods
 *
 * Fill in the body of each method in ObjectLab below. Do not rename anything,
 * do not change the parameter lists, and do not change the return types. The
 * grader compiles against these exact signatures.
 *
 * The three small classes at the top of this file -- Rectangle, Counter and
 * Timer -- are the blueprints you will build objects from. Read them, but do
 * not change them. They are the same three classes from your notes.
 *
 * Run the program with:  mvn -q compile exec:java
 * Or from your IDE, just run main.
 */

// =====================================================================
// THE BLUEPRINTS -- read these, do not change them
//
// A CLASS is the formal implementation, the blueprint: it lists the
// attributes every object of that type will carry and the behaviors every
// object will be able to perform. The class itself holds no data for any one
// thing. An OBJECT is one specific instance of a class, with its own values.
// =====================================================================

/**
 * A rectangle with a width and a height.
 *
 * Two CONSTRUCTORS, so this class's constructors are OVERLOADED. A
 * constructor has the same name as its class and no return type at all --
 * not int, not void, nothing.
 *
 *     Rectangle()            builds a 1 by 1 rectangle
 *     Rectangle(int, int)    builds one with the width and height you pass
 */
class Rectangle
{
    private int width;
    private int height;

    public Rectangle()
    {
        width = 1;
        height = 1;
    }

    public Rectangle(int w, int h)
    {
        width = w;
        height = h;
    }

    /** An INSTANCE METHOD: it runs on one object and uses that object's data. */
    public int area()
    {
        return width * height;
    }
}

/**
 * A running count.
 *
 *     Counter(int start)     builds a counter that starts at start
 *     addPoints(int p)       a void instance method: it CHANGES the count
 *     getCount()             a value-returning instance method: it REPORTS it
 */
class Counter
{
    private int count;

    public Counter(int start)
    {
        count = start;
    }

    public void addPoints(int p)
    {
        count = count + p;
    }

    public int getCount()
    {
        return count;
    }
}

/**
 * A timer whose constructor prints as it runs, so you can see exactly when
 * the constructor's statements execute.
 */
class Timer
{
    public Timer(int s)
    {
        System.out.println("building " + s);
    }
}

// =====================================================================
// YOUR WORK STARTS HERE
// =====================================================================

public class ObjectLab
{
    // ---------------------------------------------------------------
    // PART 1: the four parts of an object creation statement
    //
    // Return the area of a rectangle that is width by height.
    //
    // You cannot call area() until an object exists, so build one first. Every
    // object creation statement has the same four parts:
    //
    //     Rectangle  big  =  new  Rectangle(3, 4);
    //     ---------  ---     ---  ---------------
    //         |       |       |          |
    //         |       |       |          the CONSTRUCTOR CALL, with arguments
    //         |       |       the keyword that sets aside memory for a new object
    //         |       the variable name that will store the reference
    //         the TYPE of the variable, a reference type
    //
    // Read the right side first: new sets aside memory, runs a constructor,
    // and hands back a reference to the new object. The left side declares a
    // reference variable of that type to store it.
    //
    // Then call the instance method with the DOT OPERATOR, putting the
    // variable name on the left of the dot:  big.area()
    //
    // Example: rectangleArea(3, 4) is 12
    // Example: rectangleArea(5, 5) is 25
    //
    // Careful: the class name appears twice for two different reasons, and
    // both are required. Dropping new, as in Rectangle big = Rectangle(3, 4);
    // does not compile -- Java goes hunting for a method named Rectangle and
    // never finds one. That is the most common written error on a free
    // response question.
    // ---------------------------------------------------------------
    public static int rectangleArea(int width, int height)
    {
        // TODO Part 1: build a Rectangle with new, then return its area()
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 2: overloaded constructors, chosen by signature
    //
    // Build TWO Rectangle objects and return the sum of their areas:
    //
    //     one built with the NO-ARGUMENT constructor, Rectangle()
    //     one built with Rectangle(width, height)
    //
    // Constructors are OVERLOADED when one class has several constructors
    // with different signatures. A CONSTRUCTOR SIGNATURE is the constructor's
    // name plus the ordered list of its parameter types, so this class offers
    // Rectangle() and Rectangle(int, int). Java picks the one whose parameter
    // list matches the arguments you pass, in number and in order.
    //
    // Empty parentheses are still a constructor call, and they still run
    // code: Rectangle() sets width and height to 1, so its area is 1.
    //
    // Example: bothAreas(3, 4) is 13, because 1 + 12
    // Example: bothAreas(2, 2) is 5,  because 1 + 4
    //
    // Careful: new Rectangle(3.0, 4.0) would match neither signature, because
    // a double does not fit an int parameter without a cast. And two
    // constructors can never differ by parameter NAMES alone -- only the
    // types, or their order, make a different signature.
    // ---------------------------------------------------------------
    public static int bothAreas(int width, int height)
    {
        // TODO Part 2: build one Rectangle each way, return the sum of the areas
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 3: a void method changes the object, it does not hand back a value
    //
    // Build a Counter that starts at start, add points to it, and return the
    // count the object is left holding.
    //
    // Counter offers two instance methods and they are different kinds of
    // thing:
    //
    //     c.addPoints(7)    void. It changes the object's count and hands
    //                       back nothing, so it stands alone on its own line.
    //     c.getCount()      value-returning. It hands back an int, so you can
    //                       store it, print it, or return it.
    //
    // So the shape is three statements: build it, change it, report it.
    //
    // Example: countAfterAdding(2, 5) is 7
    // Example: countAfterAdding(0, 0) is 0
    //
    // Careful: int n = c.addPoints(7); is a COMPILE error, not a run-time
    // error. addPoints is void, so there is no value there to assign. Test
    // questions describe that one as a run-time error constantly, and it is
    // not.
    // ---------------------------------------------------------------
    public static int countAfterAdding(int start, int points)
    {
        // TODO Part 3: build the Counter, call addPoints, then return getCount()
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 4: a constructor call interrupts the statements around it
    //
    // Print exactly these three lines, in this order, each on its own line:
    //
    //     start
    //     building <size>
    //     back in main
    //
    // You must print only the first and third lines yourself. The middle line
    // is printed BY THE TIMER CONSTRUCTOR when you build a Timer, so your
    // method body is: print "start", build a Timer with new, print
    // "back in main".
    //
    // A constructor call interrupts the sequential execution of statements.
    // Control jumps into the constructor body, runs it all the way to its
    // last statement, and only then returns to the point immediately after
    // the constructor call. Nothing is deferred and nothing runs in parallel,
    // which is why "building" lands in the MIDDLE and not at the end.
    //
    // Example: announceBuild(30) prints
    //              start
    //              building 30
    //              back in main
    //
    // This part is checked character for character, so do NOT print anything
    // else here, and do not print the middle line yourself.
    // ---------------------------------------------------------------
    public static void announceBuild(int size)
    {
        // TODO Part 4: print "start", build a Timer with new, print "back in main"
    }

    // ---------------------------------------------------------------
    // PART 5: a reference variable holds an address, not the object
    //
    // Do exactly this, in this order, and return the total described at the
    // end:
    //
    //     1. build a Counter named a, starting at start
    //     2. make a second name b that points at THAT SAME OBJECT
    //        (one line, and it must not use new)
    //     3. build a third Counter named c, also starting at start, with new
    //     4. add points through b
    //     5. return a.getCount() + c.getCount()
    //
    // A primitive variable stores its value directly. A variable of a
    // REFERENCE type does not hold the object; it holds an OBJECT REFERENCE,
    // which can be thought of as the memory address of that object. So
    // Counter b = a; copies the address, not the object. That is ALIASING:
    // two names, one object, and a change made through either name is visible
    // through both.
    //
    // Count the objects first by counting how many times new appears. Here it
    // appears twice, so there are exactly two objects and three names.
    //
    // Example: aliasTotal(2, 5) is 9, because a and b share one counter that
    //          becomes 7, and c is a separate counter still holding 2
    // Example: aliasTotal(10, 0) is 20
    //
    // Careful: if you write Counter b = new Counter(start); on step 2 you
    // have built a third object, nothing reaches a's counter, and the answer
    // comes out too small. b = a is not a copy.
    // ---------------------------------------------------------------
    public static int aliasTotal(int start, int points)
    {
        // TODO Part 5: two objects, three names -- see the steps above
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 6: == compares addresses, .equals compares contents
    //
    // Return a String holding two answers separated by one space:
    //
    //     first the result of  first == second
    //     then  the result of  first.equals(second)
    //
    // So the returned value looks like "false true" -- and nothing else, no
    // capital letters, no extra spaces.
    //
    // On reference types, == asks "are these two names holding the same
    // address?", never "do these two objects hold the same data". Two
    // separately built objects carrying identical characters are NOT equal by
    // ==. The .equals method is the one that looks at the contents; you will
    // meet it properly in Topic 1.15, and here it is only the contrast.
    //
    // A boolean joined to a String with + becomes the text "true" or "false",
    // which is the concatenation you already know from Topic 1.4.
    //
    // Example: two separate String objects both holding "cat" give
    //          "false true"
    // Example: one String object and a second name for it give "true true"
    // Example: two different words give "false false"
    //
    // Careful: do not try to work out the answers yourself and return a
    // literal. Write the two comparisons and let Java answer them.
    // ---------------------------------------------------------------
    public static String compareTwoWays(String first, String second)
    {
        // TODO Part 6: return the == result, a space, then the .equals result
        return "";
    }

    // ---------------------------------------------------------------
    // PART 7: declaring is not creating, and null is a real value
    //
    // Two reference variables are handed to you. Return a String holding two
    // answers separated by one space:
    //
    //     first  whether first  refers to no object at all
    //     then   whether second refers to no object at all
    //
    // So the returned value looks like "true false" -- and nothing else.
    //
    // A variable of a reference type holds an object reference or, if there
    // is no object, NULL. String s; followed by no constructor call leaves
    // you a name with nothing on the other end of the arrow. Declaring is not
    // creating; only a new call, or an assignment from something that already
    // points at an object, fills it in.
    //
    // null is neither zero nor the empty string. The way you ask is
    // x == null, which is the one comparison you may always make on a
    // reference, whatever it holds.
    //
    // Example: a real String and a null give "false true"
    // Example: two nulls give "true true"
    //
    // Careful: do NOT call a method on these variables. first.length() and
    // first.equals("") both compile without complaint, because the compiler
    // checks only that String has such a method, but at run time there is
    // nothing at the end of the arrow and the call throws a
    // NullPointerException. That is a RUN-TIME error, an exception -- not a
    // syntax error, not a logic error, and never a compile error. An
    // exception stops the program on that line, so anything the program was
    // going to print afterwards never prints.
    // ---------------------------------------------------------------
    public static String nullReport(String first, String second)
    {
        // TODO Part 7: return the two == null results, separated by one space
        return "";
    }

    // ---------------------------------------------------------------
    // Run this to see your own work. The grader does not test main, so you
    // may change it freely while you experiment.
    // ---------------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println("rectangleArea(3, 4)     = " + rectangleArea(3, 4));
        System.out.println("bothAreas(3, 4)         = " + bothAreas(3, 4));
        System.out.println("countAfterAdding(2, 5)  = " + countAfterAdding(2, 5));
        System.out.println("aliasTotal(2, 5)        = " + aliasTotal(2, 5));

        String cat = "cat";
        String sameCat = new String("cat");
        System.out.println("compareTwoWays          = " + compareTwoWays(cat, sameCat));
        System.out.println("nullReport              = " + nullReport(cat, null));

        System.out.println("announceBuild(30) prints:");
        announceBuild(30);
    }
}
