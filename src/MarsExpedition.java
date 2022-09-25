import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        // Scanner to store user input
        Scanner input = new Scanner(System.in);



        // Loading messages
        System.out.println("Expedition prep program starting...");

        System.out.println("Booting up...");

        System.out.println("...");

        System.out.println("...");

        System.out.println("...");

        System.out.println("Ready");



        // Asks and gets the user's name
        System.out.println("Hello user. What is your name?");

        String name = input.nextLine();



        // Welcomes user and gets input
        System.out.println("Hi, " + name + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

        String excited = input.nextLine();



        // Checks if user entered Y, ignoring case
        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }
        else {
            System.out.println("Too bad you are team leader. You have to go.");
        }



        // Asks user for input
        System.out.println("How many people do you want on your expedition team? (Input an integer.)");

        int teamSize = input.nextInt();

        input.nextLine();



        // Checks if teamSize that user entered is greater than 2
        if (teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");

            // Set team size equal to 2
            teamSize = 2;
        }
        else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");

            // Set team size equal to 2
            teamSize = 2;
        }
        else if (teamSize == 2) {
            System.out.println("That's the perfect size for the team. Good job.");
        }



        // Asks user for more input
        System.out.println("You are allowed to bring one weapon with you. You know, just in case. What do you bring?");

        String weapon = input.nextLine();

        System.out.println("Nice choice. You will be bringing a " + weapon + " with you.");



        // Asks user for more input
        System.out.println("You have a choice of 3 vehicles:" +
                "\nA: Mars Rover" +
                "\nB: Chevy Silverado" +
                "\nC: Honda Civic");

        String vehicleChoice = input.nextLine();



        // Sets vehicleChoice equal to user's selection, ignoring case
        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        }
        else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        }
        else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        }
        else {
            // If user doesn't select A, B, or C
            vehicleChoice = "your feet";
        }



        // Prints output to the user
        System.out.println("Your expedition team is now ready!" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}
