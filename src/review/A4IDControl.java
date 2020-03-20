package review;

import java.util.Scanner;

public class A4IDControl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have ID?");
        String id=scanner.next();
       // boolean id=true;
        if (id.equals("YES")){
            System.out.println("You can enter the room");
        }
        else if (id.equals("NO")){
            System.out.println("Sorry, You can not enter the room ");
        }
    }
}
