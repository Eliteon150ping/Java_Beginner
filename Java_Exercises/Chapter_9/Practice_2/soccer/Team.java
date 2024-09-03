package Chapter_9.Practice_2.soccer;

public class Team {
    
    private String teamName;
    private Player[] playerArray;
    
    /* Practice 9-2. Add the two constructors here */

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
    
}
