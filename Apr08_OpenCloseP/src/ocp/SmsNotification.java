package ocp;

public class SmsNotification implements Notification {

	@Override
	public void notify(String msg) {
		System.out.println("SMS notification: " + msg);
	}

}
