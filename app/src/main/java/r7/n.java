package r7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    private final String emoji;
    private final String productId;
    public static final n COFFEE = new n("COFFEE", 0, "tip_coffee_2", "☕");
    public static final n SNACK = new n("SNACK", 1, "tip_snack", "🥐");
    public static final n SWEET = new n("SWEET", 2, "tip_sweet", "🍬");
    public static final n MEAL = new n("MEAL", 3, "tip_meal", "🍜");

    private static final /* synthetic */ n[] $values() {
        return new n[]{COFFEE, SNACK, SWEET, MEAL};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private n(String str, int i, String str2, String str3) {
        this.productId = str2;
        this.emoji = str3;
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getProductId() {
        return this.productId;
    }
}
