package MARCH08;

public class D15MethodsRemoveAllSpace {
    /*WRITE  A METHOD TO REMOVE ALL SPACES GIVEN SENTENCE
           -SAMPLE INPUT="It is a perfect day to study Java"
           -SAMPLE OUTPUT='ItisaperfectdaytostudyJava"      */
    public static void main(String[] args) {
        removeSpacesVoid("It is a perfect day to study Java");
        System.out.println();
        System.out.println(removeSpaces("It is a perfect day to study Java"));
    }
    public static void removeSpacesVoid(String sentence){
        for (int i=0;  i<sentence.length();  i++){
            if (sentence.charAt(i)!='_'){       //sentence.charAt means is current character
                System.out.print(sentence.charAt(i));
            }
        }
    }
    public static String removeSpaces(String sentence){
        String result="";
        for (int i=0;  i<sentence.length();  i++){
            if (sentence.charAt(i)!=' ')
                result+=sentence.charAt(i);
            else{
                result+='_';
            }
        }
        return result;
    }
}
