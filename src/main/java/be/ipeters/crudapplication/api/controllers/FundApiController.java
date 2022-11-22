package be.ipeters.crudapplication.api.controllers;

/* carlpeters created on 21/11/2022 inside the package - be.ipeters.crudapplication.api.controllers */

import be.ipeters.crudapplication.model.Fund;
import be.ipeters.crudapplication.services.FundService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
//@RestController
@RequestMapping("/app-api/funds")
public class FundApiController {

    private final FundService fundService;

    public FundApiController(FundService fundService) {
        this.fundService = fundService;
    }

//    @GetMapping(value = "/all")
//    public List<Fund> getFunds() {
//        return fundService.findAllFunds();
//    }
//
//    @GetMapping(value = "/{id}")
//    public Optional<Fund> findById(@PathVariable(value = "id") Long id) {
//        log.debug("");
//        return fundService.findById(id);
//    }
//
//    @PostMapping("/create")
//    public void createFund(@RequestBody Fund fund) {
//        log.debug("");
//    }
//
//    @PutMapping(value = "/update/{id}")
//    public void update(@PathVariable("id") Long id, @RequestBody Fund fund) {
//        log.debug("");
//    }
//
//    @DeleteMapping(value = "/delete/{id}")
//    public void delete(@PathVariable("id") Long id) {
//        log.debug("");
//    }
}