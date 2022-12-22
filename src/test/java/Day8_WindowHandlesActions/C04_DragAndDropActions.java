package Day8_WindowHandlesActions;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C04_DragAndDropActions extends BaseTest {
    @Test
    public void dragAndDropOffsetHorizantal() throws InterruptedException {
        driver.get("https://rangeslider.js.org/");
        WebElement slider=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,100,0).perform();
        Thread.sleep(3000);
    }


}
