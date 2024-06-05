package arquitetura.spring.hexagonal.application.core.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum StatusCodeCountry {

    AFEGANISTAO("93", "Asia"),
    AFRICADOSUL("27", "Europa"),
    ALBANIA("355", "Europa"),
    ALEMANHA("49", "Europa"),
    ANDORRA("376", "Europa"),
    ANGOLA("244", "Africa"),
    ANGUILLA("1", "America Central"),
    ANTIGUA_E_BARBUDA("1", "America Central"),
    ANTILHAS_E_HOLANDESAS("599", "America Central"),
    ARABIA_SAUDITA("966", "Asia"),
    ARGELIA("213", "Africa"),
    ARGENTINA("54", "America do Sul"),
    ARMENIA("374", "Asia"),
    ARUBA("297", "America Central"),
    ASCENSAO("247", "Africa"),
    AUSTRALIA("61", "Oceania"),
    AUSTRIA("43", "Europa"),
    AZERBAIJAO("994", "Africa"),
    BAHAMAS("1", "America Central"),
    BANGLADESH("880", "Asia"),
    BARBADOS("1", "America Central"),
    BAHRFIN("973", "Asia"),
    BELGICA("32", "Europa"),
    BENIN("229", "Africa"),
    BERMUDAS("1", "America Central"),
    BIELORUSSIA("375", "Europa"),
    BOSNIA_HERZEGOVINA("387", "Europa"),
    BOTSWANA("267", "Africa"),
    BRAZIL("55", "America do Sul");


    private final String code;
    private final String country;

    StatusCodeCountry(String code, String country) {
        this.code = code;
        this.country = country;
    }
}
