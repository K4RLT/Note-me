package u7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b2 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 SCRAP = new b2("SCRAP", 0);
    public static final b2 PDF = new b2("PDF", 1);

    private static final /* synthetic */ b2[] $values() {
        return new b2[]{SCRAP, PDF};
    }

    static {
        b2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private b2(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }
}
