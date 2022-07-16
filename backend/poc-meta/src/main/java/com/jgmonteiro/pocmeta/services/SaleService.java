package com.jgmonteiro.pocmeta.services;

import com.jgmonteiro.pocmeta.entities.Sale;
import com.jgmonteiro.pocmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findSales() {
        return saleRepository.findAll();
    }

}
