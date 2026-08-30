package w7;

import com.daren.scraply.R;
import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i8 {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ i8[] $VALUES;
    private final String analytics;
    private final int labelRes;
    public static final i8 LEFT = new i8("LEFT", 0, R.string.paper_scope_left, "left");
    public static final i8 BOTH = new i8("BOTH", 1, R.string.paper_scope_both, "both");
    public static final i8 RIGHT = new i8("RIGHT", 2, R.string.paper_scope_right, "right");

    private static final /* synthetic */ i8[] $values() {
        return new i8[]{LEFT, BOTH, RIGHT};
    }

    static {
        i8[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private i8(String str, int i, int i10, String str2) {
        this.labelRes = i10;
        this.analytics = str2;
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static i8 valueOf(String str) {
        return (i8) Enum.valueOf(i8.class, str);
    }

    public static i8[] values() {
        return (i8[]) $VALUES.clone();
    }

    public final String getAnalytics() {
        return this.analytics;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }
}
