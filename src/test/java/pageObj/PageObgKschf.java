package pageObj;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.sun.org.apache.bcel.internal.generic.NEW;
import helping.HelpMeth;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 21.02.2018.
 */
public class PageObgKschf {

    static SelenideElement chooseFun = $(".x-form-trigger.x-form-arrow-trigger.arrow-n-combo-invalid");
    static ElementsCollection functList = $$(".x-combo-list-inner div");
    static SelenideElement osnovanie = $(By.name("document.senderTrust"));
    static SelenideElement docnNum = $(By.name("document.documentInfo.numberDoc"));
    static SelenideElement nomSchf = $(".x-grid3-cell-inner.x-grid3-col-numberSf.x-unselectable");
    static SelenideElement nomSchff = $(By.name("numberSf"));
    static ElementsCollection calendar = $$(".x-form-trigger.triger-date-n-style");
    static ElementsCollection date = $$(".x-date-active.x-date-today.x-date-selected");
    static SelenideElement ispravSchf = $(".x-grid3-cell-inner.x-grid3-col-numberCorSf.x-unselectable");
    static SelenideElement nomIsprav = $(".x-form-text.x-form-field.x-form-num-field.x-form-focus");
    static SelenideElement dateIsprav = $(".x-grid3-cell-inner.x-grid3-col-dateCorSf.x-unselectable");
    static SelenideElement choose = $(new Selectors.ByText("Выбрать.."));
    static SelenideElement submitButton = $(new Selectors.ByText("ОК"));
    static SelenideElement valutaFirst = $(By.name("document.documentInfo.dopInfoHozLive.nameCurrent"));
    static ElementsCollection rosRub = $$(new Selectors.ByText("643 Российский рубль"));
    static SelenideElement valutaSecond = $(By.name("document.documentInfo.codeCurrency"));
    static SelenideElement rekvizPere = $(By.name("document.contentHozLive3.reqDocument"));
    static SelenideElement soderOperacii = $(By.name("document.contentHozLive3.operationInfo"));
    static SelenideElement podpisantOkno = $(".x-grid3-cell-inner.x-grid3-col-FIO.x-unselectable");
    static SelenideElement samPodpisant = $(new Selectors.ByText("Работник организации - составителя информации продавца"));
    static SelenideElement chooseButton = $(new Selectors.ByText("Выбрать"));
    static ElementsCollection saveMassive = $$(new Selectors.ByText("Сохранить"));
    static SelenideElement ispavlenie = $(By.name("CORRECT"));
    static SelenideElement ispKschf = $(By.name("document.documentInfo.ispravCorrKSF.numberIspravCorSf"));
    static SelenideElement idGosKon = $(By.name("document.documentInfo.dopInfoHozLive.idGOSContract"));
    static SelenideElement kursVal = $(By.name("document.documentInfo.dopInfoHozLive.courseCurrent"));
    static SelenideElement infFhz1 =  $(By.name("isTextInfo"));
    static SelenideElement idInfoPole = $(By.name("document.documentInfo.infoFieldHozLive.idFileInfoField"));
    static SelenideElement identiF = $(".x-grid3-cell-inner.x-grid3-col-CODE.x-unselectable");
    static SelenideElement enterTextToPole = $(".x-form-text.x-form-field.x-form-focus");
    static SelenideElement znachF = $(".x-grid3-cell-inner.x-grid3-col-VALUE.x-unselectable");
    static SelenideElement enterTextToArea = $(".x-form-textarea.x-form-field.textarea-n-style.x-form-focus");
    static SelenideElement inieSved = $(By.name("document.contentHozLive3.changePrice"));
    static SelenideElement naimDocOsn = $(".x-grid3-cell-inner.x-grid3-col-name.x-unselectable");
    static SelenideElement textAnother = $(".x-form-text.textfield-n-style.x-form-focus");
    static SelenideElement nomDocOsn = $(".x-grid3-cell-inner.x-grid3-col-number.x-unselectable");
    static SelenideElement dateDocOsn = $(".x-grid3-cell-inner.x-grid3-col-date.x-unselectable");
    static SelenideElement dopSved = $(".x-grid3-cell-inner.x-grid3-col-info.x-unselectable");
    static ElementsCollection closeAndSave = $$(".x-tool.x-tool-close");
    static SelenideElement submitOk = $(new Selectors.ByText("OK"));
    static SelenideElement tableEntering = $(new Selectors.ByText("18%"));
    static SelenideElement autoCount = $(new Selectors.ByText("Автоподсчет суммы"));
    static SelenideElement naimeProd = $(By.name("nameProduct"));
    static SelenideElement stoimSnalogDo = $(By.name("summProductWithNDS.priceBeforeChange"));
    static SelenideElement stoimSnalogPosle = $(By.name("summProductWithNDS.priceAfterChange"));
    static ElementsCollection saveTable = $$(new Selectors.ByText("Сохранить"));
    static SelenideElement okeiBefore = $(By.name("okeiBefore"));
    static SelenideElement okeiAfter = $(By.name("okeiAfter"));
    static ElementsCollection stuka = $$(new Selectors.ByText("796 шт."));
    static SelenideElement kolvoBefor = $(By.name("countProductBefore"));
    static SelenideElement kolvoAfter = $(By.name("countProductAfter"));
    static SelenideElement akcizDo = $(By.name("exciseBefore.tax"));
    static SelenideElement akcizAfter = $(By.name("exciseAfter.tax"));
    static SelenideElement korrDebet = $(By.name("dopInfoProduct.debet"));
    static SelenideElement korrKredit = $(By.name("dopInfoProduct.credit"));
    static ElementsCollection infoFhz2 = $$(".x-grid3-cell-inner.x-grid3-col-CODE.x-unselectable");
    static ElementsCollection znachFhz2 = $$(".x-grid3-cell-inner.x-grid3-col-VALUE.x-unselectable");


