package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    @Step("Проверка названия страницы новостей")
    public NewsPage checkNewsTitle() {
        $("h1").shouldHave(text("Новости"));
        return this;
    }
}