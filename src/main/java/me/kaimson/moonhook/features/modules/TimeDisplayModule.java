package me.kaimson.MoonHook.features.modules;

import me.kaimson.MoonHook.features.modules.utils.*;
import java.text.*;
import java.util.*;

public class TimeDisplayModule extends DefaultModuleRenderer
{
    public TimeDisplayModule() {
        super("Time Display", 14);
    }
    
    @Override
    public String getFormat() {
        return "[%value%]";
    }
    
    @Override
    public Object getValue() {
        return new SimpleDateFormat("hh:mm a").format(new Date());
    }
}
