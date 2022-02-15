import java.util.*;

public class permutation_and_combination {
    public static void main(String[] args) {

        char ch;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\t ENTER N  : ");
            int n = sc.nextInt();
            System.out.println("\n\t ENTER R : ");
            int r = sc.nextInt();
            int n_fact = 1;
            int r_fact = 1;
            float n_r_fact = 1;
            for (int i = 1; i <= r; i++) {
                r_fact *= i;
            }
            for (int i = 1; i <= n; i++) {
                n_fact *= i;
            }
            for (int i = 1; i <= (n - r); i++) {
                n_r_fact *= i;
            }
            System.out.println("\n\t PERMUTATION IS : " + (n_fact / n_r_fact));
            System.out.println("\n\t COMBINATION IS : " + (n_fact / (n_r_fact * r_fact)));
            System.out.print("/n/t DO YOU WANT TO CONTINUE(Y/N) :");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}
