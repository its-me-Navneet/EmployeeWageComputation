public class Company {
    private String name ;
    private int numberOfWorkingDays ;
    private int workingHoursMonth ; 
    private int wagePerHour ;
    
    
  
    public Company(String name, int numberOfWorkingDays, int workingHoursMonth,int wagePerHour) {
        this.name = name;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.workingHoursMonth = workingHoursMonth;
        this.wagePerHour =wagePerHour ;
    }
    

      public void setName(String name) {
        this.name = name;
    }
    public void setWagePerHour(int hour){
        this.wagePerHour =hour ;
    }
    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }
    public void setWorkingHoursMonth(int workingHoursMonth) {
        this.workingHoursMonth = workingHoursMonth;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }
    public int getWorkingHoursMonth() {
        return workingHoursMonth;
    } 
    public int getWagePerHour(){
        return wagePerHour ;
    }

    
}
