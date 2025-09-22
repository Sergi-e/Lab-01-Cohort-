import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    //Task 1: Inputs
        int age, jersey_number;
        double height, weight;
        String name;
        
        System.out.print("Enter the player's name: ");
        name = scan.next();

        System.out.print("Enter the player's age: ");
        age = scan.nextInt();

        System.out.print("Enter the player's Jersey number: ");
        jersey_number = scan.nextInt();

        System.out.print("Enter the player's Height (in meters): ");
        height = scan.nextDouble();

        System.out.print("Enter the player's weight (in pounds): ");
        weight = scan.nextDouble();

        // Task 2: Converting the necessary inputs
        double pound = 0.45359237;
        int meter = 100;
        double weigh_kilos = weight / pound;
        double heigh_cents = height * meter;
        int casted_weight = (int) weigh_kilos;

        //Task 3: Incrementing and Decrementing
        age++;
        jersey_number--;

        //Task 4: Eligibility
        String eligibility = "";
        if (age >= 18 && age <= 35 && casted_weight <= 90) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not Eligible";
        }

        //Task 5: Categorizing
        String category = "";
        if (age < 20) {
            category = "Rising Star";
        } else if (age >= 20 && age < 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }

        //Task 6 & 7: Using the switch for Players' positions
        String position = "";
        switch (jersey_number) {
            case 1:
                position = "GoalKeeper";
                break;
            case 2: case 5:
                position = "Defender";
                break;
            case 6: case 8:
                position = "Midfielder";
                break;
            case 7: case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player Position Not Known";
        }

        // Attacker status using the jersey number
        String attacker_status = (jersey_number == 7 || jersey_number == 9 || 
                                  jersey_number == 10 || jersey_number == 11)
                                  ? "Yes" : "No";

        //Task 8: The decision for line up
        String lineup_decision = "";
        if (category.equals("Prime Player")) {
            if (casted_weight < 80) {
                lineup_decision = "Starting lineup";
            } else {
                lineup_decision = "Bench";
            }
        } else {
            lineup_decision = "Bench";
        }

        //Task 9: The Final decision
        String final_status = eligibility.equals("Eligible") ? "Play" : "Rest";

        //Player Report 
        System.out.println("\n=== PLAYER REPORT ===");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heigh_cents + " cm");
        System.out.println("Weight: " + casted_weight + " kg");
        System.out.println("Jersey: " + jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attacker_status);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineup_decision);
        System.out.println("Final Decision: " + final_status);

        //Task 10. Unwanted Fall-through Demo Part
        System.out.println("Unwanted Fall-Through Demo");
        switch (jersey_number) {
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
            default:
                System.out.println("Player Position Not Known");
        }
    }
}