package Interface;

public class Main {

	public static void main(String[] args) {
		ITelephone jihunsPhone;
		jihunsPhone = new DeskPhone(2139009000);
		jihunsPhone.poweron();
		jihunsPhone.callPhone(2139009000);
		jihunsPhone.answer();
		System.out.println("----------------");
		jihunsPhone = new MobilePhone(213900);
		jihunsPhone.poweron();
		jihunsPhone.callPhone(213900);
		jihunsPhone.answer();
	}

}
