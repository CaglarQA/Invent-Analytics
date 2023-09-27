package ramazan.step_def;

import io.cucumber.java.Scenario;
import org.junit.After;
import ramazan.utily.Driver;

import java.security.PublicKey;

public class Hooks {
    @After
    public void tearDownScenario(Scenario scenario){
        Driver.closeDriver();
    }
}
