package pageObj;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by alexeya on 14.02.2018.
 */
public class PageObjMane {

    static SelenideElement newDoc = $(new Selectors.ByText("Новый документ"));
    static ElementsCollection docList = $$(".x-menu-list .x-menu-list-item");

    public static void  rezRabCreate(int minMax) {
        newDoc.click();
        $$(docList).get(1).click();
        switch (minMax){
            case 1:
                PageObjRab.fillPerRab(1);
                break;
            case 2:
                PageObjRab.fillPerRab(2);
                break;
        }
    }

    public static void tovarCreate(int minMax){
        newDoc.click();
        $$(docList).get(2).click();
        switch (minMax){
            case 1:
                PageObjTov.fillPereTov(1);
                break;
            case 2:
                PageObjTov.fillPereTov(2);
                break;
        }
    }

    public static void kschfCreate(int minMax, int function) {
        newDoc.click();
        $$(docList).get(3).click();
        switch (minMax) {
            case 1:
                switch (function) {
                    case 1:
                        PageObgKschf.fillKschf(1, 4);
                        break;
                    case 2:
                        PageObgKschf.fillKschf(1, 5);
                        break;
                    case 3:
                        PageObgKschf.fillKschf(1, 6);
                        break;
                }
                break;
            case 2:
                switch (function) {
                    case 1:
                        PageObgKschf.fillKschf(2, 4);
                        break;
                    case 2:
                        PageObgKschf.fillKschf(2, 5);
                        break;
                    case 3:
                        PageObgKschf.fillKschf(2, 6);
                        break;
                }
                break;

        }
    }

    public static void schfCreat(int minMax, int function) {
        newDoc.click();
        $$(docList).get(4).click();
        switch (minMax) {
            case 1:
                switch (function) {
                    case 1:
                        PajeObjSchf.fillSchf(1, 1);
                        break;
                    case 2:
                        PajeObjSchf.fillSchf(1, 2);
                        break;
                    case 3:
                        PajeObjSchf.fillSchf(1, 3);
                        break;
                }
                break;
            case 2:
                switch (function) {
                    case 1:
                        PajeObjSchf.fillSchf(2, 1);
                        break;
                    case 2:
                        PajeObjSchf.fillSchf(2, 2);
                        break;
                    case 3:
                        PajeObjSchf.fillSchf(2, 3);
                        break;
                }
                break;
        }

    }
}
