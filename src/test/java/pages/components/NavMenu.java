package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NavMenu {
    private SelenideElement menuBtn = $(".menu-btn"),
    menuBtnClose = $(".menu-btn.close");

    private ElementsCollection menuElementsNames = $$(".nav-links"),
    menuElements = $$(".nav-links");

    public void openMenu() {
        menuBtn.click();
    }
    public void checkMenuElements(List<String> menuElement) {
        menuElementsNames.filter(visible)
                .shouldHave(CollectionCondition.texts(menuElement));
    }
    public void checkCountMenuElements(int resultCount) {
        menuElements.should(CollectionCondition.size(resultCount));
    }
    public void closeMenu() {
        menuBtnClose.click();
    }

}
