package com.github.pocketkid2.slotmachine;

public class SlotMachineMain {

	public static void main(String[] args) {
		Slot s = new Slot(System.currentTimeMillis());
		long balance = 0;

		// Place a lot of bets
		long NUMBER_BETS = 0;
		try {
			NUMBER_BETS = Long.parseLong(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You must provide an argument for how many slot machine pulls you want to simulate");
		} catch (NumberFormatException e) {
			System.out.println("Error reading number of bets! Is it too small, large, or not a real/whole number?");
		}
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

		long loss = balance * -1;
		System.out.println();
		System.out.println("Bets: " + NUMBER_BETS + " Money lost: " + loss + " Average loss per bet: "
				+ (loss / (NUMBER_BETS != 0 ? NUMBER_BETS : 1)));
		System.out.println();

	}

}