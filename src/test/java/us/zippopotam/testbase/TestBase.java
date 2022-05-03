package us.zippopotam.testbase;


import io.restassured.RestAssured;
import org.junit.BeforeClass;
import us.zippopotam.utils.PropertyReader;


public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass

    public static void init(){

        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");

    }
}
