package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.Data;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.task.*;
import co.com.choucair.certification.proyectobase.userinterface.Complete;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class NewRegistryStepDefinitios {
    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alejandra wants register in the page automationpractice$")
    public void thanAlejandraWantsRegisterInThePageAutomationpractice() {
        OnStage.theActorCalled("Alejandra").wasAbleTo(OpenUp.thePage());
    }

    @When("^she registered his data in the form (.*) (.*) (.*) (.*) and (.*)$")
    public void sheRegisteredHisDataInTheFormNewRegistry( String registryNewUser, String registryPersonal, String registryAddress, String registryDevices, String completeRegistry)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistryUser.the(registryNewUser));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistryPersonal.the(registryPersonal));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistryAddress.the(registryAddress));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistryDevices.the(registryDevices));
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteRegistry.the(completeRegistry));
    }

    @Then("^she end the (.*) in the page$")
    public void sheValidatestheregistry (String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
