package w7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c IDLE = new c("IDLE", 0);
    public static final c CLOSING = new c("CLOSING", 1);
    public static final c WAITING = new c("WAITING", 2);
    public static final c OPENING = new c("OPENING", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{IDLE, CLOSING, WAITING, OPENING};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private c(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
