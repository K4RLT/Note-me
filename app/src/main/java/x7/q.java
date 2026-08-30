package x7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q INK = new q("INK", 0);
    public static final q IMAGES = new q("IMAGES", 1);
    public static final q EVERYTHING = new q("EVERYTHING", 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{INK, IMAGES, EVERYTHING};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private q(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
