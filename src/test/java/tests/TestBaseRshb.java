package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.MainPage;
import pages.RegistrationPage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBaseRshb {
    RegistrationPage rshbRegistrationPage = new RegistrationPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void setUp() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
