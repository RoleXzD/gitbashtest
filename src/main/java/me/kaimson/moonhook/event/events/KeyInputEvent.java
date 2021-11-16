package me.kaimson.MoonHook.event.events;

import me.kaimson.MoonHook.event.*;

public class KeyInputEvent extends Event
{
    public final int keycode;
    
    public KeyInputEvent(final int keycode) {
        this.keycode = keycode;
    }
}
