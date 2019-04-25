package io.github.makotomiyamoto.CustomYaml;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        this.saveResource("ReferencedFile.yml", true);
        // creates the path neccesary to reference the file. the same or
        // similar thing happens when the config.yml file is scanned and
        // saved to the plugin path.

        File file = new File(this.getDataFolder(), "ReferencedFile.yml");
        // gets ReferencedFile.yml as a File type.

        FileConfiguration fileConfiguration = YamlConfiguration.loadConfiguration(file);
        // allows ReferencedFile.yml to be referenced with Bukkit yml functions, see below.

        String referencedString = fileConfiguration.getString("referenced-string");
        // gets referenced-string from ReferencedFile.yml

        System.out.println(referencedString);
        // prints "If you got this message, good job!" to console.

    }

}
