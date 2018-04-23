package pageObj;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import helping.HelpMeth;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 22.03.2018.
 */
public class PageObjRab {

    static SelenideElement docNum = $(By.name("document.documentInfo.dateNumberDoc.numberDoc"));
    static SelenideElement zakaz = $(new Selectors.ByText("Выбрать.."));
    static SelenideElement submitOk = $(new Selectors.ByText("ОК"));
    static SelenideElement currency = $(By.name("document.documentInfo.currency.nameCurrent"));
    static SelenideElement podpisOp = $(".x-grid3-cell-inner.x-grid3-col-FIO.x-unselectable");
    static SelenideElement samPodpisant = $(new Selectors.ByText("Работник организации - составителя информации продавца"));
    static SelenideElement submitChoise = $(new Selectors.ByText("Выбрать"));
    static SelenideElement tableOpen = $(".x-grid3-cell-inner.x-grid3-col-startDate.x-unselectable");
    static ElementsCollection calendar = $$(".x-form-trigger.triger-date-n-style");
    static ElementsCollection firstDate = $$(".x-date-inner");
    static ElementsCollection dateDate = $$(".x-date-active.x-date-today.x-date-selected");
    static SelenideElement autoCount = $(new Selectors.ByText("Автоподсчет суммы"));
    static SelenideElement nameWork = $(By.name("nameWork"));
    static SelenideElement okei = $(By.name("okei"));
    static SelenideElement okeiSt = $(new Selectors.ByText("796 шт."));
    static SelenideElement kolvo = $(By.name("count"));
    static SelenideElement priceNDS = $(By.name("priceWithNDS"));
    static ElementsCollection saveTableOne = $$(new Selectors.ByText("Сохранить"));
    static ElementsCollection miniOk = $$(new Selectors.ByText("Ок"));
    static ElementsCollection closeAndSave = $$(".x-tool.x-tool-close");
    static SelenideElement osnEcon = $(By.name("document.senderTrust"));
    static SelenideElement zagSod = $(By.name("document.documentInfo.hozLive1.operationInfo"));
    static SelenideElement korrerkt = $(new Selectors.ByText("Корректировка"));
    static SelenideElement isprNom = $(By.name("document.documentInfo.corrected.numberDocCorrect"));
    static SelenideElement naimDocosn = $(".x-grid3-cell-inner.x-grid3-col-name.x-unselectable");
    static SelenideElement enterText = $(".x-form-text.textfield-n-style.x-form-focus");
    static SelenideElement nomDocOsn = $(".x-grid3-cell-inner.x-grid3-col-number.x-unselectable");
    static SelenideElement datedocOsn = $(".x-grid3-cell-inner.x-grid3-col-date.x-unselectable");
    static SelenideElement dopSvedOsn = $(".x-grid3-cell-inner.x-grid3-col-info.x-unselectable");
    static SelenideElement enterTextArea = $(".x-form-textarea.x-form-field.textarea-n-style.x-form-focus");
    static SelenideElement idGosKont = $(By.name("document.documentInfo.hozLive1.idGosContr"));
    static SelenideElement course = $(By.name("document.documentInfo.currency.courseCurrent"));
    static SelenideElement vidOper = $(By.name("document.documentInfo.hozLive1.typeOperation"));
    static SelenideElement fhZh1 = $(new Selectors.ByText("Информационное поле факта хозяйственной жизни 1"));
    static SelenideElement idFileFhzh1 = $(By.name("document.documentInfo.hozLive1.infoPolHozLive1.idFileInfoField"));
    static ElementsCollection idFhz = $$(".x-grid3-col.x-grid3-cell.x-grid3-td-CODE");
    static SelenideElement enterTextString = $(".x-form-text.x-form-field.x-form-focus");
    static ElementsCollection znazhFhz = $$(".x-grid3-cell-inner.x-grid3-col-VALUE.x-unselectable");
    static SelenideElement svedPeredach = $(By.name("document.contentHozLive2.infoSendItem.info"));
    static SelenideElement infoFhzh2 = $(new Selectors.ByText("Информационное поле факта хозяйственной жизни 2"));
    static SelenideElement textInfo = $(By.name("textInfo"));
    static SelenideElement debet = $(By.name("debet"));
    static SelenideElement kredit = $(By.name("credit"));


