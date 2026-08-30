package u7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w6 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ w6[] $VALUES;
    public static final w6 HEART = new w6("HEART", 0);
    public static final w6 KISS = new w6("KISS", 1);

    private static final /* synthetic */ w6[] $values() {
        return new w6[]{HEART, KISS};
    }

    static {
        w6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private w6(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) $VALUES.clone();
    }
}
