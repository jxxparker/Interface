package Interface;

public class Main {

	public static void main(String[] args) {
		
		ITelephone jihunsPhone;
		jihunsPhone = new DeskPhone(2139059166);
		jihunsPhone.powerOn();
		jihunsPhone.callPhone(2139059166);
		jihunsPhone.answer();
		jihunsPhone.dial(4343);
		
		System.out.println("----------------");
		jihunsPhone = new MobilePhone(2139059166);
		jihunsPhone.callPhone(12134);
		jihunsPhone.answer();
	}

}
