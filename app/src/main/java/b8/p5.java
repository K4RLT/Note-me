package b8;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p5 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ p5[] $VALUES;
    public static final p5 KRAFT = new p5("KRAFT", 0);
    public static final p5 AD = new p5("AD", 1);
    public static final p5 GIFT = new p5("GIFT", 2);

    private static final /* synthetic */ p5[] $values() {
        return new p5[]{KRAFT, AD, GIFT};
    }

    static {
        p5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private p5(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static p5 valueOf(String str) {
        return (p5) Enum.valueOf(p5.class, str);
    }

    public static p5[] values() {
        return (p5[]) $VALUES.clone();
    }
}
