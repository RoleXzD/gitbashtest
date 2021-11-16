package me.kaimson.MoonHook.event;

import java.lang.annotation.*;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeEvent {
}