    public static void fillTable(int minMax){
        tableEntering.doubleClick();
        autoCount.click();
        naimeProd.click();
        naimeProd.setValue("АВТО Наименование продукта");
        stoimSnalogDo.setValue("256400.11");
        stoimSnalogPosle.setValue("342964.25");
        if (minMax == 2) {
            okeiBefore.setValue("шт");
            stuka.get(0).isDisplayed();
            stuka.get(0).click();
            okeiAfter.setValue("шт");
            stuka.get(1).isDisplayed();
            stuka.get(1).click();
            kolvoBefor.clear();
            kolvoBefor.setValue("142.11");
            kolvoAfter.clear();
            kolvoAfter.setValue("156.5");
            akcizDo.setValue("456.35");
            akcizAfter.setValue("512.78");
            korrDebet.setValue("123456789");
            korrKredit.setValue("987654321");
            infoFhz2.get(1).click();
            enterTextToPole.setValue("АВТО идентификатор ФХЖ 2");
            znachFhz2.get(1).doubleClick();
            enterTextToArea.setValue("АВТО значение идентификатора ФХЖ 2");
        }
        saveTable.get(1).click();
    }


    public static void fillKschf(int minMax, int function){
        chooseFunction(function);
        String nomer;
        if (minMax ==1) {
            nomer = "MIN";
        } else {
            nomer = "MAX";
        }
        docnNum.setValue("АВТО: " + nomer +" " + function + function + function + " " + HelpMeth.randomCount());
        choose.click();
        $(new Selectors.ByText("576771279")).isDisplayed();
        $(new Selectors.ByText("576771279")).click();
        submitButton.click();
        valutaFirst.setValue("рос");
        rosRub.get(0).isDisplayed();
        rosRub.get(0).click();
        valutaSecond.setValue("рос");
        rosRub.get(1).isDisplayed();
        rosRub.get(1).click();
        rekvizPere.setValue("АВТО реквизиты передаточных документов");
        soderOperacii.setValue("АВТО содержание операции");
        nomSchf.doubleClick();
        nomSchff.setValue("АВТО 10/110");
        calendar.get(2).click();
        date.get(0).click();
        if (minMax == 2){
            ispravSchf.click();
            nomIsprav.setValue("1");
            dateIsprav.doubleClick();
            calendar.get(3).click();
            date.get(1).click();
        }
        saveMassive.get(1).click();

        if (minMax == 2){
            osnovanie.setValue("АВТО Основание составителя");


            idGosKon.setValue("АВТО ид госконтракта");
            kursVal.setValue("12.11");
            infFhz1.click();
            idInfoPole.setValue("111112222222333333333333444444444444");
            identiF.click();
            enterTextToPole.setValue("АВТО идентификатор ФХЖ 1");
            znachF.doubleClick();
            enterTextToArea.setValue("АВТО значение идентификатора ФХЖ 1");
            inieSved.setValue("АВТО иные сведения об измении стоимости");
            calendar.get(1).click();
            date.get(0).click();
            naimDocOsn.click();
            textAnother.setValue("АВТО наименование документа основания");
            nomDocOsn.click();
            textAnother.setValue("110/200");
            dateDocOsn.doubleClick();
            calendar.get(2).click();
            date.get(1).click();
            dopSved.click();
            enterTextToArea.setValue("АВТО дополнительные сведения о документе-основании");
            ispavlenie.click();
            ispKschf.setValue("2");
            $$(".x-form-trigger.triger-date-n-style").get(1).click();
            //calendar.get(1).click(); //-почему-то не работает
            $$(".x-date-active.x-date-today.x-date-selected").get(2).click();
            //date.get(2); // чо за нахъ?
        }
        podpisant();
        fillTable(minMax);

        closeAndSave.get(1).click();
        $(new Selectors.ByText("Сохранить изменения перед закрытием?")).isDisplayed();
        $(new Selectors.ByText("Да")).click();
        submitOk.click();
    }

    public static void podpisant(){
        podpisantOkno.doubleClick();
        samPodpisant.isDisplayed();
        samPodpisant.click();
        chooseButton.click();
    }

    public static void chooseFunction(int function){
        chooseFun.click();
        switch (function){
            case 4:
                $$(functList).get(0).click();
                break;
            case 5:
                $$(functList).get(1).click();
                break;
            case 6:
                $$(functList).get(2).click();
                break;
        }
    }
}
