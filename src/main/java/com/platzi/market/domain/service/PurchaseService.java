package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private final PurchaseRepository pruchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository pruchaseRepository) {
        this.pruchaseRepository = pruchaseRepository;
    }

    public List<Purchase> getAll() {
        return pruchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByClient(String clientId) {
        return pruchaseRepository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return pruchaseRepository.save(purchase);
    }

}
