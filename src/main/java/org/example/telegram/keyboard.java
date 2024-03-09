package org.example.telegram;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class keyboard {
    public static String start() {
        SendMessage sendMessage = new SendMessage();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();

        row.add("Предыдущая неделя");
        keyboardRows.add(row);

        row = new KeyboardRow();
        row.add("Эта неделя");
        keyboardRows.add(row);

        row = new KeyboardRow();
        row.add("Следующая неделя");
        keyboardRows.add(row);

        keyboardMarkup.setKeyboard(keyboardRows);
        sendMessage.setReplyMarkup(keyboardMarkup);
        return null;
    }
}

