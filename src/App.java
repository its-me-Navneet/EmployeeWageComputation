import java.util.Random;

public class App {
    static int checkEmployeePresentOrAbsent() {

        Random random = new Random();

        return random.nextInt(9);

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");

        // For checking whether Employee is present or not

        int hour = checkEmployeePresentOrAbsent();

        if (hour == 0) {
            System.out.println("Absent");
        } else {
            System.out.println("Present");
        }
    }
}