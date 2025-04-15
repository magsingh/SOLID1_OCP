package ocp;

public class NotificationService {
	public void sendNotification(Notification n, String msg) {
		n.notify(msg);
	}
}
