# Basics to Loops: 100 Java Problems

Java programming problems covering output, variables, data types, type conversion, operators, user input, conditional statements, loops, number programs, patterns, and mini programs.

---

## 1. Output and Program Structure

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 1 | [`Q001_HelloJava`](./Q001_HelloJava.java) | Print `Welcome to Java` on the console. |
| 2 | [`Q002_IntroduceYourself`](./Q002_IntroduceYourself.java) | Print your name, age, city, and hobby on four separate lines. |
| 3 | [`Q003_HouseShape`](./Q003_HouseShape.java) | Print the shape of a simple house using `println` statements and symbols. |
| 4 | [`Q004_MultiLinePrint`](./Q004_MultiLinePrint.java) | Print a four-line poem-style message using a single `println` statement and the `\n` escape sequence. |
| 5 | [`Q005_StudentMarksTable`](./Q005_StudentMarksTable.java) | Use `printf` to print a neatly aligned table of three students with their names and marks. |
| 6 | [`Q006_QuotesAndPaths`](./Q006_QuotesAndPaths.java) | Print the text `He said "Java is fun"` and the path `C:\Users\Java\Projects`. |
| 7 | [`Q007_NameBanner`](./Q007_NameBanner.java) | Print your name surrounded by a border of stars. |
| 8 | [`Q008_ConcatenationDemo`](./Q008_ConcatenationDemo.java) | Print the results of `10 + 20 + "Java" + 10 + 20` and `"Java" + 10 + 20 + 10 + 20`, and explain the difference in comments. |

## 2. Variables and Data Types

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 9 | [`Q009_StudentRecord`](./Q009_StudentRecord.java) | Declare variables for roll number, name, marks, and grade of a student and print the complete record. |
| 10 | [`Q010_DataTypeSizes`](./Q010_DataTypeSizes.java) | Print the size in bits and bytes of `byte`, `short`, `int`, `long`, `float`, `double`, and `char` using wrapper class constants. |
| 11 | [`Q011_MinMaxOfAllTypes`](./Q011_MinMaxOfAllTypes.java) | Print the minimum and maximum values of `byte`, `short`, `int`, `long`, `float`, and `double`. |
| 12 | [`Q012_CharOperations`](./Q012_CharOperations.java) | Print the next and previous character of a given character, and convert a lowercase letter to uppercase using ASCII arithmetic. |
| 13 | [`Q013_BooleanExpressions`](./Q013_BooleanExpressions.java) | Store the results of five different comparisons in `boolean` variables and print them. |
| 14 | [`Q014_NumberSystems`](./Q014_NumberSystems.java) | Print the number 25 in binary, octal, and hexadecimal using `Integer` class methods. |
| 15 | [`Q015_ScientificNotation`](./Q015_ScientificNotation.java) | Declare very large and very small numbers using scientific notation (`e`) and print them. |
| 16 | [`Q016_LongVersusInt`](./Q016_LongVersusInt.java) | Calculate 20! using `int` and `long`, and show the difference in output. |
| 17 | [`Q017_FinalVariablesDemo`](./Q017_FinalVariablesDemo.java) | Declare the GST rate as a `final` constant and use it to calculate the tax on a given price. |
| 18 | [`Q018_UnicodeChars`](./Q018_UnicodeChars.java) | Print characters using Unicode escape sequences such as `\u0041`. |

## 3. Type Conversion and Casting

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 19 | [`Q019_ImplicitConversionChain`](./Q019_ImplicitConversionChain.java) | Demonstrate implicit conversion through the chain `byte`, `short`, `int`, `long`, `float`, `double`. |
| 20 | [`Q020_ExplicitCastingLoss`](./Q020_ExplicitCastingLoss.java) | Cast `300` to `byte`, `9.99` to `int`, and `-9.99` to `int`, and print the results. |
| 21 | [`Q021_CharIntConversion`](./Q021_CharIntConversion.java) | Convert the character `'7'` to the integer 7 and the integer 7 to the character `'7'`. |
| 22 | [`Q022_RoundingMethods`](./Q022_RoundingMethods.java) | Apply `Math.round`, `Math.ceil`, `Math.floor`, and `Math.rint` to the values 4.5, -4.5, and 4.4 and print the results. |
| 23 | [`Q023_ParseStrings`](./Q023_ParseStrings.java) | Convert the strings `"100"`, `"3.14"`, and `"true"` to `int`, `double`, and `boolean` values. |
| 24 | [`Q024_IntegerDivisionPrecision`](./Q024_IntegerDivisionPrecision.java) | Compute the average of two integers correctly as a decimal value and show how incorrect typing gives a wrong result. |

