<p align="center">
<img width="6%" title="UseTech" src="media/report_media/usetech-logo.jpg">
</p>
# Проект по автоматизации тестовых сценариев для сайта компании Контур
## :scroll: Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Реализованные проверки](#computer-реализованные-проверки)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

## :computer: Используемый стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="media/icons/intellij-idea-svgrepo-com.svg">
<img width="6%" title="Java" src="media/icons/java-svgrepo-com.svg">
<img width="6%" title="Selenide" src="media/icons/Selenide.svg">
<img width="6%" title="Selenoid" src="media/icons/Selenoid.svg">
<img width="6%" title="Allure Report" src="media/icons/Allure.svg">
<img width="6%" title="Gradle" src="media/icons/gradle-svgrepo-com.svg">
<img width="6%" title="JUnit5" src="media/icons/Junit5.svg">
<img width="6%" title="GitHub" src="media/icons/github-badge-svgrepo-com.svg">
<img width="6%" title="Jenkins" src="media/icons/Jenkins.svg">
<img width="6%" title="Telegram" src="media/icons/Telegram.svg">
</p>

Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для
тестирования [Selenide](https://selenide.org/), сборщик - <code>Gradle</code>. <code>JUnit 5</code> задействован в
качестве фреймворка модульного тестирования.
При прогоне тестов для запуска браузеров используется [Selenoid](https://aerokube.com/selenoid/).
Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов
в <code>Telegram</code> при помощи бота.

Содержание Allure-отчета:

* Шаги теста;
* Скриншот страницы на последнем шаге;
* Page Source;
* Логи браузерной консоли;
* Видео выполнения автотеста.

## Реализованные проверки

* Проверка заголовков главной страницы
* Проверка перехода с главной страницы на страницу "Награды"
* Проверка перехода с главной страницы на страницу "Контакты"
* Проверка перехода с главной страницы на страницу "Новости"

## :arrow_forward: Запуск автотестов

### Запуск тестов из терминала

```
gradle clean UsetechDemoTests -Dselenoid_url="selenoid.autotests.cloud/wd/hub" -Dbrowser_size="1920х1080" -Dbrowser="chrome" -Dbrowser_version="100.0"
```

При выполнении данной команды в терминале IDE тесты запустятся удаленно в <code>Selenoid</code>.

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/icons/Jenkins.svg"> Сборка в Jenkins

Для запуска сборки необходимо перейти в раздел <code>Buld with parameters</code>, выбрать нужные параметры запуска
автотестов и нажать кнопку <code>Build</code>.
<p align="center">
<img title="Jenkins Build" src="media/report_media/allure_report_example.png">
</p>
После выполнения сборки, в блоке <code>Builds</code> напротив номера сборки появятся значки <code>Allure Report</code> и <code>Allure TestOps</code>, при клике на которые откроется страница с сформированным html-отчетом и тестовой документацией соответственно.

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/icons/Allure.svg"> Пример Allure-отчета

### Overview

<p align="center">
<img title="Allure Overview" src="media/report_media/allure_tests_result_example.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/icons/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет
сообщение с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/report_media/telegram_report.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/icons/Selenoid.svg"> Видео примера запуска тестов в Selenoid

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста
<p align="center">
  <img title="Selenoid Video" src="media/report_media/video_test_result.gif">
</p>
