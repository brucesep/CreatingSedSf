package helping;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by alexeya on 07.02.2018.
 */
public class HelpMeth {

    public static void openPage(String link) {
        open(link);
    }

    public static void logIn(String loginName, String passWord, int num) {
        $(By.id("login")).setValue(loginName);
        $(By.id("password")).setValue(passWord);
        $(By.id("loginBtn")).click();
        //если был некорректный разлогин
        if ($(By.id("pushOutMessage")).isDisplayed()) {
            $(By.name("pushOutMessage")).setValue("Sorry! Automation is trying to work around here! Next login used in process: " + loginName + ".");
            $(By.id("loginBtn")).click();
        }
        //несколько сертов
        if (num != 1) {
            $(By.id("comboSelectorId")).click();
            $(new Selectors.ByText("5003106773 Тестов Тест Тестович")).click();
            $(new Selectors.ByText("Выбрать")).click();
        }

    }


}
