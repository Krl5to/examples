package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll()");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("beforeAll()");
    }

    @BeforeEach
    void BeforeEach() {
        Configuration.browser = "firefox";
        System.out.println("    BeforeEach()");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("    AfterEach()");
    }

    @Test
    void firstTest() {
        System.out.println("        firstTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("        secondTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("        thirdTest()");
        Assertions.assertTrue(3 > 2);
    }

}