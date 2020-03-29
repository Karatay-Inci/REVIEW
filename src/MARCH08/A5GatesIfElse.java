package MARCH08;

import java.util.Scanner;

public class A5GatesIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Where are you going?  (Europe,Africa, Asia,Americ)  :");
        String place=scanner.next();
        if (place.equalsIgnoreCase("Europe")){
            System.out.println("Gate A");
        }
        else if (place.equalsIgnoreCase("Africa")){
            System.out.println("Gate B");
        }
        else if (place.equalsIgnoreCase("Asia")){
            System.out.println("Gate C");
        }
        else if (place.equalsIgnoreCase("America")){
            System.out.println("Gate D");
        }
        else{
            System.out.println("wrong enter");

        }

    }
}
