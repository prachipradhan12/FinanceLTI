package com.fianance.service;

import java.util.List;

import com.fianance.model.EmiCard;

public interface EmiCardService {
	public List<EmiCard> getAllEmiCard();
	public boolean addEmiCard(EmiCard emiCard);
}
