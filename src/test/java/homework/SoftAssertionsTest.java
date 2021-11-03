package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsTest {

    @Test
    void softAssertionShouldBeJunit() {
        Configuration.browserSize = "1900x1200";
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".markdown-body").shouldHave(text("Soft assertions"));
        // Откройте страницу SoftAssertions
        $(".markdown-body").$(byText("Soft assertions")).click();
        //Проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    sleep(3000);
    }
}
