package me.rob3rd.pickaxestats.listeners;

import org.bukkit.event.EventHandler;
import me.rob3rd.pickaxestats.utils.StatsUtils;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.event.Listener;

public class PickaxeUpgradeListener implements Listener {
    @EventHandler
    public void onPickaxeUpgrade(PrepareSmithingEvent event) {
        if (event.getInventory().getType().equals(InventoryType.SMITHING)) {
            if (event.getResult() == null) return;
            if (event.getResult().getType() == Material.NETHERITE_PICKAXE) {
                event.setResult(StatsUtils.getNewNetheritePickaxe(event.getResult().getEnchantments()));
            }
        }
    }
}