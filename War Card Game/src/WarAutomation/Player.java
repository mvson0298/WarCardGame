package WarAutomation;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private List<Card> hand;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void incrementScore() {
		score++;
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
			
		}
	}

	public Card flip() {
		if (hand.isEmpty()) {
			return null;
		}
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		} else {
		System.out.println("Deck is empty.");
		}
	}
}
