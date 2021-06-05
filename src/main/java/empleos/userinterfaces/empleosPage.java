package empleos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class empleosPage extends PageObject {

    public static final Target BUTTON_PORTAL_EMPLEOS = Target.the("button that redirects us to the job portal")
            .located(By.className("elementor-button-link elementor-button elementor-size-lg"));
    public static final Target BUTTON_CONTINUAR = Target.the("confirmation button ")
            .located(By.className("elementor-button-link elementor-button elementor-size-sm"));

}
