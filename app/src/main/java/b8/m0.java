package b8;
import b8.l0;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final l0 Companion;
    public static final m0 KRAFT = new m0("KRAFT", 0);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{KRAFT};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l0, java.lang.Object] */
    static {
        m0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
        Companion = new Object();
    }

    private m0(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
