package com.jgmonteiro.pocmeta.controllers;

import com.jgmonteiro.pocmeta.entities.Sale;
import com.jgmonteiro.pocmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<Sale>> findSales(final Pageable pageable) {
        final Page<Sale> sales = saleService.findSales(pageable);
        return ResponseEntity.ok().body(sales);
    }
}
