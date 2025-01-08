/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package next.ai.inc;

/**
 *
 * @author Andrew M Yor
 */
public class NextAiInc {

        // Method to calculate weekly pay
    public static void calculateWeeklyPay(double basePay, int hoursWorked) {
        // Check for base pay condition
        if (basePay < 30000) {
            System.out.println("Error: Base pay must not be below UGX 30,000.");
            return; // exit the method if the pay is below UGX 30,000
        }

        // Check for hours worked condition
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked cannot exceed 72 hours in a week.");
            return; // exit the method if hours worked exceed 72
        }

        // Calculating regular and overtime pay
        double regularHours = Math.min(hoursWorked, 48); // up to 48 hours are regular hours
        double overtimeHours = Math.max(0, hoursWorked - 48); // overtime starts after 48 hours

        // Regular pay calculation
        double regularPay = regularHours * basePay;
        
        // Overtime pay calculation (double the base pay)
        double overtimePay = overtimeHours * (basePay * 2);

        // Total pay
        double totalPay = regularPay + overtimePay;

        // Output the total weekly pay
        System.out.println("Total weekly pay: UGX " + totalPay);
    }

    // Main method to test the program with sample contractors
    public static void main(String[] args) {
        System.out.println("Testing Contractor A");
        calculateWeeklyPay(30000, 51); // Test Case for Contractor A
        
        System.out.println("\nTesting Contractor B");
        calculateWeeklyPay(20000, 40); // Test Case for Contractor B
        
        System.out.println("\nTesting Contractor C");
        calculateWeeklyPay(35000, 96); // Test Case for Contractor C

    }
    
}
