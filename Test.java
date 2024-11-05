import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("這是Git的練習用程式，是個加法器，請輸入一個數字，答案會是輸入+10");
        Scanner input = new Scanner(System.in);
        int x, y;
        x = input.nextInt();
        y = 10;
        System.out.println("x + y = " + (x + y));
    }
}
