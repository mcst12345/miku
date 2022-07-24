package miku.Mixin;


import miku.Utils.InventoryUtil;
import net.minecraft.command.CommandClearInventory;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.command.CommandBase.getCommandSenderAsPlayer;
import static net.minecraft.command.CommandBase.getPlayer;

@Mixin(value = CommandClearInventory.class)
public class MixinCommandClearInventory {
    @Inject(at = @At("HEAD"), method = "execute", cancellable = true)
    public void execute(MinecraftServer server, ICommandSender sender, String[] args, CallbackInfo ci) throws CommandException {
        if (InventoryUtil.isMiku(getCommandSenderAsPlayer(sender)) || InventoryUtil.isMiku(getPlayer(server, sender, args[0])))
            ci.cancel();
    }
}
