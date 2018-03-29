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
    static SelenideElement submitChoise = $(new Selectors.ByText("Выбрать"));
    static SelenideElement osnEkon = $(By.name("document.senderTrust"));
    static SelenideElement correct = $(By.name("CORRECT"));
    static SelenideElement ispravlenie = $(By.name("document.documentInfo.sellerInfo.corrected.numberDocCorrect"));
    static ElementsCollection calendar = $$(".x-form-trigger.triger-date-n-style");
    static ElementsCollection dateDate = $$(".x-date-active.x-date-today.x-date-selected");
    static ElementsCollection naimdocOsn = $$(".x-grid3-cell-inner.x-grid3-col-name.x-unselectable");
    static SelenideElement enterText = $(".x-form-text.textfield-n-style.x-form-focus");
    static ElementsCollection nomdocOsn = $$(".x-grid3-cell-inner.x-grid3-col-number.x-unselectable");
    static SelenideElement datedocOsn = $(".x-grid3-cell-inner.x-grid3-col-date.x-unselectable");
    static SelenideElement dopsvOsn = $(".x-grid3-cell-inner.x-grid3-col-info.x-unselectable");
    static SelenideElement enterTextArea = $(".x-form-textarea.x-form-field.textarea-n-style.x-form-focus");
    static SelenideElement idGosKontr = $(By.name("document.documentInfo.sellerInfo.hozLive1.idGosContr"));
    static SelenideElement course = $(By.name("document.documentInfo.sellerInfo.currency.courseCurrent"));
    static SelenideElement vidOper = $(By.name("document.documentInfo.sellerInfo.hozLive1.typeOperation"));
    static SelenideElement infoFHZ1 = $(By.name("isTextInfo"));
    static SelenideElement idFHZ1 = $(By.name("document.documentInfo.sellerInfo.hozLive1.infoPolHozLive1.idFileInfoField"));
    static ElementsCollection identFHZ = $$(".x-grid3-cell-inner.x-grid3-col-CODE.x-unselectable");
    static SelenideElement enterTextString = $(".x-form-text.x-form-field.x-form-focus");
    static ElementsCollection znazhFHZ = $$(".x-grid3-cell-inner.x-grid3-col-VALUE.x-unselectable");
    static SelenideElement prilozh = $(By.name("document.contentHozLive3.docsInfo"));
    static SelenideElement nomTranspNakl = $(".x-grid3-cell-inner.x-grid3-col-numberInvoice.x-unselectable");
    static SelenideElement dateNakl = $(".x-grid3-cell-inner.x-grid3-col-dateInvoice.x-unselectable");
    static SelenideElement infFHZH3 = $(By.name("isTextInfo3"));
    static SelenideElement charTov = $(By.name("property"));
    static SelenideElement sortTov = $(By.name("sort"));
    static SelenideElement artTov = $(By.name("article"));
    static SelenideElement codeTov = $(By.name("code"));
    static SelenideElement vidUpak = $(By.name("typePack"));
    static SelenideElement kolMest = $(By.name("place"));
    static SelenideElement kolStuk = $(By.name("countPlace"));
    static SelenideElement mBrutt = $(By.name("brutto"));
    static SelenideElement kolOtp = $(By.name("needSend"));
    static SelenideElement kolPered = $(By.name("nettoSend"));
    static SelenideElement debet = $(By.name("debet"));
    static SelenideElement credit = $(By.name("credit"));

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
            charTov.sendKeys("АВТО характеристика товара");
            sortTov.sendKeys("АВТО 1");
            artTov.sendKeys("АВТО артикул");
            codeTov.sendKeys("АВТО код");
            vidUpak.sendKeys("АВТО вид упаковки");
            kolMest.clear();
            kolMest.sendKeys("7");
            kolStuk.clear();
            kolStuk.sendKeys("12.5");
            mBrutt.clear();
            mBrutt.sendKeys("42.33");
            kolOtp.clear();
            kolOtp.sendKeys("27.65");
            kolPered.clear();
            kolPered.sendKeys("27.65");
            debet.sendKeys("123456789");
            credit.sendKeys("987654321");
            $$(identFHZ).get(2).click();
            enterTextString.sendKeys("АВТО идентификатор ФХЖ2");
            $$(znazhFHZ).get(2).doubleClick();
            enterTextArea.sendKeys("АВТО значение идентификатора ФХЖ2");
            kolPered.click();
        }
        saveTable.get(1).click();
    }

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
            osnEkon.sendKeys("АВТО Основание экономического субъекта");
            correct.click();
            ispravlenie.sendKeys("1");
            $$(calendar).get(1).click();
            $$(dateDate).get(0).click();
            $$(choiseBuyer).get(1).click();
            $(new Selectors.ByText("АОЗТ \"Никодим и сыновья\"")).isDisplayed();
            $(new Selectors.ByText("АОЗТ \"Никодим и сыновья\"")).click();
            submitChoise.click();
            $$(choiseBuyer).get(2).click();
            $(new Selectors.ByText("Тестовое")).isDisplayed();
            $(new Selectors.ByText("Тестовое")).click();
            submitChoise.click();
            $$(naimdocOsn).get(0).click();
            enterText.sendKeys("АВТО наим.док.осн.");
            $$(nomdocOsn).get(0).doubleClick();
            enterText.sendKeys("АВТО номер док.основания");
            datedocOsn.doubleClick();
            $$(calendar).get(2).click();
            $$(dateDate).get(1).click();
            dopsvOsn.doubleClick();
            enterTextArea.sendKeys("АВТО дополнительные сведения для документа-основания");
            idGosKontr.sendKeys("АВТО ИД госконтракта");
            course.sendKeys("64.45");
            vidOper.sendKeys("АВТО Вид операции");
            infoFHZ1.click();
            idFHZ1.sendKeys("111111111111112222222222222222233333");
            $$(identFHZ).get(0).click();
            enterTextString.sendKeys("АВТО идентификатор ФХЖ 1");
            $$(znazhFHZ).get(0).doubleClick();
            enterTextArea.sendKeys("АВТО значение идентификатора ФХЖ1");
            $$(calendar).get(3).click();
            $$(dateDate).get(2).click();
            prilozh.click();
            prilozh.sendKeys("АВТО приложение различных документов с количеством листов");
            $$(choiseBuyer).get(3).click();
            $(new Selectors.ByText("Физическов")).isDisplayed();
            $(new Selectors.ByText("Физическов")).click();
            submitChoise.click();
            nomTranspNakl.click();
            enterText.sendKeys("АВТО номер трансп. накладной");
            dateNakl.doubleClick();
            $$(calendar).get(4).click();
            $$(dateDate).get(3).click();
            $$(choiseBuyer).get(4).click();
            $(new Selectors.ByText("Индивидуальнов")).isDisplayed();
            $(new Selectors.ByText("Индивидуальнов")).click();
            submitChoise.click();
            infFHZH3.click();
            $$(identFHZ).get(1).click();
            enterTextString.sendKeys("АВТО идентификатор ФХЖ3");
            $$(znazhFHZ).get(1).doubleClick();
            enterTextArea.sendKeys("АВТО значение идентификатора ФХЖ3");
        }
        podpisant();
        fillTable(minMax);
        saveAndExit.get(1).click();
        $(new Selectors.ByText("Да")).click();
        submitOk.click();
    }


    public static void podpisant() {
        podpisOkno.doubleClick();
        samPodpisant.isDisplayed();
        samPodpisant.click();
        choosePodp.click();
    }
}
