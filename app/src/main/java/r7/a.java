package r7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a STICKER_PACKS_PREMIUM = new a("STICKER_PACKS_PREMIUM", 0);
    public static final a FRAMES_PREMIUM = new a("FRAMES_PREMIUM", 1);
    public static final a SURFACES_PREMIUM = new a("SURFACES_PREMIUM", 2);
    public static final a COVERS_PREMIUM = new a("COVERS_PREMIUM", 3);
    public static final a NOTEBOOK_STACKS = new a("NOTEBOOK_STACKS", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{STICKER_PACKS_PREMIUM, FRAMES_PREMIUM, SURFACES_PREMIUM, COVERS_PREMIUM, NOTEBOOK_STACKS};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private a(String str, int i) {
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
}
