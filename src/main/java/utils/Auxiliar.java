package utils;

import java.util.Random;

import static java.lang.StringTemplate.STR;

public class Auxiliar {
    // Correct info
    public static final String[] DATA = {
            "Crocodil", "Pisica", fakeMail(), "passWORD!"
    };

    // Wrong info
    public static final String[] WDATA = {
            "crocodilpisica", "pass"
    };

    public static String fakeMail() {
        String email = STR."crocodil.pisica\{new Random().nextInt(1_000_000)}@gmail.com";
        System.out.println(email);
        return email;
    }
}
