import java.util.*;

class sumproduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            System.out.print("\n\t ENTER ANY NUMBER : ");
            int num = sc.nextInt();
            int sum = 0, pro = 1;

            while (num > 0) {
                sum = sum + (num % 10);
                pro = pro * (num % 10);
                num = num / 10;
            }

            System.out.print("\n\t SUM OF DIGIT OF NUMBER : " + sum);
            System.out.print("\n\t PRODUCT OF DIGIT OF NUMBER : " + pro);

            System.out.print("\n\n\t\t DO YOU WANT TO CONTINUE(Y/N) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        sc.close();
    }
}
