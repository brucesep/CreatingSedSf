package pageObj;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import Helps.HelpMeth;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by alexeya on 14.02.2018.
 */
public class PajeObjSchf {

    static SelenideElement chooseFunct = $(".x-form-trigger.x-form-arrow-trigger.arrow-n-combo-invalid");
    static ElementsCollection functionList = $$(".x-combo-list-inner div");
    static SelenideElement docNumber = $(By.name("document.documentInfo.numberDoc"));
    static SelenideElement onzheGruzo = $(By.name("document.documentInfo.cargoSender.cargoAsSeller"));
    static SelenideElement valutaOb = $(By.name("document.documentInfo.codeCurrency"));
    static ElementsCollection rosRub = $$(new Selectors.ByText("643 Российский рубль"));
    static SelenideElement podpisTable = $(".x-grid3-cell-inner.x-grid3-col-FIO.x-unselectable");
    static SelenideElement samPodpisant = $(new Selectors.ByText("Тестов"));
    static SelenideElement choiseButton = $(new Selectors.ByText("Выбрать"));
    static ElementsCollection chooseMassive = $$(new Selectors.ByText("Выбрать.."));
    static SelenideElement waitingTablePoluch = $(new Selectors.ByText("Получатели"));
    static SelenideElement pokupatel = $(new Selectors.ByText("576771279"));
    static SelenideElement buttonOk = $(new Selectors.ByText("ОК"));
    static SelenideElement mainTable = $(new Selectors.ByText("18%"));
    static SelenideElement autoCount = $(new Selectors.ByText("Автоподсчет суммы"));
    static SelenideElement nameProduct = $(By.name("nameProduct"));
    static SelenideElement okei = $(By.name("okei"));
    static SelenideElement stuka = $(new Selectors.ByText("796 шт."));
    static SelenideElement kolTovara = $(By.name("countProduct"));
    static SelenideElement priceNds = $(By.name("priceWithNDS"));
    static ElementsCollection savingCargo = $$(new Selectors.ByText("Сохранить"));
    static SelenideElement submitExit = $(new Selectors.ByText("Документ успешно сохранен!"));
    static SelenideElement submitOk = $(new Selectors.ByText("OK"));
    //Для максимального заполнения
    static SelenideElement soderOper = $(By.name("document.infoHozLive.infoHoz.infoOper"));
    static SelenideElement osnovSostavit = $(By.name("document.senderTrust"));
    static SelenideElement getOnzheGruzoPoluch = $(By.name("isReceiver"));
    static SelenideElement waitinTableLoaded = $(new Selectors.ByText("Реквизиты грузоотправителей и грузополучателей"));
    static SelenideElement firstPoluch = $(new Selectors.ByText("Тестовое"));
    static SelenideElement secondPoluch = $(new Selectors.ByText("АОЗТ \"Никодим и сыновья\""));
    static ElementsCollection platDoc = $$(".x-grid3-row.x-grid3-row-first.x-grid3-row-last");
    static SelenideElement plantNumber = $(".x-form-text.x-form-field.x-form-invalid.x-form-focus");
    static SelenideElement datePlat = $(".x-grid3-col.x-grid3-cell.x-grid3-td-2.x-grid3-cell-last");
    static ElementsCollection calend = $$(".x-form-trigger.triger-date-n-style");
    static ElementsCollection dateDate = $$(".x-date-active.x-date-today.x-date-selected");
    static SelenideElement idGosKontr = $(By.name("document.documentInfo.dopInfoHozLive.idGOSContract"));
    static SelenideElement valDop = $(By.name("document.documentInfo.dopInfoHozLive.nameCurrent"));
    static SelenideElement valKourse = $(By.name("document.documentInfo.dopInfoHozLive.courseCurrent"));
    static ElementsCollection checkBoxes = $$(By.name("isTextInfo"));
    static SelenideElement idInfoPole1 = $(By.name("document.documentInfo.infoFieldHozLive.idFileInfoField"));
    static ElementsCollection unselIditif = $$(".x-grid3-cell-inner.x-grid3-col-CODE.x-unselectable");
    static ElementsCollection znachUnsel = $$(".x-grid3-cell-inner.x-grid3-col-VALUE.x-unselectable");
    static SelenideElement znachZnach = $(".x-form-textarea.x-form-field.textarea-n-style.x-form-focus");
    static SelenideElement check3fhzh = $(By.name("isInfoHoz3Panel"));
    static SelenideElement vidOper = $(By.name("document.infoHozLive.infoHoz.typeOper"));
    static SelenideElement naimdocOsn = $(".x-grid3-cell-inner.x-grid3-col-name.x-unselectable");
    static SelenideElement textInputField = $(".x-form-text.textfield-n-style.x-form-focus");
    static SelenideElement nomDocOsn = $(".x-grid3-col.x-grid3-cell.x-grid3-td-number");
    static SelenideElement dateDocOsn = $(".x-grid3-col.x-grid3-cell.x-grid3-td-date");
    static SelenideElement dopSvedOsn = $(".x-grid3-col.x-grid3-cell.x-grid3-td-info.x-grid3-cell-last");
    static SelenideElement nomTranNakl = $(".x-grid3-col.x-grid3-cell.x-grid3-td-numberInvoice");
    static SelenideElement naklCalen = $(".x-grid3-cell-inner.x-grid3-col-dateInvoice.x-unselectable");
    static SelenideElement svedTransp = $(By.name("document.infoHozLive.infoHoz.transportCargo.infoCargo"));
    static SelenideElement svedPeredach = $(By.name("document.infoHozLive.infoHoz.infoTransferItem.infoTransfer"));
    static SelenideElement infoFhz3 = $(By.name("isTextInfo3"));
    static SelenideElement getIdInfoPole3 = $(By.name("document.infoHozLive.infoFieldHozLive.idFileInfoField"));
    static SelenideElement korrectirovka = $(By.name("CORRECT"));
    static SelenideElement korrNumber = $(By.name("document.documentInfo.correctSf.numberCorSf"));
    static SelenideElement priznak = $(By.name("dopInfoProduct.type"));
    static SelenideElement dopInfoPr = $(By.name("dopInfoProduct.dopInfoType"));
    static SelenideElement charakter = $(By.name("dopInfoProduct.codeTov"));
    static SelenideElement akcizSumm = $(By.name("excise.tax"));
    static SelenideElement kolvoOtpust = $(By.name("dopInfoProduct.contSend"));
    static SelenideElement korrDebet = $(By.name("dopInfoProduct.debet"));
    static SelenideElement korrKredit = $(By.name("dopInfoProduct.credit"));
    static SelenideElement country = $(".x-grid3-cell-inner.x-grid3-col-codeCountry.x-unselectable");
    static SelenideElement countryEnter = $(".x-form-text.combo-n-style.x-form-focus");
    static SelenideElement tamozhNom = $(".x-grid3-cell-inner.x-grid3-col-numberTamozhDeclaration.x-unselectable");
    static SelenideElement textPoleInput = $(".x-form-text.x-form-field.x-form-focus");
    static ElementsCollection closeAndSave = $$(".x-tool.x-tool-close");


