package com.alterjuice.juicyfimanager.utils;

public class Flags {
    private Flags(){}
    public static boolean hasFlag(byte flags, byte value) {
        return (flags & value) == value;
    }

    public static byte setFlag(byte flags, byte value) {
        return (byte) (flags | value);
    }

    public static byte unsetFlag(byte flags, byte value) {
        return (byte) (flags & ~value);
    }

    public static byte toggleFlag(byte flags, byte value, boolean isChecked){
        if (isChecked)
            return setFlag(flags, value);
        return unsetFlag(flags, value);
    }
}
