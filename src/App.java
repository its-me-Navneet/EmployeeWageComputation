import java.util.Random;

public class App {
    static int checkEmployeePresentOrAbsent() {

        Random random = new Random();

        return random.nextInt(9);

    }
    static int employeeWageForToday(){

         return checkEmployeePresentOrAbsent()*20 ;
    }

   static int partTimeEmployeeWage() {
         int WwagePerHour = 10 ;
         int hourPresent =checkEmployeePresentOrAbsent(); 
          System.out.println("Today you work for "+hourPresent);
          return hourPresent *WwagePerHour;


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

        // For Daily wage Computation 

        int wage = employeeWageForToday();
        System.out.println("Income for today work is "+ wage); 

    }
}
