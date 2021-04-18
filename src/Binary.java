import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> a = new Stack<>();
        while(n!=0) {
            int sodu = n%2;
            a.push(sodu);
            n = n/2;
        }
        String x = "";
        while(!a.isEmpty()) {
            x+="" + a.pop();
        }
        System.out.print(x);
    }
}
