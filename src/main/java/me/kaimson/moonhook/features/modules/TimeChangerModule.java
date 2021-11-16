package me.kaimson.MoonHook.features.modules;

import me.kaimson.MoonHook.features.*;
import me.kaimson.MoonHook.utils.*;

public class TimeChangerModule extends Module
{
    public static TimeChangerModule INSTANCE;
    public final Setting time;
    
    public TimeChangerModule() {
        super("Time Changer");
        new Setting(this, "Time Options");
        this.time = new Setting(this, "Time").setDefault(0).setRange("Vanilla", "Day", "Sunset", "Night");
        TimeChangerModule.INSTANCE = this;
    }
}
