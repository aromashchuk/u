package ru.villagio;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class StartNew extends BeforeStart{
    @Test
        public void testFirst() {
        open("http://villagio-vip.ru");
        // open("http://www-old.villagio-vip.ru");
        $(byText("Помощь в подборе")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_header");
        $(byId("SCB_1")).clear();
        $(byId("SCB_1")).click();
        $(byId("SCB_1")).setValue("9780258808");
        $(byId("SCB_2")).click();
    }

    // ---- тест формы заказа обратного звонка на странице поселка 1
    @Test
    public void testFormCallBackVillage1() {
        open("http://villagio-vip.ru/realty/villages/konus/");
        //open("http://www-old.villagio-vip.ru/realty/villages/konus/");
        $(byText("Узнать цены")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_vposelke1");
        $(byId("SCB_3")).clear();
        $(byId("SCB_3")).click();
        $(byId("SCB_3")).setValue("9780258808");
        $(byId("SCB_4")).click();
    }

    // ---- тест формы заказа обратного звонка на странице поселка 2
    @Test
    public void testFormCallBackVillage2() {
        open("http://villagio-vip.ru/realty/villages/lion/");
        //open("http://www-old.villagio-vip.ru/realty/villages/lion/");
        // $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byText("Помощь эксперта")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_vposelke2");
        $(byId("SCB_13")).clear();
        $(byId("SCB_13")).click();
        $(byId("SCB_13")).setValue("9780258808");
        $(byId("SCB_14")).click();
    }


    // ---- тест формы заказа обратного звонка на странице дома 1
    @Test
    public void testFormCallBackHome1() {
        open("https://villagio-vip.ru/realty/objects/uyutnyj-dom/");
        // open("http://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        //$(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byText("Задать вопрос эксперту")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_house_1");
        $(byId("SCB_5")).clear();
        $(byId("SCB_5")).click();
        $(byId("SCB_5")).setValue("9780258808");
        $(byId("SCB_6")).click();
    }

    // ---- тест формы заказа обратного звонка на странице дома 2

    @Test
    public void testFormCallBackHome2() {

        open("https://villagio-vip.ru/realty/objects/uyutnyj-dom/");
        // open("http://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        //$(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Работаем без выходных'])[1]/following::button[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_house_2");
        $(byId("SCB_9")).clear();
        $(byId("SCB_9")).click();
        $(byId("SCB_9")).setValue("9780258808");
        $(byId("SCB_10")).click();
    }

    // ---- тест формы заказа обратного звонка на странице дома 3

    @Test
    public void testFormCallBackHome3() {
        open("https://villagio-vip.ru/realty/objects/uyutnyj-dom/");
        //      open("http://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        // $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byText("Записаться на просмотр дома")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_house_3");
        $(byId("SCB_11")).clear();
        $(byId("SCB_11")).click();
        $(byId("SCB_11")).setValue("9780258808");
        $(byId("SCB_12")).click();
    }


    //---------------ZHK--------------

    // ---- тест формы 1 заказа обратного звонка на странице ЖК
    @Test
    public void testFormCallBackLiveComplex1() {

        open("https://villagio-vip.ru/realty/city/zhk-rezidenciya-tverskaya/");

        $(byText("Узнать цены")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("TEST ZHK-1");
        $(byId("SCB_3")).clear();
        $(byId("SCB_3")).click();
        $(byId("SCB_3")).setValue("9780258808");
        $(byId("SCB_4")).click();
    }

    // ---- тест формы 2 заказа обратного звонка на странице ЖК
    @Test
    public void testFormCallBackLiveComplex2() {
        open("https://villagio-vip.ru/realty/city/zhk-rezidenciya-tverskaya/");
        $(byText("Помощь эксперта")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("TEST ZHK-2");
        $(byId("SCB_13")).clear();
        $(byId("SCB_13")).click();
        $(byId("SCB_13")).setValue("9780258808");
        $(byId("SCB_14")).click();
    }


    //------------------ APARTMENT ------------

    @Test
    public void testFormCallBackApartment1() {
        open("https://villagio-vip.ru/realty/city/objects/rtv-927/");
        // open("http://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        //$(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byText("Задать вопрос эксперту")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_apartment_1");
        $(byId("SCB_5")).clear();
        $(byId("SCB_5")).click();
        $(byId("SCB_5")).setValue("9780258808");
        $(byId("SCB_6")).click();
    }

    // ---- тест формы заказа обратного звонка на странице апартаментов 2
    @Test
    public void testFormCallBackApartment2() {
        open("https://villagio-vip.ru/realty/city/objects/rtv-927/");
        // open("http://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        //$(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Работаем без выходных'])[1]/following::button[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_apartment_2");
        $(byId("SCB_9")).clear();
        $(byId("SCB_9")).click();
        $(byId("SCB_9")).setValue("9780258808");
        $(byId("SCB_10")).click();
    }

    // ---- тест формы заказа обратного звонка на странице апартаментов 3
    @Test
    public void testFormCallBackApartment3() {

        open("https://villagio-vip.ru/realty/city/objects/rtv-927/");
        //      open("http://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        // $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='политикой коммуникации'])[1]/following::div[1]")).click();

        $(byText("Записаться на просмотр дома")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[2]/following::input[1]")).setValue("test_apartment_3");
        $(byId("SCB_11")).clear();
        $(byId("SCB_11")).click();
        $(byId("SCB_11")).setValue("9780258808");
        $(byId("SCB_12")).click();
    }

    // тест формы обратной связи со страницы избранное
    @Test
    public void testFormCallBackFavorite() {

        open("https://villagio-vip.ru/realty/objects/uyutnyj-dom/");
        //  open("https://www-old.villagio-vip.ru/realty/objects/spk-2-006/");
        $(byText("В избранное")).click();
        $(byClassName("header__favorites-icon")).click();
        $(byText("Записаться на просмотр")).should(exist).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[3]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[3]/following::input[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Вас зовут'])[3]/following::input[1]")).setValue("test_favorite");
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Ваш номер'])[3]/following::input[1]")).clear();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Ваш номер'])[3]/following::input[1]")).setValue("9780258808");
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Ваш номер'])[3]/following::button[1]")).click();
    }

    // ---- подписка на новости на главной
    @Test
    public void testSubscribeHomePage() {
        open("http://villagio-vip.ru/");
        // open("http://www-old.villagio-vip.ru/");
        $(byName("email")).setValue("glavnaya_test@test.test").pressEnter();
    }

    // ---- подписка на новости на странице поселки
    @Test
    public void testSubscribeVillagesSearchPage() {
        open("http://villagio-vip.ru/realty/villages/");
        //open("http://www-old.villagio-vip.ru/realty/villages/");
        $(byName("email")).setValue("poselki_test@test.test").pressEnter();
    }

    // ---- подписка на новости на странице Дома
    @Test
    public void testSubdcribeOnHomeSearchPage() {


        open("http://villagio-vip.ru/realty/objects/");
        // open("http://www-old.villagio-vip.ru/realty/objects/");
        $(byName("email")).setValue("doma_test@test.test").pressEnter();
    }

    // ---- подписка на новости на странице контакты
    @Test
    public void testSubscribeContactPage() {

        open("http://villagio-vip.ru/about/office/");
        // open("http://www-old.villagio-vip.ru/about/office/");
        $(byName("email")).setValue("kontakty_test@test.test").pressEnter();
    }

    @Test
    public void testSubscribeContactOnVillagePage() {
        open("http://villagio-vip.ru/realty/villages/monteville/");
        //open("http://www-old.villagio-vip.ru/realty/villages/monteville/");
        $(byName("email")).setValue("vnutriposelka_test@test.test").pressEnter();
    }

    @Test
    public void testSubscribeContactApartmentOrHomePage() {
        open("https://villagio-vip.ru/realty/objects/spk-5-037/");
        //open("https://www-old.villagio-vip.ru/realty/objects/spk-5-037/");
        $(byName("email")).setValue("vnutridoma_test@test.test").pressEnter();
    }

    @Test
    public void stepToFirstMenuElement() {
        open("http://villagio-vip.ru");
        $(byText("Посёлки")).click();
    }

    @Test
    public void stepToSecondMenuElement() {
        open("http://villagio-vip.ru");
        $(byText("Дома")).click();
    }

    @Test
    public void stepToThirdMenuElement() {
        open("http://villagio-vip.ru");
        $(byText("ЖК")).click();
    }

    @Test
    public void stepToFourthMenuElement() {
        open("http://villagio-vip.ru");
        $(byText("Квартиры")).click();
    }

    @Test
    public void stepToSixthMenuElement() {
        open("http://villagio-vip.ru");
        $(byText("Новые объекты")).click();
    }

    @Test
    public void stepToSeventhMenuElement() {
        open("http://villagio-vip.ru");
        $(byText("Контакты")).click();
    }

}

