 import java.util.*;

/**
 * Write a description of class NFLTeam here.
 * 
 * @author Joe Dunne, Joe Dementri, Michael Matthews
 * @version (a version number or a date)
 */

//2016 10 22 1329 sbw: started to change Team from NFLTeam
//      but noted many inconsistencies from current Controller Team setup
//      most of the code here can be eliminated!!
//  TO fix:
//    note conflict between current Player and NFLPlayer here
//    Controller builds Teams and loads players 
public class NFLTeam {
    
    /**
     * Team name
     */
    private String team;
    private String player;
    private NFLTeam teamMember;
    /**
     * List of all of the players on the team
     */
    private ArrayList<Player> players;
    private ArrayList<Player> offense;
    private ArrayList<Player> defense;

    /**
     * Constructor for objects of class NFLTeam
     * 
     * @param team - the team name
     */
    public NFLTeam(String team) 
    {
        this.team = team;
        this.players = new ArrayList<Player>();
        offense = new ArrayList<Player>();
        defense = new ArrayList<Player>();
        teamMember = new NFLTeam(team);
    }
    
    
    //Implement
    public void act() 
    {
    
    }

    /**
     * Adds a player to the list of all players
     * 
     * @param player - the player to add to the list
     */
    public void addPlayer(Player player) {
        players.add(player);
    }
        
    /**
     * Removes a player from the list
     * 
     * @param player - the player to remove from the team list
     */
    public void removePlayer(Player player) {
        int index = 0;
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            if (it.next().getName(index).equals(teamMember.getName(index))) {
                it.remove();
            }
        }
    }
    
    /** 
     * Adds player to offense
     * @param player - the player to add to offense
     */
    public void addPlayerToOffense(Player player)
    {
        offense.add(player);
    }
    
    /**
     * Adds player to defense
     * @param player - the player to add to defense
     */
    public void addPlayerToDefense(Player player)
    {
        defense.add(player);
    }

    /**
     * Gets a player with the specified name
     * 
     * @param name - the name of the player to get
     */
    public Player getPlayer(String name) {
        Iterator<NFLPlayer> it = players.iterator();
        while (it.hasNext()) {
            NFLPlayer player = it.next();
            if (player.getFullName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;
    }
    
    /**
     * Gets a player by their position first and then by overall
     * 
     * @param pos - the pos of the player to get
     */
    public Player getPlayerByPos(String pos) {
        Iterator<NFLPlayer> it = players.iterator();
        NFLPlayer bestAtPos = null;
        while (it.hasNext()) {
            NFLPlayer p = it.next();
            if (p.getPosition().equalsIgnoreCase(pos)) {
                if (bestAtPos == null) {
                    bestAtPos = p;
                }
                if (bestAtPos != null && p.getOverall() > bestAtPos.getOverall()) {
                    bestAtPos = p;
                }
            }
        }
        return bestAtPos;
    }
    
    /**
     * Gets all of the players on the team
     * 
     * @return     the list of players
     */    
    public ArrayList<Player> getPlayers() {
        return players;
    }
    /**
     * Gets all of the players on the team
     * 
     * @return     the list of players
     */    
    public ArrayList<Player> getOffense() {
        return offense;
    }
    /**
     * Gets all of the players on the team
     * 
     * @return     the list of players
     */    
    public ArrayList<Player> getDefense() {
        return defense;
    }
    
    /**
     * 
     */
    public String getName(int index)
    {
        String name = "";
        name = players.get(index);
        return name;
    }
    /**
     * Gets the team name
     * 
     * @return the team name
     */
    public String getTeamName() 
    {
        return team;
    }
}