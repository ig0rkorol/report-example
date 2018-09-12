package net.serenitybdd.report.example.utils;


import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class RestUtilsExpl {

    public static void query1() {
        Response response = SerenityRest.given().get("https://api.instagram.com/v1/tags/nofilter/media/recent?access_token=ACCESS_TOKEN", new Object[0]);
        response.prettyPrint();
    }
}
