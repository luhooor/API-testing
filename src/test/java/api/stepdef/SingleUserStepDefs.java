package api.stepdef;

import api.service.reqres;
import io.cucumber.java.en.When;

public class SingleUserStepDefs {
    reqres reqres = new reqres();

    @When("GET request is sent to get single user data with id: {int}")
    public void getRequestIsSentToGetSingleUserDataWithId(int id) {
        reqres.getSingleUser(id);
    }

    @When("GET request is sent to get single user data with {string}")
    public void getRequestIsSentToGetSingleUserDataWith(String value) {
        reqres.getSingleUser(value);
    }

    @When("GET request is sent to get single user data with unknown id: {int}")
    public void getRequestIsSentToGetSingleUserDataWithUnknownId(int id) {
        reqres.getSingleUser(id);
    }
}
