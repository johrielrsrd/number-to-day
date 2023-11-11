import java.util.Scanner;

public class NumberToDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter input (1-7): ");

        if (!scan.hasNextInt()) {
            System.out.print("Invalid!");
        } else {
            int day = scan.nextInt();
            checkNumToDay(day);
        }
    }

    public static void checkNumToDay(int day) {
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
                System.out.println("Out of range!");
                break;
        }
    }
}
