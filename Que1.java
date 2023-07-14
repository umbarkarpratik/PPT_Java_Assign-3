package PrePlacementTraning.JavapptAssign3;
//Q1. Write a simple Banking System program by using OOPs concept 
// where you can get account Holder name balance etc?
import java.util.Scanner;
public class Que1 {
     private static int newacc() {
        System.out.println("enter the Name");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println("enter the deposit amount");
        int bal=sc.nextInt();
        return bal;
    }
    public static void main(String[] args) {
        Que1 bank=new Que1();
        System.out.println("enter new account");
        int balance= newacc();

        System.out.println("Enter 1 for view balance");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Account Balance "+ balance);
        }
        else
        System.out.println("invalid input");
    }

}
