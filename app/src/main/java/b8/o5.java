package b8;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o5 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ o5[] $VALUES;
    public static final o5 NOTEBOOKS = new o5("NOTEBOOKS", 0);
    public static final o5 TAPES = new o5("TAPES", 1);
    public static final o5 STICKERS = new o5("STICKERS", 2);
    public static final o5 FRAMES = new o5("FRAMES", 3);
    public static final o5 ACCESSORIES = new o5("ACCESSORIES", 4);

    private static final /* synthetic */ o5[] $values() {
        return new o5[]{NOTEBOOKS, TAPES, STICKERS, FRAMES, ACCESSORIES};
    }

    static {
        o5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private o5(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static o5 valueOf(String str) {
        return (o5) Enum.valueOf(o5.class, str);
    }

    public static o5[] values() {
        return (o5[]) $VALUES.clone();
    }
}
