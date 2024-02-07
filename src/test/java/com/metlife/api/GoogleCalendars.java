package com.metlife.api;

import io.restassured.http.Header;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GoogleCalendars
{
@Test
public void createCalendar()
{
given().baseUri("https://www.googleapis.com/calendar/v3")
        .headers("Authorization","Bearer ya29.a0AfB_byA6yZ9vMxqwOApNsw6Fj_WB_2ziHKYYzuJTCSWJRSEvCWptHXFFETPs0Lvj0weE3YnfBwAvPcqxwsQgM6ZaBd11yq6Wf9VKDuaITFHXqzkvA5vqWzTUz1Evkn9kF7VWSAw0xSrNmbCY4TqoKUV29tmlN102nB366gaCgYKAb8SARESFQHGX2Miqchd1g6hnmglAevgc0VPVA0173")
        .body("{\n" +
                "    \"summary\":\"Metlife Test Calendar\"\n" +
                "}")
        .when()
        .post("/calendars")
        .then()
        .statusCode(200);
}
}
