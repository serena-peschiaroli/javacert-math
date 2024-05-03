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
- [x] Jack
The program prints either Jack or Queen
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
A,B,C?
- [x] ,,,,,,
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


A,B,E
All of these
- [x] A, D
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

- 21. 

1 / 16
Which of the following are not valid format specifiers in Java?
The are 3 correct answers

%s
- [x]  #o
- [x]  #n
%c
- [x]  #s
%d

____________________________________________________________________________________________

- 22.

What will be returned by the below abc() method?
The are 1 correct answers


char abc(){
String string = "I am an Engineer";

switch (string.length()*25/10-5+2){
case 35: return string.charAt(0);
case 36: return string.charAt(1);
case 37: return string.charAt(2);
case 38: return string.charAt(3);
default: return '0';

}

}


E
Zero
I
FALSE
- [x] a
m

____________________________________________________________________________________________

- 23. 

What will be the resulting output of this code?
The are 1 correct answers


package com. company;

public class Main {

public static void main(String[] args) {
String str1 = "mnop";
String str2 = "mop";

for(int i=0; i< str1.length()-1; i++){
if(str1.charAt(i) != str2.charAt(i)){
System.out.print(str1.charAt(i));
}

}

}

}


- [x] no
mn
op
mp
mo
mop

____________________________________________________________________________________________
 
- 24. 

Anticipate the result produced  by the given code?
The are 1 correct answers

package com.company;
public class Main {
public static void main(String[] args){
String str = "HappyNewyear2021";
String[] arrOfStr = str.split("p");
System.out.print(arrOfStr[0]);

}
}

2021
- [x]  Ha
Hap
HappyNewyear
syntax error
Happ



____________________________________________________________________________________________

- 25.

Provide the anticipated result of the given code.
The are 1 correct answers
package com.company;

public class Main {

public static void main(String[] args) {
        String[] arr = {"Abc", "e", "fhl", "mnop"};
        String str = "";

        for(int i=0; i< arr.length; i++){
            if(i/2 == 0){
            str= str + " ";

            }else{
            str= str + arr[i];

            }
        }

        System.out.println(str.charAt(5));
}
}

p
e
A
f
blank space
- [x]  m


____________________________________________________________________________________________

- 26.
What will be the output of this Java program:
The are 1 correct answers

package com.example;

public class Main {

public static void main(String[] args) {
String str = "Google";
System.out.print(str.charAt(str.length() - 2));

}
}

4
e
6
- [x]  l
Zero
g




____________________________________________________________________________________________

- 27. 

What will be printed?
The are 1 correct answers

package com.example;

class StringClass{
String str = new String("Emy is Great");
String getString(){
return str.substring(1,3) + str.substring(9,12);

}

}

public class Main {

public static void main(String[] args) {
StringClass sc = new StringClass();
System.out.println(sc.getString());

}

}


my
emy eat
eat
- [x]  myeat
my eat
emyeat
____________________________________________________________________________________________


- 28. 

Given the code fragment:


String s = “Hello Java“;

System.out.println(s.length());

s.concat(“SE 8“);

System.out.println(s.length());


What is the result?

The are 1 correct answers

912
- [x]  1010
99
1014


____________________________________________________________________________________________


- 29.  

Given the code fragment:


String s1 = “foo-bar“;

String s2 = new String(“foo-bar“);

System.out.print(s1.equals(s2) + “ “);

System.out.print(s1 == s2);

System.out.print(“ “ + s1.compareTo(s2));


What is the result?

The are 1 correct answers

false false -1
- [x]  true false 0
true true 0
false true -1


____________________________________________________________________________________________

- 30.

Which of the following are valid methods of the string class?

The are 5 correct answers

- [x]  replaceAll(String regex, String replacement)
- [x]  subSequence(int beginIndex, int endIndex)
- [x]  startsWith(String prefix, int offset)
- [x]  toCharArray()
isnull()
- [x]  join(CharSequence delimiter, CharSequence… elements)



_________________________________________________________________________________________


- 31. 


What is the probable output of the given code?
The are 1 correct answers

package com.company;
public class Main {

public static void main(String[] args) {
String s1 = new String("happy");
String s2 = "happy";
System.out.print(s1.equals(s2)+" "+ (s1 == s2));
}
}

false false
TRUE
true true
- [x]  true false
false true

____________________________________________________________________________________________


- 32. 

What output should one expect  from the following code?
The are 1 correct answers

package com.company;
public class Main {

public static void main(String[] args) {
String s1 = new String("year ");
int num = 2022;
System.out.print(s1+num -- );

}
}


year 2021
- [x]  year 2022
none of these
2021
2022
year


____________________________________________________________________________________________


- 33. 


Which of the following are valid format specifiers in Java?

The are 1 correct answers

%x
%n
%t
%c
%d
- [x]  All of the above



____________________________________________________________________________________________



- 34. 


State whether the below statement is Correct or Incorrect. The Strings in Java are mutable in nature.
The are 1 correct answers

- [x]  Incorrect
Correct



____________________________________________________________________________________________



- 35. 


What does the trim() method of the string class do?
The are 1 correct answers

- [x] None of these
Removes whitespace from both ends of a string
Removes all whitespace from a string
Removes whitespace only between the words, except from start and end
Adds whitespace between all characters of a string

 Adds whitespace only at the start and end of the string



____________________________________________________________________________________________



- 36. 

Predict the output of the code snippet below.
The are 1 correct answers


package com.company;
public class Main {

public static void main(String[] args) {

String s1 = "day";
String s2 = "trading";
System.out.print(s1 =s2="day");

}

}


daytrading
tradingtrading
- [x]  day
tradingday
trading
dayday


____________________________________________________________________________________________

