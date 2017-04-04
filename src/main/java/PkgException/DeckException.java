package PkgException;

import pkgPokerBLL.Deck;

public class DeckException extends Exception {
	private Deck deck;

	public DeckException(Deck deck) {
		super();
		this.setDeck(deck);
}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
}

