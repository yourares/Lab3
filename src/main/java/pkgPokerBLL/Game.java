package pkgPokerBLL;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private List<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(UUID tableID, ArrayList<Player> gameplayers){
		setGamePlayers(gameplayers);
		setTableID(tableID);
		UUID.randomUUID();
	}

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public List<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(List<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	public void AddPlayerToGame(Table table, Player player){
		table.AddPlayerToTable(player);	
		this.AddPlayerToGame(table, player);
    }
	public void RemovePlayerFromTable(Table table, Player player){
		table.RemovePlayerFromTable(player);	
		this.AddPlayerToGame(table, player);
    }
}
