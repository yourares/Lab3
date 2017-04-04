package pkgPokerEnum;

public enum eRank {
	TWO(2), 
	THREE(3), 
	FOUR(4), 
	FIVE(5), 
	SIX(6), 
	SEVEN(7), 
	EIGHT(8), 
	NINE(9), 
	TEN(10), 
	JACK(11), 
	QUEEN(12), 
	KING(13), 
	ACE(14),
	JOKER(99,true);

	private int iRankNbr;
	private boolean iWild;

	private eRank(int iRankNbr) {
		this.iRankNbr = iRankNbr;
	}
	public int getiRankNbr() {
		return iRankNbr;
	}
	private eRank(int iRankNbr, boolean iWild) {
		this.iRankNbr = iRankNbr;
		this.setiWild(iWild);
}
	public boolean isiWild() {
		return iWild;
	}
	public void setiWild(boolean iWild) {
		this.iWild = iWild;
	}
}
