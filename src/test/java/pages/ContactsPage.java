package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {
    public ContactsPage checkContactsTitle() {
        $("h1").shouldHave(text("Контакты"));
        return this;
    }
}
