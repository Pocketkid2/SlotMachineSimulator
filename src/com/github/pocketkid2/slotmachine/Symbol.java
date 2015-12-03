package com.github.pocketkid2.slotmachine;

/**
 * Represents the four values a particular slot can be at a given time
 *
 * @author Adam
 *
 */
public enum Symbol {

	LIGHTNING, HEART, DIAMOND, TARGET;

	public static int getNumberForSymbol(Symbol s) {
		switch (s) {
		case DIAMOND:
			return 0;
		case HEART:
			return 1;
		case LIGHTNING:
			return 2;
		case TARGET:
			return 3;
		default:
			return -1;
		}
	}

	public int getNumberForSymbol() {
		return Symbol.getNumberForSymbol(this);
	}

	public static Symbol getSymbolForNumber(int i) {
		switch (i) {
		case 0:
			return DIAMOND;
		case 1:
			return HEART;
		case 2:
			return LIGHTNING;
		case 3:
			return TARGET;
		default:
			return null;
		}
	}
}
