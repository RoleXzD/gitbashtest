package me.kaimson.MoonHook.mixins.client.renderer;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ EntityRenderer.class })
public interface IMixinEntityRenderer
{
    @Invoker("loadShader")
    void callLoadShader(final ResourceLocation p0);
}
