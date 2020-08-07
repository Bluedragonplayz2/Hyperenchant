package me.bluedragonplayz2.hyperenchant.Args;

import me.bluedragonplayz2.hyperenchant.Hyperenchant;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Free implements CommandExecutor {
    private Hyperenchant main;
    public Free(Hyperenchant main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        Inventory event = Bukkit.createInventory(p, 27, ChatColor.DARK_GREEN + "Free Sword");
        ItemStack test_sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta test_sword_meta = test_sword.getItemMeta();
        test_sword_meta.setDisplayName(ChatColor.MAGIC + "test sword one");
        test_sword_meta.addEnchant(Enchantment.DURABILITY, 1, true );
        ArrayList<String> test_sword_lore = new ArrayList<>();
        test_sword_lore.add(ChatColor.DARK_PURPLE + "testing sword");
        test_sword_meta.setLore(test_sword_lore);
        test_sword.setItemMeta(test_sword_meta);
        ItemStack[] menu_items = {test_sword};
        event.setContents(menu_items);
        p.openInventory(event);
        return true;
    }
}

