import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        System.out.println("First level:");
        System.out.println("Введите слово или предолжение:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int lenghtLine = str.length();
        System.out.println("Коичетво символов:");
        System.out.println(lenghtLine);
        System.out.println("Количество символов больше 10?");
        if (lenghtLine > 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("Первый и последний символ равны?");
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("Second LEVEL");
        Scanner secondScanner = new Scanner(System.in);
        String symbol = secondScanner.nextLine();
        symbol = symbol.replace('A', ' ');
        symbol = symbol.replace('B', 'A');
        symbol = symbol.replace(' ', 'B');
        System.out.println(symbol);
    }
}
