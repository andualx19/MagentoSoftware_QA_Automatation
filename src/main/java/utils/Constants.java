package utils;

import java.util.Random;

public abstract class Constants {
    public static final String URL = "https://magento.softwaretestingboard.com/", PROPERTY_COLOR = "color";

    public static final String COMPANY_X = "company", STREET_X = "street[0]", CITY_X = "city", ZIP_X = "postcode", PHONE_X = "telephone";
    public static final String COUNTRY_I_X = "country_id", COUNTRY_O_X = "//option[@value='RO']", JUDET_I_X = "region_id",
    JUDET_O_X = "//option[@value='287']";

    // Correct info
    public static final String[] DATA = {
            "Crocodil", "Pisica", fakeMail(), "passWORD!"
    };

    public static final String EMAIL = "crocodil.pisica453702@gmail.com", PASSWORD = "passWORD!";

    // Wrong info
    public static final String[] WDATA = {
            "crocodilpisica", "pass"
    };

    // Colors
    public static final String RED_COLOR = "rgba(224, 43, 39, 1)";

    public static String fakeMail() {
        String email = "crocodil.pisica" + new Random().nextInt(1_000_000) + "@gmail.com";
        System.out.println(email);
        return email;
    }
}
