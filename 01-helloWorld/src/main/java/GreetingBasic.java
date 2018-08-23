public class GreetingBasic implements Greeting {
    @Override
    public String getGreeting(String name) {
        return String.format("Hello, %s, nice to meet you!", name);
    }
}
