import com.codeborne.selenide.commands.FollowLink;
import com.codeborne.selenide.commands.PressEnter;
import org.openqa.selenium.By;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.screenshot;
import org.junit.Test;
import org.openqa.selenium.Keys;


public class haimTests {
    @Test
    public void search_selenide_in_google() {
        Configuration.browser = "chrome";
        open("http://www.google.com");
        $("#lst-ib").setValue("Ivan Drago");
        $("#lst-ib").sendKeys(Keys.RETURN);
        $(byText("Ivan Drago - Wikipedia")).click();
        screenshot("IVAN DRAGO");
        //$("#btnK").click();
        //screenshot("test2");
    }
}
