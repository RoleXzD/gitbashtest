package me.kaimson.MoonHook.mixins.util;

import org.spongepowered.asm.mixin.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.kaimson.MoonHook.features.modules.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ MovementInputFromOptions.class })
public class MixinMovementInput extends MovementInput
{
    @Inject(method = { "updatePlayerMoveState" }, at = { @At("TAIL") })
    private void updatePlayerMoveState(final CallbackInfo ci) {
        ToggleSprintModule.getInstance().updateMovement();
    }
}
