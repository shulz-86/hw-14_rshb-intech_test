package rshb;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    private final String TITLE_TEXT = "Заявка на стажировку";

    private final SelenideElement
            nameInput = $("#name_33dert121"),
            dateOfBirthInput = $("#birthday_33dert121"),
            userNumberInput = $("#phone_33dert121"),
            userEmailInput = $("#email_33dert121"),
            city = $("#city_33dert121"),
            directionsSelect = $(".ks-select__current"),
            nextButton1 = $(".btn.btn--green.mt-0"),
            skill = $("#skill_33dert121"),
            stageOfStudySelect = $("div[name='stages'] div[class='ks-select__current']"),
            stageOfStudyRadio = $("div[name='stages'] div[class='ks-select__list']"),
            vuz = $("#vuz_33dert121"),
            expectations = $("#text_33dert121"),
            nextButton2 = expectations.parent().parent().sibling(0).lastChild().find(".btn.btn--green.mt-0"),
            attachResume = $("#resume_33dert121"),
            checkboxPersonalData = $(".checkbox-wrap.mt-2.w-100"),
            applyButton = checkboxPersonalData.parent().sibling(0).lastChild().find(".btn.btn--green.mt-0"),
            closeButtonError = $("div[class='modal izi-modal iziModal modal_active modal--short'] div[class='modal__close']");
            //closeButton = $("#closeLargeModal");

    /**
     * метод открывает форму заявки на https://rshbdigital.ru/stage/
     * проверяет что окрылась форма
     */
    public RegistrationPage openPage() {
        open("/stage");
        sleep(4000);
        $(".row--mod.texting").$(new ByText("Отправить заявку")).click();
        $(".izi-modal__hh").shouldHave(text(TITLE_TEXT));
        return this;
    }

    public RegistrationPage setName(String value) {
        nameInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.setValue(day+month+year);
        return this;
    }

    public RegistrationPage setPhone(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setDirectionsSelect(String value) {
        directionsSelect.click();
        $(".ks-select__block").$(byText(value)).click();
        directionsSelect.click();
        return this;
    }

    public RegistrationPage setSkill(String value) {
        skill.setValue(value);
        return this;
    }

    public RegistrationPage setExpectations(String value) {
        expectations.setValue(value);
        return this;
    }

    public RegistrationPage setResume(String value) {
        attachResume.uploadFile(new File(value));
        return this;
    }

    public RegistrationPage setCity(String value) {
        city.setValue(value);
        return this;
    }

    public RegistrationPage setVuz(String value) {
        vuz.setValue(value);
        sleep(2000);
        $(".form__step-title").click();
        return this;
    }

    public RegistrationPage setStageOfStudySelect(String value) {
        stageOfStudySelect.click();
        stageOfStudyRadio.$(byText(value)).click();
        stageOfStudySelect.click();
        return this;
    }

    public RegistrationPage clickNext1() {
        nextButton1.click();
        return this;
    }

    public RegistrationPage clickNext2() {
        $(".form__steps").parent().scrollIntoView(false);
        sleep(1000);
        nextButton2.click();
        return this;
    }

    public RegistrationPage clickCheckboxPersonalData() {
        checkboxPersonalData.click();
        return this;
    }

    public RegistrationPage clickApply() {
        sleep(1000);
        applyButton.click();
        return this;
    }

    public RegistrationPage clickClose() {
        closeButtonError.click();
        return this;
    }

    public RegistrationPage verifyResultsModalAppears() {
        registrationResultsModal.verifyModalAppears();
        return this;
    }
}
