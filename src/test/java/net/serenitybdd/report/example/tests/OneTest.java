package net.serenitybdd.report.example.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.report.example.BaseTest;
import net.serenitybdd.report.example.model.User;
import net.serenitybdd.report.example.steps.UserSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class OneTest {//extends BaseTest{

    User user = new User("Initial Name");

    @Steps UserSteps userSteps;

    @Test
    public void firstTest() {
        userSteps.printUserId(user);
    }

//    @Step
//    @Override
    @Before
    public void testprecondition() {
        userSteps.setUserId(user);
    }
}