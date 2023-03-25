# <a href="https://rshbdigital.ru/stage"><img src="media/logo/rshb_logo.png" width="55" height="35"/></a> Проект по автоматизации тестирования веб для РСХБ-интех (hw-14_rshb-intech_test)

## :technologist: Технологии и инструменты

<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="media/logo/Java.svg"></code>
<code><img width="5%" title="Selenoid" src="media/logo/Selenoid.svg"></code>
<code><img width="5%" title="Selenide" src="media/logo/Selenide.svg"></code>
<code><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></code>
<code><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Jenkins" src="media/logo/Jenkins_logo.svg"></code>
<code><img width="5%" title="Jira" src="media/logo/Jira.svg"></code>
<code><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></code>
</p>

## :heavy_check_mark: Список проверок, реализованных в автотестах

- [x] Проверка кликабельности кнопки "Подать заявку"
- [x] Проверка полей формы для отклика на стажировку
- [x] Проверка управляющих элементов формы 

## :heavy_check_mark: Список проверок, реализованных в ручных тестах

- [x] Проверка ссылок на главной странице
- [x] Проверка заголовков на главной странице
- [x] Проверка меню

## :rocket: Запуск тестов

###  :rocket: Локальный запуск :
```bash
gradle clean test
```

###  :rocket: Удаленный запуск (в Jenkins):
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/017-aolshanskaya-hw_14/">проект</a>

![This is an image](/images/screens/Jenkins1.png)

2. Нажать **Собрать сейчас**
3. Результат запуска сборки можно посмотреть в отчёте Allure

## :triangular_flag_on_post: Allure отчеты:

### <img src="media/logo/Allure.svg" width="25" height="25"  alt="Allure"/>Отчет в Allure</a> <a target="_blank" href="https://jenkins.autotests.cloud/job/017-aolshanskaya-hw_14/12/allure/"> report</a>

#### :black_small_square: Основной отчет

#### :black_small_square: Тесты

### <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure TestOps"/>Отчет в Allure</a> <a target="_blank" href="https://allure.autotests.cloud/jobrun/19967"> TestOps</a>

#### :black_small_square: Основной отчет

#### :black_small_square: Тесты
<p align="center">
<img title="Allure Suites" src="/images/screens/testsOps.jpg">
</p>

#### :black_small_square: Пример ручных тестов
<p align="center">
  <img title="Allure TestOps manual tests" src="/images/screens/manual.jpg">
</p>