## 4. Operators

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 25 | [`Q025_ArithmeticTable`](./Q025_ArithmeticTable.java) | Read two numbers and print the results of all arithmetic operations in a formatted layout. |
| 26 | [`Q026_SwapUsingArithmetic`](./Q026_SwapUsingArithmetic.java) | Swap two numbers using addition and subtraction. |
| 27 | [`Q027_SwapUsingXor`](./Q027_SwapUsingXor.java) | Swap two numbers using the XOR operator. |
| 28 | [`Q028_PrePostIncrementPuzzle`](./Q028_PrePostIncrementPuzzle.java) | Evaluate and print the values of expressions combining pre-increment and post-increment on the same variable. |
| 29 | [`Q029_CompoundOperatorsChain`](./Q029_CompoundOperatorsChain.java) | Apply a sequence of compound assignment operators to a variable and print the value after each step. |
| 30 | [`Q030_EvenOddUsingBitwise`](./Q030_EvenOddUsingBitwise.java) | Check whether a number is even or odd using the bitwise AND operator. |
| 31 | [`Q031_PowerOfTwoCheck`](./Q031_PowerOfTwoCheck.java) | Check whether a number is a power of two using a bitwise expression. |
| 32 | [`Q032_ShiftMultiplyDivide`](./Q032_ShiftMultiplyDivide.java) | Multiply and divide a number by powers of two using the shift operators. |
| 33 | [`Q033_BitManipulationBasics`](./Q033_BitManipulationBasics.java) | Set, clear, toggle, and check the `k`-th bit of a number. |
| 34 | [`Q034_NestedTernary`](./Q034_NestedTernary.java) | Find the largest of three numbers using nested ternary operators. |
| 35 | [`Q035_TruthTable`](./Q035_TruthTable.java) | Print the truth table of logical AND, OR, and XOR for all combinations of two boolean values. |
| 36 | [`Q036_OperatorPrecedencePuzzles`](./Q036_OperatorPrecedencePuzzles.java) | Evaluate five complex expressions that combine arithmetic, relational, and logical operators and print each result. |

## 5. Formula-Based Programs and User Input

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 37 | [`Q037_CircleCalculations`](./Q037_CircleCalculations.java) | Read the radius and print the diameter, circumference, and area of a circle. |
| 38 | [`Q038_CylinderVolume`](./Q038_CylinderVolume.java) | Read the radius and height and calculate the volume and surface area of a cylinder. |
| 39 | [`Q039_SphereVolume`](./Q039_SphereVolume.java) | Read the radius and calculate the volume and surface area of a sphere. |
| 40 | [`Q040_HypotenuseCalculator`](./Q040_HypotenuseCalculator.java) | Read two sides of a right-angled triangle and calculate the hypotenuse. |
| 41 | [`Q041_DistanceBetweenPoints`](./Q041_DistanceBetweenPoints.java) | Read the coordinates of two points and calculate the distance between them. |
| 42 | [`Q042_BmiCalculator`](./Q042_BmiCalculator.java) | Read weight in kilograms and height in meters and calculate the Body Mass Index. |
| 43 | [`Q043_DiscountCalculator`](./Q043_DiscountCalculator.java) | Read the price and discount percentage and print the discount amount and final price. |
| 44 | [`Q044_GstCalculator`](./Q044_GstCalculator.java) | Read an amount and a GST percentage and print the tax amount and total bill. |
| 45 | [`Q045_EmiCalculator`](./Q045_EmiCalculator.java) | Read loan amount, annual interest rate, and tenure in months and calculate the monthly EMI. |
| 46 | [`Q046_SalaryBreakdown`](./Q046_SalaryBreakdown.java) | Read the basic salary and calculate HRA (20 percent), DA (10 percent), and the gross salary. |
| 47 | [`Q047_TimeConverter`](./Q047_TimeConverter.java) | Read a number of minutes and convert it into days, hours, and minutes. |
| 48 | [`Q048_TemperatureConverter`](./Q048_TemperatureConverter.java) | Read a temperature in Celsius and print it in Fahrenheit and Kelvin. |
| 49 | [`Q049_CurrencyConverter`](./Q049_CurrencyConverter.java) | Read an amount in rupees and convert it to dollars using a fixed exchange rate. |
| 50 | [`Q050_TotalMarksPercentage`](./Q050_TotalMarksPercentage.java) | Read marks of five subjects and print the total, percentage, and average. |

