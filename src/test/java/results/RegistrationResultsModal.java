package results;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {

    public void verifyModalAppears() {
        //$(".izi-modal__hh.color--green").shouldHave(text("Заявка отправлена"));
        $("div[class='modal izi-modal iziModal modal_active modal--short'] " +
                "div[class='modal__wrapper'] div[class='modal__body'] div[class='modal__inner'] " +
                "div[class='pr w-100 z-index-1'] div div[class='izi-modal__hh color--red']")
                .shouldHave(text("Ошибка отправки"));
    }
    public void verifyResult1() {
        $(".form__steps").lastChild().preceding(0).find(".form__step-title")
                .shouldHave(text("Образование и навыки"));
    }
    public void verifyResult2() {
        $(".form__steps").lastChild().find(".form__step-title")
                .shouldHave(text("Достижения и опыт"));
    }
}
