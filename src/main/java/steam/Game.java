package steam;

public class Game {
  private String title;
  private String achievements;
  private String lastPlayed;
  private String playTime;


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAchievements() {
    return achievements;
  }

  public void setAchievements(String achievements) {
    this.achievements = achievements;
  }

  public String getLastPlayed() {
    return lastPlayed;
  }

  public void setLastPlayed(String lastPlayed) {
    this.lastPlayed = lastPlayed;
  }

  public String getPlayTime() {
    return playTime;
  }

  public void setPlayTime(String playTime) {
    this.playTime = playTime;
  }
}
