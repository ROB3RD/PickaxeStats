package me.rob3rd.pickaxestats.commands.cmds;

import me.rob3rd.pickaxestats.PickaxeStats;
import me.rob3rd.pickaxestats.commands.SubCommand;
import me.rob3rd.pickaxestats.utils.LanguageFilesUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class ReloadCommand extends SubCommand {
    @Override
    public void onCommand(CommandSender sender, String[] args) {
        if (args.length > 1) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(PickaxeStats.getInstance().prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(PickaxeStats.getInstance().getConfig().getString("language"), "reloadcommandusage")));
            }
        }else {
            PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
            plugin.reloadConfig();
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(plugin.prefix() + ChatColor.translateAlternateColorCodes('&', LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "reloadsuccess")));
            }
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return null;
    }

    @Override
    public String getLabel() {
        return "reload";
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getPermission() {
        return "ps.reload";
    }

    @Override
    public boolean isPlayerOnly() {
        return false;
    }
}
