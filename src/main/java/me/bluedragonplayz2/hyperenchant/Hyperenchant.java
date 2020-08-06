package me.bluedragonplayz2.hyperenchant;

import me.bluedragonplayz2.hyperenchant.command.Gui;
import me.bluedragonplayz2.hyperenchant.event.eventitemclick;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public final class Hyperenchant extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hyperenchant is starting! Welcome!");

        this.getCommand("Hyperenchant").setExecutor(new Gui());

        getServer().getPluginManager().registerEvents(new eventitemclick(),this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
            System.out.println("Hyperenchant is shutting down!");


    }

    public void logToFile(String message)

    {

        try
        {
            File dataFolder = getDataFolder();
            if(!dataFolder.exists()){
                dataFolder.mkdir();
            }

            File saveTo = new File(getDataFolder(), "data.txt");
            if (!saveTo.exists()){
                saveTo.createNewFile();
            }

            FileWriter fw = new FileWriter(saveTo, true);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(message);

            pw.flush();

            pw.close();

        }
        catch (IOException e){

            e.printStackTrace();

        }

    }

}


