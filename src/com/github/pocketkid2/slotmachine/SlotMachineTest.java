package com.github.pocketkid2.slotmachine;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SlotMachineTest {

	@Test
	public void test() {

		// Create a set of outcomes
		Set<Outcome> outcomes = new HashSet<Outcome>();

		// Loop through all slots and symbols
		for (Symbol s1 : Symbol.values()) {
			for (Symbol s2 : Symbol.values()) {
				for (Symbol s3 : Symbol.values()) {
					for (Symbol s4 : Symbol.values()) {
						// Create an outcome for this round
						Outcome o = new Outcome(s1, s2, s3, s4);

						// OPTIONAL: skip unwanted outcomes
						if (true /*
									 * (o.symbolCount() == 2) &&
									 * (o.highestSymbolCount() == 3)
									 */) {
							// Print, and add to total
							System.out.println(o);
							outcomes.add(o);
						}
					}
				}
			}
		}

		// Print total outcome count
		System.out.println(outcomes.size());

	}

}
