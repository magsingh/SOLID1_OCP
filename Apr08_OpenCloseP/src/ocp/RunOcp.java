package ocp;

public class RunOcp {

	public static void main(String[] args) {
		NotificationService notiService = new NotificationService();
		notiService.sendNotification(new EmailNotification(), "Msg1");
		notiService.sendNotification(new SmsNotification(), "Msg2");
		//Now if want to add new kind of notification like WhatsApp, then just need to add WhatsappNotification class and class from main
		//this does not disturbs the existing classes thus the design follows OCP 
	}

}
