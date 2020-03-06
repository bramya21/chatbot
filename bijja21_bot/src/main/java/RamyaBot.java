import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class RamyaBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        String command = update.getMessage().getText();
        SendMessage message = new SendMessage();
        if(command.equals("/myfirstname")) {
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText(update.getMessage().getFrom().getFirstName());
        }
        else if(command.equals("/mylastname")) {
            System.out.println(update.getMessage().getFrom().getLastName());
            message.setText(update.getMessage().getFrom().getLastName());
        }
        else if(command.equals("/myfullname")) {
            System.out.println(update.getMessage().getFrom().getFirstName()+update.getMessage().getFrom().getLastName());
            message.setText(update.getMessage().getFrom().getFirstName()+update.getMessage().getFrom().getLastName());
        }
        else if(command.equals(("/myname"))) {
            System.out.println("It's "+update.getMessage().getFrom().getFirstName());
            message.setText("It's "+update.getMessage().getFrom().getFirstName());
        }
        message.setChatId(update.getMessage().getChatId());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
//        System.out.println(update.getMessage().getText());
//        System.out.println(update.getMessage().getFrom().getFirstName());
    }

    public String getBotUsername() {
        return "bijja21_bot";
    }

    public String getBotToken() {
        return "1077468011:AAFKHq5RlWnQhJZeLLB-QjvVzYiwaGtxE30";
    }
}
