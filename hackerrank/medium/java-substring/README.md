# Java Strings Introduction

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, $s$, and two indices, $start$ and $end$, print a [substring](https://en.wikipedia.org/wiki/Substring) consisting of all characters in the inclusive range from $start$ to $end-1$. You'll find the *String* class' [substring method](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) helpful in completing this challenge. 

**Input Format**

The first line contains a single string denoting $s$.		
The second line contains two space-separated integers denoting the respective values of $start$ and $end$.

**Constraints**

* $1 \le |s| \le 100$
* $0 \le start \lt end \le n$
- String $s$ consists of English alphabetic letters (i.e., $[a-zA-Z]$) only.

**Output Format**

Print the substring in the inclusive range from $start$ to $end-1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T18:15:27.751Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-substring/problem)