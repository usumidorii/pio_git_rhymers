package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private static final int FULL = 11;

	private static final int SIZE = 12;

	private static final int COUNTER = -1;

	private final int[] NUMBERS = new int[SIZE];

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	private int total = COUNTER;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == COUNTER;
		}
		
			public boolean isFull() {
				return total == FULL;
			}
		
				int peekaboo() {
					if (callCheck())
						return COUNTER;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return COUNTER;
						return NUMBERS[total--];
					}

}
