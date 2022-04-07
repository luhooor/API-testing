package api.stepdef;

import api.service.reqres;
import io.cucumber.java.en.When;

public class RegisterStepDefs {
    reqres reqres = new reqres();

    @When("POST register request is sent with body of email and password")
    public void postRegisterRequestIsSentWithBodyOfEmailAndPassword() {
        reqres.postRegister("eve.holt@reqres.in", "12345678");
    }

    @When("POST register request is sent with body of email without password")
    public void postRequestIsSentWithBodyOfEmailWithoutPassword() {
        reqres.postRegister("luhur@reqres.in","");
    }
}
