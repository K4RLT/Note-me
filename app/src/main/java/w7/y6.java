package w7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y6 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ y6[] $VALUES;
    public static final y6 IDLE = new y6("IDLE", 0);
    public static final y6 DRAWING = new y6("DRAWING", 1);
    public static final y6 SELECTED = new y6("SELECTED", 2);
    public static final y6 MOVING = new y6("MOVING", 3);

    private static final /* synthetic */ y6[] $values() {
        return new y6[]{IDLE, DRAWING, SELECTED, MOVING};
    }

    static {
        y6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private y6(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static y6 valueOf(String str) {
        return (y6) Enum.valueOf(y6.class, str);
    }

    public static y6[] values() {
        return (y6[]) $VALUES.clone();
    }
}
