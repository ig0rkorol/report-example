package net.serenitybdd.report.example.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.report.example.BaseTest;
import net.serenitybdd.report.example.steps.CommonSteps;
import net.serenitybdd.report.example.steps.RestSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TwoTest extends BaseTest{

    @Steps public RestSteps restSteps;
    @Steps CommonSteps commonSteps;

    @Test
    public void secondTest() {
        commonSteps.emptyStep("Step 1");
        commonSteps.emptyStep("Step 2");
        commonSteps.emptyStep("Step 3");
    }

    @Step()
    @Override
    public void testprecondition() {
        restSteps.restStep1();
    }
}