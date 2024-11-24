import java.util.Scanner;
public class Solution4 {
    //write a java program to find the smallest number among three.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter First Number:");
        int Number1=sc.nextInt();
        System.out.println("Please Enter Second Number:");
        int Number2=sc.nextInt();
        System.out.println("Please Enter Third Number:");
        int Number3=sc.nextInt();
        if(Number1<Number2 && Number1<Number3){
            System.out.println(" smallest number is:"+" "+Number1);
        }
        else if (Number2<Number3) {
            System.out.println(" smallest number is:"+" "+ Number2);
        }
          else  {
                System.out.println(" Smallest Number is:"+" "+Number3);
            }

        }

    }

