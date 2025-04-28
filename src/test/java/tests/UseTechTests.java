package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AwardsPage;
import pages.ContactsPage;
import pages.MainPage;
import pages.NewsPage;

@Tag("UsetechDemoTests")
public class UseTechTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();
    NewsPage newsPage = new NewsPage();
    AwardsPage awardsPage = new AwardsPage();

    @Test
    @DisplayName("Открываем главную страницу и проверяем заголовки")
    void openMainPageAndCheckHeader() {
        mainPage
                .openPage()
                .checkHeaderVisible();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Контакты")
    void navigateToContactsPage() {
        mainPage
                .openPage()
                .clickContactsButton();

        contactsPage.checkContactsTitle();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Новости")
    void navigateToNewsPage() {
        mainPage
                .openPage()
                .clickNewsButton();

        newsPage.checkNewsTitle();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Награды")
    void navigateToAwardsPage() {
        mainPage
                .openPage()
                .clickAwardsButton();

        awardsPage.checkNewsTitle();
    }
}