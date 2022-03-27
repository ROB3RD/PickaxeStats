package me.rob3rd.pickaxestats.commands.cmds;

import me.rob3rd.pickaxestats.PickaxeStats;
import me.rob3rd.pickaxestats.commands.SubCommand;
import me.rob3rd.pickaxestats.menus.LanguageMenu;
import me.rob3rd.pickaxestats.utils.LanguageFilesUtils;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class LanguageCommand extends SubCommand {

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        if (sender instanceof Player) {
            if (args.length > 2){
                Player player = (Player) sender;
                PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
                player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languagecommandusage")));
            }else if (args.length == 1) {
                Player player = (Player) sender;
                PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
                player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languagecommandusage")));
            }else if (args.length == 2) {
                PickaxeStats plugin = PickaxeStats.getInstance();
                Player player = (Player) sender;
                if (args[1].equalsIgnoreCase("english")) {
                    plugin.getConfig().set("language", "english");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("german")) {
                    plugin.getConfig().set("language", "german");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("french")) {
                    plugin.getConfig().set("language", "french");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("chinese")) {
                    plugin.getConfig().set("language", "chinese");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("pinyin")) {
                    plugin.getConfig().set("language", "pinyin");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("hungarian")) {
                    plugin.getConfig().set("language", "hungarian");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("vietnamese")) {
                    plugin.getConfig().set("language", "vietnamese");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("swedish")) {
                    plugin.getConfig().set("language", "swedish");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("spanish")) {
                    plugin.getConfig().set("language", "spanish");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("polish")) {
                    plugin.getConfig().set("language", "polish");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else if (args[1].equalsIgnoreCase("czech")) {
                    plugin.getConfig().set("language", "czech");
                    plugin.saveConfig();
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languageselectsuccess")));
                    player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                }else {
                    player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "languagecommandusage")));
                }
            }
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        if (args.length == 2) {
            ArrayList<String> languages = new ArrayList<>();
            languages.add("english");
            languages.add("german");
            languages.add("french");
            languages.add("chinese");
            languages.add("pinyin");
            languages.add("hungarian");
            languages.add("vietnamese");
            languages.add("swedish");
            languages.add("spanish");
            languages.add("polish");
            languages.add("czech");
            if (args[1].equalsIgnoreCase("")) {
                return languages;
            }else {
                ArrayList<String> search = new ArrayList<>();
                for (String language : languages) {
                    if (language.startsWith(args[1])) {
                        search.add(language);
                    }
                }
                return search;
            }
        }
        return null;
    }

    @Override
    public String getLabel() {
        return "setlanguage";
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getPermission() {
        return "ps.setlanguage";
    }

    @Override
    public boolean isPlayerOnly() {
        return true;
    }
}
