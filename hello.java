import java.util.Scanner;

public class hello {

    int mul(int a, int b){
        int product = a*b;
        return product;
    }

    public hello() {
        System.out.println("This is the Constructor");
    }

    int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hello h1 = new hello();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = h1.mul(a, b);
        int sum = h1.add(a, b);
        System.out.println("This is our Product "+ prod);
        System.out.println("This is our Sum "+ sum);
    }
}