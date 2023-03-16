package rshb;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {
    public void verifyModalAppears() {
        $(".izi-modal__hh.color--green").shouldHave(text("Заявка отправлена"));

    }
}
