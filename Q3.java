import java.io.*;
class Q3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the 3 digit no range N = ");
        int N = Integer.parseInt(br.readLine());

        System.out.println("First " + N + " 3-Digit numbers are : ");
        for(int i=100; i< 100 + N ;i++){
            System.out.println(i);
        }
    }
}
