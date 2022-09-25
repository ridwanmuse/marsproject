import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists {
    public FindingsLists() throws InterruptedException {
        // Stop terminal for half a second
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");



        // ROCKS
        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");



        // Add different rocks to rockList, then prints rockList
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);



        // Prints message to user
        System.out.println("Wait a second... That last one is not a rock. We need to delete that one from the list.");



        // Removes "not rock" from rockList, then reprints rockList
        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Perfect!");



        // FOSSILS
        // Stop terminal for half a second
        Thread.sleep(500);



        // Allows for two attributes
        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded.");



        // Add different fossils to fossilDirectory
        fossilDirectory.put("Bird Fossil", "The fossil has wings, implying it was capable of flight.");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish-shaped, implying there was once water.");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil.");



        // Asks for input from the user
        System.out.println("Which of the fossils would you like to learn more about? Spelling and spacing is important!");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();



        // Prints appropriate output to user depending on their input, ignoring case
        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }



        // SUPPLIES BROUGHT
        // Stop terminal for half a second
        Thread.sleep(500);

        HashSet<String> suppliesBrought = new HashSet<>();

        HashSet<String> suppliesUsed = new HashSet<>();

        // Adds items to suppliesBrought
        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");



        // Adds items to suppliesUsed
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");



        // Prints leftover item(s)
        System.out.println("Medicine");
    }
}
