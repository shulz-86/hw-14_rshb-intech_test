package helpers;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakerIDN;

import java.util.List;
import java.util.Locale;
import java.util.Random;

public class TestsDataRshb {

    Faker faker = new Faker(new Locale("ru"));
    Random random = new Random();
    /**
     * Генерируем тестовые данные
     */
    public String name = faker.name().name(),
            userNumber = faker.instance().bothify("+7-9##-###-##-##"),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = String.format("%02d", faker.number().numberBetween(1, 12)),
            year = String.valueOf(faker.number().numberBetween(1900, 2022)),
            userEmail = FakerIDN.toASCII(faker.internet().emailAddress()),
            city = getCityRandom(),
            directionsSelect = getDirectionsSelectRandom(),
            skill = "Java, SQL",
            expectations = "Получить опыт коммерческой разработки автотестов, получить работу",
            resume = "src/test/resources/resume.docx",
            vuz = "ФГБОУ ВО Самарский ГАУ",
            stageOfStudyRandom = getStageOfStudyRandom();

    public String searchData = "Стажировка",
    resultOfSearch = "Результаты вашего поиска",
    totalResult = "Найден 1 результат";

    public String titleMainPage = "РСХБ в цифре";

    public static int menuElementsCount = 1;
    public static List<String> menuElements =
            List.of("О нас Экспертиза и технологии Игры и квесты " +
                    "Студентам и выпускникам AgroCode Hub АгроИнвест Клуб АгроБит");


    public String getCityRandom() {
        String[] states = {"Москва", "Санкт-Петербург", "Севастополь", "Архангельск",
                "Воронеж", "Нижний Новгород", "Орёл", "Ярославль"};
        int i = random.nextInt(states.length);
        return states[i];
    }

    public String getDirectionsSelectRandom() {
        String[] directions = {"Разработка", "Тестирование", "DevOps", "Data Science",
                "Аналитика", "Информационная безопасность", "Проектный менеджмент",
                "Контент-менеджмент", "IT-архитектура", "Маркетинг"};
        int i = random.nextInt(directions.length);
        return directions[i];
    }

    public String getStageOfStudyRandom() {
        String[] stageOfStudy = {"выпускник", "аспирант"};
        int i = random.nextInt(stageOfStudy.length);
        return stageOfStudy[i];
    }


}
