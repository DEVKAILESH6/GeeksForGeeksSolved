class Solution 
{
    public int binarySubstring(String s) 
    {
      int a=0;
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='1')
          {
              a++;
          }
      }
      return a*(a-1)/2; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna