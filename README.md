- 1. 

What is the output of the following?

The are 1 correct answers



public class Legos {

public static void main(String[] args) {

var sb = new StringBuilder();

sb.append("red");

sb.deleteCharAt(0);

sb.delete(1, 2);

System.out.println(sb);

}

}

- [x] e
d
ed
r
None
Code does not compile

____________________________________________________________________________________________

- 2. 



Given the code fragment:


String digits = “0123456789“;

System.out.println(

 digits.substring(

 digits.indexOf(“4“), digits.indexOf(“8“)).concat(“89“)

);


What is the result?

The are 1 correct answers

- [x] 456789
4567889
45678
3456789


____________________________________________________________________________________________

- 3. 

What gets written on the screen when the following program is compiled and run?

Select the one right answer:

public class Test {

 public static void main(String[] args) {

  int i;

  float f = 2.3f;

  double d = 2.7;

  i = ((int) Math.ceil(f)) * ((int) Math.round(d));

  System.out.println(i);

 }

}

The are 1 correct answers

An exception is thrownCompilation fails
- [x] 9
6.1
6
5
4


____________________________________________________________________________________________

- 4. 

Given the following code fragment:

What is the result?

The are 1 correct answers

class X {

static void m (String s1) {
s1 = "acting";

}

public static void main(String[] args) {
String s2 = "action";
m(s2);
System.out.println(s2);

}

}

Compilation fails
acting
- [x] action
An exception is thrown at runtime


____________________________________________________________________________________________

- 5. 


What is a possible result of this code?
The are 1 correct answers


List nums = new ArrayList();

nums.add((long) Math.min(5,3));

nums.add(Math.round(3.14));

nums.add((long) Math.pow(4,2));

System.out.println(nums);


[3, 4, 8]
[5, 3, 8]
- [x] [3, 3, 16]
[3, 4, 16]
None of the above
Cannot be determined


____________________________________________________________________________________________


- 6. 

What outcome is foreseen from the given code?
The are 1 correct answers

package com.company;
import java. lang.Math;

public class Main {

public static void main(String[] args){
System.out.print(Math.floorDiv(43,23));
}
}

Zero
42
1.86
23
2
- [x] 1





____________________________________________________________________________________________


- 7. 

Given the code fragment:

public static void main(String[] args) {

 double num = -25.67;

 System.out.println(Math.abs(num));

}

What is the result?

The are 1 correct answers

- [x] 25.67
25
25.7
26



____________________________________________________________________________________________


- 8. 

Which of the following method is not part of the Math class?
The are 1 correct answers

getExponent()
cosh()
signum()
negateExact()
abs()
- [x] calculate()

____________________________________________________________________________________________

- 9. 

Given the code fragment, and assuming that the java.util.Random class has been imported, what is the result?

The are 1 correct answers


Random r1 = new Random(10);
Random r2 = new Random(10); // line n1

if (r1.nextInt() == r2.nextInt()) {
System.out.println("Jack");
} else {
System.out.println("Queen");

}


A compilation error occurs at line n1
Jack
- [x] The program prints either Jack or Queen
Queen


____________________________________________________________________________________________

- 10. 

Consider the following program:

Which one of the following options provides the output of this program when executed?

The are 1 correct answers

public class StrEqual {

public static void main(String[] args) {
String s1 = "hi";
String s2 = new String("hi");
String s3 = "hi";

if (s1 == S2) {
System.out.println("s1 and s2 are equal");
} else {
System.out.println("s1 and s2 are not equal");
}
if (s1 == s3) {
System.out.println("s1 and s3 are equal");
} else {
System.out.println("s1 and s3 are not equal");

}

}
}

s1 and s2 are equal, s1 and s3 are equal
- [x] s1 and s2 are not equal, s1 and s3 are equal
s1 and s2 are equal, s1 and s3 are not equal
s1 and s2 are equal, s1 and s3 are equal


____________________________________________________________________________________________

- 11. 

Which of the following math class method rounds off a floating point value up to the nearest integer?
The are 1 correct answers

- [x] math.ceil()
Math.exp()
Math.floor()
Math.floorDiv()
Math.min()
Math.max()


____________________________________________________________________________________________

- 12. 

Given the code fragment:


public static void main(String[] args) {

 String name = “Rita“;

 int age = 14;

 /* line n1 */

}


Which code fragment, when inserted at line n1, enables it to print Rita is 14 years old?

The are 1 correct answers

System.out.println("%s is %d years old" +name+age);
System.out.println("%s is %n years old" name, age);
- [x] System.out.printf("%s is %d years old", name, age);
System.out.printf("%s is %n years old", name, age);



____________________________________________________________________________________________

- 13. 

What is the result of compiling and running the following program?


public class Test {

 public static void main(String[] args) {

  String str1 = “abc“;

  String str2 = “def“;

  String str3 = str1.concat(str2);

  str1.concat(str2);

  System.out.println(str1);

 }

}

The are 1 correct answers

abcdef
def
defabc
abcabc
- [x] abc
abcdefdef


____________________________________________________________________________________________ 


- 14. 


Which of the following methods are provided by the Math class?
The are 4 correct answers

- [x] max()
- [x] log()
reduce()
- [x] random()
delete()
- [x] asin()



____________________________________________________________________________________________

- 15. 

Given the code fragment, what is the result?

The are 1 correct answers


String inputFromConsole = " betaTEST ";

String cleanedInput;

cleanedInput = inputFromConsole.toUpperCase();

cleanedInput = cleanedInput.trim();

System.out.println("[" + cleanedInput + "]");

[ BETATEST ]
[betaTest]
[ betaTest ]
- [x] [BETATEST]

____________________________________________________________________________________________


- 16. 

When executed, the following code segment will print the following:

The are 1 correct answers

String str = "A.B.C!";
System.out.println(str.replaceAll(".",",").replace("!", "?"));


A.B.C?
- [x] A,B,C?
,,,,,,
A,B,C!



____________________________________________________________________________________________


- 17. 

Given the following code, what is the result?

The are 1 correct answers


public class Case {

public static void main(String[] args) {

String product = "Pen";

product.toLowerCase();

product.concat(" BOX".toLowerCase());

System.out.println(product.substring(4,6));

}

}

box
nbo
- [x] An exception is thrown at runtime
bo
nb
Compilation fails



____________________________________________________________________________________________


- 18. 


Which of the following code snippets does not generate -29 as the output?
The are 1 correct answers

A. float val = -28.5F;
int number = (int) Math.abs(val);
number+3;
System.out.print(number);

B. float val = -28.5F;
int number = (int) Math.ceil(val);
-- number;
System.out.print(number);

C. float val = -28.5F;
int number = (int) Math.nextDown(val);
-- number;
System.out.print(number);

D. float val = -28.5F;
int number = (int) Math.floor(val);
-- number;
System.out.print(number);

E. float val = -28.5F;
int number = (int) Math.nextUp(val);
-- number;
System.out.print(number);

F. float val = -28.5F;
int number = (int) Math.round(val);
-- number;
System.out.print(number);


- [x] A,B,E
All of these
A, D
None of these
A
E,F
____________________________________________________________________________________________



- 19. 

Given the code fragment:


//line n1

public class App {

 public static void main(String[] args) {

  List nums = new ArrayList<>();

  nums.add(Math.PI);

  nums.add(new Random().nextDouble());

 }

}


Which statement is true?

The are 1 correct answers

The code results in a compilation error. To make it compile, insert at line n1:import java.lang.Math; import java.lang.Random;
The code compiles successfully
The code results in a compilation error. To make it compile, insert at line n1:import java.lang; import java.util;
- [x] The code results in a compilation error. To make it compile,  insert at line n1:import java.util.*;




____________________________________________________________________________________________



- 20. 

Given the code fragment:


String a = “Java“;

String b = new String(“Java“);

System.out.println(a.equals(b));

System.out.println(a==b);


What is the result?

The are 1 correct answers

FALSEFALSE
TRUETRUE
- [x] TRUEFALSE
FALSETRUE






____________________________________________________________________________________________
