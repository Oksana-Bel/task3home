import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void dragAndDropElement() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));

        $("#column-a header").shouldHave(Condition.text("B"));
        $("#column-b header").shouldHave(Condition.text("A"));

    }
}
