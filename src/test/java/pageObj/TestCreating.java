package pageObj;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helping.HelpMeth;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObj.PageObjMane;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 07.02.2018.
 */

public class TestCreating {

    protected WebDriver driver;

    @BeforeClass
//    public static void setUp() {
////        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\webdrvs\\chromedriver.exe");
////        Configuration.browser="chrome";
//
//        ChromeDriverManager.getInstance().setup();
//    }


    @BeforeTest
    public void setupTest() {

        //fastSetValue = true;
        Configuration.savePageSource = false;
        Configuration.screenshots = false;

        HelpMeth.openPage("http://sf2abukk.comita.lan:8080/ccwe/");
        HelpMeth.logIn("GreyKnights", "gfhjkmnhb");
    }


    @Test(enabled = false)
    public void createSChfMin() {
        PageObjMane.schfCreat(1, 1);
//        PageObjMane.schfCreat(1, 2);
//        PageObjMane.schfCreat(1, 3);
    }

    @Test(enabled = false)
    public void createSChfMax() {
        PageObjMane.schfCreat(2, 1);
        PageObjMane.schfCreat(2, 2);
        PageObjMane.schfCreat(2, 3);
    }

    @Test(enabled = false)
    public void createKschfMin(){
        PageObjMane.kschfCreate(1,1);
        PageObjMane.kschfCreate(1,2);
        PageObjMane.kschfCreate(1,3);
    }

    @Test(enabled = false)
    public void createKschfMax(){
        PageObjMane.kschfCreate(2,1);
        PageObjMane.kschfCreate(2,2);
        PageObjMane.kschfCreate(2,3);
    }

    @Test (enabled = false)
    public void createPereTov(){
        PageObjMane.tovarCreate(1);
        PageObjMane.tovarCreate(2);
    }

    @Test (enabled = false)
    public void createPereRab(){
        PageObjMane.rezRabCreate(1);
        PageObjMane.rezRabCreate(2);
    }

    @Test (enabled = true)
    public void createUzal(){
        //PageObjMane.uzalDocCreate(1);
        PageObjMane.uzalDocCreate(2);
    }

    @AfterTest
    public void tearDown() {
        HelpMeth.logOut();
    }

//    @AfterClass (alwaysRun = true)
//    public void closeWebDriver(){
//        WebDriverRunner.closeWebDriver();
//    }
}

