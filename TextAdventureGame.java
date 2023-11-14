import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself at a crossroads. Do you go left or right?");
        System.out.print("Enter your choice (left/right): ");
        
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "left":
                System.out.println("You chose to go left. You discover a treasure chest!");
                System.out.println("Do you want to open it (yes/no)?");
                String openChest = scanner.nextLine().toLowerCase();
                if (openChest.equals("yes")) {
                    System.out.println("Congratulations! You found a valuable treasure.");
                } else {
                    System.out.println("You decided not to open the chest. You continue on your journey.");
                }
                break;
            case "right":
                System.out.println("You chose to go right. You encounter a ferocious dragon!");
                System.out.println("Do you want to fight or run (fight/run)?");
                String dragonChoice = scanner.nextLine().toLowerCase();
                if (dragonChoice.equals("fight")) {
                    System.out.println("You bravely fought the dragon but unfortunately didn't make it. Game over!");
                } else if (dragonChoice.equals("run")) {
                    System.out.println("You wisely ran away from the dragon and survived.");
                } else {
                    System.out.println("Invalid choice. The dragon attacks you. Game over!");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 'left' or 'right'.");
        }

        System.out.println("Thanks for playing the Text Adventure Game!");
        scanner.close();
    }
}
