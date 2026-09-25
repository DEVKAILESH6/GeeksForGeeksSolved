class Solution {
    int firstOccurence(String txt, String pat) 
{
    for (int i = 0; i <= txt.length() - pat.length(); i++)
    {
        boolean found = true;
        for (int j = 0; j < pat.length(); j++)
            {
                if (txt.charAt(i + j) != pat.charAt(j))
                {
                    found = false;
                    break;
                }
            }
            if (found)
            {
                return i;
            }
        }
        return -1;
        
    }
}
        
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna