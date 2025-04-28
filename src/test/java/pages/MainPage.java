package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage checkHeaderVisible() {
        $("#nav-menu-container").shouldBe(visible);
        return this;
    }

    public MainPage clickContactsButton() {
        $("#menu-item-203").click();
        return this;
    }

    public MainPage clickNewsButton() {
        $("#menu-item-452").click();
        return this;
    }

    public MainPage clickAwardsButton() {
        $("#menu-item-418").click();
        return this;
    }
}