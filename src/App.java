import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App implements EmployeeWageInterface {
    
private int noOfCompany ; 
 private ArrayList<Company> company ;  
 private ArrayList<Integer>dailyIncome ;
 private HashMap<String,Company> companyList ;
 
   public  App(int n){
     
     this.noOfCompany = n; 
     company = new ArrayList<>() ;
     dailyIncome = new ArrayList<>() ;
     companyList = new HashMap<String,Company>() ;
   }
   
    @Override
public void addCompany(Company c) { 
   companyList.put(c.getName(), c) ;
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


    @Override
public int computeDailyWage() {
     int todayWage =0 ;
     for(int i=0;i<noOfCompany ;i++){
             
            todayWage += company.get(i). oneDayWage() ; 
         }
         return todayWage ;
  
}

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to calculating wage computation");
        System.out.println("************************************");

   
  
         App  EmpWageBuilder = new App(3) ; 
        
         EmpWageBuilder.addCompany(new Company("GE", 5, 100,500 ));
         EmpWageBuilder.addCompany(new Company("xyz2", 5, 100,400) );
         EmpWageBuilder.addCompany(new Company("xyz3", 5, 100,600 ));
         
        // int totalWage = EmpWageBuilder.computeWage() ;
        //  System.out.println(totalWage);
        // int totalWage =0 ;
        //  for(int i=0;i<30;i++){
        //   EmpWageBuilder.dailyIncome.add(EmpWageBuilder.computeDailyWage()) ;
        //   System.out.println(EmpWageBuilder.dailyIncome.get(i)); 
        //   totalWage += EmpWageBuilder.dailyIncome.get(i) ;
        //  }

        //  System.out.println("Total income for month is "+ totalWage); 
       

        
        int totalWage =0 ;
        System.out.println("Enter Company name ");
         String name = new Scanner(System.in).nextLine() ; 
      
         Company companyName = EmpWageBuilder.companyList.get(name) ;
         if(companyName == null) {
           System.out.println("You do not work in this company"); 
           return ;
         }

         totalWage = companyName.wagesForMonth() ;
         System.out.println("total wage for the " + name + " is "+ totalWage);

         

    }
}
