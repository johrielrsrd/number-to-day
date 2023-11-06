import java.util.Scanner;

public class NumberToDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a day (1-7): ");
        int day = scan.nextInt();
        scan.close();

        switch (day) {
            case 1:
                System.out.println("The day is Monday.");
                break;
            case 2:
                System.out.println("The day is Tuesday.");
                break;
            case 3:
                System.out.println("The day is Wednesday.");
                break;
            case 4:
                System.out.println("The day is Thursday.");
                break;
            case 5:
                System.out.println("The day is Friday.");
                break;
            case 6:
                System.out.println("The day is Satuday.");
                break;
            case 7:
                System.out.println("The day is Sunday.");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
