import java.util.*;
class Q {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int N = sc.nextInt();
 System.out.println("Multiples of " + N + " are:");
        for(int i = N * 10; i >= N; i--){
            if(i % N == 0){
                System.out.println(i);
            }
        }
}
}
