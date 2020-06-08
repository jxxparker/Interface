package Interface;

public class MobilePhone implements ITelephone{
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;

	}
	
	@Override
	public void poweron() {
		System.out.println("mobile phone powered up");
	}
	
	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
		System.out.println("now ringing " + phoneNumber + " on deskphone");
		} else {
			System.out.println("Phone is switched off");
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
			System.out.println("mobile ring");
		} else {
			isRinging = false;
			System.out.println("mobile phone not on or # different");
		}
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		return isRinging;

	}
	
}
