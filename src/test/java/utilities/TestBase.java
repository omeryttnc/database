package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBase {
    protected RequestSpecification spec01;
    protected RequestSpecification spec02;
    protected RequestSpecification spec03_5;
@Before

    public void setup(){
        spec01 = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com/booking")
                .build();
        spec02 = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com/todos")
                .build();

    }
}
