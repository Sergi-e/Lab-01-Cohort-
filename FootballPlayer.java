//Task 1
import java.util.Scanner;
public class FootballPlayer{
    public static void main(String[] args) {
        //Accepting the inputs
        Scanner scan=new Scanner(System.in);
        int age, jersey_number;
        double height, weight;
        String name;
        
        System.out.print("Enter the player's name");
        name=scan.next();
        
        System.out.print("Enter the player's age");
        age=scan.nextInt();
        
        System.out.print("Enter the player's Jersey number");
        jersey_number=scan.nextInt();
        
        System.out.print("Enter the player's Height");
        height=scan.nextDouble();
        
        System.out.print("Enter the player's weight");
        weight=scan.nextDouble();
        //Displaying the outputs 
        System.out.println("Player name -" + name);
        System.out.println("Age -" + age);
        System.out.println("Height -" + height);
        System.out.println("Weight -" + weight);
        System.out.println("Jersey Number -" + jersey_number);
        
        //Task 2
        double pound=0.45359237;
        int meter=100;
        double weigh_kilos=weight/pound;
        double heigh_cents=height/meter;
        int casted_weight=(int) weigh_kilos;
        System.out.println("Player name -" + name);
        System.out.println("Age -" + age);
        System.out.println("Height -" + heigh_cents);
        System.out.println("Weight -" + casted_weight);
        System.out.println("Jersey Number -" + jersey_number);
        
        // Task 3
        System.out.println("The age is" +age);
        age++;
        jersey_number--;
        System.out.println("The new age is" +age);
        System.out.println("The new jersey number is" +age);
        
        // Task 4
        String eligibility="";
        if (age>=18 && age<=35 && casted_weight<=90){
            eligibility="ELIGIBLE";
            System.out.println(eligibility);
        }
        else{
            eligibility="Not eligible";
            System.out.println(eligibility);
        }
        if (age<18 || weight>=90){
            System.out.println("The player has a problem (Either too young or too heavy)" +age);
        }
        if (!(age>=18 && age<=35 && casted_weight<=90)){
            System.out.println("ELIGIBLE");
        }
        // Task 5
        String category="";
        if (age<20){
            category="Rising Star";
            System.out.println(category);
        }
        if(age>=20 || age<30 ){
            category="Prime Player";
            System.out.println(category);
        }
        if(age>30 ){
            category="Veteran";
            System.out.println(category);
        }
        
        //Task 6
        System.out.println("Please, enter the jersey number");
        int jersey_num=scan.nextInt();
        switch(jersey_num){
            case 1:
            System.out.println("GoalKeeper");
            break;
            case 2:
            System.out.println("Defender");
            break;
            case 6:
            System.out.println("Midfielder");
            break;
            case 7:
            System.out.println("Winger");
            break;
            case 9:
            System.out.println("Striker");
            break;
            case 10:
            System.out.println("Playmaker");
            break;
            case 11:
            System.out.println("Winger");
            break;
            case 5:
            System.out.println("Defender");
            break;
            case 8:
            System.out.println("Midfielder");
            break;
            default:
            System.out.println("Player Position Not Known");
              }
            
              //Task 7
            //Part A (Unwanted Fall-Through):
        switch(jersey_num){
            case 2:
            System.out.println("Defender");
            case 6:
            System.out.println("Midfielder");
            case 7:
            System.out.println("Winger");
            default:
            System.out.println("Player Position Not Known");
             }
            
             //Part B (Grouped Case – Useful Fall-Through):
        System.out.println("Enter the player's jersey number");
        switch(jersey_num){
            case 1:
            System.out.println("GoalKeeper");
            break;
            case 2:
            case 5:
            System.out.println("Defender");
            break;
            case 6:
            case 8:
            System.out.println("Midfielder");
            break;
            case 7:
            case 11:
            System.out.println("Winger");
            break;
            case 9:
            System.out.println("Striker");
            break;
            case 10:
            System.out.println("Playmaker");
            break;
            default:
            System.out.println("Player Position Not Known");
            
            //Task 8
        if (category.equals("Prime Player")){
            if (casted_weight<80){
                System.out.println("Starting lineup");
            }
            else{
                System.out.println("Bench");
            }
        }
        //Task 9
        String final_status=(category.equals("ELIGIBLE"))
                           ? "Play"
                           : "Rest";
        System.out.println(final_status);

     }
 }
}