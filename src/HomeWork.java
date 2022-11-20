import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //First LEVEL
        Scanner scanner = new Scanner(System.in);
        int rep = scanner.nextInt();
        String string = "Я начинаю разбираться с циклами";
        while (rep > 0) {
            System.out.println(string);
            rep--;
        }
        //Second LEVEL
        Scanner secondScanner = new Scanner(System.in);
        String str = secondScanner.nextLine();
        int len = str.length();
        while (len > 0) {
            System.out.println(str.charAt(0));
            len--;
        }
    }
}
