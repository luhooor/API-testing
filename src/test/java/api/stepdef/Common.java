package api.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Common {
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
