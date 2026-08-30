package p7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PEN = new a("PEN", 0);
    public static final a PRESSURE_PEN = new a("PRESSURE_PEN", 1);
    public static final a HIGHLIGHTER = new a("HIGHLIGHTER", 2);
    public static final a MARKER = new a("MARKER", 3);
    public static final a PENCIL = new a("PENCIL", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{PEN, PRESSURE_PEN, HIGHLIGHTER, MARKER, PENCIL};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private a(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
