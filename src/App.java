import java.util.Scanner;

public class App {
private int noOfCompany ; 
 private Company company[] ;   
 
   public  App(int n){
     
     this.noOfCompany = n; 
     company = new Company[n] ;
   }
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");
        System.out.println("************************************");

     
        //  Company GE =new Company("GE", 5, 100,500 );
        //       Employee Emp1 = new Employee("xyz1", "xyz", "Full-Time",GE) ; 
        //       GE.setNoOfEmployee(GE.getNoOfEmployee()+1);
        //       Employee Emp2 = new Employee("xyz2", "xyz", "Full-Time",GE) ; 
        //      GE.setNoOfEmployee(GE.getNoOfEmployee()+1);  
        //      System.out.println(GE.getNoOfEmployee()); 
  
        App  EmpWageBuilder = new App(3) ; 
        
         EmpWageBuilder.company[0] =new Company("GE", 5, 100,500 );
         EmpWageBuilder.company[1] =new Company("xyz2", 5, 100,400 );
         EmpWageBuilder.company[2] =new Company("xyz3", 5, 100,600 );
         
         int totalWage = 0 ;
         for(int i=0;i< EmpWageBuilder.noOfCompany ;i++){
             
            totalWage += EmpWageBuilder.company[i]. wagesForMonth() ; 
         }

         System.out.println(totalWage);


    }
}
