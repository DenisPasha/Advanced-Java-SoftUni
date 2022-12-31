package P06DefiningClasses.Exercises.OpinionPoll;

public class OpinionPoll {
    String name;
    int age;

    public OpinionPoll(String name, int age) {

            this.age = age;
            this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
