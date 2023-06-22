import java.util.Scanner;

class totalscore {
  public static void main(String args[]) {
    int projectscore, externalscore, internalscore, score, totalscore, score1 = 0, score2 = 0, score3 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter projectsore:");
    projectscore = sc.nextInt();
    System.out.println("Enter externalscore:");
    externalscore = sc.nextInt();
    System.out.println("Enter internalscore:");
    internalscore = sc.nextInt();
    if (projectscore >= 50 && externalscore >= 50 && internalscore >= 50) {
      totalscore = (projectscore * 70) / 100 + (externalscore * 20) / 100 + (internalscore * 10) / 100;
      if (totalscore >= 90) {
        System.out.println("Got A grade");
      } else if (totalscore >= 70 && totalscore <= 89) {
        System.out.println("Got B grade");
      } else if (totalscore >= 69 && totalscore <= 50) {
        System.out.println("Got c grade");
      }
    } else {
      if (projectscore < 50) {
        System.out.println("fail grade in projectscore: " + projectscore);
      }
      if (externalscore < 50) {
        System.out.println("Fail grade in externalscore: " + externalscore);
      }
      if (internalscore < 50) {
        System.out.println("Fail grade in internalscore: " + internalscore);
      }
    }

  }
}