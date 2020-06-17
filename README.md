# Linear-Algebra-Library-for-Scala
## Simple and Efficient Linear Algebra Library for Scala

**Contents**
* [Project Summary](#project-summary)
* [Documentation](#documentation)
* [Installation](#installation)
* [A brief presentation of the commands](#a-brief-presentation-of-the-commands)
* [Correctness of the library using ScalaTest](#correctness-of-the-library-using-scalatest)
* [Advantages of the library](#advantages-of-the-library)
* [An example (numerical methods implemented using the library)](#an-example-numerical-methods-implemented-using-the-library)

## Project Summary
This project presents a Linear Algebra Library for Scala which contains basic matrix and vector operations which are briefly described [here](#a-brief-presentation-of-the-commands). The project is optimized for Scala 2.13.1.

The reason why I decided to implement such a library is that I wanted to give Scala users the opportunity to use a library which is very easy to understand. The aim of my library is to keep it as simple as possible. Most of the existing Linear Algebra libraries tend to have a more and more complicated syntax. Therefore, the design decision I took are based on keeping the usage of the library as clear as possible making the user clear about the functionalities of the library, without worrying about the complexities that might arrive. My library might not have its functionalities as efficient as others already have, but the fact that it might be easy-to-use is the main advantage it has and also makes it different from other such libraries.

The code for the operations can be found in the file MatrixOp.scala. I decied to keep the whole code for the library in one file as it is easier finding already defined functions which can be used for adding further operations to the library. Also, I make use of scaladoc facility provided by Scala in order to have everything described in details on an HTML page.

I decided to use 2 different types for everyting I did (column vectors and 2-Dimensioned Matrices):
```scala
  /** Matrix made of an array of Double-valued arrays.
   */
  type Matrix = Array[Array[Double]]
  /** Column vector made of an array of Double values.
   */
  type Vector = Array[Double]
```
Before every function, there is a description of what it does and what it requires to work. The way in which parameter and return types are described are done in such a way in which it is very easy for the user to understand how to run it, favorising the simplicity argument of my design decisions.

In order to use the library, you need to create an object instance of the MVOperations class. You can use it in both scala command line and any project as long as the MatrixOp.scala document is in the folder the user works in.

I also included the unit testing facility which can be found in the file Testsuite.scala. This is described more [here](#correctness-of-the-library-using-scalatest). To suggest how useful the library is I also implemented some numerical methods for root-finding and optimization which make use of this library. These are explained [here](#an-example-numerical-methods-implemented-using-the-library).

## Documentation
I created the documentation for this library using the scaladoc feature from Scala. I implemented the comments of the functions such that this feature generates an HTML documentation of our library. I have already created the HTML file.

Therefore, the documentation for the library can be found in the HTML file MVOperations.html. After cloning the project, a simple  opening of the file should make the HTML page work. However, if this doesn't happen, the following command should be run using the command line in the project file which generates the HTML documentation and can be immediately open using the MVOperations.html file.
```
  scaladoc MVOperations.scala
```

## Installation

## A brief presentation of the commands

## Correctness of the library using ScalaTest

## Advantages of the library

## An example (numerical methods implemented using the library)







