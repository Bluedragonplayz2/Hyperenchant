package me.bluedragonplayz2.hyperenchant;

import me.bluedragonplayz2.hyperenchant.Files.Customconfigs;
import me.bluedragonplayz2.hyperenchant.clickevent.eventitemclick;
import org.bukkit.plugin.java.JavaPlugin;

public final class Hyperenchant extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hyperenchant is starting! Welcome!");

        this.getCommand("hyperenchant").setExecutor(new Argsplitter(this));
        this.getServer().getPluginManager().registerEvents(new eventitemclick(),this);
        //setup configuation file
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        Customconfigs.setup();

        Customconfigs.get().options().copyDefaults(true);
        Customconfigs.save();

    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
            System.out.println("Hyperenchant is shutting down!");


    }
}


