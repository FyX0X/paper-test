package dev.nitramnibus.papertest.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.CommandSender;

public class PingCommand{

    public static LiteralArgumentBuilder<CommandSourceStack> createCommand() {
        return Commands.literal("ping")
                .executes(PingCommand::runPingLogic);
    }

    private static int runPingLogic(CommandContext<CommandSourceStack> ctx) {
        CommandSender sender = ctx.getSource().getSender();

        Component message = Component.text("Pong!").color(NamedTextColor.YELLOW);

        sender.sendMessage(message);
        return Command.SINGLE_SUCCESS;
    }
}
