<p align="center">
<img width="6%" title="UseTech" src="media/report_media/usetech-logo.jpg" href="https://usetech.ru/">
</p>

# Проект по автоматизации тестовых сценариев для сайта компании [Usetech](https://usetech.ru/)

## 📜 Содержание

- [Используемый стек](#computer-используемый-стек)
- [Реализованные проверки](#-реализованные-проверки)
- [Запуск автотестов](#️-запуск-автотестов)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-тестов-в-selenoid)

## :computer: Используемый стек
<p align="center">
  <a href="https://www.jetbrains.com/idea/"><img width="7%" title="IntelliJ IDEA" src="media/icons/intellij-idea-svgrepo-com.svg"></a>
  <a href="https://www.java.com/"><img width="7%" title="Java" src="media/icons/java-svgrepo-com.svg"></a>
  <a href="https://selenide.org/"><img width="7%" title="Selenide" src="media/icons/Selenide.svg"></a>
  <a href="https://aerokube.com/selenoid/"><img width="7%" title="Selenoid" src="media/icons/Selenoid.svg"></a>
  <a href="https://docs.qameta.io/allure/"><img width="7%" title="Allure Report" src="media/icons/Allure.svg"></a>
  <a href="https://docs.qameta.io/allure-testops/"><img width="7%" title="Allure TestOps" src="media/icons/Allure_TestOps.svg"></a>
  <a href="https://gradle.org/"><img width="7%" title="Gradle" src="media/icons/gradle-svgrepo-com.svg"></a>
  <a href="https://junit.org/junit5/"><img width="7%" title="JUnit5" src="media/icons/Junit5.svg"></a>
  <a href="https://github.com/"><img width="7%" title="GitHub" src="media/icons/github-badge-svgrepo-com.svg"></a>
  <a href="https://www.jenkins.io/"><img width="7%" title="Jenkins" src="media/icons/Jenkins.svg"></a>
  <a href="https://telegram.org/"><img width="7%" title="Telegram" src="media/icons/Telegram.svg"></a>
</p>

Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для
тестирования [Selenide](https://selenide.org/), сборщик - <code>Gradle</code>. <code>JUnit 5</code> задействован в
качестве фреймворка модульного тестирования.
При прогоне тестов для запуска браузеров используется [Selenoid](https://aerokube.com/selenoid/).
Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов
в <code>Telegram</code> при помощи бота.

## 🔽 Реализованные проверки

* Проверка заголовков главной страницы
* Проверка перехода с главной страницы на страницу "Награды"
* Проверка перехода с главной страницы на страницу "Контакты"
* Проверка перехода с главной страницы на страницу "Новости"
* Проверка перехода с главной страницы на страницу "Отрасли"
* Проверка перехода с главной страницы на страницу "Услуги"
* Проверка перехода с главной страницы на страницу "Карьера"

## 🔽 Запуск автотестов

### Запуск тестов из терминала

```
gradle clean UsetechDemoTests -Dselenoid_url="selenoid.autotests.cloud/wd/hub" -Dbrowser_size="1920х1080" -Dbrowser="chrome" -Dbrowser_version="100.0"
```

При выполнении данной команды в терминале IDE тесты запустятся удаленно в <code>Selenoid</code>.

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/icons/Jenkins.svg"> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/C34-khabarov_ilya-UseTech/)

Для запуска сборки необходимо перейти в раздел <code>Buld with parameters</code>, выбрать нужные параметры запуска
автотестов и нажать кнопку <code>Build</code>.
<p align="center">
<img title="Jenkins Build" src="media/report_media/allure_report_example.png">
</p>
После выполнения сборки, в блоке <code>Builds</code> напротив номера сборки появятся значки <code>Allure Report</code> и <code>Allure TestOps</code>, при клике на которые откроется страница со сформированным html-отчетом и тестовой документацией соответственно.

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/icons/Allure.svg"> Пример [Allure-отчета](https://jenkins.autotests.cloud/job/C34-khabarov_ilya-UseTech/2/allure)
Содержание Allure-отчета:

* Шаги теста;
* Скриншот страницы на последнем шаге;
* Page Source;
* Логи браузерной консоли;
* Видео выполнения автотеста.

<p align="center">
<img title="Allure Overview" src="media/report_media/allure_tests_result_example.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/icons/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет
сообщение с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/report_media/telegram_report.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/icons/Selenoid.svg"> Видео примера запуска тестов в Selenoid

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста
<p align="center">
  <img title="Selenoid Video" src="media/report_media/video_test_result.gif">
</p>
