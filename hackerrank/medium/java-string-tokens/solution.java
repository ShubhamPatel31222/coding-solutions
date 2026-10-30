

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

