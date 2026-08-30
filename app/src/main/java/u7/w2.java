package u7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w2 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ w2[] $VALUES;
    public static final w2 INK = new w2("INK", 0);
    public static final w2 IMAGES = new w2("IMAGES", 1);
    public static final w2 EVERYTHING = new w2("EVERYTHING", 2);

    private static final /* synthetic */ w2[] $values() {
        return new w2[]{INK, IMAGES, EVERYTHING};
    }

    static {
        w2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private w2(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static w2 valueOf(String str) {
        return (w2) Enum.valueOf(w2.class, str);
    }

    public static w2[] values() {
        return (w2[]) $VALUES.clone();
    }
}
