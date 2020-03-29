package MARCH08;

public class A5GatesStringSwitchCase {
    public static void main(String[] args) {
        String destination="Asia";
        destination=destination.toLowerCase();

        switch (destination){
            case "europe":
                System.out.println("Gate A");
                break;
            case "africa":
                System.out.println("Gate B");
                break;
            case "asia":
                System.out.println("Gate C");
                break;
            case "america":
                System.out.println("Gate D");
                break;
            default:
                System.out.println("Not a destination");
        }
    }
}
