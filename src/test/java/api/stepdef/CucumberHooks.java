package api.stepdef;

import org.junit.After;
import org.junit.Before;

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
