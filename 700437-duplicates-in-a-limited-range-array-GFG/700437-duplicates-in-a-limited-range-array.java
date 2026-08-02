class Solution 
{
    public ArrayList<Integer> findDuplicates(int[] arr) 
    {
        int n=arr.length;
       ArrayList<Integer> list=new ArrayList<>();
       int[] freq=new int[n+1];
       for(int i=0;i<n;i++)
       {
          freq[arr[i]]++;
       }
       for(int i=1;i<=n;i++)
       {
           if(freq[i]==2)
           {
              list.add(i);
               
           }
       }
       return list;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna