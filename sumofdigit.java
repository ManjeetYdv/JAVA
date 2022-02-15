import java.util.*;

public class sumofdigit {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t ENTER ANY NUMBER : ");
        int num = sc.nextInt();
        int sum=0;
        while(num>0)
        {
            sum=sum + num%10;
            num=num/10;
        }        

        System.out.println("\n\t SUM OF DIGITS OF NUMBER IS : "+sum );
    }
}
