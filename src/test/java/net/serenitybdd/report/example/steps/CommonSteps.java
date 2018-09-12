package net.serenitybdd.report.example.steps;

import net.serenitybdd.report.example.model.User;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CommonSteps extends ScenarioSteps {
    @Step("{0}")
    public void emptyStep(String message) {
    }
    @Step("{0}")
    public void stepUser(User user) {
        user.setName("John");
    }
}
