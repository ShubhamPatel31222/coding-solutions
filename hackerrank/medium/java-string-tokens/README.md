# Java Anagrams

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
**Submitted:** 2026-10-30T18:45:29.769Z  

```java


    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        
        // Convert both strings to lowercase for case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Frequency array for 26 alphabets (a-z)
        int[] frequencies = new int[26];
        
        // Loop through both strings simultaneously
        for (int i = 0; i < a.length(); i++) {
            // Increment count for string a's character
            frequencies[a.charAt(i) - 'a']++;
            
            // Decrement count for string b's character
            frequencies[b.charAt(i) - 'a']--;
        }
        
        // If they are anagrams, every single count in the array must be back to 0
        for (int count : frequencies) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-tokens/problem)