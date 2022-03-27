package me.rob3rd.pickaxestats.listeners;

import me.rob3rd.pickaxestats.utils.StatsUtils;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener implements Listener
{
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        ItemStack item = event.getPlayer().getInventory().getItemInMainHand();
        if (item.getType() == Material.DIAMOND_PICKAXE || item.getType() == Material.IRON_PICKAXE || item.getType() == Material.GOLDEN_PICKAXE || item.getType() == Material.WOODEN_PICKAXE || item.getType() == Material.NETHERITE_PICKAXE || item.getType() == Material.STONE_PICKAXE) {
            int cnetherit = StatsUtils.getCountOnPickaxe(item, 2);
            int cdiamond = StatsUtils.getCountOnPickaxe(item, 3);
            int cgold = StatsUtils.getCountOnPickaxe(item, 4);
            int ciron = StatsUtils.getCountOnPickaxe(item, 5);
            int credstone = StatsUtils.getCountOnPickaxe(item, 6);
            int clapis = StatsUtils.getCountOnPickaxe(item, 7);
            int ccoal = StatsUtils.getCountOnPickaxe(item, 8);
            int cstone = StatsUtils.getCountOnPickaxe(item, 9);
            int ccobblestone = StatsUtils.getCountOnPickaxe(item, 10);
            switch (event.getBlock().getType()) {
                case DIAMOND_ORE -> {
                    final int diamond = cdiamond + 1;
                    final ItemStack newDItem = StatsUtils.updatePickaxe(item, cnetherit, diamond, cgold, ciron, credstone, clapis, ccoal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newDItem);
                }
                case ANCIENT_DEBRIS -> {
                    final int netherite = cnetherit + 1;
                    final ItemStack newNItem = StatsUtils.updatePickaxe(item, netherite, cdiamond, cgold, ciron, credstone, clapis, ccoal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newNItem);
                }
                case GOLD_ORE -> {
                    final int gold = cgold + 1;
                    final ItemStack newGItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, gold, ciron, credstone, clapis, ccoal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newGItem);
                }
                case IRON_ORE -> {
                    final int iron = ciron + 1;
                    final ItemStack newIItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, iron, credstone, clapis, ccoal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newIItem);
                }
                case REDSTONE_ORE -> {
                    final int redstone = credstone + 1;
                    final ItemStack newRItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, redstone, clapis, ccoal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newRItem);
                }
                case LAPIS_ORE -> {
                    final int lapis = clapis + 1;
                    final ItemStack newLItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, lapis, ccoal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newLItem);
                }
                case COAL_ORE -> {
                    int coal = ccoal + 1;
                    ItemStack newCItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, coal, cstone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newCItem);
                }
                case COBBLESTONE -> {
                    int cobblestone = ccobblestone + 1;
                    ItemStack newCoItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, ccoal, cstone, cobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newCoItem);
                }
                case STONE -> {
                    int stone = cstone + 1;
                    ItemStack newSItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, ccoal, stone, ccobblestone);
                    event.getPlayer().getInventory().setItemInMainHand(newSItem);
                }
            }
            //if (event.getPlayer().getInventory().getItemInMainHand().getEnchantments().get(Enchantment.SILK_TOUCH) != null && event.getBlock().getType() == Material.STONE) {
                //int stone = cstone + 1;
                //ItemStack newSItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, ccoal, stone, ccobblestone);
                //event.getPlayer().getInventory().setItemInMainHand(newSItem);
            //}else if (event.getPlayer().getInventory().getItemInMainHand().getEnchantments().get(Enchantment.SILK_TOUCH) == null && event.getBlock().getType() == Material.STONE) {
                //int cobblestone = ccobblestone + 1;
                //ItemStack newCoItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, ccoal, cstone, cobblestone);
                //event.getPlayer().getInventory().setItemInMainHand(newCoItem);
            //}else if (event.getPlayer().getInventory().getItemInMainHand().getEnchantments().get(Enchantment.SILK_TOUCH) == null && event.getBlock().getType() == Material.COBBLESTONE) {
                //int cobblestone = ccobblestone + 1;
                //ItemStack newCoItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, ccoal, cstone, cobblestone);
                //event.getPlayer().getInventory().setItemInMainHand(newCoItem);
            //}else if (event.getPlayer().getInventory().getItemInMainHand().getEnchantments().get(Enchantment.SILK_TOUCH) != null && event.getBlock().getType() == Material.COBBLESTONE) {
                //int cobblestone = ccobblestone + 1;
                //ItemStack newCoItem = StatsUtils.updatePickaxe(item, cnetherit, cdiamond, cgold, ciron, credstone, clapis, ccoal, cstone, cobblestone);
                //event.getPlayer().getInventory().setItemInMainHand(newCoItem);
            //}
        }
    }
}