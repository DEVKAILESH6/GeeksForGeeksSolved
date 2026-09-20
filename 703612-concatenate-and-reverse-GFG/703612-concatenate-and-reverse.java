class Solution 
{
    static String conRevstr(String s1, String s2) 
    {
        String str1 = s1 + s2;
        String str2 = "";
         for(int i = str1.length() - 1; i >= 0; i--)
        {
            str2 += str1.charAt(i);
        }
        return str2;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna