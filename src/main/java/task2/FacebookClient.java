package task2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class FacebookClient implements Client {
    @Getter
    private String notification = null;
    private final FacebookUser user;

    public FacebookClient(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
}
