package study;

public class Fish extends Pet {
    int currentDepth = 0;
    public int dive (int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Dive to the depth " + howDeep + " inch");
        System.out.println("I am on the depth " + currentDepth + " inch under sea level");
        return  currentDepth;
    }
}
