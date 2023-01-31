import java.io.*;

import java.util.*;

class Solution {

    // Function to find the maximum count of

    // unique substrings by splitting a string

    // into maximum number of unique substrings

    public int maxUniqueSplit(String S)

    {

        return maxUnique(S, new HashSet<String>());

    }

    // Utility function to find maximum count of

    // unique substrings by splitting the string

    public int maxUnique(String S, Set<String> set)

    {

        // Stores maximum count of unique substring

        // by splitting the string into substrings

        int max = 0;

        // Iterate over the characters of the string

        for (int i = 1; i <= S.length(); i++) {

            // Stores prefix substring

            String tmp = S.substring(0, i);

            // Check if the current substring

            // already exists

            if (!set.contains(tmp)) {

                // Insert tmp into set

                set.add(tmp);

                // Recursively call for remaining

                // characters of string

                max = Math.max(max, maxUnique(

                        S.substring(i), set)

                        + 1);

                // Remove from the set

                set.remove(tmp);

            }

        }

        // Return answer

        return max;

    }
}

// Driver Code

class GFG {

    public static void main(String[] args)

    {

        Solution st = new Solution();

        String S = "ababccc";

        int res = st.maxUniqueSplit(S);

        System.out.println(res);

    }
}