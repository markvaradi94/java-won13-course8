package ro.fasttrackit.course7homework.exercise1;

public class Facebook implements AdProvider {
    public void advertise(String text) {
        System.out.println("Running ads on Facebook with content " + text);
    }
}
