import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class PrintingQuotesProgram {
    private BufferedReader reader;
    private BufferedWriter writer;

    public PrintingQuotesProgram(BufferedReader reader, BufferedWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void execute() throws IOException {
        outputString("What is the quote? ");
        String quote = reader.readLine();
        outputString("Who said it? ");
        String author = reader.readLine();
        outputString(produceQuoteString(author, quote));
    }

    private String produceQuoteString(String author, String quote) {
        String result = String.format("%s says, \"%s\"", author, quote);
        return result;
    }

    private void outputString(String output) throws IOException {
        writer.write(output);
        writer.flush();
    }

    public void printListOfQuotes() throws IOException {
        List<Quote> quotes = DummyQuotes.getQuotes();
        for (Quote quote : quotes) {
            String escapedQuote = produceQuoteString(quote.getAuthor(), quote.getQuote());
            writer.write(escapedQuote);
            writer.newLine();
            writer.flush();
        }
    }

}
