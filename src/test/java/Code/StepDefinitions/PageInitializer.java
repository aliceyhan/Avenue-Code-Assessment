package Code.StepDefinitions;

import Code.Pages.AvenueMainPage;
import Code.Pages.AvenueSignInPage;
import Code.Pages.MyTaskPage;
import Code.Pages.PopupModalDialogPage;

public class PageInitializer {

    public static AvenueSignInPage avenueSignInPage;
    public static AvenueMainPage avenueMainPage;
    public static MyTaskPage myTaskPage;
    public static PopupModalDialogPage popupModalDialogPage;



    public static void initializePageObjects(){
        avenueSignInPage= new AvenueSignInPage();
        avenueMainPage =new AvenueMainPage();
        myTaskPage = new MyTaskPage();
        popupModalDialogPage = new PopupModalDialogPage();
    }
}
