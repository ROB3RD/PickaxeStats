package me.rob3rd.pickaxestats.listeners;

import me.rob3rd.pickaxestats.utils.StatsUtils;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.inventory.ItemStack;

public class CreativeListener implements Listener {
    @EventHandler
    public void onCreativePickaxeGet(InventoryCreativeEvent event) {
        ItemStack item = event.getCursor();
        Material m = item.getType();
        if (m == Material.NETHERITE_PICKAXE || m == Material.DIAMOND_PICKAXE || m == Material.IRON_PICKAXE || m == Material.GOLDEN_PICKAXE || m == Material.STONE_PICKAXE || m == Material.WOODEN_PICKAXE) {
            if (!item.hasItemMeta()) {
                ItemStack newItem = StatsUtils.updatePickaxe(item, 0, 0, 0, 0, 0 ,0, 0, 0, 0);
                event.setCursor(newItem);
            }
        }
    }
}
