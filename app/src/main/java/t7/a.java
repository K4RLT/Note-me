package t7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int points;
    public static final a NOTEBOOK_CREATED = new a("NOTEBOOK_CREATED", 0, 1);
    public static final a COVER_DESIGNED = new a("COVER_DESIGNED", 1, 2);
    public static final a NOTEBOOK_SAVED = new a("NOTEBOOK_SAVED", 2, 3);
    public static final a NOTEBOOK_SHARED = new a("NOTEBOOK_SHARED", 3, 4);
    public static final a TIPPED = new a("TIPPED", 4, 6);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NOTEBOOK_CREATED, COVER_DESIGNED, NOTEBOOK_SAVED, NOTEBOOK_SHARED, TIPPED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private a(String str, int i, int i10) {
        this.points = i10;
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

    public final int getPoints() {
        return this.points;
    }
}
