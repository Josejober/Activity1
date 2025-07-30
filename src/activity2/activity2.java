package activity2;

import java.util.Scanner;

public class activity2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name;
        float rate, totalhours, total, contribution, netwage;
        
        System.out.print("Enter employee name:");
        name = input.nextLine();
        System.out.print("Enter hourly rate:");
        rate = input.nextFloat();
        System.out.print("Enter total hours worked this week:");
        totalhours = input.nextFloat();
        
        total = rate * totalhours;
        contribution = (float) (total*0.1);
        netwage = total - contribution;
        
        System.out.println("-----Wage Summary-----");
        System.out.println("Employee:"+name);
        System.out.println("Hourly Rate:"+rate);
        System.out.println("Hours Worked"+totalhours);
        System.out.println("Gross Weekly Wage: ₱"+total);
        System.out.println("SSS Contribution (10%): ₱"+contribution);
        System.out.println("----------------------");
        System.out.println("Net Weekly Wage:₱"+netwage);
    }
    
}