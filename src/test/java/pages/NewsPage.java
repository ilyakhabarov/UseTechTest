package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    public NewsPage checkNewsTitle() {
        $("h1").shouldHave(text("Новости"));
        return this;
    }
}