import java.util.*;
class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to print odd numbers : ");
        int N = sc.nextInt();
        System.out.println("Odd range till" + N + " are:");
        for(int i=1;i<=N;i++)
        {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    
}
