package review;

public class D8CarDecision {
    public static void main(String[] args) {
        String tested ="No";
        boolean mileage=true;
        boolean age=false;

        if (tested.equalsIgnoreCase("NO")){
            System.out.println("Don't buy");
        }
        else{
            if(mileage){
                System.out.println("Buy");
            }
            else{
                if (age){
                    System.out.println("Buy");
                }
                else{
                    System.out.println("Don't buy");
                }
            }
        }
    }
}
