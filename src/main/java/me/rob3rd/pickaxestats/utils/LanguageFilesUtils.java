package me.rob3rd.pickaxestats.utils;

import me.rob3rd.pickaxestats.PickaxeStats;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LanguageFilesUtils {
    private static final Map<File, Map<String, String>> languages = new HashMap<>();

    public static String getValue(String language, String valueName) {
        File langFile = new File(PickaxeStats.getInstance().getDataFolder() + "/languages", language + ".yml");
        return languages.get(langFile).get(valueName);
    }

    public static void loadValues() {
        File langFolder = new File(PickaxeStats.getInstance().getDataFolder() + "/languages");
        if (!langFolder.exists()) {
            langFolder.mkdir();
        }
        File enFile = new File(langFolder, "english.yml");
        File deFile = new File(langFolder, "german.yml");
        File frFile = new File(langFolder, "french.yml");
        File viFile = new File(langFolder, "vietnamese.yml");
        File huFile = new File(langFolder, "hungarian.yml");
        File poFile = new File(langFolder, "polish.yml");
        File swFile = new File(langFolder, "swedish.yml");
        File spFile = new File(langFolder, "spanish.yml");
        File chFile = new File(langFolder, "chinese.yml");
        File piFile = new File(langFolder, "pinyin.yml");
        File czFile = new File(langFolder, "czech.yml");

        try {
            if (!enFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("english.yml");
                if (in != null) {
                    Files.copy(in, enFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!deFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("german.yml");
                if (in != null) {
                    Files.copy(in, deFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!frFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("french.yml");
                if (in != null) {
                    Files.copy(in, frFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!viFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("vietnamese.yml");
                if (in != null) {
                    Files.copy(in, viFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!huFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("hungarian.yml");
                if (in != null) {
                    Files.copy(in, huFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!poFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("polish.yml");
                if (in != null) {
                    Files.copy(in, poFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!swFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("swedish.yml");
                if (in != null) {
                    Files.copy(in, swFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!spFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("spanish.yml");
                if (in != null) {
                    Files.copy(in, spFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!chFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("chinese.yml");
                if (in != null) {
                    Files.copy(in, chFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!piFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("pinyin.yml");
                if (in != null) {
                    Files.copy(in, piFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!czFile.exists()) {
                InputStream in = PickaxeStats.getInstance().getResource("czech.yml");
                if (in != null) {
                    Files.copy(in, czFile.toPath());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        for (File file : Objects.requireNonNull(langFolder.listFiles())) {
            Map<String, String> values = new HashMap<>();
            FileConfiguration lang = YamlConfiguration.loadConfiguration(file);
            for (String key : lang.getKeys(false)) {
                for (String valueName : Objects.requireNonNull(lang.getConfigurationSection(key)).getKeys(false)) {
                    String value = ChatColor.stripColor(lang.getString(key + "." + valueName));
                    values.put(valueName, value);
                }
            }
            languages.put(file, values);
            System.out.println("[PickaxeStats] " + file.getName() + " loaded!");
        }
    }
}
