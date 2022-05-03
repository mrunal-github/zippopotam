package us.zippopotam.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import us.zippopotam.steps.UserSteps;

public class MyStepdefs {

    @Steps
    UserSteps userSteps;
    @When("^user sends a GET request to the Endpoint with \"([^\"]*)\" and \"([^\"]*)\" they should receive successful response with valid status code 200$")
    public void userSendsAGETRequestToTheEndpointWithAndTheyShouldReceiveSuccessfulResponseWithValidStatusCode(String country, String postcode) {
        userSteps.getAllDetailsOfUkPostCode("GB","AB1").statusCode(200);
        userSteps.getAllDetailsOfUsPostCode("us","90210").statusCode(200);
    }



}
