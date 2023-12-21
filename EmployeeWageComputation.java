import java.util.Objects;
import java.util.Random;
public class EmployeeWageComputation {
    public static void main(String args[])
    {
        System.out.println("Welcome to Employee Wage Computation Program...!!");
        //UC1-CHECK EMPLOYEE ATTENDENCE
        boolean isPresent=new Random().nextBoolean();
        if(isPresent){
            System.out.println("Employee is present.");
        }
        else{
            System.out.println("Employee is not present.");

        }

        //UC2-CALCULATE DAILY EMPLOYEE WAGE
        int wagePerHour=20;
        int hoursWorked=8;
        int dailyWage=wagePerHour*hoursWorked;
        System.out.println("Daily Employee Wage: "+dailyWage);


        //UC3-ADD PART TIME EMPLOYEE AND WAGE
        int partTimeHours=4;
        int partTimeWage=wagePerHour*partTimeHours;
        System.out.println("Part Time Employee Wage: "+partTimeWage);


        //UC4-SOLVING USING SWITCH CASE STATEMENT
        int employeeType=2;
        int wage;
        switch(employeeType){
            case 1:
                wage=dailyWage;
                break;
            case 2:
                wage=partTimeWage;
                break;
            default:
                wage=0;
                System.out.println("Invalid Employee Type:");
        }
        System.out.println("Employee Wage using Switch: "+wage);


        //UC5-CALCULATE WAGES FOR A MONTH
        int workingDays=20;
        int monthlyWage=dailyWage*workingDays;
        System.out.println("Monthly Employee Wage: "+monthlyWage);


        //UC6-CALCULATE WAGES TILL A CONDITION IS REACHED
        int maxHours=100;
        int maxDays=20;
        int totalHours=0;
        int totalDays=0;
        int totalWage=0;

        while(totalHours<maxHours&&totalDays<maxDays){
            totalWage+=dailyWage;
            totalHours+=hoursWorked;
            totalDays++;
        }
        System.out.println("Total Employee Wage till condition:"+totalDays);
    }
}
