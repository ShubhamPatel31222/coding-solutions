# Java Currency Formatter

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Using __Regex__, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

**Note**: In this problem, a regex is only valid if you can compile it using the  [Pattern.compile](http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29) method.

**Input Format**

The first line of input contains an integer $N$, denoting the number of test cases. The next $N$ lines contain a string of any printable characters representing the pattern of a regex.

**Constraints**

 

**Output Format**

For each test case, print ``Valid`` if the syntax of the given pattern is correct. Otherwise, print ``Invalid``. Do not print the quotes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T17:40:08.690Z  

```java
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        // US Locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);
        
        // India Locale (India does not have a built-in constant in Locale, use new Locale("en", "IN"))
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaFormat.format(payment);
        
        // China Locale
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);
        
        // France Locale
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/pattern-syntax-checker/problem)