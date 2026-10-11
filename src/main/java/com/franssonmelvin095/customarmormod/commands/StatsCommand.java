package com.franssonmelvin095.customarmormod.commands;

import com.franssonmelvin095.customarmormod.CustomArmorMod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public class StatsCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("stats")
            .executes(StatsCommand::showStats));
    }

    private static int showStats(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        source.sendFeedback(() -> Text.literal("Showing player statistics... (implementation pending)"), false);
        return 1;
    }
}
