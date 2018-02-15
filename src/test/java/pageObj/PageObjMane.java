package pageObj;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by alexeya on 14.02.2018.
 */
public class PageObjMane {

    static SelenideElement newDoc = $(new Selectors.ByText("Новый документ"));
    static ElementsCollection docList = $$(".x-menu-list .x-menu-list-item");


    public static void schfCreat(int minMax, int function) {
        newDoc.click();
        $$(docList).get(4).click();
        switch (minMax) {
            case 1:
                switch (function) {
                    case 1:
                        PajeObjSchf.fillSchfMin(1);
                        break;
                    case 2:
                        PajeObjSchf.fillSchfMin(2);
                        break;
                    case 3:
                        PajeObjSchf.fillSchfMin(3);
                        break;
                }
                break;
            case 2:
                switch (function) {
                    case 1:
                        PajeObjSchf.fillSchfMin(1);
                        PajeObjSchf.fillSchfMax(1);
                        break;
                    case 2:
                        PajeObjSchf.fillSchfMin(2);
                        PajeObjSchf.fillSchfMax(2);
                        break;
                    case 3:
                        PajeObjSchf.fillSchfMin(3);
                        PajeObjSchf.fillSchfMax(3);
                        break;
                }
                break;
        }

    }
}
