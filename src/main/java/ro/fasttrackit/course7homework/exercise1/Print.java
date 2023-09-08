package ro.fasttrackit.course7homework.exercise1;

public class Print implements AdProvider {
    public void advertise(String text) {
        System.out.println("Printing the following text in paper: " + text);
    }
}
