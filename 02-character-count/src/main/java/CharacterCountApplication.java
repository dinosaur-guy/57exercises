import java.io.*;

public class CharacterCountApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        CharacterCountProgram program = new CharacterCountProgram(reader, writer);
        program.execute();
    }
}
