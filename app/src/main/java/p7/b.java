package p7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final String displayName;
    public static final b ALL = new b("ALL", 0, "Todas");
    public static final b VINTAGE = new b("VINTAGE", 1, "Máquina");
    public static final b HANDWRITING = new b("HANDWRITING", 2, "Manuscrito");
    public static final b TITLES = new b("TITLES", 3, "Títulos");
    public static final b MODERN = new b("MODERN", 4, "Modernas");

    private static final /* synthetic */ b[] $values() {
        return new b[]{ALL, VINTAGE, HANDWRITING, TITLES, MODERN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private b(String str, int i, String str2) {
        this.displayName = str2;
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }
}
