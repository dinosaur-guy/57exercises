import java.util.ArrayList;
import java.util.List;

public class GreetingRandom implements Greeting {
    private List<String> greetings;

    public GreetingRandom() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello %s, nice to meet you!");
        greetings.add("Bonjour %s!");
        greetings.add("Hallo %s!");

        this.greetings = greetings;
    }

    @Override
    public String getGreeting(String greeted) {
        return String.format(getRandomGreetingFromList(), greeted);
    }

    private String getRandomGreetingFromList() {
        int randomIndex = (int) Math.round(Math.random()) * (greetings.size() - 1);
        return greetings.get(randomIndex);
    }
}
