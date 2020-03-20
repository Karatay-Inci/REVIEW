package review;

public class A4IDITidControl {
    public static void main(String[] args) {
        boolean idRegular=true;        //Change this area true or false
        boolean ITid=true;
        if (idRegular || ITid){
            System.out.println("Welcome to Building");
            if (ITid){
                System.out.println("Welcome to IT Room");
            }
            else{
                System.out.println("You can not enter IT Room");
            }
        }
        else {
            System.out.println("You can not enter building");
        }
    }
}
