package r7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f IDLE = new f("IDLE", 0);
    public static final f LOADING = new f("LOADING", 1);
    public static final f READY = new f("READY", 2);
    public static final f UNAVAILABLE = new f("UNAVAILABLE", 3);

    private static final /* synthetic */ f[] $values() {
        return new f[]{IDLE, LOADING, READY, UNAVAILABLE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private f(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
