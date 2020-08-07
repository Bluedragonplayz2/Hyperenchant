package me.bluedragonplayz2.hyperenchant.Files;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Customconfigs {
    private static File file;
    private static FileConfiguration customfile;
    //Find ot generate a custom data file
    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("Hyperenchant").getDataFolder(), "HyperData.yml");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException e){
                //oh no
            }
        }
        customfile = YamlConfiguration.loadConfiguration(file);
    }
    public static FileConfiguration get(){
        return customfile;
    }
    public static void save(){
        try{
            customfile.save(file);
        }catch(IOException e){
            System.out.println("Oh no! We cant save your file");
            //why!!!
        }
    }
    public static void reload(){
        customfile = YamlConfiguration.loadConfiguration(file);
        //https://www.youtube.com/watch?v=3en6w7PNL08
    }
}
