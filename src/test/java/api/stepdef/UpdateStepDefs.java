package api.stepdef;

import api.service.reqres;
import io.cucumber.java.en.When;

public class UpdateStepDefs {
    reqres reqres = new reqres();
    @When("PUT request with body of name: {string} and job: {string} is sent to update user data with id: {int}")
    public void putRequestWithBodyOfNameAndJobIsSentToUpdateUserDataWithId(String name, String job, int id) {
        reqres.updateUser(name, job, id);
    }

    @When("PUT request with body of name: {string} and job: {string} is sent to update user data with invalid id: {int}")
    public void putRequestWithBodyOfNameAndJobsIsSentToUpdateUserDataWithInvalidIdId(String name, String job, int id) {
        reqres.updateUser(name, job, id);
    }
}
