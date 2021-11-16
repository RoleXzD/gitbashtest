package me.kaimson.MoonHook.event.events;

import me.kaimson.MoonHook.event.*;
import net.minecraft.client.gui.*;

public class GuiScreenEvent extends Event
{
    public final GuiScreen screen;
    
    public GuiScreenEvent(final GuiScreen screen) {
        this.screen = screen;
    }
    
    public static class Open extends GuiScreenEvent
    {
        public Open(final GuiScreen screen) {
            super(screen);
        }
    }
}
