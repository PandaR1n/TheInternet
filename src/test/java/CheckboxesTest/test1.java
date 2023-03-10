package CheckboxesTest;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;

public class test1 {

    public static class CheckboxTest {
        @Test
        public void testCheckboxState() {

            open("http://the-internet.herokuapp.com/checkboxes");

        }
    }

}
