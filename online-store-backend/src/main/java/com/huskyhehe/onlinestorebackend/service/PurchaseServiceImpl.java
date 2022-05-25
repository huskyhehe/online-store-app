package com.huskyhehe.onlinestorebackend.service;

import com.huskyhehe.onlinestorebackend.model.Purchase;
import com.huskyhehe.onlinestorebackend.repository.PurchaseRepository;
import com.huskyhehe.onlinestorebackend.repository.projection.PurchaseItem;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }

}
