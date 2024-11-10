import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверка главной страницы Газпромбанка")
public class SimpleGazpromBankTests extends TestBase {

    @Tag("simpleGazpromBankTests")
    @Owner("Ekaterina Zhukova")
    @DisplayName("Тест на выбора города на главной странице Газпромбанка")
    @Test
    void chooseCityTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу Газпромбанка", () -> {
            open("https://www.gazprombank.ru/");
        });

        step("Проверяем, что выбран город Москва", () -> {
            $(".header_full_location__desktop-dbc").shouldHave(text("Москва"));
        });

        step("Открываем меню выбора города", () -> {
            $(".header_full_location__desktop_city-dbc").click();
        });

        step("Выбираем город Екатеринбург", () -> {
            $(".cities_content__search-5d5").click();
            $("[name='city-search']").setValue("екатеринбург");
            $("[class='cities_content__scrollbars_root-5d5 scrollbar-992 ']").$(byText("Екатеринбург")).click();
        });
        step("Проверяем, что выбран город Екатеринбург", () -> {
            $(".header_full_location__desktop-dbc").shouldHave(text("Екатеринбург"));
        });
    }

    @Tag("simpleGazpromBankTests")
    @Owner("Ekaterina Zhukova")
    @DisplayName("Тест на проверку результата поиска по запросу Вклад")
    @Test
    void searchResultTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу Газпромбанка", () -> {
            open("https://www.gazprombank.ru/");
        });

        step("Нажимаем на поиск в правом верхнем углу", () -> {
            $(".button__addons-8e6").click();
        });

        step("Вбиваем в поисковую строку запрос на Вклады", () -> {
            $("[class='text_field-860 text_field_search-860 text_field_no_label-860']").click();
            $("[class='text_field__input-860 search_bar__input-2b5']").setValue("Вклады").pressEnter();
        });

        step("Проверяем результаты поиска по Вкладам", () -> {
            $("[class='template_section_wrapper-e6c']").shouldHave(text("Открыть вклад"));
        });
    }

    @Tag("simpleGazpromBankTests")
    @Owner("Ekaterina Zhukova")
    @DisplayName("Тест на клибакельность кнопки Стать клиентом")
    @Test
    void searchTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу Газпромбанка", () -> {
            open("https://www.gazprombank.ru/");
        });

        step("Нажимаем на кнопки Стать клиентом", () -> {
            $("[data-test-id='header-become-client-button']").click();
        });

        step("Проверка, что после нажатия на кнопку вылезает окно Стать клиентом", () -> {
            $("[class='ScrollbarsCustom-Content scrollbar_scrollbars__content-992']").shouldHave(text("Стать клиентом"));
        });
    }

    @Tag("simpleGazpromBankTests")
    @Owner("Ekaterina Zhukova")
    @DisplayName("Тест на открытие карты с офисами Газпромбанка")
    @Test
    void openOfficesMapsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу Газпромбанка", () -> {
            open("https://www.gazprombank.ru/");
        });

        step("Нажимаем на слово Офисы в верхнем углу сайта", () -> {
            $(".header_full_main_menu__item-718").$(byText("Офисы")).click();
        });

        step("Проверка карты с офисами Газпромбанка", () -> {
            $("[class='tabs__btn-b78 tabs_active-b78']").shouldHave(text("Офисы"));
        });
    }

    @Tag("simpleGazpromBankTests")
    @Owner("Ekaterina Zhukova")
    @DisplayName("Тест на открытие карты с банкоматами Газпромбанка")
    @Test
    void openCashMachineMapsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу Газпромбанка", () -> {
            open("https://www.gazprombank.ru/");
        });

        step("Нажимаем на слово Офисы в верхнем углу сайта", () -> {
            $(".header_full_main_menu__item-718").$(byText("Офисы")).click();
        });

        step("Проверка карты с офисами Газпромбанка", () -> {
            $("[class='tabs__btn-b78 tabs_active-b78']").shouldHave(text("Офисы"));
        });

        step("Кликаем на кнопку выбора Банкоматов", () -> {
            $(".tabs-b78").$(byText("Банкоматы")).click();
        });

        step("Проверка карты с банкоматами Газпромбанка", () -> {
            $("[class='tabs__btn-b78 tabs_active-b78']").shouldHave(text("Банкоматы"));
        });
    }
}
