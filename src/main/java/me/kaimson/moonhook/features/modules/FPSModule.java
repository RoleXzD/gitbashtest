package me.kaimson.MoonHook.features.modules;

import me.kaimson.MoonHook.features.modules.utils.*;
import net.minecraft.client.*;

public class FPSModule extends DefaultModuleRenderer
{
    public FPSModule() {
        super("FPS");
    }
    
    @Override
    public Object getValue() {
        return Minecraft.getDebugFPS();
    }
}
