package Claas4.MorningSession;

public class PersonStack implements Comparable<PersonStack> {
    String name;
    int age;

    public PersonStack(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   @Override
    public String toString() {
        return "PersonStack{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(PersonStack other){
        return  this.age - other.age;
    }

    public static void main(String[] args) throws StackOverflowExeption {
        CustomStack<PersonStack> personStack = new CustomStack<>(3);
        personStack.push(new PersonStack("Alice", 25));
        personStack.push(new PersonStack("Bob", 30));
        personStack.push(new PersonStack("Charlie", 22));

        System.out.println("Unsorted Stack of Person" + personStack);

        personStack.sort();

        System.out.println("Sorted Stack of Person by age" + personStack);


    }
}
