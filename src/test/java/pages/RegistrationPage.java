package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Step;
import results.RegistrationResultsModal;

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
            stageOfStudySelect = $("div[name='stages']"),
            stageOfStudyRadio = $("div[name='stages'] div[class='ks-select__list']"),
            vuz = $("[name=vuz]"),
            expectations = $("#text_33dert121"),
            nextButton2 = expectations.parent().parent().sibling(0).lastChild().find(".btn.btn--green.mt-0"),
            attachResume = $("#resume_33dert121"),
            checkboxPersonalData = $(".checkbox-wrap.mt-2.w-100"),
            applyButton = checkboxPersonalData.parent().sibling(0).lastChild().find(".btn.btn--green.mt-0"),
            closeButtonError = $x("(//div[@class='modal__close'])[2]");

    @Step("открыть форму заявки")
    public RegistrationPage openPage() {
        open("/stage");
        $(".btn.btn--green").$(new ByText("Отправить заявку")).click();
        $(".izi-modal__hh").shouldHave(text(TITLE_TEXT));
        return this;
    }

    @Step("Написать имя")
    public RegistrationPage setName(String value) {
        nameInput.setValue(value);
        return this;
    }

    @Step("Указать дату рождения")
    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.setValue(day+month+year);
        return this;
    }

    @Step("Указать номер телефона")
    public RegistrationPage setPhone(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    @Step("Указать Email")
    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    @Step("Указать Направление стажировки")
    public RegistrationPage setDirectionsSelect(String value) {
        directionsSelect.click();
        $(".ks-select__block").$(byText(value)).click();
        directionsSelect.click();
        return this;
    }

    @Step("Указать Ваши знания и навыки")
    public RegistrationPage setSkill(String value) {
        skill.setValue(value);
        return this;
    }

    @Step("Указать Ваши ожидания от участия в программе стажировки")
    public RegistrationPage setExpectations(String value) {
        expectations.setValue(value);
        return this;
    }

    @Step("Добавить файл с резюме")
    public RegistrationPage setResume(String value) {
        attachResume.uploadFile(new File(value));
        return this;
    }
    @Step("Указать город")
    public RegistrationPage setCity(String value) {
        city.setValue(value);
        $(".vacancies__search-items.vacancies__search-items--top.active").click();
        return this;
    }

    @Step("Указать ВУЗ")
    public RegistrationPage setVuz(String value) {
        vuz.setValue(value);
        sleep(2000);
        $(".form__step-title").click();
        return this;
    }

    @Step("Указать Ступень обучения")
    public RegistrationPage setStageOfStudySelect(String value) {
        stageOfStudySelect.click();
        stageOfStudyRadio.$(byText(value)).click();
        stageOfStudySelect.click();
        return this;
    }

    @Step("Нажать кнопку Далее")
    public RegistrationPage clickNext1() {
        nextButton1.click();
        return this;
    }

    @Step("Нажать кнопку Далее еще раз")
    public RegistrationPage clickNext2() {
        $(".form__steps").parent().scrollIntoView(false);
        sleep(1000);
        nextButton2.click();
        return this;
    }

    @Step("Активировать чек-бокс Даю свое согласие...")
    public RegistrationPage clickCheckboxPersonalData() {
        checkboxPersonalData.click();
        return this;
    }
    @Step("Нажать кнопку Подать заявку")
    public RegistrationPage clickApply() {
        sleep(1000);
        applyButton.click();
        return this;
    }
    @Step("Закрыть модальное окно")
    public RegistrationPage clickClose() {
        closeButtonError.click();
        return this;
    }

    public RegistrationPage verifyResult1() {
        registrationResultsModal.verifyResult1();
        return this;
    }

    public RegistrationPage verifyResult2() {
        registrationResultsModal.verifyResult2();
        return this;
    }
    @Step("Проверить что заявка отправлена")
    public RegistrationPage verifyResultsModalAppears() {
        registrationResultsModal.verifyModalAppears();
        return this;
    }
}
