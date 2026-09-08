import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='I'||ch=='O'||ch=='E'||ch=='U')
        {
            System.out.println("true");
        }
        else
        {
        System.out.println("false");
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna