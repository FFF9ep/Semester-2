public class Prisoner {
    String name;
    String height;
    String sentence;

    public Prisoner(String name, String height, String sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    public void think() {
        System.out.println("YOU WILL PAY THIS SUFFERING GODDAMMIT!!!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence);
    }
}