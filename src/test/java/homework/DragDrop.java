package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Selenide.open;

public class DragDrop {

    @Test
    void moveAtoB() {
        Configuration.browserSize = "1900x1200";
        // открыть страничку selenide
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b header").shouldHave(text("A")).click();

        sleep(3000);
    }
}
