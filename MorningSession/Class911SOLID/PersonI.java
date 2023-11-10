package scr.MorningSession.Class911SOLID;
// Exercise 1:
//Imagine an interface Person with methods study(), work(), and play().
// Break it down so that Student and Worker classes can implement only the methods relevant to them.
interface Activity {
    void play();
}
interface Study extends Activity {
    void study();
}
interface Work extends Activity {
    void work();
}

class StudentI implements Study{

    @Override
    public void play() {
        System.out.println("Student is playing.");
    }
    @Override
    public void study() {
        System.out.println("Student is studying.");
    }
}
class Worker implements Work{
    @Override
public void work() {
    System.out.println("Worker is working.");
}
    @Override
    public void play() {
        System.out.println("Worker is playing.");
    }

}
public class PersonI {
    public static void main(String[] args) {
        Study student = new StudentI();
        student.study();  // Outputs: Student is studying.
        student.play();   // Outputs: Student is playing.

        Work worker = new Worker();
        worker.work();    // Outputs: Worker is working.
        worker.play();    // Outputs: Worker is playing.
    }
}
