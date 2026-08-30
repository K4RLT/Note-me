package f7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final String eventName;
    private final String prefKey;
    public static final a NOTEBOOK_CREATED = new a("NOTEBOOK_CREATED", 0, "act_1_notebook_created", "s1");
    public static final a CONTENT_ADDED = new a("CONTENT_ADDED", 1, "act_2_content_added", "s2");
    public static final a PAGE_COMPOSED = new a("PAGE_COMPOSED", 2, "act_3_page_composed", "s3");
    public static final a EXPORTED = new a("EXPORTED", 3, "act_4_exported", "s4");
    public static final a RETURNED = new a("RETURNED", 4, "act_5_returned", "s5");

    private static final /* synthetic */ a[] $values() {
        return new a[]{NOTEBOOK_CREATED, CONTENT_ADDED, PAGE_COMPOSED, EXPORTED, RETURNED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private a(String str, int i, String str2, String str3) {
        this.eventName = str2;
        this.prefKey = str3;
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getPrefKey() {
        return this.prefKey;
    }
}
