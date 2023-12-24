import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");
        System.out.println("************************************");


         Company GE =new Company("GE", 5, 100,500 );
              Employee Emp1 = new Employee("xyz1", "xyz", "Full-Time",GE) ; 
              GE.setNoOfEmployee(GE.getNoOfEmployee()+1);
              Employee Emp2 = new Employee("xyz2", "xyz", "Full-Time",GE) ; 
             GE.setNoOfEmployee(GE.getNoOfEmployee()+1);  
             System.out.println(GE.getNoOfEmployee());

    }
}
