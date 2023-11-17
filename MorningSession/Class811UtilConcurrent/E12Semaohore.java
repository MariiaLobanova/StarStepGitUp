package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.Semaphore;

// Simulate a bathroom with 3 stalls using Semaphore.
public class E12Semaohore {
    public static void main(String[] args) {
        // Create a Semaphore with 3 permits, representing the number of available bathroom stalls
        Semaphore bathroomStalls = new Semaphore(3);

        // Create multiple threads representing people who want to use the bathroom
        for (int i = 1; i <= 10; i++) {
            Thread person = new Thread(new Person(bathroomStalls, "Person " + i));
            person.start();
        }
    }

    static class Person implements Runnable {
        private final Semaphore bathroomStalls;
        private final String name;

        public Person(Semaphore bathroomStalls, String name) {
            this.bathroomStalls = bathroomStalls;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                // Acquire a bathroom stall permit (blocks if no stalls are available)
                bathroomStalls.acquire();

                System.out.println(name + " is using the bathroom.");

                // Simulate some time spent in the bathroom
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(name + " has left the bathroom.");
                // Release the bathroom stall permit when done
                bathroomStalls.release();
            }
        }
    }
}

