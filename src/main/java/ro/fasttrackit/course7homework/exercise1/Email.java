package ro.fasttrackit.course7homework.exercise1;

public class  Email implements AdProvider {
    public void advertise(String text) {
        System.out.println("Sending email ad with content" + text);
    }
}
