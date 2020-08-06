package me.bluedragonplayz2.hyperenchant.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class eventitemclick implements Listener {
    @EventHandler
    public void clickEvent(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.MAGIC + "Event Item")){
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.MAGIC + "test sword one")){
                p.sendMessage("lol troll no sword for you");
                e.setCancelled(true);

            }

        }


    }
}