    public static void fillSchf(int minMax, int function) {

        chooseFunction(function);
        String nomerr;
        if (minMax == 1) {
            nomerr = "MIN";
        } else {
            nomerr = "MAX";
        }
        docNumber.setValue("АВТО: " + nomerr +" " + function + function + function + " " + HelpMeth.randomCount());

        if (minMax == 1) {
            onzheGruzo.click();
        }
        valutaOb.setValue("рос").click();
        $$(rosRub).get(0).isDisplayed();
        $$(rosRub).get(0).click();
        podpisant();
        $$(chooseMassive).get(0).click();
        waitingTablePoluch.isDisplayed();
        pokupatel.click();
        buttonOk.click();
        if (function != 1) {
            soderOper.setValue("АВТО Содержание операции");
        }
        if (minMax == 2) {
            osnovSostavit.setValue("АВТО основание по которому эконсубъект является");
            getOnzheGruzoPoluch.click();
            $$(chooseMassive).get(1).click();
            waitinTableLoaded.isDisplayed();
            firstPoluch.isDisplayed();
            firstPoluch.click();
            choiseButton.click();
            $$(chooseMassive).get(2).click();
            waitinTableLoaded.isDisplayed();
            secondPoluch.isDisplayed();
            secondPoluch.click();
            choiseButton.click();
            $$(platDoc).get(0).$(".x-grid3-cell-inner.x-grid3-col-1.x-unselectable").click();
            plantNumber.setValue("АВТО пладт.док № " + function + function + function);
            datePlat.click();
            $$(calend).get(1).click();
            $$(dateDate).get(0).click();
            idGosKontr.setValue("АВТО айДи госконтр");
            valDop.setValue("рос").click();
            $$(rosRub).get(1).isDisplayed();
            $$(rosRub).get(1).click();
            valKourse.setValue("10.25");
            $$(checkBoxes).get(0).click();
            idInfoPole1.setValue("111112222222333333333333444444444444");
            $$(unselIditif).get(0).click();
            $$(".x-layer.x-editor.x-small-editor.x-grid-editor").get(2);(textPoleInput).setValue("АВТО ИНДЕТИФИКАТОР");
            $$(znachUnsel).get(0).doubleClick();
            znachZnach.setValue("АВТО значение идентификатора информационного поля факта хозяйственной жизни 1");
            check3fhzh.click();
            if (function == 1) {
                soderOper.setValue("АВТО Содержание операции по факту хозяйственной жизни 3");
            }
            vidOper.setValue("АВТО вид операции по факту хозяйственной жизни 3");
            $$(calend).get(2).click();
            $$(dateDate).get(1).click();
            naimdocOsn.click();
            textInputField.setValue("АВТО наименование документа-основания");
            nomDocOsn.doubleClick();
            textInputField.setValue("АВТО 110/110");
            dateDocOsn.doubleClick();
            $$(calend).get(3).click();
            $$(dateDate).get(2).click();
            dopSvedOsn.click();
            znachZnach.setValue("АВТО Дополнительные сведения по документу-остнованию");
            $$(chooseMassive).get(3).click();
            $(new Selectors.ByText("Довереннов")).isDisplayed();
            $(new Selectors.ByText("Довереннов")).click();
            choiseButton.click();
            nomTranNakl.click();
            textInputField.setValue("АВТО номер тансп. накладной 110");
            naklCalen.doubleClick();
            $$(calend).get(4).click();
            $$(dateDate).get(3).click();
            $$(chooseMassive).get(4).click();
            waitinTableLoaded.isDisplayed();
            $(new Selectors.ByText("Фамилиев")).isDisplayed();
            $(new Selectors.ByText("Фамилиев")).click();
            choiseButton.click();
            svedTransp.setValue("АВТО сведения о транспортировке и грузе");
            $$(calend).get(5).click();
            $$(dateDate).get(4).click();
            svedPeredach.setValue("АВТО сведения о передаче");
            infoFhz3.click();
            getIdInfoPole3.setValue("111112222222333333333333444444444444");
            $$(unselIditif).get(1).click();
            textPoleInput.setValue("АВТО Идетификатор ФХЖ 3");
            $$(znachUnsel).get(1).doubleClick();
            znachZnach.setValue("АВТО значение идентификатора ФХЖ 3");
            korrectirovka.click();
            korrNumber.setValue("1");
            $$(calend).get(1).click();
            $$(dateDate).get(5).click();
        }

        fillTable(minMax);

        $$(closeAndSave).get(1).click();
        $(new Selectors.ByText("Сохранить изменения перед закрытием?")).isDisplayed();
        $(new Selectors.ByText("Да")).click();
        submitOk.click();
    }

