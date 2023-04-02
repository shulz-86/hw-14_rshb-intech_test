package tests;

import helpers.TestsDataRshb;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("Olshanskaya")
@Tag("UITests")
public class SearchPageTests extends TestBaseRshb {
    TestsDataRshb testsData = new TestsDataRshb();
    @BeforeEach
    void openPage() {
        searchPage.openSearchPage();
    }
    @DisplayName("Проверка работы строки поиска")
    @Test
    void checkSearchResult() {
        searchPage.fillSearchField(testsData.searchData)
                .checkResultOfSearch(testsData.resultOfSearch, testsData.totalResult);
    }
}
