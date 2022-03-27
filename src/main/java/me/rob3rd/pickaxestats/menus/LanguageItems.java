package me.rob3rd.pickaxestats.menus;

import me.rob3rd.pickaxestats.PickaxeStats;
import me.rob3rd.pickaxestats.utils.LANGUAGE;
import me.rob3rd.pickaxestats.utils.LanguageFilesUtils;
import me.rob3rd.pickaxestats.utils.skullcrator.SkullCreator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LanguageItems {
    public static ItemStack getEnglish() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack en = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = en.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "english"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.en()) {
            lore.add(LanguageFilesUtils.getValue("english", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("english");
        }
        meta.setLore(lore);
        en.setItemMeta(meta);
        return en;
    }
    public static ItemStack geGerman() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack ge = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f");
        ItemMeta meta = ge.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "german"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.ge()) {
            lore.add(LanguageFilesUtils.getValue("german", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("german");
        }
        meta.setLore(lore);
        ge.setItemMeta(meta);
        return ge;
    }
    public static ItemStack getFrench() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack fr = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = fr.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "french"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.fr()) {
            lore.add(LanguageFilesUtils.getValue("french", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("french");
        }
        meta.setLore(lore);
        fr.setItemMeta(meta);
        return fr;
    }
    public static ItemStack getChinese() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack ch = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = ch.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "chinese"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.ch()) {
            lore.add(LanguageFilesUtils.getValue("chinese", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("chinese");
        }
        meta.setLore(lore);
        ch.setItemMeta(meta);
        return ch;
    }
    public static ItemStack getPinyin() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack pi = new ItemStack(Material.PLAYER_HEAD, 2);
        ItemMeta meta = pi.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "pinyin"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.pi()) {
            lore.add(LanguageFilesUtils.getValue("pinyin", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("pinyin");
        }
        meta.setLore(lore);
        pi.setItemMeta(meta);
        return SkullCreator.itemWithUrl(pi, "http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
    }
    public static ItemStack getSpanish() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack sp = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = sp.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "spanish"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.sp()) {
            lore.add(LanguageFilesUtils.getValue("spanish", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("spanish");
        }
        meta.setLore(lore);
        sp.setItemMeta(meta);
        return sp;
    }
    public static ItemStack getSwedish() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack sw = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = sw.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "swedish"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.sw()) {
            lore.add(LanguageFilesUtils.getValue("swedish", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("swedish");
        }
        meta.setLore(lore);
        sw.setItemMeta(meta);
        return sw;
    }
    public static ItemStack getVietnamese() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack vi = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = vi.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "vietnamese"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.vi()) {
            lore.add(LanguageFilesUtils.getValue("vietnamese", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("vietnamese");
        }
        meta.setLore(lore);
        vi.setItemMeta(meta);
        return vi;
    }
    public static ItemStack getPolish() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack po = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = po.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "polish"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.po()) {
            lore.add(LanguageFilesUtils.getValue("polish", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("polish");
        }
        meta.setLore(lore);
        po.setItemMeta(meta);
        return po;
    }
    public static ItemStack getHungarian() {
        PickaxeStats plugin = PickaxeStats.getPlugin(PickaxeStats.class);
        ItemStack hu = SkullCreator.itemFromUrl("http://textures.minecraft.net/texture/cd91456877f54bf1ace251e4cee40dba597d2cc40362cb8f4ed711e50b0be5b3");
        ItemMeta meta = hu.getItemMeta();
        meta.setDisplayName(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "hungarian"));
        ArrayList<String> lore = new ArrayList<>();
        if (LANGUAGE.hu()) {
            lore.add(LanguageFilesUtils.getValue("hungarian", "selected"));
            meta.setLocalizedName("x");
        }else {
            lore.add(LanguageFilesUtils.getValue(plugin.getConfig().getString("language"), "CLICK to select"));
            meta.setLocalizedName("hungarian");
        }
        meta.setLore(lore);
        hu.setItemMeta(meta);
        return hu;
    }
}