## 6. Conditional Statements

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 51 | [`Q051_SignOfNumber`](./Q051_SignOfNumber.java) | Check whether a number is positive, negative, or zero. |
| 52 | [`Q052_DivisibleBy5And11`](./Q052_DivisibleBy5And11.java) | Check whether a number is divisible by both 5 and 11. |
| 53 | [`Q053_AbsoluteValue`](./Q053_AbsoluteValue.java) | Print the absolute value of a number without using `Math.abs`. |
| 54 | [`Q054_SmallestOfThree`](./Q054_SmallestOfThree.java) | Find the smallest of three numbers. |
| 55 | [`Q055_SortThreeNumbers`](./Q055_SortThreeNumbers.java) | Read three numbers and print them in ascending order using conditional statements. |
| 56 | [`Q056_LeapYearCheck`](./Q056_LeapYearCheck.java) | Check whether a given year is a leap year. |
| 57 | [`Q057_CharCategory`](./Q057_CharCategory.java) | Check whether a character is a letter, a digit, or a special symbol. |
| 58 | [`Q058_CaseConverter`](./Q058_CaseConverter.java) | Convert an uppercase letter to lowercase and a lowercase letter to uppercase using ASCII values. |
| 59 | [`Q059_ValidDate`](./Q059_ValidDate.java) | Read a day, month, and year and check whether it is a valid date. |
| 60 | [`Q060_QuadraticRoots`](./Q060_QuadraticRoots.java) | Read the coefficients of a quadratic equation and print whether the roots are real and distinct, real and equal, or imaginary, along with the roots. |
| 61 | [`Q061_TriangleValidity`](./Q061_TriangleValidity.java) | Check whether a triangle is valid using its three angles, and again using its three sides. |
| 62 | [`Q062_SeasonByMonth`](./Q062_SeasonByMonth.java) | Read a month number and print the season. |
| 63 | [`Q063_BonusCalculator`](./Q063_BonusCalculator.java) | Calculate an employee bonus based on years of experience: below 2 years none, 2 to 5 years 10 percent, above 5 years 20 percent of salary. |
| 64 | [`Q064_TaxCalculator`](./Q064_TaxCalculator.java) | Calculate income tax using slabs: up to 3 lakh none, 3 to 6 lakh 5 percent, 6 to 9 lakh 10 percent, above 9 lakh 15 percent on the amount in that slab. |
| 65 | [`Q065_ShoppingDiscount`](./Q065_ShoppingDiscount.java) | Apply a tiered discount based on the bill amount: 5 percent above 1000, 10 percent above 5000, and 15 percent above 10000. |
| 66 | [`Q066_AtmWithdrawal`](./Q066_AtmWithdrawal.java) | Read a balance and a withdrawal amount and check whether the withdrawal is allowed (sufficient balance and multiple of 100). |
| 67 | [`Q067_LoginValidator`](./Q067_LoginValidator.java) | Compare an entered username and password with stored values using `equals` and print the result. |
| 68 | [`Q068_MonthNameSwitch`](./Q068_MonthNameSwitch.java) | Read a month number and print the month name using `switch`. |
| 69 | [`Q069_VowelSwitch`](./Q069_VowelSwitch.java) | Check whether a character is a vowel or consonant using `switch`. |
| 70 | [`Q070_TrafficLightSwitch`](./Q070_TrafficLightSwitch.java) | Read a traffic light color and print the corresponding action using `switch`. |
| 71 | [`Q071_ArithmeticMenuSwitch`](./Q071_ArithmeticMenuSwitch.java) | Display a menu of arithmetic operations and perform the chosen one on two numbers using `switch`. |
| 72 | [`Q072_RechargePlanSwitch`](./Q072_RechargePlanSwitch.java) | Read a recharge amount and print the plan details (validity and data) using `switch`. |

