import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorldApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = inputReader.readLine();
        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);
    }
}
