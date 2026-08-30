package w7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k9 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ k9[] $VALUES;
    public static final k9 STRIPES = new k9("STRIPES", 0);
    public static final k9 DOTS = new k9("DOTS", 1);
    public static final k9 GRID = new k9("GRID", 2);
    public static final k9 SOLID = new k9("SOLID", 3);
    public static final k9 AIRMAIL = new k9("AIRMAIL", 4);
    public static final k9 HEARTS = new k9("HEARTS", 5);
    public static final k9 STARS = new k9("STARS", 6);
    public static final k9 CHEVRON = new k9("CHEVRON", 7);
    public static final k9 PLAID = new k9("PLAID", 8);
    public static final k9 WAVES = new k9("WAVES", 9);
    public static final k9 TRIANGLES = new k9("TRIANGLES", 10);

    private static final /* synthetic */ k9[] $values() {
        return new k9[]{STRIPES, DOTS, GRID, SOLID, AIRMAIL, HEARTS, STARS, CHEVRON, PLAID, WAVES, TRIANGLES};
    }

    static {
        k9[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private k9(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static k9 valueOf(String str) {
        return (k9) Enum.valueOf(k9.class, str);
    }

    public static k9[] values() {
        return (k9[]) $VALUES.clone();
    }
}
