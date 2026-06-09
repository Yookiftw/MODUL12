public interface EmailNotifier {
    void sendEmail(String message);
}

public interface SMSNotifier {
    void sendSMS(String message);
}

public interface WhatsAppNotifier {
    void sendWhatsApp(String message);
}

public class EmailSystem implements EmailNotifier {
    @Override
    public void sendEmail(String message) {
        System.out.println("Mengirimkan email notifikasi resi: " + message);
    }
}