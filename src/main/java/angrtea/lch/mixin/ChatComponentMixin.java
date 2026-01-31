package angrtea.lch.mixin;

import net.minecraft.client.gui.components.ChatComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChatComponent.class)
public class ChatComponentMixin {

    @ModifyConstant(
            method = "<init>",
            constant = @Constant(intValue = 100)
    )
    private int modifyRecentChatSize(int original) {
        return 999;
    }
}