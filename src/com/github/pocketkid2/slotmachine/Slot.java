package com.github.pocketkid2.slotmachine;

import java.util.Random;

/**
 * Represents a slot in the slot machine. Used to randomly get one symbol or get
 * multiple values.
 * 
 * @author Adam
 *
 */
public class Slot {

	public Slot(long seed) {
		random = new Random(seed);
	}

	private Random random;

	public Symbol getRandomSymbol() {
		return Symbol.getSymbolForNumber(random.nextInt(4));
	}

	public Outcome getRandomOutcome() {
		return new Outcome(getRandomSymbol(), getRandomSymbol(), getRandomSymbol(), getRandomSymbol());
	}

}
