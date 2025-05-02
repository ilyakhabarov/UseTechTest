package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    @Step ("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step ("Проверить отображение заголовков")
    public MainPage checkHeaderVisible() {
        $("#nav-menu-container").shouldBe(visible);
        return this;
    }

    @Step ("Клик по вкладке Контакты")
    public MainPage clickContactsButton() {
        $("#menu-item-203").click();
        return this;
    }

    @Step ("Клик по вкладке Новости")
    public MainPage clickNewsButton() {
        $("#menu-item-452").click();
        return this;
    }

    @Step ("Клик по вкладке Награды")
    public MainPage clickAwardsButton() {
        $("#menu-item-418").click();
        return this;
    }

    @Step ("Клик по вкладке Отрасли")
    public MainPage clickIdustryButton() {
        $("#menu-item-195").click();
        return this;
    }
}