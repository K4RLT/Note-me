package z7;

import com.daren.scraply.R;
import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    private final int subtitleRes;
    private final int titleRes;
    public static final o PERFORMANCE = new o("PERFORMANCE", 0, R.string.settings_cat_performance, R.string.settings_cat_performance_sub);
    public static final o GENERAL = new o("GENERAL", 1, R.string.settings_cat_general, R.string.settings_cat_general_sub);

    private static final /* synthetic */ o[] $values() {
        return new o[]{PERFORMANCE, GENERAL};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private o(String str, int i, int i10, int i11) {
        this.titleRes = i10;
        this.subtitleRes = i11;
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }
}
