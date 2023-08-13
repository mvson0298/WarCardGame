package WarAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
			for (String suit : suits) {
				for (int value = 2; value <= 14; value++) {
					String rank = ranks[value - 2];
					cards.add(new Card(value, rank, suit));
				}
			}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		if (cards.isEmpty()) {
			return null;
		}
		return cards.remove(0);
	}
	
}
