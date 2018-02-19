import com.codeborne.selenide.Configuration;
import helping.HelpMeth;
import org.testng.annotations.*;
import pageObj.PageObjMane;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by alexeya on 07.02.2018.
 */

public class Creating {


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
    }

    @Test(enabled = true)
    public void createSChfMax() {
        PageObjMane.schfCreat(2, 1);
    }

    @AfterTest
    public void tearDown() {
        HelpMeth.logOut();
    }
}
