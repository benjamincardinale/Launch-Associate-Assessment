package assessment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {

    final private ReverseList rl = new ReverseList();
    private List<String> testList = Arrays.asList("great", "doing", "are", "You");
    private List<String> resultList = List.of("You", "are", "doing", "great");
    private List<String> testListTwo = Arrays.asList("try", "no", "is", "there", "not", "do", "or", "Do");
    private List<String> resultListTwo = List.of("Do", "or", "do", "not", "there", "is", "no", "try");
    @Test
    void reverseList_01() {
        List<String> actual = rl.reverseList(testList);
        System.out.println(actual.toString());
        assertEquals( resultList, actual, "Actual list should equal expected");
    }

    @Test
    void reverseList_02() {
        List<String> actual = rl.reverseList(testListTwo);
        System.out.println(actual.toString());
        assertEquals(resultListTwo, actual, "Actual list should equal expected");
    }
}
