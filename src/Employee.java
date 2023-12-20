import java.util.Random;

public class Employee {
     
    private String name ;
    private String address ;
    private String type ;
    private int SalaryPerHour ; 

     public Employee(String name ,String address, String type ,int salary){
        this.name=name ;
        this.address=address ;
        this.type=type ;
        this.SalaryPerHour=salary ;
     }
  

        int checkEmployeePresentOrAbsent() {

        Random random = new Random();

        return random.nextInt(9);

    }
      
     int employeeWageForToday() {
        int hourPresent = checkEmployeePresentOrAbsent();
        System.out.println("Today you work for " + hourPresent);
        return hourPresent * 20;
    }
      int partTimeEmployeeWage() {
        int WagePerHour = 10;
        int hourPresent = checkEmployeePresentOrAbsent();
        System.out.println("Today you work for " + hourPresent);
        return hourPresent * WagePerHour;

    }

     int wagesForMonth() {

        return SalaryPerHour * 8 * 20;
    }
      int wageForMonthPartTime() {

        int day = 0;
        int hr = 0;

        while (day <= 20 && hr < 100) {
            day++;
            hr += checkEmployeePresentOrAbsent();
        }
        int Salary = hr * SalaryPerHour;
        return Salary;
    }


}
