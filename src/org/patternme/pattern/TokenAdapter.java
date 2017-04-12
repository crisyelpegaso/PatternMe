package org.patternme.pattern;

import org.patternme.model.CardToken;
import org.patternme.model.CustomerCard;

public class TokenAdapter implements Tokenizer {

	@Override
	public void tokenize(CustomerCard cc) {
		CardToken cardToken = new CardToken();
		cardToken.tokenize("lala", "123", "123");
	}

}
