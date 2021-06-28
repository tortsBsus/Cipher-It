package Ciphers.CaesarP;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CaesarCipher cipher = new CaesarCipher(5); 

        System.out.print("\nEnter the text to be encrypted : \n\t");
        String text = sc.nextLine();

        String encrypted = cipher.encrypt(text);
        System.out.println("\n    Encrypted text : ");
        System.out.println("    \t" + encrypted);

        String decrypted = cipher.decrypt(encrypted);
        System.out.println("\n    Decrypted text : ");
        System.out.println("    \t" + decrypted);

        System.out.println();
        sc.close();
    }
}