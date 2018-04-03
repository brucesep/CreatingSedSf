package helping;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by alexeya on 07.02.2018.
 */
public class HelpMeth {

    public static void openPage(String link) {
        open(link);
    }

    public static void logIn(String loginName, String passWord) {
        $(By.id("login")).clear();
        $(By.id("login")).setValue(loginName);
        $(By.id("password")).clear();
        $(By.id("password")).setValue(passWord);
        $(By.id("loginBtn")).click();
        //если был некорректный разлогин
        if ($(By.id("pushOutMessage")).isDisplayed()) {
            $(By.name("pushOutMessage")).setValue("Sorry! Automation is trying to work around here! Next login used in process: " + loginName + ".");
            $(By.id("loginBtn")).click();
        }
        $(new Selectors.ByText("OK")).click();
    }

    public static void logOut(){
        $(new Selectors.ByText("Выход")).isDisplayed();
        $(new Selectors.ByText("Выход")).click();
        $(new Selectors.ByText("OK")).click();
    }

    public static int randomCount(){
        int max = 999;
        int min = 100;
        max -=min;
        return (int) (Math.random() * ++max) + min;
    }


}
