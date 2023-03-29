package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
public class SearchPage {

    private SelenideElement
            searchResultsTitle = $(".heading-letters"),
            totalResults = $(".total-result"),
            inputField = $(".searchInput");
    @Step("открыть страницу")
    public SearchPage openSearchPage() {
        open(baseUrl);
        return this;
    }
    @Step("ввести значение в поле для поиска вакансии")
    public SearchPage fillSearchField(String text) {
        inputField.setValue(text).pressEnter();
        return this;
    }

    @Step("проверить результат выполнения поиска")
    public SearchPage checkResultOfSearch(String resultsTitle, String result) {
        searchResultsTitle.shouldHave(text(resultsTitle));
        totalResults.shouldHave(text(result));
        return this;
    }


}
