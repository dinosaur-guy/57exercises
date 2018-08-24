import java.util.ArrayList;
import java.util.List;

public class DummyQuotes {
    private static List<Quote> quotes = new ArrayList<>();

    private static void initializeQuotes() {
        quotes.add(new Quote("Obi Wan Kenobi", "These aren't the droids you're looking for."));
        quotes.add(new Quote("Homer Jay Simpson", "D'oh!"));
    }

    public static List<Quote> getQuotes() {
        if (quotes.size() <= 0) {
            initializeQuotes();
        }
        return quotes;
    }
}
