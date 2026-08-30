package m8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: u, reason: collision with root package name */
    public static final z f20758u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ z[] f20759v;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m8.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m8.z, java.lang.Object] */
    static {
        z r02 = new Enum("NOT_SET", 0);
        z r12 = new Enum("EVENT_OVERRIDE", 1);
        f20758u = r12;
        f20759v = new z[]{r02, r12};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(5, r12);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f20759v.clone();
    }
}