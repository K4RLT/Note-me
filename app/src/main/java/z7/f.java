package z7;

import com.daren.scraply.R;
import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AUTO = new f("AUTO", 0);
    public static final f BATTERY = new f("BATTERY", 1);
    public static final f BALANCED = new f("BALANCED", 2);
    public static final f QUALITY = new f("QUALITY", 3);
    public static final f ULTRA = new f("ULTRA", 4);

    private static final /* synthetic */ f[] $values() {
        return new f[]{AUTO, BATTERY, BALANCED, QUALITY, ULTRA};
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

    public final int getDescriptionRes() {
        int i = e.f31953a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return R.string.quality_ultra_desc;
                        }
                        l4.a.o();
                        return 0;
                    }
                    return R.string.quality_quality_desc;
                }
                return R.string.quality_balanced_desc;
            }
            return R.string.quality_battery_desc;
        }
        return R.string.quality_auto_desc;
    }

    public final int getLabelRes() {
        int i = e.f31953a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return R.string.quality_ultra;
                        }
                        l4.a.o();
                        return 0;
                    }
                    return R.string.quality_quality;
                }
                return R.string.quality_balanced;
            }
            return R.string.quality_battery;
        }
        return R.string.quality_auto;
    }
}
