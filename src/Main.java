import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);

        System.out.println("enter number a : ");
        int a= c.nextInt();
        System.out.println("enter number b: ");
        int b = c.nextInt();
        getSum(a,b);
    }

private static void getSum(int a,int b){
        System.out.println("Sum:" + (a+b ));
}

}

