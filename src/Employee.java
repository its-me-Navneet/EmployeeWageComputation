import java.util.Random;

public class Employee {
     
    private String name ;
    private String address ;
    private String type ;
    private int SalaryPerHour ; 
    private int workingHoursMonth ;

     public Employee(String name ,String address, String type ,Company c){
        this.name=name ;
        this.address=address ;
        this.type=type ;
        this.SalaryPerHour=c.getWagePerHour() ;
        this.workingHoursMonth =c.getWorkingHoursMonth();
     }
  

        int checkEmployeePresentOrAbsent() {

        Random random = new Random();

        return random.nextInt(9);

    }
      
     int employeeWageForToday() {
        int hourPresent = checkEmployeePresentOrAbsent();
        System.out.println("Today you work for " + hourPresent);
        return hourPresent * SalaryPerHour;
    }
      int partTimeEmployeeWage() {
        int WagePerHour = 10;
        int hourPresent = checkEmployeePresentOrAbsent();
        System.out.println("Today you work for " + hourPresent);
        return hourPresent * WagePerHour;

    }

     int wagesForMonth() {

        return SalaryPerHour*workingHoursMonth;
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


    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String getType() {
        return type;
    }


    public int getSalaryPerHour() {
        return SalaryPerHour;
    }


    public int getWorkingHoursMonth() {
        return workingHoursMonth;
    }
    



}
