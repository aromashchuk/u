package ru.villagio;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class TestRecordInAdminPanel extends BeforeTestAdminPanel{
        @Test
        public void testEmailGlavnaya() {
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("glavnaya_test@test.test")).shouldHave(text("glavnaya_test@test.test"));
        }

        @Test
        public void testEmailDom(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("doma_test@test.test")).shouldHave(text("doma_test@test.test"));
        }

        @Test
        public void testEmailPoselok(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("poselki_test@test.test")).shouldHave(text("poselki_test@test.test"));
        }

        @Test
        public void testEmailContacts(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("kontakty_test@test.test")).shouldHave(text("kontakty_test@test.test"));
        }

        @Test
        public void testEmailVnutriDoma(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("vnutridoma_test@test.test")).shouldHave(text("vnutridoma_test@test.test"));
        }

        @Test
        public void testEmailVnutriposelka(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("vnutriposelka_test@test.test")).shouldHave(text("vnutriposelka_test@test.test"));
        }

        //------------- проверка что в заявки пришли номера телефонов с каждой формы
        @Test
        public void goToVerifyMainHeaderCallBack(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_header")).shouldHave(text("test_header"));
        }

        @Test
        public void goToVerifyInVillageFormCallBack1(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_vposelke1")).shouldHave(text("test_vposelke1"));
        }

        @Test
        public void goToVerifyInVillageFormCallBack2(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_vposelke2")).shouldHave(text("test_vposelke2"));
        }

        @Test
        public void goToVerifyInObjectFormCallBack1(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_house_1")).shouldHave(text("test_house_1"));
        }

        @Test
        public void goToVerifyInObjectFormCallBack2(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_house_2")).shouldHave(text("test_house_2"));
        }

        @Test
        public void goToVerifyInObjectFormCallBack3(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_house_3")).shouldHave(text("test_house_3"));
        }

        @Test
        public void goToVerifyInZHKFormCallBack1(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("TEST ZHK-1")).shouldHave(text("TEST ZHK-1"));
        }

        @Test
        public void goToVerifyInZHKFormCallBack2(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("TEST ZHK-2")).shouldHave(text("TEST ZHK-2"));
        }

        @Test
        public void goToVerifyInApartmentFormCallBack1(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_apartment_1")).shouldHave(text("test_apartment_1"));
        }

        @Test
        public void goToVerifyInApartmentFormCallBack2(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_apartment_2")).shouldHave(text("test_apartment_2"));
        }

        @Test
        public void goToVerifyInApartmentFormCallBack3(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_apartment_3")).shouldHave(text("test_apartment_3"));
        }

        @Test
        public void goToVerifyInFavoriteFormCallBack(){
            open("https://villagio-vip.ru/admin/request/request/");
            $(byText("test_favorite")).shouldHave(text("test_favorite"));

        }

}
