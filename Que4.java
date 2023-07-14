package PrePlacementTraning.JavapptAssign3;
//Q4.Write a program to show Compile time polymorphism in java?
public class Que4 {
     private static int add(int i, int j) {
       int sum1=i+j;
       return sum1;
    }
    private static int add(int a,int b,int c){
        int sum2=a+b+c;
        return sum2;
    }
    private static double add(double a,double b){
        double sum3=a+b;
        return sum3;
    }
    
    public static void main(String[] args) {
        Que4 q=new Que4();
       int ans1= add(4,5);
        int ans2=add(4,5,6);
       double ans3= add(1.2,2.2);
       System.out.println(ans1);
       System.out.println(ans2);
       System.out.println(ans3);
    }

   
    
}
