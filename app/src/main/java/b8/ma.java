package b8;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ma {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ ma[] $VALUES;
    public static final ma NOTEBOOKS = new ma("NOTEBOOKS", 0);
    public static final ma TAPES = new ma("TAPES", 1);
    public static final ma STICKERS = new ma("STICKERS", 2);
    public static final ma FRAMES = new ma("FRAMES", 3);
    public static final ma ACCESSORIES = new ma("ACCESSORIES", 4);

    private static final /* synthetic */ ma[] $values() {
        return new ma[]{NOTEBOOKS, TAPES, STICKERS, FRAMES, ACCESSORIES};
    }

    static {
        ma[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private ma(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static ma valueOf(String str) {
        return (ma) Enum.valueOf(ma.class, str);
    }

    public static ma[] values() {
        return (ma[]) $VALUES.clone();
    }
}
