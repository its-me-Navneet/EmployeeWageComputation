import java.util.Random;
import java.util.Scanner;

public class App {
    static int checkEmployeePresentOrAbsent() {

        Random random = new Random();

        return random.nextInt(9);

    }

    static int employeeWageForToday() {
          int hourPresent =checkEmployeePresentOrAbsent(); 
          System.out.println("Today you work for "+hourPresent);
          return hourPresent * 20;
    }

   static int partTimeEmployeeWage() {
         int WagePerHour = 10 ;
         int hourPresent =checkEmployeePresentOrAbsent(); 
          System.out.println("Today you work for "+hourPresent);
          return hourPresent * WagePerHour;


    }

    static int wagesForMonth() {

        return 20 * 8 * 20;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");
        System.out.println("************************************");

        Scanner sc = new Scanner(System.in);
      
         
        while (true) {
            System.out.println("Please Enter the Below Option");
            System.out.println("Option 1 Check present");
            System.out.println("Option 2 for calculating Today Salary ");
            System.out.println("Option 3 for calculating monthly salary ");
            System.out.println("Option 4 for Exit ");
            System.out.println("******************************");
              int option = sc.nextInt();
                          sc.nextLine();
            switch (option) {
                case 1:
                    // For checking whether Employee is present or not

                        int hour = checkEmployeePresentOrAbsent();

                        if (hour == 0) {
                            System.out.println("Absent");
                        } else {
                            System.out.println("Present");
                        }
                       break;

                case 2: 
                       // For Daily wage Computation

                        int wage = employeeWageForToday();
                        System.out.println("And Income for today work is " + wage);
                        break;
                case 3:
                        // For calculating Monthly Wages   
                        int totalWage = wagesForMonth();
                        System.out.println("Total wages for a month is " + totalWage);
                        break;
                case 4:
                        System.out.println("Thank you for using this service"); 
                        return ;
                    
                default:
                       System.out.println("Please Enter valid option");
                       break ;
        }
      System.out.println("******************************");
        
       
    }
   


    }
}
