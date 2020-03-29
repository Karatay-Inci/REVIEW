package MARCH08;

import java.util.Scanner;

public class D7DecisionTree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Does  animal breath air Y, N?");

        String animal=scanner.next();
        if (animal.equalsIgnoreCase("Y")){

            System.out.println("Does the animal lay egg? Y or N");
            String layEgg=scanner.next();

            if (layEgg.equalsIgnoreCase("Y")){
                System.out.println("Bird");
            }
                else{
                System.out.println("Mammal");
                }
        }
            else{
                System.out.println("Fish");
            }

         ////////////////////////////////////////////////////////////////
/*
        String breathe="Yes";
        String layEggs="No";

        String myAnimal="";

        if (!(breathe.equalsIgnoreCase("NO"))){
            if (layEggs.equalsIgnoreCase("Yes")){
                myAnimal="Bird";
            }
            else{
                myAnimal="Mammal";
            }
        }
            else{
                myAnimal="Fish";
        }
        System.out.println(myAnimal);*/
    }
}
