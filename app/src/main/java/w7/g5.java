package w7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g5 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ g5[] $VALUES;
    public static final g5 IMAGE = new g5("IMAGE", 0);
    public static final g5 TEXT = new g5("TEXT", 1);
    public static final g5 SHAPE = new g5("SHAPE", 2);

    private static final /* synthetic */ g5[] $values() {
        return new g5[]{IMAGE, TEXT, SHAPE};
    }

    static {
        g5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private g5(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static g5 valueOf(String str) {
        return (g5) Enum.valueOf(g5.class, str);
    }

    public static g5[] values() {
        return (g5[]) $VALUES.clone();
    }
}
