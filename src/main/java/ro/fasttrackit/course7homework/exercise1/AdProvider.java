package ro.fasttrackit.course7homework.exercise1;

public interface AdProvider {
    void advertise(String text);

    default void saySomething() {
        System.out.println("Hello");
    }
}
