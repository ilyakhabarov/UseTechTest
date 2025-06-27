package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ServicesPage {
    @Step("Проверка названия страницы услуг")
    public ServicesPage checkServicesTitle() {
        $("h1").shouldHave(text("Услуги"));
        return this;
    }
}