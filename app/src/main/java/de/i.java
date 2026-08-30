package de;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: u, reason: collision with root package name */
    public static final i f15847u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i[] f15848v;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [de.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [de.i, java.lang.Enum] */
    static {
        i r02 = new Enum("UNKNOWN", 0);
        i r12 = new Enum("BASE", 1);
        i r22 = new Enum("TRANSLATE", 2);
        i r32 = new Enum("ENTITY_EXTRACTION", 3);
        i r42 = new Enum("CUSTOM", 4);
        i r52 = new Enum("DIGITAL_INK", 5);
        f15847u = r52;
        f15848v = new i[]{r02, r12, r22, r32, r42, r52, new Enum("DIGITAL_INK_SEGMENTATION", 6), new Enum("TOXICITY_DETECTION", 7), new Enum("IMAGE_CAPTIONING", 8)};
    }

    public static i[] values() {
        return (i[]) f15848v.clone();
    }
}