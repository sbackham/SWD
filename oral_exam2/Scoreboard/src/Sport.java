public  abstract class Sport {
    private String homeTeam;
    private String awayTeam;
    private String gameTime;

    /*
    Sport constructor
     */
    public Sport(String home, String away, String time){
        gameTime = time;
        awayTeam = away;
        homeTeam = home;
    }

    /*
    getters for the home team, away team, and how long a game period is
    since these attributes define what a Sport is
     */
    public final String getHome(){
        return homeTeam;
    }
    public final String getAway(){
        return awayTeam;
    }
    public final String getTime(){
        return gameTime;
    }
}
