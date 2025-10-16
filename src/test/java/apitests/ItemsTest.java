package apitests;

import dataObjects.ItemDetails;
import io.restassured.http.ContentType;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ItemsTest {

    @Test
    public void verifyGetReturnsSuccess() {
        given().when().
                get("https://www.babyblog.ru/login").
                then().
                assertThat().statusCode(200);
    }

    @Test
    public void verifyPostReturnsSuccess() {
        ItemDetails profileData = new ItemDetails("tone4ka.selyova@yandex.ru",
                "eA@k_fZPU@VNP8i");

        given().contentType(ContentType.JSON).
                body(profileData).log().body().
                when().
                post("https://www.babyblog.ru/api/auth/email").
                then().
                assertThat().statusCode(200);
    }
}
