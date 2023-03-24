package rshb;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RshbStageRegistrationTests extends TestBaseRshb {

TestsDataRshb testsData = new TestsDataRshb();

    @Test
    void fillFormTest() {
        step("Открываем форму. Заполняем первую страничку формы тестовыми данными. Нажимаем Далее", () -> {
            rshbRegistrationPage.openPage()
                    .setName(testsData.name)
                    .setBirthDate(testsData.day, testsData.month, testsData.year)
                    .setPhone(testsData.userNumber)
                    .setEmail(testsData.userEmail)
                    .setCity(testsData.city)
                    .setDirectionsSelect(testsData.directionsSelect)
                    .clickNext1();
        });
        step("Проверяем, что открылась вторая страничка формы", () -> {
            rshbRegistrationPage.verifyResult1();
        });
        step("Заполняем вторую страничку формы тестовыми данными. Нажимаем далее", () -> {
            rshbRegistrationPage
                    .setVuz(testsData.vuz)
                    .setStageOfStudySelect(testsData.stageOfStudyRandom)
                    .setSkill(testsData.skill)
                    .setExpectations(testsData.expectations)
                    .clickNext2();
        });
        step("Проверяем, что открылась третья страничка формы", () -> {
            rshbRegistrationPage.verifyResult2();
        });
        step("Заполняем вторую страничку формы тестовыми данными. Нажимаем Подать заявку", () -> {
            rshbRegistrationPage
                    .setResume(testsData.resume)
                    .clickCheckboxPersonalData()
                    .clickApply();
        });
        step("Проверяем, что форма отправлена. Закрываем форму", () -> {
            rshbRegistrationPage.verifyResultsModalAppears()
                    .clickClose();
        });
    }
}
