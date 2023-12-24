import java.util.ArrayList;
import java.util.Scanner;

public class App implements EmployeeWageInterface {
    
private int noOfCompany ; 
 private ArrayList<Company> company ;  
 
   public  App(int n){
     
     this.noOfCompany = n; 
     company = new ArrayList<>() ;
   }
   
    @Override
public void addCompany(Company c) {
   company.add(c) ;
    
}

@Override
public int computeWage() {
     int totalWage = 0 ;
         for(int i=0;i<noOfCompany ;i++){
             
            totalWage += company.get(i). wagesForMonth() ; 
         }
         return totalWage ;

    
}

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");
        System.out.println("************************************");

   
  
        App  EmpWageBuilder = new App(3) ; 
        
         EmpWageBuilder.addCompany(new Company("GE", 5, 100,500 ));
         EmpWageBuilder.addCompany(new Company("xyz2", 5, 100,400) );
         EmpWageBuilder.addCompany(new Company("xyz3", 5, 100,600 ));
         
        int totalWage = EmpWageBuilder.computeWage() ;
         System.out.println(totalWage);


    }
}
