package player;

public class Player {
	PlayersCards playersCard=new PlayersCards();
	int bettingMoney=0;
	
	public void bet(int t){
		bettingMoney+=t;
	}
	
}
