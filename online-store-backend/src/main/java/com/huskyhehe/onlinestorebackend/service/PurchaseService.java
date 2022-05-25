package com.huskyhehe.onlinestorebackend.service;

import com.huskyhehe.onlinestorebackend.model.Purchase;
import com.huskyhehe.onlinestorebackend.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {

    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);

}