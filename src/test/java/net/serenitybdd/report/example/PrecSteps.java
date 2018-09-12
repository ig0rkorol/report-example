package net.serenitybdd.report.example;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PrecSteps extends ScenarioSteps {
    public abstract void testprecondition();

    private static final Logger LOGGER = LoggerFactory.getLogger(PrecSteps.class);

    @Step("P R E C O N D I T I O N S")
    public void stepInPreconditions(){
        LOGGER.info("Preconditions - START");
        testprecondition();
        LOGGER.info("Preconditions - FINISH");
    }
}
