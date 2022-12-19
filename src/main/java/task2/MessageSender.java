package task2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class MessageSender {
    List<Client> allUsers;

    public void send(String text) {
        List<Client> filteredUsers = allUsers.stream()
                .filter(user -> user.getCountry().equals("Ukraine"))
                .filter(user -> user.getLastActiveTime().equals(LocalDate.now()))  //users last active within this day
                .toList();

        for (Client user: filteredUsers) {
            user.setNotification(text);
        }
    }
}
