package z7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m MAIN = new m("MAIN", 0);
    public static final m QUICK_START = new m("QUICK_START", 1);

    private static final /* synthetic */ m[] $values() {
        return new m[]{MAIN, QUICK_START};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private m(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
