package m8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: u, reason: collision with root package name */
    public static final j0 f20719u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j0[] f20720v;

    /* JADX WARN: Type inference failed for: r0v0, types: [m8.j0, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m8.j0, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [m8.j0, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [m8.j0, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [m8.j0, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [m8.j0, java.lang.Enum, java.lang.Object] */
    static {
        j0 r02 = new Enum("DEFAULT", 0);
        f20719u = r02;
        j0 r12 = new Enum("UNMETERED_ONLY", 1);
        j0 r22 = new Enum("UNMETERED_OR_DAILY", 2);
        j0 r32 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        j0 r42 = new Enum("NEVER", 4);
        j0 r52 = new Enum("UNRECOGNIZED", 5);
        f20720v = new j0[]{r02, r12, r22, r32, r42, r52};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r22);
        sparseArray.put(3, r32);
        sparseArray.put(4, r42);
        sparseArray.put(-1, r52);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f20720v.clone();
    }
}