import java.util.*;
class Q10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        
        int count = 0;
        System.out.println("Count of odd numbers is: " + count );
        for(int i=1;i<N;i++){
            if(i % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
