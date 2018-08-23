import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class GreetingProgram {
    private BufferedReader reader;
    private BufferedWriter writer;
    private Greeting greeting;

    public GreetingProgram(BufferedReader reader, BufferedWriter writer, Greeting greeting) {
        this.reader = reader;
        this.writer = writer;
        this.greeting = greeting;
    }

    public void execute() throws IOException {
        writer.write("output");
        writer.flush();
        String name = askForName();
        showGreeting(name);
    }

    private String askForName() throws IOException {
        String prompt = "What is your name? ";
        writer.write(prompt, 0, prompt.length());
        writer.flush();
        return reader.readLine();
    }

    private void showGreeting(String name) throws IOException {
        String output = greeting.getGreeting(name);
        writer.write(output);
        writer.flush();
    }
}
