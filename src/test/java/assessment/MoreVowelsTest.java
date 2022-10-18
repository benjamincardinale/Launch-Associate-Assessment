package assessment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoreVowelsTest {


    final MoreVowels mv = new MoreVowels();

    final List<String> testListOne = List.of("pen", "sword", "staff", "mighty", "happy", "vowel", "onomatopoeia");
    final List<String> resultListOne = List.of("mighty", "happy", "vowel", "onomatopoeia");

    final List<String> testListTwo =List.of("who", "what", "when", "why", "where", "starting", "gourd", "pasta", "role");
    final List<String> resultListTwo = List.of("where", "starting", "gourd", "pasta", "role");

    @Test
    void removeWordsOne() {
        List<String> actual = mv.removeWordsWithOnlyOneVowel(testListOne);

        assertEquals(resultListOne.size(), actual.size(), "Length of returned array should be equal to 4");
        assertEquals(resultListOne, actual, String.format("Expected {%s}, but was {%s}.", resultListOne,actual));
    }
    @Test
    void removeWordsTwo() {
        List<String> actual = mv.removeWordsWithOnlyOneVowel(testListTwo);

        assertEquals(resultListTwo.size(), actual.size(), "Length of returned array should be equal to 4");
        assertEquals(resultListTwo, actual, String.format("Expected {%s}, but was {%s}.", resultListTwo, actual));
    }


}
