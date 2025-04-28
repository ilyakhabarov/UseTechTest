package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AwardsPage {
    public AwardsPage checkNewsTitle() {
        $("h1").shouldHave(text("Награды"));
        return this;
    }
}