import java.util.Scanner;
public class Solution2 {
    //To write a program that finds a given number is negative or positive
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        int Number=sc.nextInt();
        if( Number>0 ){
            System.out.println(Number+" is a Positive Number.");
        }
        else{
            System.out.println(Number+" is a Negative Number.");
        }
    }
}
