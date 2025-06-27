package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    @Step("Проверка названия страницы карьера")
    public CareerPage checkCareerTitle() {
        $(".home-filter__left").shouldHave(text("Поиск вакансий"));
        return this;
    }
}