package Interface;

public class DeskPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	
	@Override
	public void powerOn() {
		System.out.println("no action taken, desk phone doesn ot have a power button");
		
	}
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;

	}
	
	@Override
	public void dial(int phoneNumber) {
		System.out.println("now ringing " + phoneNumber + " on deskphone");
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("answering the desk phone");
			isRinging = false;
		} 
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("ring ring");
		} else {
			isRinging = false;
		}
		return false;
	}
	
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	
}
