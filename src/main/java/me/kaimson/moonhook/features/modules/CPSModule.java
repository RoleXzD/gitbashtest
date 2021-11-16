package me.kaimson.MoonHook.features.modules;

import me.kaimson.MoonHook.features.modules.utils.*;
import me.kaimson.MoonHook.utils.*;
import me.kaimson.MoonHook.features.*;
import me.kaimson.MoonHook.*;

public class CPSModule extends DefaultModuleRenderer
{
    private final Setting cpsMode;
    
    public CPSModule() {
        super("CPS Display");
        new Setting(this, "General Options");
        this.cpsMode = new Setting(this, "Mode").setDefault(2).setRange("Left", "Right", "Both", "Higher");
    }
    
    @Override
    public Object getValue() {
        switch (this.cpsMode.getInt()) {
            case 0: {
                return Client.left.getCPS();
            }
            case 1: {
                return Client.right.getCPS();
            }
            case 2: {
                return Client.left.getCPS() + " | " + Client.right.getCPS();
            }
            case 3: {
                return Math.max(Client.left.getCPS(), Client.right.getCPS());
            }
            default: {
                return null;
            }
        }
    }
    
    @Override
    public String getFormat() {
        return "[%value% CPS]";
    }
}
