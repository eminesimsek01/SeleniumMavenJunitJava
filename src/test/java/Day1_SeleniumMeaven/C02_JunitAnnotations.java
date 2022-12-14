package Day1_SeleniumMeaven;

import org.junit.*;

public class C02_JunitAnnotations {
    //1. test
    //2. test
    //3. test
    //4. test(geliştirme sonrasında bu yüzden rapora dahil olamsın).
    //Her testimizden önce ve sonra çalışması gereken kod bloklarımız mevcut.
    //Tüm testlerin öncesinde ve sonrasında çalışması gereken metodlarımız mevcut

    //        1. @Test -> Marks a method as a TEST CASE.
    //        2. @Before : Runs before EACH @Test annotation.
    //        3. @After : Runs after EACH @Test annotation.
    //        4. @BeforeClass : Runs before each class only once.
    //        5. @AfterClass : Runs after each class only once.
    //        6. @Ignore : Skipping a test case.

    @Test
    public void test01(){
        System.out.println("1. test yapılıyor...");
    }
    @Test
    public void test02(){
        System.out.println("2. test yapılıyor...");
    }

    @Test
    public void test03(){
        System.out.println("3. test yapılıyor...");
    }

    @Test
    @Ignore
    public void test04(){
        System.out.println("4. test geliştirme aşamasında..");
    }

    @Before
    public void beforeEach(){
        System.out.println("Method'un öncesinde kod bloğu çalıştı");
    }
    @After
    public void afterEach(){
        System.out.println("Method'un sonrasında kod bloğu çalıştı");
    }
    @BeforeClass
    public static void beforeAll(){
        System.out.println("Methodların öncesinde kod bloğu çalıştı");
    }
    @AfterClass
    public static void afterAll(){
        System.out.println("Method'ların sonrasında kod bloğu çalıştı");
    } //Beforeclass ve Afterclass tüm classı çalıştıracağı için metodlar statik olmalı
    //1. Method beforeAll() should be static
    //  2. Method afterAll() should be static


}
