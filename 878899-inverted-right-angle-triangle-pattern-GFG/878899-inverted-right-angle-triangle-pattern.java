import java.util.Scanner;

class GFG
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0)
        {
            for(int i = 1; i <= n; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna