package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
// import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
//        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open ("/text-box");
//        getWebDriver().manage().window().maximize();

        $("#userName").setValue("Petr Ivanov");
        $("#userEmail").setValue("Petr_Ivanov@mail.ru");
        $("#currentAddress").setValue("Rostov");
        $("#permanentAddress").setValue("Kazan");
        $("#submit").click();

//        $("#output").$("#name").shouldHave(text("Petr Ivanov"));
        $("#output #name").shouldHave(text("Petr Ivanov"));
        $("#output #email").shouldHave(text("Petr_Ivanov@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Rostov"));
        $("#output #permanentAddress").shouldHave(text("Kazan"));
    }
}
