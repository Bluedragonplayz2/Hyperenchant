
package me.bluedragonplayz2.hyperenchant.clickevent;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class eventitemclick implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        if (e.getCurrentItem() == null) return;
        if (e.getCurrentItem().getItemMeta() == null) return;
        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "Free Sword")){
            p.sendMessage("1");


            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.MAGIC + "test sword one")){
                p.sendMessage("no free sword for you lol");
                p.sendMessage("2");

                e.setCancelled(true);
            }
        }
    }


}
