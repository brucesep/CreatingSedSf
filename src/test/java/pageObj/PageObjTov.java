package pageObj;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import helping.HelpMeth;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 13.03.2018.
 */
public class PageObjTov {

    static SelenideElement docNum = $(By.name("document.documentInfo.sellerInfo.dateNumberDoc.numberDoc"));
    static ElementsCollection choiseBuyer = $$(new Selectors.ByText("Выбрать.."));
    static SelenideElement submitButton = $(new Selectors.ByText("ОК"));
    static SelenideElement currency = $(By.name("document.documentInfo.sellerInfo.currency.nameCurrent"));
    static SelenideElement podpisOkno = $(".x-grid3-cell-inner.x-grid3-col-FIO.x-unselectable");
    static SelenideElement samPodpisant = $(new Selectors.ByText("Работник организации - составителя информации продавца"));
    static SelenideElement choosePodp = $(new Selectors.ByText("Выбрать"));
    static SelenideElement entingTable = $(new Selectors.ByText("18%"));
    static SelenideElement autoCount = $(new Selectors.ByText("Автоподсчет суммы"));
    static SelenideElement prodName = $(By.name("name"));
    static SelenideElement okei = $(By.name("okei"));
    static SelenideElement okeiName = $(By.name("mesaure"));
    static SelenideElement priceNDS = $(By.name("summWithNDS"));
    static ElementsCollection saveTable = $$(new Selectors.ByText("Сохранить"));
    static ElementsCollection saveAndExit = $$(".x-tool.x-tool-close");
    static SelenideElement submitOk = $(new Selectors.ByText("OK"));



    public static void fillPereTov(int minMax) {
        String nomer;
        if (minMax == 1) {
            nomer = "MIN";
        } else {
            nomer = "MAX";
        }

        docNum.sendKeys("АВТО " + nomer + " 777 " + HelpMeth.randomCount());
        choiseBuyer.get(0).click();
        $(new Selectors.ByText("576771279")).isDisplayed();
        $(new Selectors.ByText("576771279")).click();
        submitButton.click();
        currency.sendKeys("Евр");
        $(new Selectors.ByText("978 Евро")).isDisplayed();
        $(new Selectors.ByText("978 Евро")).click();
        if (minMax == 2) {

        }

        podpisant();
        fillTable(minMax);
        saveAndExit.get(1).click();
        $(new Selectors.ByText("Да")).click();
        submitOk.click();
    }

    public static void fillTable(int minMax) {
        entingTable.doubleClick();
        autoCount.click();
        prodName.sendKeys("АВТО наименование товара");
        okei.click();
        okei.sendKeys("шт");
        $(new Selectors.ByText("796 шт.")).isDisplayed();
        $(new Selectors.ByText("796 шт.")).click();
        okeiName.click();
        priceNDS.clear();
        priceNDS.sendKeys("4598.98");
        if (minMax == 2) {

        }
        saveTable.get(1).click();

    }


    public static void podpisant() {
        podpisOkno.doubleClick();
        samPodpisant.isDisplayed();
        samPodpisant.click();
        choosePodp.click();
    }
}
