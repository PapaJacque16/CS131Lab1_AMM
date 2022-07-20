public abstract class SportsTeam {

  protected String teamName;
  protected String teamMascot;
  protected String headCoach;
  protected int win;
  protected int losses;

  public SportsTeam() {
    this.teamName = "";
    this.teamMascot = "";
    this.headCoach = "";
    this.win = 0;
    this.losses = 0;
  }

  public SportsTeam(String teamName, String teamMascot, String headCoach) {
    this.teamName = teamName;
    this.teamMascot = teamMascot;
    this.headCoach = headCoach;
    this.win = 0;
    this.losses = 0;
  }

  double getWinPercentage() {
    return (double) win / (double) (win + losses);
  }

  public abstract double[] getStats();
}
