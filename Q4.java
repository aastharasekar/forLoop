import java.io.*;
class Q4 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the range of even numbers to be printed N = ");
        int N = Integer.parseInt(br.readLine());

        System.out.println("Even numbers till "+ N + " are: ");
        for(int i = 2; i<=N;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
