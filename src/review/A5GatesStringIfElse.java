package review;

public class A5GatesStringIfElse {
    public static void main(String[] args) {

        String destination="Asia";
        if (destination.equalsIgnoreCase("Europe")){
            System.out.println("Gate A");
        }
        else if (destination.equalsIgnoreCase("Africa")){
            System.out.println("Gate B");
        }
        else if (destination.equalsIgnoreCase("Asia")){
            System.out.println("Gate C");
        }
        else if (destination.equalsIgnoreCase("America")){
            System.out.println("Gate D");
        }
        else{
            System.out.println("wrong destination");

        }

    }
}
