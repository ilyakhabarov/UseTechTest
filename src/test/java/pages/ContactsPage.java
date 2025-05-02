package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {
    @Step("Проверка названия страницы контактов")
    public ContactsPage checkContactsTitle() {
        $("h1").shouldHave(text("Контакты"));
        return this;
    }
}
