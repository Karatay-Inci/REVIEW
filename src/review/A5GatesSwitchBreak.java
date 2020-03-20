package review;

import java.util.Scanner;

public class A5GatesSwitchBreak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Where are you going:");

        String where=scanner.nextLine();

        switch (where){
            case "Europe":
                System.out.println("Gate A");
                break;
            case "Africa":
                System.out.println("Gate B");
                break;
            case "Asia":
                System.out.println("Gate C");
                break;
            case "America":
                System.out.println("Gate D");
                break;
            default:
                System.out.println("Gate E");
        }
    }
}
