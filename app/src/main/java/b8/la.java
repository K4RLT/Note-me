package b8;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class la {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ la[] $VALUES;
    public static final la EXPLORE = new la("EXPLORE", 0);
    public static final la DETAIL = new la("DETAIL", 1);
    public static final la PICK_NOTEBOOK = new la("PICK_NOTEBOOK", 2);
    public static final la PUBLISH_FORM = new la("PUBLISH_FORM", 3);

    private static final /* synthetic */ la[] $values() {
        return new la[]{EXPLORE, DETAIL, PICK_NOTEBOOK, PUBLISH_FORM};
    }

    static {
        la[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private la(String str, int i) {
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static la valueOf(String str) {
        return (la) Enum.valueOf(la.class, str);
    }

    public static la[] values() {
        return (la[]) $VALUES.clone();
    }
}
