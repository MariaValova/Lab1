public class Mainpackage com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int quantity = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word ");
        String string = in.nextLine();
        char[] word = string.toCharArray();
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] sym = symbols.toCharArray();
        for (int i = 0; i < symbols.length()/2; i++) {
            for (int j = 0; j < string.length(); j++)
                if (word[j] == sym[i] || word[j] == sym[i + 26])
                    quantity++;
            if (quantity != 0) {
                System.out.println(sym[i] + " - " + quantity);
                quantity = 0;
            }
        }
    }
} {
}
