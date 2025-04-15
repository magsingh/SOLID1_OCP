package nonocp;

public class NotificationService {
	public void sendNotification(String type, String msg) {
		if (type.equals("Email")) {
			System.out.println("Email notification: " + msg);
		} else if (type.equals("SMS")) {
			System.out.println("SMS notification: " + msg);
		} else {
			System.out.println("Invalid notification type");
		}
	}
	//If new notification type (like WhatsApp) needs to be added then this class needs to be changed
	//Rather if we were following OCP then only needed to add new class test functionality of just that class
}