    public static void fillTable(int minMax) {
        tableOpen.doubleClick();
        $$(calendar).get(3).click();
        $$(firstDate).last().$$(".x-date-active").get(0).click();
        $$(calendar).get(4).click();
        $$(firstDate).last().$$(".x-date-active").last().click();
        $(new Selectors.ByText("18%")).doubleClick();
//        autoCount.isDisplayed();
//        autoCount.click();
        $$(".x-form-checkbox.x-form-field").get(3).click();
        nameWork.sendKeys("АВТО наименование услуг");
        okei.sendKeys("шт");
        okeiSt.isDisplayed();
        okeiSt.click();
        kolvo.clear();
        kolvo.sendKeys("11.4");
        priceNDS.clear();
        priceNDS.sendKeys("9764.16");
        if (minMax == 2) {
            textInfo.sendKeys("АВТО текстовое описание выполненных работ");
            debet.sendKeys("123456789");
            kredit.sendKeys("987654321");
            $$(idFhz).last().click();
            enterTextString.sendKeys("АВТО идентификатор инфополя описания");
            $$(znazhFhz).last().doubleClick();
            enterTextArea.sendKeys("АВТО значение индетификатора инфополя описания выполненных работ (оказанных услуг).");
            $$(idFhz).last().click();
        }
        $$(saveTableOne).get(1).click();
        $$(miniOk).last().click();
    }

    public static void fillPerRab(int minMax) {
        String nomer;
        if (minMax == 1) {
            nomer = "MIN";
        } else nomer = "MAX";
        docNum.sendKeys("АВТО " + nomer + " 888 " + HelpMeth.randomCount());
        zakaz.click();
        $(new Selectors.ByText("576771279")).isDisplayed();
        $(new Selectors.ByText("576771279")).click();
        submitOk.click();
        currency.sendKeys("евр");
        $(new Selectors.ByText("978 Евро")).isDisplayed();
        $(new Selectors.ByText("978 Евро")).click();
        podpisant();
        fillTable(minMax);
        if (minMax == 2) {
            osnEcon.sendKeys("АВТО основание эконсубъекта");
            zagSod.sendKeys("АВТО заголовок содержания операции");
            korrerkt.click();
            isprNom.sendKeys("1");
            $$(calendar).get(1).click();
            $$(dateDate).last().click();
            naimDocosn.click();
            enterText.sendKeys("АВТО наименвоание док.осн.");
            nomDocOsn.doubleClick();
            enterText.sendKeys("АВТО номер док.осн.");
            datedocOsn.doubleClick();
            $$(calendar).get(2).click();
            $$(dateDate).last().click();
            dopSvedOsn.doubleClick();
            enterTextArea.sendKeys("АВТО дополнительные сведения по документу основанию");
            idGosKont.click();
            idGosKont.sendKeys("АВТО ид. госконтракта");
            course.sendKeys("60.12");
            vidOper.sendKeys("АВТО вид операции");
            fhZh1.click();
            idFileFhzh1.sendKeys("111111111111222222222222333333333333");
            $$(idFhz).get(0).click();
            enterTextString.sendKeys("АВТО идентификатор ФХЖ1");
            $$(znazhFhz).get(0).doubleClick();
            enterTextArea.sendKeys("АВТО значение идентификатора ФХЖ1");
            $$(calendar).get(3).click();
            $$(dateDate).last().click();
            $$(calendar).get(4).click();
            $$(dateDate).last().click();
            svedPeredach.click();
            svedPeredach.sendKeys("АВТО сведения о передаче");
            infoFhzh2.click();
            $$(idFhz).get(1).click();
            enterTextString.sendKeys("АВТО идентификатор ФХЖ2");
            $$(znazhFhz).get(1).click();
            enterTextArea.sendKeys("АВТО значение идентификатора ФХЖ2");
        }

        $$(closeAndSave).get(1).click();
        $(new Selectors.ByText("Сохранить изменения перед закрытием?")).isDisplayed();
        $(new Selectors.ByText("Да")).click();
        $(new Selectors.ByText("Документ успешно сохранен!")).waitUntil(Condition.appear, 10000).isDisplayed();
        $(new Selectors.ByText("OK")).click();

    }

    public static void podpisant() {
        podpisOp.doubleClick();
        samPodpisant.isDisplayed();
        samPodpisant.click();
        submitChoise.click();
    }
}
