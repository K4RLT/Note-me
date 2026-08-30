package e7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EARNED = new j("EARNED", 0);
    public static final j DISMISSED_EARLY = new j("DISMISSED_EARLY", 1);
    public static final j UNAVAILABLE = new j("UNAVAILABLE", 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{EARNED, DISMISSED_EARLY, UNAVAILABLE};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private j(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
