package arquitetura.spring.hexagonal.adapters.inbound;

import arquitetura.spring.hexagonal.application.core.domain.DDIs;
import arquitetura.spring.hexagonal.application.core.service.DDIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class CountryController {

    @Autowired
    private DDIService ddiService;

    @GetMapping("/accountList")
    public List<DDIs> listCountry(){
        return ddiService.list();
    }
}
