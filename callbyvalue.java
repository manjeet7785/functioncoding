
// import java.util.*;
// public class callbyvalue {
//     public static void Sum(int num1, int num2) {
//         int sum = num1 + num2;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         Sum(a, b);
//     }
// }
// write a code to fucntion call  and print in main function
import java.util.*;

public class callbyvalue {

    public static int Sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Ssum = Sum(a, b);
        System.out.println("sum is :" + Ssum);
    }
}
