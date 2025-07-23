import java.io.*;
class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the range : ");
        int N = Integer.parseInt(br.readLine());
        System.out.println("Sum of Natural numbers till " + N + " are:");
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
