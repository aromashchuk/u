package ru.villagio;


import org.junit.After;
import org.junit.Before;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BeforeTestAdminPanel {
    @Before
    public void loginToAdm (){
        open("https://villagio-vip.ru/admin/request/request/");
        $(byId("id_username")).setValue("qa111");
        $(byId("id_password")).setValue("Artu1r1").pressEnter();
        $(byLinkText("Заявки")).click();
    }
    @After
    public void logoutFromAdm(){
        open("https://villagio-vip.ru/admin/logout/");
    }
}
