import java.util.*;
class Solution 
{
    String removeDuplicates(String s) 
    {
        String s1 = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!map.containsKey(ch))
            {
                s1 += ch;
                map.put(ch,1);
            }
        }
        return s1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna