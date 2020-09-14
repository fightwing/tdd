import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MommifierTest {

    @Test
    void should_return_true_when_Thirty_percent_of_the_given_string_length_is_vowels(){
        boolean flage = vowel.isVowelMoreThanThirtyPercent("aqqerr");
        assertTrue(flage);
    }

    @Test
    void should_insert_mommy_for_each_continuous_set_of_vowels_when_Thirty_percent_of_the_given_string_length_is_vowels(){
        String result = vowel.insertMommy("aqqerr");
        assertEquals("amommyqqemommyrr",result);

    }


}
