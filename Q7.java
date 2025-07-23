import java.util.*;
class Q7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int N = sc.nextInt();
 System.out.println("Multiples of " + N + " are:");
        for(int i = N; i <=N * 10; i++){
            if(i % N == 0){
                System.out.println(i);
            }
        }
}
}
