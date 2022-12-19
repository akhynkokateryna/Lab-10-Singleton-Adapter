package task2;

import java.time.LocalDate;

public interface Client {
    String notification = null;
    void setNotification(String notification);
    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();
}
