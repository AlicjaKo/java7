import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringExerciseTest {

    @Test
    void testStringExercise() {
        String[] args = { "Lorem", "ipsum", "dolor", "sit", "amet" };
        String concatenatedString = "Lorem ipsum dolor sit amet";

        String expectedReversedString = "tema tis rolod muspi meroL";
        int expectedVowelCount = 10;
        int expectedWordCount = 5;
        String expectedFrequencyMap = "L : 1\no : 2\nr : 2\ne : 1\nm : 3\n  : 4\ni : 2\np : 1\ns : 2\nd : 1\nu : 1\nt : 1\na : 1";

        assertEquals(concatenatedString, StringExercise.concatenateStrings(args));
        assertEquals(expectedReversedString, StringUtilities.reverseString(concatenatedString));
        assertEquals(expectedVowelCount, StringUtilities.countVowels(concatenatedString));
        assertEquals(expectedWordCount, StringUtilities.countWords(concatenatedString));
        assertEquals(expectedFrequencyMap, StringUtilities.characterFrequencyMap(concatenatedString).toString());
    }
}