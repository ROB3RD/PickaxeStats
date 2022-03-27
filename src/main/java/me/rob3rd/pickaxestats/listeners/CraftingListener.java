package me.rob3rd.pickaxestats.listeners;

import org.bukkit.event.EventHandler;
import me.rob3rd.pickaxestats.utils.StatsUtils;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

public class CraftingListener implements Listener {
    @EventHandler
    public void onPickaxeCraft(PrepareItemCraftEvent event) {
        if (event.getInventory().getResult() != null) {
            if (event.getInventory().getResult().getType() == Material.DIAMOND_PICKAXE) {
                event.getInventory().setItem(0, StatsUtils.getNewDiamondPickaxe());
            } else if (event.getInventory().getResult().getType() == Material.GOLDEN_PICKAXE) {
                event.getInventory().setItem(0, StatsUtils.getNewGoldenPickaxe());
            } else if (event.getInventory().getResult().getType() == Material.WOODEN_PICKAXE) {
                event.getInventory().setItem(0, StatsUtils.getNewWoodenPickaxe());
            } else if (event.getInventory().getResult().getType() == Material.IRON_PICKAXE) {
                event.getInventory().setItem(0, StatsUtils.getNewIronPickaxe());
            } else if (event.getInventory().getResult().getType() == Material.STONE_PICKAXE) {
                event.getInventory().setItem(0, StatsUtils.getNewStonePickaxe());
            }
        }
    }
}