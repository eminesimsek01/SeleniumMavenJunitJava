package Homework;

import Utilities.BaseTest;
import org.junit.Test;

public class UploadFileTask extends BaseTest {
    /*
    Go to URL: https://www.monsterindia.com/seeker/registration
    Upload file.
     */

    @Override
    public void tearDown() {
    }

    @Test
    public void test() {
        driver.get("https://www.monsterindia.com/seeker/registration");

    }
}
