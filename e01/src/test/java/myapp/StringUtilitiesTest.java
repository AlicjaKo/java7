package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class StringUtilitiesTest {

    @Test
    public void testReverseString() {
        assertEquals("cba", StringUtilities.reverseString("abc"));
        assertEquals("", StringUtilities.reverseString(""));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, StringUtilities.countVowels("hello"));
        assertEquals(0, StringUtilities.countVowels("xyz"));
        assertEquals(0, StringUtilities.countVowels(""));
    }

    @Test
    public void testCountWords() {
        assertEquals(3, StringUtilities.countWords("hello world java"));
        assertEquals(0, StringUtilities.countWords(""));
    }

    @Test
    public void testCharacterFrequencyMap() {
        Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('a', 2);
        expectedMap.put('b', 1);
        expectedMap.put('c', 2);
        expectedMap.put('d', 4);
        expectedMap.put('e', 2);

        assertEquals(expectedMap, StringUtilities.characterFrequencyMap("abccdaeeddd"));
        assertEquals(new HashMap<Character, Integer>(), StringUtilities.characterFrequencyMap(""));
    }
}
