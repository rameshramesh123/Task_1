import java.util.Scanner;
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter The Purchased Amount:");
        int PurchasedAmount=sc.nextInt();
        if(PurchasedAmount>1000){
            int discount=PurchasedAmount/100*25;
            System.out.println("Purchased Amount is: "+PurchasedAmount +"\n"+"Applying discount of 20%: "+discount +"\n"+
                    "The Final payable amount after applying discount is: "+(PurchasedAmount-discount) );



        } else if (PurchasedAmount>=500 && PurchasedAmount<=1000) {
            int discount=PurchasedAmount/100*10;
            System.out.println("Purchased Amount is: " + PurchasedAmount + "\n" + "Applying discount of 10%: " + discount + "\n" +
            "The Final payable amount after applying discount is: " + (PurchasedAmount - discount));


        }
        else {
            int discount=PurchasedAmount/100*0;
            System.out.println("Purchased Amount is: " + PurchasedAmount + "\n" + "Applying discount of 0%: " + discount + "\n" +
                    "The Final payable amount after applying discount is: " + (PurchasedAmount - discount));
            ;

        }
        }


    }


