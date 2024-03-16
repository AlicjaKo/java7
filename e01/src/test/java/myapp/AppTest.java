package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testStringExercise() {
        String[] args = { "Lorem", "ipsum", "dolor", "sit", "amet" };
        String concatenatedString = "Lorem ipsum dolor sit amet";

        String expectedReversedString = "tema tis rolod muspi meroL";
        int expectedVowelCount = 9;
        int expectedWordCount = 5;
        String expectedFrequencyMap = "{ =4, a=1, d=1, e=2, i=2, L=1, l=1, m=3, o=3, p=1, r=2, s=2, t=2, u=1}";

        assertEquals(expectedReversedString, StringUtilities.reverseString(concatenatedString));
        assertEquals(expectedVowelCount, StringUtilities.countVowels(concatenatedString));
        assertEquals(expectedWordCount, StringUtilities.countWords(concatenatedString));
        assertEquals(expectedFrequencyMap, StringUtilities.characterFrequencyMap(concatenatedString).toString());
    }
}
