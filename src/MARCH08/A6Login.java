package MARCH08;

import java.util.Scanner;

public class A6Login {
    public static void main(String[] args) {
        String userName="user";
        String passWord="pass";
        Scanner scanner=new Scanner(System.in);
        System.out.println("User Name: ");
        String user=scanner.next();
        System.out.println("Password: ");
        String pass=scanner.next();

        if (user.equals(userName) && passWord.equals(pass)){
            System.out.println("Welcome your page");
        }
        else {
            System.out.println("User name or password is wrong");
        }

    }
}
