package me.rob3rd.pickaxestats.utils;

import org.bukkit.ChatColor;

import java.util.List;
import java.util.stream.Collectors;

public class ChatUtil {

    public static String translate(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public List<String> translate(List<String> stringList) {
        return stringList.stream().map(ChatUtil::translate).collect(Collectors.toList());
    }
}
