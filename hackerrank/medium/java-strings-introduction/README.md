# Java Strings Introduction

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

> "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." &mdash; [Wikipedia: String (computer science)](https://en.wikipedia.org/wiki/String_(computer_science))
    
This exercise is to test your understanding of Java Strings. A sample *String* declaration:

    String myString = "Hello World!"

The elements of a *String* are called *characters*. The number of *characters* in a *String* is called the *length*, and it can be retrieved with the *String.length()* method.

Given two strings of lowercase English letters, $A$ and $B$, perform the following operations:

1. Sum the lengths of $A$ and $B$.
2. Determine if $A$ is lexicographically larger than $B$ (i.e.: does $B$ come before $A$ in the dictionary?).
3. Capitalize the first letter in $A$ and $B$ and print them on a single line, separated by a space.

**Input Format**

The first line contains a string $A$.
The second line contains another string $B$.
The strings are comprised of only lowercase English letters.


**Constraints**

 

**Output Format**

There are three lines of output:    
For the first line, sum the lengths of $A$ and $B$.        
For the second line, write `Yes` if $A$ is lexicographically greater than $B$ otherwise print `No` instead.    
For the third line, capitalize the first letter in both $A$ and $B$ and print them on a single line, separated by a space.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T18:14:58.948Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        int res = A.compareTo(B);
        if (res>0) {
            System.out.println("Yes");
        }else {System.out.println("No");}
        
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
}

}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-strings-introduction/problem)