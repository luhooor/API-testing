package api.stepdef;

import api.service.reqres;
import io.cucumber.java.en.When;

public class DeleteStepDefs {
    reqres reqres = new reqres();

    @When("DELETE request is sent to delete user data with id: {int}")
    public void deleteRequestIsSentToDeleteUserDataWithId(int id) {
        reqres.deleteUser(id);
    }

    @When("DELETE request is sent to delete user data with invalid id: {int}")
    public void deleteRequestIsSentToDeleteUserDataWithInvalidIdId(int id) {
        reqres.deleteUser(id);
    }
}
