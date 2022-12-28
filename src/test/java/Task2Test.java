import org.junit.jupiter.api.Test;
import task2.*;

import java.time.LocalDate;
import java.util.List;

public class Task2Test {
    @Test
    public void test(){
        FacebookUser facebookUser = new FacebookUser("k@gmail.com", Country.Ukraine, LocalDate.now());
        FacebookClient facebookClient = new FacebookClient(facebookUser);
        TwitterUser twitterUser = new TwitterUser("a@gmail.com", "USA", "22/05/2022");
        TwitterClient twitterClient = new TwitterClient(twitterUser);
        List<Client> clients = List.of(facebookClient, twitterClient);
        MessageSender messageSender = new MessageSender(clients);
        messageSender.send("Hello! Have a nice day!");
    }
}
