package PkgException;

import pkgPokerBLL.Hand;

public class HandException extends Exception {
	private Hand hand;

	public HandException(Hand hand) {
		super();
		this.setHand(hand);
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