    public static void fillTable(int minMax) {
        mainTable.doubleClick();
        autoCount.click();
        nameProduct.click();
        nameProduct.setValue("АВТО наименование товара 1");
        okei.setValue("шт").click();
        stuka.isDisplayed();
        stuka.click();
        kolTovara.clear();
        kolTovara.setValue("256");
        priceNds.clear();
        priceNds.setValue("250489.65");
        if (minMax == 2) {
            priznak.setValue("тов");
            $(new Selectors.ByText("Товар")).isDisplayed();
            $(new Selectors.ByText("Товар")).click();
            dopInfoPr.setValue("001");
            charakter.setValue("АВТО характеристика и код торвара");
            akcizSumm.clear();
            akcizSumm.setValue("10489.65");
            kolvoOtpust.setValue("103");
            korrDebet.setValue("111222333");
            korrKredit.setValue("333222111");
            country.click();
            countryEnter.setValue("нор");
            $(new Selectors.ByText("578 НОРВЕГИЯ")).isDisplayed();
            $(new Selectors.ByText("578 НОРВЕГИЯ")).click();
            tamozhNom.click();
            textPoleInput.setValue("АВТО номер там.декл. 110");
            akcizSumm.click();
            $$(unselIditif).last().doubleClick();
            textPoleInput.setValue("АВТО Идентификатор ФХЖ 2");
            $$(znachUnsel).get(2).click();
            znachZnach.setValue("АВТО значение идентификатора ФХЖ 2");
            akcizSumm.click();
        }
        $$(savingCargo).get(1).click();
    }

    public static void podpisant() {
        podpisTable.doubleClick();
        samPodpisant.click();
        choiseButton.click();
    }

    public static void chooseFunction(int function) {
        chooseFunct.click();
        switch (function) {
            case 1:
                $$(functionList).get(0).click();
                break;
            case 2:
                $$(functionList).get(1).click();
                break;
            case 3:
                $$(functionList).get(2).click();
                break;
        }

    }

}
