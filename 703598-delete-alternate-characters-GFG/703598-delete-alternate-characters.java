class Solution 
{
    static String delAlternate(String s)
    {
        String s1="";
        for(int i = 0; i < s.length(); i+=2)
        {
            s1 += s.charAt(i);
        }
        return s1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna