package com.jgmonteiro.pocmeta.services;

import com.jgmonteiro.pocmeta.entities.Sale;
import com.jgmonteiro.pocmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Page<Sale> findSales(final Pageable pageable, final String minDate, final String maxDate) {

        final LocalDate min = LocalDate.parse(minDate);
        final LocalDate max = LocalDate.parse(maxDate);

        return saleRepository.findSales(pageable, min, max);
    }

}
