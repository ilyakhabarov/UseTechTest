package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("UsetechDemoTests")
public class UseTechTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();
    NewsPage newsPage = new NewsPage();
    AwardsPage awardsPage = new AwardsPage();
    IndustryPage industryPage = new IndustryPage();

    @Test
    @DisplayName("Открываем главную страницу и проверяем заголовки")
    void openMainPageAndCheckHeaderTest() {
        mainPage
                .openPage()
                .checkHeaderVisible();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Контакты")
    void navigateToContactsPageTest() {
        mainPage
                .openPage()
                .clickContactsButton();

        contactsPage.checkContactsTitle();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Новости")
    void navigateToNewsPageTest() {
        mainPage
                .openPage()
                .clickNewsButton();

        newsPage.checkNewsTitle();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Награды")
    void navigateToAwardsPageTest() {
        mainPage
                .openPage()
                .clickAwardsButton();

        awardsPage.checkAwardsTitle();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Отрасли")
    void navigateToIndustryPageTest() {
        mainPage
                .openPage()
                .clickIdustryButton();

        industryPage.checkIndustryTitle();
    }
}