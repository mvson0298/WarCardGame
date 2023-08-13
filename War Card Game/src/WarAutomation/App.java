package WarAutomation;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		int numCardsToDraw = 26;
		
	for (int i = 0; i < numCardsToDraw; i++) {
		player1.draw(deck);
		player2.draw(deck);
		
	}

	for (int i = 0; i < 26; i++) {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
		if (card1 != null && card2 != null) {
			
			System.out.println("Player 1 flipped: " + card1);
			System.out.println("Player 2 flipped: " + card2);
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				
				System.out.println("Player 1 wins this round!");
			} else if
				(card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				
				System.out.println("Player 2 wins this round!");
				} else { 
					System.out.println("It's a tie!");
				}
				System.out.println("Player 1 Score: " + player1.getScore());
				System.out.println("Player 2 Score: " + player2.getScore());
				System.out.println();
			
			}
		}
	int player1Score = player1.getScore();
	int player2Score = player2.getScore();
	
	System.out.println("Final Scores:");
	System.out.println("Player 1 Score: " + player1Score);
	System.out.println("Player 2 Score: " + player2Score);
	
	if (player1Score > player2Score) {
		System.out.println("Player 1 wins!");
	}else if (player2Score > player1Score) {
		System.out.println("Player 2 wins!");
	}else{
		System.out.println("It's a draw!");
		}
	}
}

