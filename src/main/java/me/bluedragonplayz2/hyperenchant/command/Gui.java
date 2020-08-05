package me.bluedragonplayz2.hyperenchant.command;

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

public class Gui implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            if(args.length > 0){

                Inventory event = Bukkit.createInventory(p, 27, ChatColor.MAGIC + "Event Item");

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



            }else{
                p.sendMessage("Please use a args");
            }


        }
        return false;
    }
}
