# Java Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two strings, $a$ and $b$, are called anagrams if they contain all the same characters in the same frequencies.  For this challenge, the test is not case-sensitive. For example, the anagrams of `CAT` are `CAT`, `ACT`, `tac`, `TCA`, `aTC`, and `CtA`.

**Function Description**    

Complete the *isAnagram* function in the editor.   

*isAnagram* has the following parameters:  

- *string a:* the first string   
- *string b:* the second string   

**Returns**   

- *boolean:* If $a$ and $b$ are case-insensitive anagrams, return true.  Otherwise, return false.   

**Input Format**

The first line contains a string $a$.		
The second line contains a string $b$.

**Constraints**

- $1 \le length(a), length(b) \le 50$
- Strings $a$ and $b$ consist of English alphabetic characters.
- The comparison should NOT be case sensitive. 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T18:45:04.105Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-anagrams/problem)