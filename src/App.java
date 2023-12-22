import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");
        System.out.println("************************************");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please Enter the Below Option");
            System.out.println("Option 1 Check present");
            System.out.println("Option 2 for calculating Today Salary ");
            System.out.println("Option 3 for calculating monthly salary for Full-Time ");
            System.out.println("Option 4 for calculating monthly salary for part time ");
            System.out.println("Option 5 for Exit ");
            System.out.println("******************************");
            int option = sc.nextInt();
            sc.nextLine(); 
            //................ Details of Employee................
              Company GE =new Company("GE", 5, 100,500 );
              Employee Emp = new Employee("xyz", "xyz", "part-Time",GE) ;
            switch (option) {
                case 1:
                    // For checking whether Employee is present or not
                    int hour = Emp.checkEmployeePresentOrAbsent();

                    if (hour == 0) {
                        System.out.println("Absent");
                    } else {
                        System.out.println("Present");
                    }
                    break;

                case 2:
                    // For Daily wage Computation

                    int wage = Emp.employeeWageForToday();
                    System.out.println("And Income for today work is " + wage);
                    break;
                case 3:
                    // For calculating Monthly Wages for full-time 
                    int totalWage = Emp.wagesForMonth();
                    System.out.println("Total wages for a month is " + totalWage);
                    break;
                case 4:
                    // For calculating Monthly Wages for part -time
                    int Salary = Emp.wageForMonthPartTime();
                    System.out.println("Total wages for a month is " + Salary);
                    break; 
                case 5:
                    System.out.println("Thank you for using this service");
                    return;

                default:
                    System.out.println("Please Enter valid option");
                    break;
            }
            System.out.println("******************************");

        }

    }
}
