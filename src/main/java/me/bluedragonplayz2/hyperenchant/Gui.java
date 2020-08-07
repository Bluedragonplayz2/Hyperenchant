package me.bluedragonplayz2.hyperenchant;

import me.bluedragonplayz2.hyperenchant.Args.Free;
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
import java.util.Arrays;

public class Gui implements CommandExecutor{

    private Hyperenchant main;
    private Free Free;

    public Gui(Hyperenchant main) {
        this.main = main;
        this.Free = new Free(this.main);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            if(args.length > 0){
                switch (args[0].toLowerCase()) {
                    case "free":
                        this.Free.onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
                        break;


                }







            }else{
                p.sendMessage("Please use a args");
            }

        }

        return false;
    }











}
