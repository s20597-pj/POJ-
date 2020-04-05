package Zad17;
/**
 * summary: Palindrom
 * author: Mateusz Hinca
 **/
public class Palindrom {
    public static void main(String[] args) {
        checkPalindrom("Atak kata");
        checkPalindrom("Muzo, raz daj jad za rozum");
        checkPalindrom("Wódy żal dla żydów");
    }

    private static void checkPalindrom(String text) {
        text = text.toLowerCase().replaceAll(",", "").replace(" ", "");
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--)
            reversed += text.charAt(i);

        if(reversed.equals(text)){
            System.out.println("Zdanie jest palindromem");
        }else{
            System.out.println("Zdanie nie jest palindromem");
        }
    }
}
