public class BasketballTeam extends SportsTeam {
	
  private int fieldGoals;
  private int fieldGoalsAttempted;
  private int freeThrows;
  private int freeThrowsAttempted;

  public BasketballTeam() {
    super();
    this.fieldGoals = 0;
    this.fieldGoalsAttempted = 0;
    this.freeThrows = 0;
    this.freeThrowsAttempted = 0;
  }

  public BasketballTeam(String teamName, String teamMascot, String headCoach) {
    super(teamName, teamMascot, headCoach);
    this.fieldGoals = 0;
    this.fieldGoalsAttempted = 0;
    this.freeThrows = 0;
    this.freeThrowsAttempted = 0;
  }

  double fieldGoalPercentage() {
    return (double) fieldGoals / (double) fieldGoalsAttempted;
  }

  double freeThrowPrecentage() {
    return (double) freeThrows / (double) freeThrowsAttempted;
  }

  public double[] getStats() {
    double arr[] = new double[3];
    arr[0] = super.getWinPercentage();
    arr[1] = fieldGoalPercentage();
    arr[2] = freeThrowPrecentage();
    return arr;
  }
}