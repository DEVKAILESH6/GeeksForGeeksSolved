class Solution 
{
    public String longest(List<String> arr) 
    {
        String ans=arr.get(0);
        for (int i=1; i<arr.size();i++) 
        {
            if(arr.get(i).length()>ans.length())
            {
                ans=arr.get(i);
            }
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna