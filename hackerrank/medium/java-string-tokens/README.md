# Java String Tokens

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, $s$, matching the regular expression `[A-Za-z !,?._'@]+`, split the string into *tokens*. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

**Note:** You may find the [String.split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-) method helpful in completing this challenge.

**Input Format**

A single string, $s$.

**Constraints**

- $1 \le \text{ length of } s \le 4 \cdot 10^5$
- $s$ is composed of *any* of the following: English alphabetic letters, blank spaces, exclamation points (`!`), commas (`,`), question marks (`?`), periods (`.`), underscores (`_`), apostrophes (`'`), and at symbols (`@`).

**Output Format**

On the first line, print an integer, $n$, denoting the number of tokens in string $s$ (they *do not* need to be unique). Next, print each of the $n$ tokens on a new line in the same order as they appear in input string $s$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T19:12:55.071Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        
        
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            
            
            String[] tokens = s.split("[^A-Za-z]+");
            
           
            System.out.println(tokens.length);
            
            
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-tokens/problem)