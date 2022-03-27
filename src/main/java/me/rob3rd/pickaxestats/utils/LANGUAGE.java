package me.rob3rd.pickaxestats.utils;

import me.rob3rd.pickaxestats.PickaxeStats;

public class LANGUAGE {
    public static Boolean en() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("english")) {
            return true;
        }
        return false;
    }
    public static Boolean ge() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("german")) {
            return true;
        }
        return false;
    }
    public static Boolean fr() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("french")) {
            return true;
        }
        return false;
    }
    public static Boolean ch() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("chinese")) {
            return true;
        }
        return false;
    }
    public static Boolean pi() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("pinyin")) {
            return true;
        }
        return false;
    }
    public static Boolean chz() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("chzech")) {
            return true;
        }
        return false;
    }
    public static Boolean vi() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("vietnamese")) {
            return true;
        }
        return false;
    }
    public static Boolean sw() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("swedish")) {
            return true;
        }
        return false;
    }
    public static Boolean sp() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("spanish")) {
            return true;
        }
        return false;
    }
    public static Boolean po() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("polish")) {
            return true;
        }
        return false;
    }
    public static Boolean hu() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        if (plugin.getConfig().getString("language").equalsIgnoreCase("hungarian")) {
            return true;
        }
        return false;
    }
}
