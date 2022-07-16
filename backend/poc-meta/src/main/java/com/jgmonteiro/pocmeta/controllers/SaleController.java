package com.jgmonteiro.pocmeta.controllers;

import com.jgmonteiro.pocmeta.entities.Sale;
import com.jgmonteiro.pocmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Sale>> findSales() {
        final List<Sale> sales = saleService.findSales();
        return ResponseEntity.ok().body(sales);
    }
}
