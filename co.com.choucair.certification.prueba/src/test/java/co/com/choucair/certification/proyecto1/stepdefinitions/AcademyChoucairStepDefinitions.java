package co.com.choucair.certification.proyecto1.stepdefinitions;




import co.com.choucair.certification.proyecto1.model.AcademyChoucairData;
import co.com.choucair.certification.proyecto1.questions.Answer;
import co.com.choucair.certification.proyecto1.tasks.Login;
import co.com.choucair.certification.proyecto1.tasks.OpenUp;
import co.com.choucair.certification.proyecto1.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class AcademyChoucairStepDefinitions {


    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alejandra wants to learn automation at the academy choucair$")
    public void thanAlejandraWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Alejandra").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^she search fot the course (.*) on the choucair academy platform$")
    public void sheSearchFotTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course)  {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^She finds the course called resources (.*)$")
    public void sheFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
