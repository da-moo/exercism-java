import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PangramChecker {
    private final static Pattern ALPHA_UNIQ_COUNT_PATTERN = Pattern.compile("([a-z])(?!.*\\1)");
    private final static int ALPHA_COUNT = 26;

    public boolean isPangram(String input) {
        Matcher counter = ALPHA_UNIQ_COUNT_PATTERN.matcher(input.toLowerCase());
        return counter.results().count() == ALPHA_COUNT;
    }

}
