package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_JavaFakerClass {
    //Faker değerler üretmek için Faker Class'ından bir obje üretilir v evar olan metotları kulanırız.

    //Faker değerler üretmek için Faker Class’ından bir obje üretir ve var olan metotları kullanırız.


    @Test
    public void fakerExample(){

        //Faker objesini olusturuyoruz
        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().fullAddress());

    }

}
