package arquitetura.spring.hexagonal.application.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListDDIs {

    @JsonProperty("CODE_DDI")
    private String codeDDI;
    @JsonProperty("COUNTRY")
    private String country;

}
