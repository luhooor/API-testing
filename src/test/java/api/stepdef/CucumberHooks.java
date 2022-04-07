package api.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    @Before
    public void Before() {
        System.out.println("Cucumber Hooks Before");
    }

    @After
    public void After() {
        System.out.println("Cucumber Hooks After");
    }
}
