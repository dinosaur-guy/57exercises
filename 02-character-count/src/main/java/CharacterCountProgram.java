import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CharacterCountProgram {
    private BufferedReader reader;
    private BufferedWriter writer;

    public CharacterCountProgram(BufferedReader reader, BufferedWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void execute() throws IOException {
        String input = askForInput();
        showCharacterCount(input);
    }

    private String askForInput() throws IOException {
        String prompt = "What is the input string? ";
        writer.write(prompt);
        writer.flush();

        String input = reader.readLine();

        if (input.length() <= 0) {
            writer.write("Empty strings are not allowed. Try again...\n");
            writer.flush();
            return askForInput();
        }

        return input;
    }

    private void showCharacterCount(String name) throws IOException {
        String output = String.format("'%s' has %d characters", name, name.length());
        writer.write(output);
        writer.flush();
    }
}
