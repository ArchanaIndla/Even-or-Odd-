import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        sc.close();
        System.out.println(a%2==0? "Even": "Odd");
    }
}
