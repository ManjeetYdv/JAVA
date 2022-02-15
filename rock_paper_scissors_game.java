
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class rock_paper_scisor_game {
    public static void main(String[] args) {
        System.out.println(" ******ROCK PAPER SCISOR ******");
        System.out.println("");
        System.out.println("1.Rock\n2.Paper\n3.Scisoors ");

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
String ch ="";

        do {
            int comp = 0;
            int you = 0;



            System.out.println("HOW MANY TIMES YOU WANNA PLAY ?");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {

                int random = rn.nextInt(3) + 1;
                System.out.println("Enter YOUR CHOICE");
                int x = sc.nextInt();

                if (x == 1 && random == 1) {

                    System.out.println("You chose : rock ");
                    System.out.println("Computer chose: rock");
                    System.out.println("TIE");
                }

             if(x==2&&random==2){
                System.out.println("You chose : paper ");
                 System.out.println("Computer chose: paper");
                 System.out.println("TIE");
}
                if(x==3&&random==3){

                    System.out.println("You chose : scisoor ");
                    System.out.println("Computer chose: scissor");
                    System.out.println("TIE");
                }
                if(x==1&&random==2){

                    System.out.println("You chose : Rock ");
                    System.out.println("Computer chose: Paper");
                    System.out.println("you lose");
                    comp++;


            }
                if(x==1&&random==3){

                    System.out.println("You chose : Rock ");
                    System.out.println("Computer chose: scissor");
                    System.out.println("you won");
                    you++;


                }

                if(x==2&&random==1){

                    System.out.println("You chose : paper ");
                    System.out.println("Computer chose: rock");
                    System.out.println("you won");
                    you++;


                }
                if(x==2&&random==3){

                    System.out.println("You chose : paper ");
                    System.out.println("Computer chose: scissor");
                    System.out.println("computer won ");
                    comp++;



                }

                if(x==3&&random==1){

                    System.out.println("You chose : scisorr ");
                    System.out.println("Computer chose: rock");
                    System.out.println("computer won ");
                    comp++;



                }
                if(x==3&&random==2) {

                    System.out.println("You chose : scissor");
                    System.out.println("Computer chose: paper ");
                    System.out.println("you won ");
                    you++;
                }
if(x!=1&&x!=2&&x!=3){
                        System.out.println("WRONG CHOICE");

                    }
                    }

            if(comp>you){
                System.out.println("COMPUTER WON BY "+ comp+"-"+you);


                }
            if(you>comp){
                System.out.println("YOU WON BY "+you+"-"+comp);
            }
            if(you==comp){
                System.out.println("Your Score "+you);
                System.out.println("computer score "+comp);
                System.out.println("Its a tie");
            }
            System.out.println("wanna play more ");
            System.out.println("PRESS Y/y FOR Yes and N/n for No");
            String arg =sc.next();
            ch = ch + arg;

        }
        while( ch.equals("Y")&& ch.equals("y"));


    }
}
