package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	private defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

	//todo can use IntLinkedList class instead of two while loops

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
