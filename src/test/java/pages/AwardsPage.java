package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AwardsPage {
    @Step("Проверка названия страницы наград")
    public AwardsPage checkAwardsTitle() {
        $("h1").shouldHave(text("Награды"));
        return this;
    }
}