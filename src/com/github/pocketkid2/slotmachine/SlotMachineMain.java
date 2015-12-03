package com.github.pocketkid2.slotmachine;

public class SlotMachineMain {

	public static void main(String[] args) {
		Slot s = new Slot(System.currentTimeMillis());
		int balance = 0;

		// Place a lot of bets
		final long NUMBER_BETS = Long.parseLong(args[0]);
		for (long i = 0; i < NUMBER_BETS; i++) {
			// Pay $20
			balance -= 20;

			// Pull the lever
			Outcome o = s.getRandomOutcome();

			// Check for prizes
			if (o.symbolCount() == 1) {
				balance += 200;
			} else if ((o.symbolCount() == 2) && (o.highestSymbolCount() == 3)) {
				balance += 60;
			}
		}

		System.out.println(
				"I started with 0 dollars and after " + NUMBER_BETS + " bets ended with " + balance + " dollars");

	}

}