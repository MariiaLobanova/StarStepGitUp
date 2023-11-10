package scr.MorningSession.Class911UtilConcurrent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ColorSetExercise {
    public static void main(String[] args) {
        // Create a CopyOnWriteArraySet to store unique colors
        CopyOnWriteArraySet<String> colorSet = new CopyOnWriteArraySet<>();

        // Add colors to the set
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Green");
        colorSet.add("Yellow");

        // Iterate over the set to print the color names
        Iterator<String> iterator = colorSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


