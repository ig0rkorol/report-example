package net.serenitybdd.report.example.steps;


import net.serenitybdd.report.example.model.User;
import net.serenitybdd.report.example.utils.RestUtilsExpl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RestSteps extends ScenarioSteps {

    @Step("Step 1")
    public RestSteps restStep1() {
        RestUtilsExpl.query1();
        return this;
    }
    @Step("Step 2")
    public RestSteps restStep2() {
        RestUtilsExpl.query1();
        return this;
    }
    @Step("Step 3")
    public RestSteps restStep3() {
        RestUtilsExpl.query1();
        return this;
    }

    @Step("Step 3")
    public RestSteps userTestStep(User user) throws Exception {
        if (user.getName().isEmpty())
            throw new Exception("User name is empty");
        return this;
    }

}