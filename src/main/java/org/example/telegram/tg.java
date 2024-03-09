package org.example.telegram;

import org.example.selenium.page;
import org.example.selenium.page_next;
import org.example.selenium.page_prev;
import org.example.text.start;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class tg extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "Arnola";
    }

    @Override
    public String getBotToken() {
        return "";
    }


    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);

        keyboard.start();

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();

        if (message != null && message.hasText()) {
            switch (message.getText()) {
                case "/start":
                    sendMsg(message, start.start());
                    break;
                case "Эта неделя":
                    sendMsg(message, page.start());
                    break;
                case "Следующая неделя":
                    sendMsg(message, page_next.start());
                    break;
                case "Предыдущая неделя":
                    sendMsg(message, page_prev.start());
                    break;
            }
        }
    }
}