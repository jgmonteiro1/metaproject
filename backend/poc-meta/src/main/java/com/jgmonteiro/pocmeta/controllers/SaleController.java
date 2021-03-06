package com.jgmonteiro.pocmeta.controllers;

import com.jgmonteiro.pocmeta.entities.Sale;
import com.jgmonteiro.pocmeta.services.SaleService;
import com.jgmonteiro.pocmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @Autowired
    private SmsService smsService;

    @GetMapping
    public ResponseEntity<Page<Sale>> findSales(final Pageable pageable, @RequestParam(value = "minDate", defaultValue = "") final String minDate, @RequestParam(value = "maxDate", defaultValue = "") final String maxDate) {
        final Page<Sale> sales = saleService.findSales(pageable, minDate, maxDate);
        return ResponseEntity.ok().body(sales);
    }


    @GetMapping(value = "/notification/{id}")
    public void notifySms(@PathVariable final Long id){
        smsService.sendSms(id);
    }
}
