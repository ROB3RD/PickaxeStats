package me.rob3rd.pickaxestats.utils;

import me.rob3rd.pickaxestats.PickaxeStats;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemFlag;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

import org.bukkit.inventory.ItemStack;

public class StatsUtils {
    public static ItemStack updatePickaxe(ItemStack item, int netherite, int diamonds, int gold, int iron, int redstone, int lapis, int coal, int stone, int cobblestone) {
        PickaxeStats plugin = PickaxeStats.getInstance();
        final ItemMeta meta = item.getItemMeta();
        final ArrayList<String> lore = new ArrayList<String>();
        lore.add(" ");
        lore.add("§e§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "stats").toUpperCase());
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "netherite").toUpperCase() + " §7» §f" + netherite);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "diamonds").toUpperCase() + " §7» §f" + diamonds);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "gold").toUpperCase() + " §7» §f" + gold);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "iron").toUpperCase() + " §7» §f" + iron);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "redstone").toUpperCase() + " §7» §f" + redstone);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "lapis").toUpperCase() + " §7» §f" + lapis);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "coal").toUpperCase() + " §7» §f" + coal);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "stone").toUpperCase() + " §7» §f" + stone);
        lore.add("§a" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "cobblestone").toUpperCase() + " §7» §f" + cobblestone);
        assert meta != null;
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        if (item.getType() == Material.NETHERITE_PICKAXE) {
            meta.setDisplayName("§f§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "netherite pickaxe").toUpperCase());
        }else if (item.getType() == Material.DIAMOND_PICKAXE) {
            meta.setDisplayName("§f§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "diamond pickaxe").toUpperCase());
        }else if (item.getType() == Material.IRON_PICKAXE) {
            meta.setDisplayName("§f§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "iron pickaxe").toUpperCase());
        }else if(item.getType() == Material.GOLDEN_PICKAXE) {
            meta.setDisplayName("§f§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "golden pickaxe").toUpperCase());
        }else if (item.getType() == Material.STONE_PICKAXE) {
            meta.setDisplayName("§f§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "stone pickaxe").toUpperCase());
        }else if (item.getType() == Material.WOODEN_PICKAXE) {
            meta.setDisplayName("§f§l" + LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "wooden pickaxe").toUpperCase());
        }
        meta.setLore(lore);
        meta.setLocalizedName("pickaxe");
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack getNewDiamondPickaxe() {
        final ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        updatePickaxe(pickaxe, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return pickaxe;
    }

    public static ItemStack getNewGoldenPickaxe() {
        final ItemStack pickaxe = new ItemStack(Material.GOLDEN_PICKAXE);
        updatePickaxe(pickaxe, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return pickaxe;
    }

    public static ItemStack getNewIronPickaxe() {
        final ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
        updatePickaxe(pickaxe, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return pickaxe;
    }

    public static ItemStack getNewNetheritePickaxe(Map<Enchantment, Integer> enc) {
        final ItemStack pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        pickaxe.addEnchantments(enc);
        updatePickaxe(pickaxe, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return pickaxe;
    }

    public static ItemStack getNewWoodenPickaxe() {
        final ItemStack pickaxe = new ItemStack(Material.WOODEN_PICKAXE);
        updatePickaxe(pickaxe, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return pickaxe;
    }

    public static ItemStack getNewStonePickaxe() {
        final ItemStack pickaxe = new ItemStack(Material.STONE_PICKAXE);
        updatePickaxe(pickaxe, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return pickaxe;
    }


    public static int getCountOnPickaxe(ItemStack item, int index) {
        ItemMeta meta = item.getItemMeta();
        if (meta.hasLore() && meta != null) {
            try {
                return Integer.parseInt(ChatColor.stripColor(Objects.requireNonNull(meta.getLore()).get(index).split("»")[1].trim()));
            }catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        return 0;
    }
}