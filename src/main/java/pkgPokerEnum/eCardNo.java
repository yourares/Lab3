package pkgPokerEnum;

public enum eCardNo {

	FirstCard(0), SecondCard(1), ThirdCard(2), 
	FourthCard(3), FifthCard(4);
	
	private boolean iWild;

	private eCardNo(final int CardNo){
		this.CardNo = CardNo;
	}
	private eCardNo(final int CardNo, final boolean iWild){
		this.CardNo = CardNo;
		this.setiWild(iWild);
}

	private int CardNo;
	
	public int getCardNo(){
		return CardNo;
	}
	public boolean isiWild() {
		return iWild;
	}
	public void setiWild(boolean iWild) {
		this.iWild = iWild;
	}
	
}
