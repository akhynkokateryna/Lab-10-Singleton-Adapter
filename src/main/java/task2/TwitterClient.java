package task2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class TwitterClient implements Client {
    @Setter @Getter
    private String notification = null;
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
}