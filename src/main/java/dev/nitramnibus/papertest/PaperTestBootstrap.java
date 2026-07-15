package dev.nitramnibus.papertest;

import dev.nitramnibus.papertest.commands.PingCommand;
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginProviderContext;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperTestBootstrap implements PluginBootstrap {

    @Override
    public void bootstrap(BootstrapContext context) {
        context.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, commands -> {
            // register your commands here ...
            commands.registrar().register(PingCommand.createCommand().build());
        });
    }

    @Override
    public JavaPlugin createPlugin(PluginProviderContext context) {
        return new PaperTest();
    }

}