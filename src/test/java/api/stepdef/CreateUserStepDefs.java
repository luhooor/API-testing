package api.stepdef;

import api.service.reqres;
import io.cucumber.java.en.When;

public class CreateUserStepDefs {
    reqres reqres = new reqres();

    @When("POST create request is sent with body of name and job")
    public void postCreateRequestIsSentWithBodyOfNameAndJob() {
        reqres.createUser("morpheus", "leader");
    }

    @When("POST create user is sent with body of {string} and {string}")
    public void postCreateUserIsSentWithBodyOfAnd(String name, String job) {
        reqres.createUser(name, job);
    }
}
