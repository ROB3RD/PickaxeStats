package me.rob3rd.pickaxestats.utils;

import me.rob3rd.pickaxestats.PickaxeStats;

import java.util.Objects;

public class Language {
    private final static PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);

    public static Boolean en() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("english");
    }

    public static Boolean ge() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("german");
    }

    public static Boolean fr() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("french");
    }

    public static Boolean ch() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("chinese");
    }

    public static Boolean pi() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("pinyin");
    }

    public static Boolean chz() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("chzech");
    }

    public static Boolean vi() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("vietnamese");
    }

    public static Boolean sw() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("swedish");
    }

    public static Boolean sp() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("spanish");
    }

    public static Boolean po() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("polish");
    }

    public static Boolean hu() {
        return Objects.requireNonNull(plugin.getConfig().getString("language")).equalsIgnoreCase("hungarian");
    }
}
