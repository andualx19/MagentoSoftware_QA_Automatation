package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Constants {
    URL("https://magento.softwaretestingboard.com/"),
    PROPERTY_COLOR("color"),

    // location
    STREET_X("street[0]"),
    CITY_X("city"), ZIP_X("postcode"),
    PHONE_X("telephone"),
    COUNTRY_I_X("country_id"),
    COUNTRY_O_X("//option[@value='RO']"),
    JUDET_I_X("region_id"),
    JUDET_O_X("//option[@value='287']"),

    // Data
    COMPANY("Company"),
    ADRESS("Sos. Crocodililor"),
    CITY("Bucuresti"), ZIP("12323435"),
    PHONE("21323543"),

    // Colors
    RED_COLOR("rgba(224, 43, 39, 1)");

    public final String value;
}
