package rshb;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RshbStageRegistrationTests extends TestBaseRshb {

TestsDataRshb testsData = new TestsDataRshb();

    @Test
    void fillFormTest() {
        step("Открываем форму. Заполняем форму тестовыми данными.", () -> {
            rshbRegistrationPage.openPage()
                    .setName(testsData.name)
                    .setBirthDate(testsData.day, testsData.month, testsData.year)
                    .setPhone(testsData.userNumber)
                    .setEmail(testsData.userEmail)
                    .setCity(testsData.city)
                    .setDirectionsSelect(testsData.directionsSelect)
                    .clickNext1()
                    .setVuz(testsData.vuz)
                    .setStageOfStudySelect(testsData.stageOfStudyRandom)
                    .setSkill(testsData.skill)
                    .setExpectations(testsData.expectations)
                    .clickNext2()
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
