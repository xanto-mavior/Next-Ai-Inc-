
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrew M Yor
 */
public class TriathlonResults {
    /*import java.util.ArrayList;*/
    /*import java.util.Collections;*/
    /*import java.util.List;*/

// Base class Participant
final class Participant {
    private String name;
    private String id;
    private int swimmingTime;
    private int cyclingTime;
    private int runningTime;

    // Constructor to initialize participant details
    public Participant(String name, String id, int swimmingTime, int cyclingTime, int runningTime) {
        this.name = name;
        this.id = id;
        setSwimmingTime(swimmingTime);
        setCyclingTime(cyclingTime);
        setRunningTime(runningTime);
    }

    // Getters and setters for the attributes
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSwimmingTime() {
        return swimmingTime;
    }

    public void setSwimmingTime(int swimmingTime) {
        if (swimmingTime < 0) {
            System.out.println("Swimming time cannot be negative.");
        } else {
            this.swimmingTime = swimmingTime;
        }
    }

    public int getCyclingTime() {
        return cyclingTime;
    }

    public void setCyclingTime(int cyclingTime) {
        if (cyclingTime < 0) {
            System.out.println("Cycling time cannot be negative.");
        } else {
            this.cyclingTime = cyclingTime;
        }
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        if (runningTime < 0) {
            System.out.println("Running time cannot be negative.");
        } else {
            this.runningTime = runningTime;
        }
    }

    // Method to calculate the total time of the participant
    public int calculateTotalTime() {
        return swimmingTime + cyclingTime + runningTime;
    }

    // Polymorphic method to display participant details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Time: " + calculateTotalTime() + " minutes");
    }
}
// Derived class BeginnerParticipant
// Derived class EliteParticipant

// Main class TriathlonResults
/*public class TriathlonResults {*/
    public static void main(String[] args) {
        // List of participants
        List<Participant> participants = new ArrayList<>();

        // Adding participants to the list
        /* participants.add(new EliteParticipant("Alice", "A001", 25, 40, 20, "Nike"));*/
        /* participants.add(new EliteParticipant("Bob", "B002", 20, 35, 25, "Adidas"));*/
        /*participants.add(new BeginnerParticipant("Charlie", "C003", 30, 50, 30));*/
        /* participants.add(new BeginnerParticipant("Diana", "D004", 28, 42, 18));*/

        // Sorting the participants by total time
        Collections.sort(participants, (p1, p2) -> Integer.compare(p1.calculateTotalTime(), p2.calculateTotalTime()));

        // Displaying details of all participants
        System.out.println("Triathlon Results:");
        for (Participant participant : participants) {
            participant.displayDetails();
            System.out.println("-------------------------------");
        }

        // Determine and print the participant with the fastest total time
        if (!participants.isEmpty()) {
            Participant firstPlace = participants.get(0);
            System.out.println("Fastest Participant:");
            firstPlace.displayDetails();
            System.out.println("-------------------------------");

            // Check if there is a second fastest participant
            if (participants.size() > 1) {
                Participant secondPlace = participants.get(1);
                System.out.println("Second Fastest Participant:");
                secondPlace.displayDetails();
                System.out.println("-------------------------------");
            }
        } else {
            System.out.println("No participants available.");
        }
    }
}


