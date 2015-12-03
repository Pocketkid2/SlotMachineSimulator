package com.github.pocketkid2.slotmachine;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents an outcome of pulling the lever on the slot machine. Has 4 symbols
 *
 * @author Adam
 *
 */
public class Outcome {

	private Symbol first;

	private Symbol second;

	private Symbol third;

	private Symbol fourth;

	public Outcome(Symbol first, Symbol second, Symbol third, Symbol fourth) {
		setFirst(first);
		setSecond(second);
		setThird(third);
		setFourth(fourth);
	}

	public Outcome(Slot s) {
		setFirst(s.getRandomSymbol());
		setSecond(s.getRandomSymbol());
		setThird(s.getRandomSymbol());
		setFourth(s.getRandomSymbol());
	}

	/**
	 * @return the number of unique symbols in this outcome
	 */
	public int symbolCount() {
		Set<Symbol> used = new HashSet<Symbol>();
		used.add(first);
		used.add(second);
		used.add(third);
		used.add(fourth);
		return used.size();
	}

	/**
	 * @return the number of symbols that represents the highest amount of a
	 *         single symbol in the outcome
	 */
	public int highestSymbolCount() {
		int[] counts = new int[4];
		counts[first.getNumberForSymbol()]++;
		counts[second.getNumberForSymbol()]++;
		counts[third.getNumberForSymbol()]++;
		counts[fourth.getNumberForSymbol()]++;
		return Math.max(Math.max(counts[0], counts[2]), Math.max(counts[1], counts[3]));
	}

	/*
	 * | | | | | GENERATED STUFF BELOW | | | | | V V V V V V V V V V
	 */

	@Override
	public String toString() {
		return "Outcome (Symbol count: " + symbolCount() + ") (Highest symbol count: " + highestSymbolCount()
				+ ") [first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((first == null) ? 0 : first.hashCode());
		result = (prime * result) + ((fourth == null) ? 0 : fourth.hashCode());
		result = (prime * result) + ((second == null) ? 0 : second.hashCode());
		result = (prime * result) + ((third == null) ? 0 : third.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Outcome other = (Outcome) obj;
		if (first != other.first) {
			return false;
		}
		if (fourth != other.fourth) {
			return false;
		}
		if (second != other.second) {
			return false;
		}
		if (third != other.third) {
			return false;
		}
		return true;
	}

	public Symbol getFirst() {
		return first;
	}

	public void setFirst(Symbol first) {
		this.first = first;
	}

	public Symbol getSecond() {
		return second;
	}

	public void setSecond(Symbol second) {
		this.second = second;
	}

	public Symbol getThird() {
		return third;
	}

	public void setThird(Symbol third) {
		this.third = third;
	}

	public Symbol getFourth() {
		return fourth;
	}

	public void setFourth(Symbol fourth) {
		this.fourth = fourth;
	}

}
