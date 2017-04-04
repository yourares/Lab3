package pkgPokerBLL;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private List<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(UUID tableID, ArrayList<Player> gameplayers){
		GamePlayers = gameplayers;
		TableID = tableID;
		UUID.randomUUID();
	}

	public List<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(List<Player> gameplayers) {
		GamePlayers = gameplayers;
	}

	public UUID getGameID() {
		return GameID;
	}

	public UUID getTableID() {
		return TableID;
	}
	
	public void AddPlayerToGame(Table table, Player player){
		table.AddPlayerToTable(player);
		this.GamePlayers.add(player);
		
	}

}
