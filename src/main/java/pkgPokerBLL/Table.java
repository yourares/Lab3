package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	//	Change this from ArrayList to HashMap.
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
	public Table() {
		super();
		setTableID(UUID.randomUUID());
	}
	
	public Table AddPlayerToTable(Player p)
	{
		this.TablePlayers.add(p);		
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		this.TablePlayers.remove(p);
		return this;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
}
