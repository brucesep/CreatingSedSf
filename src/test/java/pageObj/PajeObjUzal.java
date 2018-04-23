package pageObj;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import Helps.HelpMeth;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 04.04.2018.
 */
public class PajeObjUzal {

    static SelenideElement docNum = $(By.name("NumberDoc"));
    static SelenideElement chooseOne = $(new Selectors.ByText("Выбрать.."));
    static SelenideElement themeMes = $(By.name("SUBJECT"));
    static SelenideElement soprovText = $(By.name("ADDITIONALTEXT"));
    static SelenideElement groupRass = $(".x-form-checkbox.x-form-field");
    static ElementsCollection closeMail = $$(".x-tool.x-tool-close");
    static SelenideElement oneAdress = $(new Selectors.ByText("576771279"));
    static SelenideElement okButton = $(new Selectors.ByText("ОК"));
    static SelenideElement plusAdd = $(".x-action-col-icon.x-action-col-0.undefined");
    static SelenideElement lastOK = $(new Selectors.ByText("OK"));
    static SelenideElement listOK = $(new Selectors.ByText("ОК"));


    public static void fillUzalDoc(int minMax) {
        String nomer;
        if (minMax == 1) {
            nomer = "MIN 999 ";
        } else {
            nomer = "MAX 999 ";
        }
        docNum.sendKeys("АВТО " + nomer + HelpMeth.randomCount());
        themeMes.sendKeys("АВТО тема для прочего письма");
        soprovText.sendKeys("АВТО сопроводительный текст для прочего письма, для заполнения некоторого количества места в большом пребольшом поле.");
        if (minMax ==1) {
            chooseOne.click();
            oneAdress.isDisplayed();
            oneAdress.click();
            okButton.click();
        } else {
            groupRass.click();
            plusAdd.isDisplayed();
            plusAdd.click();
            $(new Selectors.ByText("576771279")).isDisplayed();
            $(new Selectors.ByText("576771279")).closest("tr").find(".x-grid3-col.x-grid3-cell.x-grid3-td-checker.x-grid3-cell-first").click();
            $(new Selectors.ByText("764806252")).closest("tr").find(".x-grid3-col.x-grid3-cell.x-grid3-td-checker.x-grid3-cell-first").click();
            $(new Selectors.ByText("647461002")).closest("tr").find(".x-grid3-col.x-grid3-cell.x-grid3-td-checker.x-grid3-cell-first").click();
            listOK.click();

            $("input#fileItemElement-file").uploadFile(new File("D:/JAVA/poly/attach01.txt"));
            soprovText.click();
        }

        $$(closeMail).get(1).click();
        $(new Selectors.ByText("Сохранить изменения перед закрытием?")).isDisplayed();
        $(new Selectors.ByText("Да")).click();
        $(new Selectors.ByText("Документ успешно сохранен!")).isDisplayed();
        lastOK.click();
    }
}
