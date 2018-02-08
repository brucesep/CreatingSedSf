import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import helping.HelpMeth;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.SystemClock;
import org.testng.annotations.*;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 07.02.2018.
 */

public class Creating {


    @BeforeTest
    public void setupTest() {

        //fastSetValue = true;

        HelpMeth.openPage("http://sf2abukk.comita.lan:8080/ccwe/");
        HelpMeth.logIn("GreyKnights", "gfhjkmnhb", 2);
    }

    @Test
    public void createSChf() {

    }

    @AfterTest
    public void tearDown() {

    }
}
