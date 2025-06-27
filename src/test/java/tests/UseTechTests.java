package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("WebUITests")
public class UseTechTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();
    NewsPage newsPage = new NewsPage();
    AwardsPage awardsPage = new AwardsPage();
    IndustryPage industryPage = new IndustryPage();
    ServicesPage servicesPage = new ServicesPage();
    CareerPage careerPage = new CareerPage();

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

    @Test
    @DisplayName("Проверяем переход в раздел Услуги")
    void navigateToServicesPageTest() {
        mainPage
                .openPage()
                .clickServicesButton();

        servicesPage.checkServicesTitle();
    }

    @Test
    @DisplayName("Проверяем переход в раздел Карьера")
    void navigateToCareerPageTest() {
        mainPage
                .openPage()
                .clickCareerButton();

        careerPage.checkCareerTitle();
    }
}