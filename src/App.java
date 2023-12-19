import java.util.Random;

public class App {
    static int checkEmployeePresentOrAbsent() {

        Random random = new Random();

        return random.nextInt(9);

    }
    static int employeeWageForToday(){

         return checkEmployeePresentOrAbsent()*20 ;
    }

    static void partTimeEmployeeWage(){
            // Do not have clarity of question    
 
    }
    static int wagesForMonth(){
         
         return 20*8*20 ;
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

        // For calculating Monthly Wages 

        int totalWage = wagesForMonth();
        System.out.println("Total wages for a month is "+ totalWage);

    }
}
