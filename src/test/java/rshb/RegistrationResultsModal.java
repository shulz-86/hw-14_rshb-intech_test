package rshb;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationResultsModal {
    public void verifyModalAppears() {
        sleep(3000);
        //$(".izi-modal__hh.color--green").shouldHave(text("Заявка отправлена"));
        $("div[class='modal izi-modal iziModal modal_active modal--short'] " +
                "div[class='modal__wrapper'] div[class='modal__body'] div[class='modal__inner'] " +
                "div[class='pr w-100 z-index-1'] div div[class='izi-modal__hh color--red']")
                .shouldHave(text("Ошибка отправки"));
    }
}
