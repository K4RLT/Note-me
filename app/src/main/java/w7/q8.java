package w7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q8 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ q8[] $VALUES;
    public static final q8 PHOTO = new q8("PHOTO", 0);
    public static final q8 STICKER = new q8("STICKER", 1);
    public static final q8 TAPE = new q8("TAPE", 2);
    public static final q8 FRAME = new q8("FRAME", 3);
    public static final q8 SHAPE = new q8("SHAPE", 4);
    public static final q8 FILL = new q8("FILL", 5);

    private static final /* synthetic */ q8[] $values() {
        return new q8[]{PHOTO, STICKER, TAPE, FRAME, SHAPE, FILL};
    }

    static {
        q8[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private q8(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static q8 valueOf(String str) {
        return (q8) Enum.valueOf(q8.class, str);
    }

    public static q8[] values() {
        return (q8[]) $VALUES.clone();
    }
}
