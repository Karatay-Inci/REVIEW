package MARCH08;

public class KHT18Arrays {
    public static void main(String[] args) {
        String myStr = "$%^&*_";

        int ln = myStr.length()-1;

        char[] chars= myStr.toCharArray();

        for (char x: chars){
            if (x!=' '){
                System.out.print(myStr.charAt(ln));
                ln--;
            }
        }
    }
}
