# Linear-Algebra-Library-for-Scala
## Simple and Efficient Linear Algebra Library for Scala

**Contents**
* [Project Summary](#project-summary)
* [Installation](#installation)
* [Documentation](#documentation)
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

## Installation
There is just one version of my library. It is optimized for Scala 2.13.1. To install it, it should be enough just to clone the repository to your own machine. I have already compiled the Scala files and the class files already exist. However, if the library doesn't work yet, it should be compiled one more time using the following command in the command line:.
```
  fsc MatrixOp.scala
```
Afterwards, you can start using the library by creating a new object using the next command.
```scala
  val u = new MVOperations
```
Examples to be run can be found at the beginning of the Testsuite.scala file. You can copy them and run different functions using the Scala REPL interpreter. 

## Documentation
I created the documentation for this library using the scaladoc feature from Scala. I implemented the comments of the functions such that this feature generates an HTML documentation of our library. I have already created the HTML file.

Therefore, the documentation for the library can be found in the HTML file MVOperations.html. After cloning the project, a simple  opening of the file should make the HTML page work. However, if this doesn't happen, the following command should be run using the command line in the project file which generates the HTML documentation and can be immediately open using the MVOperations.html file.
```
  scaladoc MatrixOp.scala
```
![](/ss/DocPhoto.PNG)

## A brief presentation of the commands
Below can be found a table containing the available library facilities and a short description of what they do (to check their detailed description you can look on the HTML documentation file).

Function | Description
-------- | -----------
addM/addV | Add 2 matrices/vectors
angleV | Find the angle between 2 vectors
areOrth/areOrthSets | Check for orthogonality between vectors/sets of vectors
columnSpace/rowSpace/nullspace | Compute row/column/null space of a matrix 
copyM/copyV | Copy a matrix/vector
ctmulM/ctmulV | Multiply a matrix/vector by a constant
det | Compute the determinant of a matrix
eigvals | Compute the eigenvalues of a matrix (working optimally only for full-rank symmetric square matrices)
eigvectors / eigvectorsNorm | Compute (the normalized) eigenvectors of a matrix (working optimally only for full-rank symmetric square matrices)
elMAdd/elMMul/elMSwitch | Compute an elementary matrix for adding/multiplying/switching
elOpAdd/elOpMul/elOpSwitch | Do an addition/multiplication/switching elementary operation on a matrix
expM | Exponentiate a square matrix
fillM/fillV | Change a matrix/vector size
genId | Generate an identity matrix
inverse | Compute the inverse of a matrix
isEqualM|isEqualV | Check for equality between matrices/vectors
isInd | Check for linearly independence of a vector set
isOnetoOneLinTr/isOntoLinTr | Check if a linear transformation is 1-1/onto
isOrthNormSet/isOrthSet | Check if a set of vectors is orthonormal/orthogonal
isSymmetric | Check if a square matrix is symmetric
kernelLinTr/rangeLinTr | Compute the kernel/range of a linear transformation
lengthV | Compute the length of a vector
matrtoval/matrtovect | Transform a matrix into a value/vector
mulM/mulMV/mulV | Multiply 2 matrices/ 1 matrix and 1 vector / 2 vectors
noMsgSysSolve/sysSolve | Solve a linear equation (without) printing the solution
normV | Normalize a vector
nullityLinTr/rankLinTr | Compute the nullity/rank of a linear transformation
orthGrSch | Compute the Gram-Schmidt orthogonalization
plu/qr | Compute the PLU/QR decomposition of a matrix
printM/printV | Print a matrix/vector
rank | Compute the rank of a matrix
ref/rref | Reduce a matrix to its REF/RREF form
subM/subV | Subtract 2 matrices/vectors
transposeM/transposeV | Transpose a matrix/vector
vecttomatr | Transform a vector into a matrix

## Correctness of the library using ScalaTest
ScalaTest is required to check that the unit testing works!

I used unit testing to test the correctness of my library. I made use of the ScalaTest testing framework. You can find the tests I made in the file Testsuite.scala. At the beginning there are more examples used in the tests and can also be copied to check different functionalities as well. I have already compiled the program and created the class files. To check that the unit testing works as expected just run the following command.
```
  scala org.scalatest.run Testsuite
```
However, in order to ensure that the unit testing is accurate you cand alo recompile the file and run it afterwards using the following 2 commands.
```
  fsc Testsuite.scala
  scala org.scalatest.run Testsuite
```

## Advantages of the library
The main advantages of my library are:
* Simplicity of the syntax which makes it easy for the user to understand how to use it
* The flexibility of the Scala language which makes lots of functions easier to implement than in other programming languages because of the vast range of available data structures and libraries
* The user-friendly documentation which lets the user work with the library efficiently

## An example (numerical methods implemented using the library)
I decided to implement some numerical methods in more dimensions for optimizing and root-finding to prove the efficiency of the library. I also included 1-dimensional methods which do not require the library (also for numerical integration).

These methods can be found in the files numIntegration.scala, numRootFinding.scala and numOptimization.scala. They are already compiled. However, to ensure that they work efficiently you can compile them one more time using the following command.
```
  fsc numIntegration.scala numRootFinding.scala numOptimization.scala
```
Below is a table with what each numerical method file contains.
Type of numerical method | Algorithms
------------------------ | ---------
1 dimensional integration | Midpoint rule, Trapezium rule and Simpson's rule
1 dimensional root-finding | Bisection, Newton, Secant
n dimensional root-finding | Newton, Broyden
1 dimensional optimization | Golden section search
n dimensional optimization | Gradient descent, Newton, BFGS

I also included documentation HTML files for these which can be accessed using numIntegration.html, numRootFinding.html and numOptimization.html. Again, these can be compiled again using the following commands:
```
  scaladoc numIntegration.scala numRootFinding.scala numOptimization.scala
```
In the file numMethodsTester.scala there is a various number of function examples for which I tested their accuracy. In order to see how they act, you can run the following command.
```
  scala numMethodsTester.scala
```
Afterwards, more results will be printed. Below there is just a small amount of what is printed (for the n dimensional root finding).

All the functions can also be checked using the Scala REPL Interpreter copying the examples and creating objects for each of the classes.
```scala
  val u1 = new numIntegration
  val u2 = new numRootFinding
  val u3 = new numOptimization
```
