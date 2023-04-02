package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.components.NavMenu;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private NavMenu menu = new NavMenu();
    private SelenideElement logo = $(".main__header-logo").$(".g-image"),
            pageTitle = $(".title-xl");

    @Step("открыть страницу")
    public MainPage openMeinPage() {
        open(baseUrl);
        return this;
    }
    @Step("проверить наличие логотипа на главной странице")
    public MainPage checkLogo() {
        logo.isImage();
        return this;
    }
    @Step("проверить наличие заголовка на главной странице")
    public MainPage checkTitleOfThePage(String titleName) {
        pageTitle.shouldHave(text(titleName));
        return this;
    }
    @Step("раскрыть меню")
    public MainPage openNavMenu() {
        menu.openMenu();
        return this;
    }
    @Step("проверить количество элементов меню")
    public MainPage checkNavMenuElementsCount(int resultCount) {
        menu.checkCountMenuElements(resultCount);
        return this;
    }

    @Step("проверить названия элементов меню")
    public MainPage checkNavMenuElements(List<String> menuElement) {
        menu.checkMenuElements(menuElement);
        return this;
    }
    @Step("закрыть меню")
    public MainPage closeNavMenu() {
        menu.closeMenu();
        return this;
    }
}
