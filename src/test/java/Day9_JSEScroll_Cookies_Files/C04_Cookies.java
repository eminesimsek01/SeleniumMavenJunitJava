package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C04_Cookies extends BaseTest {
    /*
    Go to URL: https://kitchen.applitools.com/ingredients/cookie
    Get Cookie.
    Find the total number of cookies.
    Print all the cookies.
    Add Cookie.
    Edit Cookie.
    Delete Cookie.
    Delete All Cookies.
     */
    @Test
    public void cookiesTest() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("test get cookie");
        Cookie cookie =driver.manage().getCookieNamed("protein");
        Assert.assertEquals("chicken",cookie.getValue());
        //Find the total numeber of cookies
        Set<Cookie> allCookies=driver.manage().getCookies();
        int num0FCookies=allCookies.size();
        System.out.println(num0FCookies);
        //Print all the cookies
        for(Cookie each:allCookies){
            System.out.println("each cookie: "+each);
            System.out.println("each cookies name"+each.getName());
            System.out.println("each cookie value :"+each.getValue());
        }

        //Add Cookie
        System.out.println("add cookie");
        Cookie cookie1 =new Cookie("fruit","apple");
        driver.manage().addCookie(cookie1);
        Assert.assertEquals(cookie1.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
         allCookies=driver.manage().getCookies();//sayfada var olan cookieleri dondurur
        System.out.println(allCookies.size());//3

        //Edit Cookie
        System.out.println("edit cookie");
        Cookie edited=new Cookie(cookie1.getName(),"mango");
        driver.manage().addCookie(edited);

        Assert.assertEquals(edited.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
        System.out.println(driver.manage().getCookieNamed(cookie1.getName()).getValue());


    }

    @Test
    public void deleteCookies() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("delete cookies");
        Cookie addedCookie=new Cookie("drinks","ayran");
        driver.manage().addCookie(addedCookie);

    }
}
