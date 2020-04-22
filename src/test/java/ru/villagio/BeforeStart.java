package ru.villagio;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class BeforeStart {
    @Before
    public void testBefore(){
        Configuration.startMaximized = true;
    }
}
