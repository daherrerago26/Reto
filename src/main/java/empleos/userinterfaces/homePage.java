package empleos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class homePage extends PageObject {

    public static final Target BUTTON_WINDOW_EMPLEOS = Target.the("button that redirects us to the jobs window")
            .located(By.id("menu-item-550"));
}
