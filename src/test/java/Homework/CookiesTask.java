package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class CookiesTask extends BaseTest {
    /*
    Go to URL: http://facebook.com
    getCookies,
    addCookie,
    deleteCookieNamed,
    deleteAllCookies.
     */
    @Test
    public void test()  {
        driver.get("http://facebook.com");
        Set<Cookie> allcookies= driver.manage().getCookies();
        System.out.println(allcookies.size());
        for(Cookie a:allcookies){
            System.out.println(a.getName());
        }
        Cookie newcookie=new Cookie("ebik","gabık");
        driver.manage().addCookie(newcookie);
        allcookies=driver.manage().getCookies();
        System.out.println(allcookies.size());
        driver.manage().deleteCookieNamed(newcookie.getName());
        allcookies=driver.manage().getCookies();
        System.out.println(allcookies.size());
        driver.manage().deleteAllCookies();
        allcookies=driver.manage().getCookies();
        System.out.println(allcookies.size());

    }

}
