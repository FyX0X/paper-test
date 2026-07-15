package dev.nitramnibus.papertest;

import dev.nitramnibus.papertest.commands.PingCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PaperTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("ping").setExecutor(new PingCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
