package x7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE = new a("NONE", 0);
    public static final a SCRAP = new a("SCRAP", 1);
    public static final a PDF = new a("PDF", 2);
    public static final a PNG = new a("PNG", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, SCRAP, PDF, PNG};
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
