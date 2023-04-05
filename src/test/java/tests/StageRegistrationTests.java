package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import helpers.TestsDataRshb;
@Owner("Olshanskaya")
@Tag("UITests")
public class StageRegistrationTests extends TestBaseRshb {

TestsDataRshb testsData = new TestsDataRshb();
    @DisplayName("Заполнение формы тестовыми данными. Подача заявки")
    @Test
    void fillFormTest() {
            rshbRegistrationPage.openPage()
                    .setName(testsData.name)
                    .setBirthDate(testsData.day, testsData.month, testsData.year)
                    .setPhone(testsData.userNumber)
                    .setEmail(testsData.userEmail)
                    .setCity(testsData.city)
                    .setDirectionsSelect(testsData.directionsSelect)
                    .clickNext1()
                    .verifyResult1()
                    .setVuz(testsData.vuz)
                    .setStageOfStudySelect(testsData.stageOfStudyRandom)
                    .setSkill(testsData.skill)
                    .setExpectations(testsData.expectations)
                    .clickNext2()
                    .verifyResult2()
                    .setResume(testsData.resume)
                    .clickCheckboxPersonalData()
                    .clickApply()
                    .verifyResultsModalAppears()
                    .clickClose();
    }
}
