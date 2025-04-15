package ocp;

public class EmailNotification implements Notification {
	@Override
	public void notify(String msg) {
		System.out.println("Email notification: " + msg);
	}
}
