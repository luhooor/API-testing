package api.stepdef;

import api.service.reqres;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class LoginStepDefs {
    reqres reqres = new reqres();

    @When("POST login request is sent with body of email and password")
    public void postRequestIsSentWithBodyOfEmailAndPassword() {
        reqres.postLogin("eve.holt@reqres.in", "cityslicka");
    }

    @When("POST login request is sent with body of email: {string} and password: {string}")
    public void postRequestIsSentWithBodyOfEmailEmailAndPasswordPassword(String email, String password) {
        reqres.postLogin(email, password);
    }

    @Then("Status response code should be {int}")
    public void statusResponseCodeShouldBe(int status) {
        restAssuredThat(response -> response.statusCode(status));
    }

    @And("Response body should be matched with {string}")
    public void responseBodyShouldBeMatchedWith(String schema) {

        String path = "schema/" + schema;
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }
}
