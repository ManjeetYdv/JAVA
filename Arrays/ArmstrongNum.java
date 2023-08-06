public class ArmstrongNum {

    static boolean numCheck(int num){
        if(num==0) return true;

        //checking number of digits
        int number = num;
        int digits=0;
        while(number>0){
            digits++;
            number/=10;
        }

        number =num;
        int sum=0;
        while(number>0){
            sum+=Math.pow((number%10) , digits);
            number/=10;
        }
         return sum==num;

    }
    public static void main(String[] args) {
        System.out.println(numCheck(1634));
    }
}
