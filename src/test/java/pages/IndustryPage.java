package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IndustryPage {
    @Step("Проверка названия страницы отраслей")
    public IndustryPage checkIndustryTitle() {
        $("h1").shouldHave(text("Отрасли"));
        return this;
    }
}