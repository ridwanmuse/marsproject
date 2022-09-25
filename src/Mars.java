public class Mars {

    public static void main(String[] args) throws InterruptedException {
        // Mars Adventure Game Part 1
        // Create a string variable named ColonyName, and set it equal to your desired name
        String ColonyName = "Cat Colony";

        // Create and set ShipPopulation equal to 300
        int ShipPopulation = 300;

        // Create and set ShipFood equal to 4000.00
        double ShipFood = 4000.00;

        // Create and set Landing equal to true
        boolean Landing = true;



        // Upon reaching Mars everyone will eat 0.75 meals a day, to preserve food
        // The landing process takes 2 days, calculate how much food is left after landing
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);

        System.out.println(ShipFood);

        // Food added. Increase by 50%
        ShipFood = ShipFood + (ShipFood * .5);

        // Five people added to population
        ShipPopulation = ShipPopulation + 5;



        // Choose where to land: The Hill, The Plain, or The Ocean
        String LandingLocation = "The Ocean";

        // Check to see if LandingLocation is equal to our desired location, ignoring case
        if (LandingLocation.equalsIgnoreCase("The Ocean")) {
            System.out.println("Bbzzz Landing on the Ocean");
        }
        else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Ocean");
        }

        // Call landingCheck() that has a parameter of 100, returns a boolean, and set it equal to Landing
        Landing = landingCheck(100);



        // Mars Adventure Game Part 2
        // Call GuessingGame (GuessingGame.java)
        new GuessingGame();



        // Mars Adventure Game Part 3
        // Call MarsExpedition (MarsExpedition.java)
        new MarsExpedition();



        // Mars Adventure Game Part 4
        // Call FindingsLists (FindingsLists.java)
        new FindingsLists();
    }


    public static boolean landingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            // Checks to see if i divisible by 3 equals 0, and that i divisible by 5 equals 0
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            }
            // Checks if i divisible by 5 equals 0
            else if ((i % 5) == 0) {
                System.out.println("Right");
            }
            // Checks if i divisible by 3 equals 0
            else if ((i % 3) == 0) {
                System.out.println("Left");
            }
            else {
                System.out.println("Calculating");
            }

            Thread.sleep(250);
        }

        System.out.println("Landed");

        // The ship landed on Mars! Return false value.
        return false;
    }
}