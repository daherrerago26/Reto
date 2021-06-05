package empleos.tasks;

import empleos.userinterfaces.homePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class windowEmpleos implements Task {

    private homePage HomePage;
    public static windowEmpleos thePage() {
        return Tasks.instrumented(windowEmpleos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(homePage.BUTTON_WINDOW_EMPLEOS));
    }
}
