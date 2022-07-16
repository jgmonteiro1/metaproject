package com.jgmonteiro.pocmeta.services;

import com.jgmonteiro.pocmeta.entities.Sale;
import com.jgmonteiro.pocmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Page<Sale> findSales(final Pageable pageable) {
        return saleRepository.findAll(pageable);
    }

}
