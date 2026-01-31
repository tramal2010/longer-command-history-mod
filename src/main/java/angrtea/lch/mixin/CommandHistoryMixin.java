package angrtea.lch.mixin;

import net.minecraft.client.CommandHistory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CommandHistory.class)
public class CommandHistoryMixin {

    @ModifyArg(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/util/ArrayListDeque;<init>(I)V"
            ),
            index = 0
    )
    private int modifyCommandHistoryInitSize(int original) {
        return 999;
    }

    @ModifyConstant(
            method = "addCommand",
            constant = @Constant(intValue = 50)
    )
    private int modifyCommandHistoryMaxSize(int original) {
        return 999;
    }
}