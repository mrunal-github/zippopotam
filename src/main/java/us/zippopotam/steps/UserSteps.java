package us.zippopotam.steps;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import us.zippopotam.constants.EndPoints;

public class UserSteps {


    @Step("Getting all Details related with the US PostCode")

    public ValidatableResponse getAllDetailsOfUsPostCode(String country,String postcode) {

        return SerenityRest.rest()
                .given().log().all()
                .when()
                .get(EndPoints.GET_ALL_DETAILS_OF_US_POSTCODE)
                .then().log().all();

    }

    @Step("Getting all Details related with the UK PostCode")

    public ValidatableResponse getAllDetailsOfUkPostCode(String country, String postcode) {

        return SerenityRest.rest()
                .given().log().all()
                .when()
                .get(EndPoints.GET_ALL_DETAILS_OF_UK_POSTCODE)
                .then().log().all();

    }
}
