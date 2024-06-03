// PrisonTest.java
public class PrisonTest {
    public static void main(String[] args) {
        // Instantiate two prisoners
        Prisoner twitch = new Prisoner("Twitch", "5'8\" (1.73m)", "3 years");
        Prisoner bubba = new Prisoner("Bubba", "6'10\" (2.08m)", "4 years");

        // Display information about the prisoners
        System.out.println("Information about Twitch:");
        twitch.displayInfo();

        System.out.println("\nInformation about Bubba:");
        bubba.displayInfo();

        System.out.println(bubba == twitch);

        System.out.println(bubba);
        System.out.println(twitch);

        System.out.println("percobaan:");

        bubba = twitch;
        bubba.name = "Bubba";
        twitch.name = "Twitch";

        System.out.println(bubba.name);
        System.out.println(bubba == twitch);
    }
}