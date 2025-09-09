# simple-calculator
Project Report: Simple Calculator in Java
1. Project Title

Simple Calculator using Java

2. Introduction

The Simple Calculator project is a basic Java console application designed to perform fundamental arithmetic operations. It demonstrates the use of Java programming concepts such as methods, exception handling, user input using Scanner, switch-case, and loops.

The calculator allows users to repeatedly perform operations like addition, subtraction, multiplication, and division until they choose to exit. It also handles invalid inputs and prevents division by zero errors through exception handling.

3. Objectives

To implement a user-friendly calculator in Java.

To demonstrate the use of methods for modular programming.

To handle user inputs effectively with the Scanner class.

To implement error handling using try-catch blocks.

To apply control structures like while loops and switch-case.

4. System Requirements
Hardware Requirements:

Processor: Intel i3 or above

RAM: 2 GB or more

Storage: 50 MB free space

Software Requirements:

Operating System: Windows / Linux / MacOS

JDK: Java Development Kit 8 or higher

IDE (Optional): Eclipse, IntelliJ IDEA, NetBeans, or simple text editor

5. Technologies Used

Programming Language: Java

Concepts:

Scanner class (for input)

Methods (for add, subtract, multiply, divide)

Switch-case (for operator selection)

Exception handling (InputMismatchException, ArithmeticException)

Loops (while)

6. Working of the Project
Step-by-step flow:

The program starts and prompts the user to enter the first number.

The user enters the operator (+, -, *, /).

The program asks for the second number.

Based on the operator entered, the corresponding method (add, subtract, multiply, divide) is called.

If the user enters an invalid number, InputMismatchException is handled.

If the user tries to divide by zero, an ArithmeticException is thrown with the message "Error: Division by zero is not allowed."

The result of the calculation is displayed.

The user is asked if they want to perform another calculation (yes or no).

If the answer is yes, the program repeats; if no, the calculator closes.

7. Code Explanation

Main Class: SimpleCalculator

Methods:

add(double num1, double num2) → returns sum

subtract(double num1, double num2) → returns difference

multiply(double num1, double num2) → returns product

divide(double num1, double num2) → checks for zero denominator and returns quotient

Exception Handling:

InputMismatchException → when user enters invalid input like a letter instead of a number.

ArithmeticException → when division by zero is attempted.

Looping:

A while loop runs until the user types no.

Switch Case:

Used to decide the operation (+, -, *, /).
