package Interface;

public class MobilePhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone showered up");
		
	}
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;

	}
	
	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("now ringing " + phoneNumber + " on mobile Phone");
		} else {
			System.out.println("phone is switched off mobile");
		}
		
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("answering the mobile phone");
			isRinging = false;
		} 
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Mobile Melody ring");
		} else {
			isRinging = false;
			System.out.println("mobile phone not on or different");
		}
		return false;
	}
	
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	
}
