public class BlackJack {
    public static void main(String[] args) {
        String[] round1 = getBlackJackWinners(
            new String[]{"J", "A"},
            new String[]{"8", "J", "7"},
            new String[]{"2", "4", "K", "10"},
            new String[]{"K", "8"},
            "10", "6", "A", "8", "9", "A", "3", "Q", "5", "2", "3", "8", "6", "J", "K", "2", "8", "7", "7", "K", "Q");
        String[] round2 = getBlackJackWinners(
            new String[]{"J", "2", "K"},
            new String[]{"A", "5", "A", "5", "7"},
            new String[]{"J", "A"},
            new String[]{"2", "Q"},
            "4", "10", "Q", "K", "2", "8", "9", "8", "9", "4", "K", "7", "10", "A", "4", "9", "5", "A", "Q", "Q", "3");
        String[] round3 = getBlackJackWinners(
            new String[]{"6", "A", "2", "Q", "3"},
            new String[]{"5", "8"},
            new String[]{"6", "Q", "2"},
            new String[]{"3", "10"},
            "A", "4", "10", "5", "4", "A", "Q", "2", "6", "A", "5", "7", "9", "Q", "2", "8", "9", "A", "K", "2", "8");
        
    }
    public static String[] getBlackJackWinners(String[] player1, String[] player2, String[] player3, String[] croupier, String... cards) {
    System.out.println("--Croupier--");
    int cPoints = calculatePoints(croupier);
    int index = 0;
    while (cPoints < 17) {
      String[] newHand = new String[croupier.length + 1];
      System.arraycopy(croupier, 0, newHand, 0, croupier.length);
      newHand[croupier.length] = cards[index];
      index++;
      croupier = newHand;
      cPoints = calculatePoints(croupier);
    }
    int[] pPoints = new int[3];
    System.out.println("--Player 1--");
    pPoints[0] = calculatePoints(player1);
    System.out.println("--Player 2--");
    pPoints[1] = calculatePoints(player2);
    System.out.println("--Player 3--");
    pPoints[2] = calculatePoints(player3);
    return new String[]{};
  }
  
  public static int calculatePoints(String[] hand) {
    int points = 0;
    for (String card : hand) {
      System.out.println("c: " + card);
      if (card.equals("10") || card.toUpperCase().equals("K") || card.toUpperCase().equals("Q") || card.toUpperCase().equals("J")) {
        points += 10;
      } else if (card.toUpperCase() == "A") {
        points += 1;
      } else {
        points += Character.getNumericValue(card.charAt(0));
      }
    }
    for (String card : hand) {
      if (card.toUpperCase() == "A" && (points + 10) <= 21) {
        points += 10;
      }
    }
    System.out.println("p: " + points);
    return points;
  }
}
