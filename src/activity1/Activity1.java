package activity1;

import java.util.Scanner;


public class Activity1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        String name;
        int subjects;
        float total = 0;
        
        System.out.println("Enter student name: ");
        name=input.nextLine();
        
        System.out.println("Enter number of subjects: ");
        subjects=input.nextInt();
        
        for(int i = 1; i <= subjects; i++){
            System.out.println("Enter grade for sub" + i + ":");
            total += input.nextInt();
            
            
        }
        float average = total / subjects;
                
        System.out.println("Average: "+average);
        
        if(average > 74 ){
            System.out.println("Remarks: PASSED");                
        }else{
        System.out.println("Remarks: FAILED");
    }
        
    }
    
}
