public class Solution3
{
    public static void main(String[] args)
    {
       String s1="876";
       String reverse="";
        for (int i =2; i >=0 ; i--)
        {
            reverse=reverse+s1.charAt(i);
        }
        System.out.println("Output="+reverse);
        

    }
}
