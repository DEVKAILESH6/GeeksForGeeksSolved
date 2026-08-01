class Solution
{
    static ArrayList<Integer> leaders(int arr[]) 
    {
        ArrayList<Integer> ans=new ArrayList<>(); 
        int a=arr[arr.length-1];
        ans.add(a);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=a)
            {
                ans.add(arr[i]);
                a=arr[i];
                
            }
        }
        Collections.reverse(ans);
        return ans;
        
    }   
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna