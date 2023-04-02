package tests;

import helpers.TestsDataRshb;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static helpers.TestsDataRshb.menuElementsCount;
@Owner("Olshanskaya")
@Tag("UITests")
public class ManePageTests extends TestBaseRshb {
    TestsDataRshb testsData = new TestsDataRshb();
    @BeforeEach
    void openMainPage() {
        mainPage.openMeinPage();
    }
    @DisplayName("Проверка наличия логотипа на главной странице")
    @Test
    void checkLogoTest() {
        mainPage.checkLogo();
    }

    @DisplayName("Проверка заголовка на главной странице")
    @Test
    void checkTitleTest() {
        mainPage.checkTitleOfThePage(testsData.titleMainPage);
    }
    @DisplayName("Проверка меню на главной странице")
    @Test
    void checkNavMenuButtonsTest() {
        mainPage.openNavMenu()
                .checkNavMenuElements(TestsDataRshb.menuElements)
                .checkNavMenuElementsCount(menuElementsCount)
                .closeNavMenu();
    }
}
