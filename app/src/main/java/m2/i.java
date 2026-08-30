package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    public static final i A;
    public static final /* synthetic */ i[] B;

    /* renamed from: u, reason: collision with root package name */
    public static final i f20498u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f20499v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f20500w;

    /* renamed from: x, reason: collision with root package name */
    public static final i f20501x;

    /* renamed from: y, reason: collision with root package name */
    public static final i f20502y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f20503z;

    /* JADX WARN: Type inference failed for: r0v0, types: [m2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [m2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [m2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [m2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [m2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [m2.i, java.lang.Enum] */
    static {
        i r02 = new Enum("Paragraph", 0);
        f20498u = r02;
        i r12 = new Enum("Span", 1);
        f20499v = r12;
        i r22 = new Enum("VerbatimTts", 2);
        f20500w = r22;
        i r32 = new Enum("Url", 3);
        f20501x = r32;
        i r42 = new Enum("Link", 4);
        f20502y = r42;
        i r52 = new Enum("Clickable", 5);
        f20503z = r52;
        i r62 = new Enum("String", 6);
        A = r62;
        B = new i[]{r02, r12, r22, r32, r42, r52, r62};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) B.clone();
    }
}