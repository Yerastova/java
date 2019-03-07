package study;

public class Pet {
    int age;
    float weight;
    float height;
    String color;
    public void sleep () {
        System.out.println("Good night! See you tomorrow");
    }
    public void eat () {
        System.out.println("I am very hungry, let`s eat nachos!");
    }
    public String say (String aWord) {
        String petResponse = "Okay!!" + aWord;
        return petResponse;
    }

}
