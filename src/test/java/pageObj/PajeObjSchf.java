package pageObj;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.CollectionElement;
import org.openqa.selenium.By;
import helping.HelpMeth;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 14.02.2018.
 */
public class PajeObjSchf {

    static SelenideElement chooseFunct = $(".x-form-trigger.x-form-arrow-trigger.arrow-n-combo-invalid");
    static ElementsCollection functionList = $$(".x-combo-list-inner div");
    static SelenideElement docNumber = $(By.name("document.documentInfo.numberDoc"));


    public static void fillSchfMin(int function) {
        chooseFunction(function);
        docNumber.setValue("АВТО " + HelpMeth.randomCount());


    }

    public static void fillSchfMax(int function) {

    }

    public static void fillTable(int minMax){

    }

    public static void chooseFunction(int funct){
        chooseFunct.click();
        switch (funct) {
            case 1:
                $$(functionList).findBy(Condition.text("счет-фактура, применяемый при расчетах по налогу на добавленную стоимость")).click();
                break;
            case 2:
                $$(functionList).findBy(Condition.text("счет-фактура, применяемый при расчетах по налогу на добавленную стоимость, и документ об отгрузке товаров (выполнении работ), передаче имущественных прав (документ об оказании услуг)")).click();
                break;
            case 3:
                $$(functionList).findBy(Condition.text("документ об отгрузке товаров (выполнении работ), передаче имущественных прав (документ об оказании услуг)")).click();
                break;
        }

    }

}