## 7. Loops and Number Problems

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 73 | [`Q073_PrintNumbersInRange`](./Q073_PrintNumbersInRange.java) | Print all numbers between two given numbers. |
| 74 | [`Q074_OddNumbersReverse`](./Q074_OddNumbersReverse.java) | Print all odd numbers from 99 down to 1. |
| 75 | [`Q075_TableUpToN`](./Q075_TableUpToN.java) | Print the multiplication table of a number up to a user-defined limit. |
| 76 | [`Q076_SumOfEvenAndOdd`](./Q076_SumOfEvenAndOdd.java) | Find the separate sums of all even numbers and all odd numbers from 1 to `n`. |
| 77 | [`Q077_SumOfSquares`](./Q077_SumOfSquares.java) | Calculate the sum of the series 1^2 + 2^2 + ... + n^2. |
| 78 | [`Q078_NcrCalculator`](./Q078_NcrCalculator.java) | Calculate nCr for given `n` and `r` using factorial loops. |
| 79 | [`Q079_DigitFrequency`](./Q079_DigitFrequency.java) | Count how many times a given digit occurs in a number. |
| 80 | [`Q080_LargestDigit`](./Q080_LargestDigit.java) | Find the largest and smallest digit in a number. |
| 81 | [`Q081_SwapFirstLastDigit`](./Q081_SwapFirstLastDigit.java) | Swap the first and last digits of a number. |
| 82 | [`Q082_StrongNumber`](./Q082_StrongNumber.java) | Check whether a number is a strong number (sum of factorials of its digits equals the number, for example 145). |
| 83 | [`Q083_AutomorphicNumber`](./Q083_AutomorphicNumber.java) | Check whether a number is automorphic (its square ends with the number itself, for example 25). |
| 84 | [`Q084_HarshadNumber`](./Q084_HarshadNumber.java) | Check whether a number is divisible by the sum of its digits. |
| 85 | [`Q085_NeonNumber`](./Q085_NeonNumber.java) | Check whether the sum of the digits of the square of a number equals the number itself (for example 9). |
| 86 | [`Q086_PrimeFactorization`](./Q086_PrimeFactorization.java) | Print all prime factors of a number. |
| 87 | [`Q087_CollatzSequence`](./Q087_CollatzSequence.java) | Print the Collatz sequence for a given starting number until it reaches 1. |
| 88 | [`Q088_HcfLcmWithEuclid`](./Q088_HcfLcmWithEuclid.java) | Find the HCF and LCM of two numbers using the Euclidean algorithm. |
| 89 | [`Q089_SumOfPrimes`](./Q089_SumOfPrimes.java) | Find the sum and count of all prime numbers below a given number. |
| 90 | [`Q090_TwinPrimes`](./Q090_TwinPrimes.java) | Print all twin prime pairs below 100. |

## 8. Pattern Printing

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 91 | [`Q091_HollowPyramid`](./Q091_HollowPyramid.java) | Print a hollow pyramid of stars with `n` rows. |
| 92 | [`Q092_InvertedPyramid`](./Q092_InvertedPyramid.java) | Print an inverted pyramid of stars with `n` rows. |
| 93 | [`Q093_ButterflyPattern`](./Q093_ButterflyPattern.java) | Print a butterfly pattern of stars with `n` rows in each half. |
| 94 | [`Q094_NumberPyramid`](./Q094_NumberPyramid.java) | Print a pyramid where each row contains numbers increasing to the middle and then decreasing. |
| 95 | [`Q095_BinaryTrianglePattern`](./Q095_BinaryTrianglePattern.java) | Print a triangle of alternating 1s and 0s that starts each row with 1. |
| 96 | [`Q096_HourglassPattern`](./Q096_HourglassPattern.java) | Print an hourglass pattern of stars. |
| 97 | [`Q097_NumberDiamond`](./Q097_NumberDiamond.java) | Print a diamond pattern made of numbers for a given `n`. |

## 9. Mini Programs

| No. | Class Name | Problem Statement |
|-----|------------|-------------------|
| 98 | [`Q098_RockPaperScissors`](./Q098_RockPaperScissors.java) | Build a game against the computer using `Random`. Play repeatedly until the user quits, and display the final score. |
| 99 | [`Q099_SimpleAtmMachine`](./Q099_SimpleAtmMachine.java) | Build a menu-driven ATM with options to check balance, deposit, withdraw, and exit, using `do-while` and `switch`. |
| 100 | [`Q100_StudentGradeSystem`](./Q100_StudentGradeSystem.java) | Read the marks of `n` students and print the highest mark, lowest mark, class average, and the number of students who passed. |