package me.rob3rd.pickaxestats.menus;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuUtils implements Listener {
    public static void setLine(Inventory inv, int start, int end, Material m) {
        for (int i = start; i <= end; i++) {
            if (inv.getItem(i) == null) {
                ItemStack line = new ItemStack(m);
                ItemMeta meta = line.getItemMeta();
                if (meta != null) {
                    meta.setLocalizedName("x");
                }
                if (meta != null) {
                    meta.setDisplayName(" ");
                }
                line.setItemMeta(meta);
                inv.setItem(i, line);
            }
        }
    }

    @EventHandler
    public void onXClick(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().getItemMeta() != null) {
                if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                    if (event.getCurrentItem().getItemMeta().getLocalizedName().equalsIgnoreCase("x")) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
