package empleos.tasks;

import empleos.userinterfaces.empleosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class windowPortal implements Task {

    private empleosPage EmpleosPage;

    public static windowPortal thePage() {
        return Tasks.instrumented(windowPortal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(empleosPage.BUTTON_PORTAL_EMPLEOS),
                Click.on(empleosPage.BUTTON_CONTINUAR));
    }
}
