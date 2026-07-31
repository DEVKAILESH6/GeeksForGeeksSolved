class Solution
{
    public int getSecondLargest(int[] arr) 
    {
        int L=-1;
        int SL=-1;
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]>L)
            {
                SL=L;
                L=arr[i];
            }
            else if(arr[i]>SL&&arr[i]!=L)
            {
                SL=arr[i];
            }
        }
        return SL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna