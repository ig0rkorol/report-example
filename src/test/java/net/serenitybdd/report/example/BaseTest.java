package net.serenitybdd.report.example;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.StepFactory;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseTest extends PrecSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    @Before
    @Step
    public void testSetup2(){
        LOGGER.info("P  R  E  C  O  N  D  I  T  I  O  N");
//        StepFactory.getFactory().getNewCachedStepLibraryFor(this.getClass()).stepInPreconditions();
        StepFactory.getFactory().getSharedStepLibraryFor(this.getClass()).stepInPreconditions();
    }
}
