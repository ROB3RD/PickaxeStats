package me.rob3rd.pickaxestats;

import me.rob3rd.pickaxestats.commands.CommandManager;
import me.rob3rd.pickaxestats.listeners.BlockBreakListener;
import me.rob3rd.pickaxestats.listeners.CraftingListener;
import me.rob3rd.pickaxestats.listeners.CreativeListener;
import me.rob3rd.pickaxestats.listeners.PickaxeUpgradeListener;
import me.rob3rd.pickaxestats.menus.MenuUtils;
import me.rob3rd.pickaxestats.utils.LanguageFilesUtils;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class PickaxeStats extends JavaPlugin {

    private static PickaxeStats instance;

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        instance = this;
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new CraftingListener(), this);
        getServer().getPluginManager().registerEvents(new PickaxeUpgradeListener(), this);
        getServer().getPluginManager().registerEvents(new MenuUtils(), this);
        getServer().getPluginManager().registerEvents(new CreativeListener(), this);
        Objects.requireNonNull(getCommand("ps")).setExecutor(new CommandManager());
        LanguageFilesUtils.loadValues();
    }

    public static PickaxeStats getInstance() {
        return instance;
    }

    public String prefix() {
        return ChatColor.translateAlternateColorCodes('&', "&a&l(PickaxeStats) &7");
    }
}
