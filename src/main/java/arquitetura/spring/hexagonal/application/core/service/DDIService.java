package arquitetura.spring.hexagonal.application.core.service;

import arquitetura.spring.hexagonal.application.core.domain.DDIs;
import arquitetura.spring.hexagonal.application.core.domain.ListDDIs;
import arquitetura.spring.hexagonal.application.core.enums.StatusCodeCountry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DDIService {

    public List<DDIs> list(){
        List<DDIs> ddIs = new ArrayList<>();
        DDIs ddi = new DDIs();
        ddi.setDdIsList(new ArrayList<>());
        ddIs.add(ddi);

        List<StatusCodeCountry> enumOrders = Arrays.asList(StatusCodeCountry.values());

        enumOrders.stream().forEach(code -> {
            ListDDIs listDDIs = new ListDDIs();
            listDDIs.setCodeDDI(code.getCode());
            listDDIs.setCountry(code.getCountry());

            ddi.getDdIsList().add(listDDIs);
        });

        return ddIs;
    }
}
