package CleanCodeRefactory.BaiTap;

public class TennisGame {

    public static String getScore(String namePlayer1, String namePlayer2, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) score = namePlayer1 + "Advantage";
            else if (minusResult == -1) score = namePlayer2 + " Advantage";
            else if (minusResult >= 2) score = namePlayer1 + " Win";
            else score = namePlayer2 + " Win";
        } else {
            for (int i = 1; i <= 2; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(TennisGame.getScore("Nguyen", "Binh", 0, 3));
    }
}
