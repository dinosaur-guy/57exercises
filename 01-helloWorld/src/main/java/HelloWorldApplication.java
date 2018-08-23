import java.io.*;

public class HelloWorldApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        GreetingProgram program = new GreetingProgram(reader, writer, new GreetingBasic());
        program.execute();
    }
}
