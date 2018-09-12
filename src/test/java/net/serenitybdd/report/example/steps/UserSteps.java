package net.serenitybdd.report.example.steps;

import net.serenitybdd.report.example.model.User;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserSteps extends ScenarioSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserSteps.class);

    @Step("Print user id {0}")
    public UserSteps printUserId(User user) {
        LOGGER.info("PRINT USER ID is {}", user.getId().toUpperCase());
        return this;
    }
    @Step("Step 2")
    public UserSteps setUserId(User user) {
        String id = RandomUtils.nextInt()+"";
        LOGGER.info("Set user id to {}", id);
        user.setId(id);
        return this;
    }

}