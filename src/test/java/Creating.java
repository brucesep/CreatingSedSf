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

    @Test (enabled = true)
    public void createPereRab(){
        //PageObjMane.rezRabCreate(1);
        PageObjMane.rezRabCreate(2);
    }

    @AfterTest
    public void tearDown() {
        HelpMeth.logOut();
    }
}
