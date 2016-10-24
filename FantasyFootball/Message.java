 

public class Message {

	private Integer messageCode;
	private Player player;
	private PlayerStat stat;
	private NFLTeam playerName;
	private int tick;
	private int yardage;
	private int ballPosition;
	
	public Message(int messageCode, Player playerName, int tick, int yardage, int ballPosition) {
		this.messageCode = messageCode;
		this.ballPosition = ballPosition;
		this.player = playerName;
		this.yardage = yardage;
		this.tick = tick;
	}
	
	public int getBallPosition()
	{
		return ballPosition;
	}
	
	public int getMessageCode()
	{
		return messageCode;
	}
	
	public Player getPlayerName()
	{
		return player;
	}
	
	public int getTick()
	{
		return tick;
	}
	
	public void showMessage()
	{
	    String NFLPlayer = "";
	    int index = 0;
	    NFLPlayer = playerName.getName(index);
		System.out.println( NFLPlayer + " at " + yardage +  " just " + stat.getOV().get(messageCode) + " at " + tick);
	}
}
