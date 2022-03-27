package me.rob3rd.pickaxestats.commands;

import me.rob3rd.pickaxestats.PickaxeStats;
import me.rob3rd.pickaxestats.commands.cmds.LanguageCommand;
import me.rob3rd.pickaxestats.commands.cmds.ReloadCommand;
import me.rob3rd.pickaxestats.utils.ChatUtil;
import me.rob3rd.pickaxestats.utils.LanguageFilesUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public class CommandManager implements TabExecutor {

    private final Set<SubCommand> subCommands = new HashSet<>();

    public CommandManager() {
        subCommands.add(new LanguageCommand());
        subCommands.add(new ReloadCommand())
;    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length > 0) {
            for (SubCommand subCommand : subCommands) {
                if (subCommand.getLabel().equalsIgnoreCase(args[0])) {
                    if (subCommand.isPlayerOnly() && !(sender instanceof Player)) {
                        PickaxeStats plugin = PickaxeStats.getInstance();
                        PickaxeStats.getInstance().getLogger().log(Level.SEVERE, LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "playersonly"));
                        return true;
                    }
                    if (!sender.hasPermission(subCommand.getPermission())) {
                        PickaxeStats plugin = PickaxeStats.getInstance();
                        sender.sendMessage(ChatUtil.translate(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "nopermission")));
                        return true;
                    }
                    subCommand.onCommand(sender, args);
                    return true;
                }
            }
        }
        return true;
    }
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length > 1) {
            for (SubCommand subCommand : subCommands) {
                if (subCommand.getLabel().equalsIgnoreCase(args[0]) && sender.hasPermission(subCommand.getPermission())) {
                    return subCommand.onTabComplete(sender, args);
                }
            }
        }
        List<String> subCmd = new ArrayList<>();
        if (args.length == 1) {
            for (SubCommand subCommand : subCommands) {
                if (sender.hasPermission(subCommand.getPermission())) {
                    subCmd.add(subCommand.getLabel());
                }
            }
            return subCmd;
        }
        return null;
    }

    public Set<SubCommand> getSubCommands() {
        return subCommands;
    }
}
