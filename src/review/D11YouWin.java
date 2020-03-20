package review;
import java.util.Scanner;
public class D11YouWin {
    /*   -->Write a virtual chat program repeats user input until user enters you win
    *Sample input="Hello"   --> Sample output ="You said Hello"
    * Sample input="you win"   --> Sample output ="I knew i will win"
    * */
    public static void main(String[] args) {
        String answer=" ";
        Scanner scanner=new Scanner(System.in);

        while(!answer.equalsIgnoreCase("you won")){
            System.out.print("Talk little bit:");
            answer=scanner.nextLine();

            if (!answer.equalsIgnoreCase("you won")){
                System.out.println("You said "+ answer);
            }
        }
        System.out.println("I knew I will win!!!");
    }
}
