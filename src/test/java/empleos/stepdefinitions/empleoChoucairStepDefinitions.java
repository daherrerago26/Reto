package empleos.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import empleos.tasks.windowEmpleos;
import empleos.tasks.windowPortal;
import empleos.userinterfaces.homePage;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class empleoChoucairStepDefinitions {

    private homePage HomePage = new homePage();

    @Before
    public void setStage(){
        OnStage.setTheStage((new OnlineCast()));
    }
    @Given("^(.*) wants to apply for a job at choucair$")
    public void wants_to_apply_for_a_job_at_choucair(String nameActor) {
        OnStage.theActorCalled(nameActor).wasAbleTo(Open.browserOn(HomePage));
        getDriver().manage().window().maximize();
    }

    @When("^(.*) enters the work section of the choucair page$")
    public void he_enters_the_work_section_of_the_choucair_page(String nameActor) {
        OnStage.theActorCalled(nameActor).wasAbleTo(windowEmpleos.thePage());
    }

    @Then("^(.*) presses the button Ir al portal de empleos$")
    public void he_presses_the_button_Ir_al_portal_de_empleos(String nameActor) {
        OnStage.theActorCalled(nameActor).wasAbleTo(windowPortal.thePage());
    }
}
