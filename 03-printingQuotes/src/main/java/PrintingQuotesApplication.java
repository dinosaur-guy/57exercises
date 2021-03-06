import java.io.*;

public class PrintingQuotesApplication {
    public static void main(String[] args) throws IOException {
        //askForAndPrintQuote();
        printListOfQuotes();
    }

    private static void askForAndPrintQuote() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        PrintingQuotesProgram printingQuotesProgram = new PrintingQuotesProgram(reader, writer);
        printingQuotesProgram.execute();
    }

    private static void printListOfQuotes() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        PrintingQuotesProgram printingQuotesProgram = new PrintingQuotesProgram(reader, writer);
        printingQuotesProgram.printListOfQuotes();
    }
}
