//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class greetMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello " + name + ".Nice to meet you!" );
    }
}
