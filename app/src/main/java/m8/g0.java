package m8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseArray f20698u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g0[] f20699v;

    /* JADX INFO: Fake field, exist only in values array */
    g0 EF1;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Enum, m8.g0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, m8.g0, java.lang.Object] */
    static {
        g0 r12 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        g0 r22 = new Enum("GPRS", 1);
        g0 r32 = new Enum("EDGE", 2);
        g0 r42 = new Enum("UMTS", 3);
        g0 r52 = new Enum("CDMA", 4);
        g0 r62 = new Enum("EVDO_0", 5);
        g0 r72 = new Enum("EVDO_A", 6);
        g0 r8 = new Enum("RTT", 7);
        g0 r92 = new Enum("HSDPA", 8);
        g0 r10 = new Enum("HSUPA", 9);
        g0 r11 = new Enum("HSPA", 10);
        g0 r122 = new Enum("IDEN", 11);
        g0 r13 = new Enum("EVDO_B", 12);
        g0 r14 = new Enum("LTE", 13);
        g0 r15 = new Enum("EHRPD", 14);
        g0 r02 = new Enum("HSPAP", 15);
        g0 r16 = new Enum("GSM", 16);
        g0 r23 = new Enum("TD_SCDMA", 17);
        g0 r03 = new Enum("IWLAN", 18);
        g0 r17 = new Enum("LTE_CA", 19);
        f20699v = new g0[]{r12, r22, r32, r42, r52, r62, r72, r8, r92, r10, r11, r122, r13, r14, r15, r02, r16, r23, r03, r17, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f20698u = sparseArray;
        sparseArray.put(0, r12);
        sparseArray.put(1, r22);
        sparseArray.put(2, r32);
        sparseArray.put(3, r42);
        sparseArray.put(4, r52);
        sparseArray.put(5, r62);
        sparseArray.put(6, r72);
        sparseArray.put(7, r8);
        sparseArray.put(8, r92);
        sparseArray.put(9, r10);
        sparseArray.put(10, r11);
        sparseArray.put(11, r122);
        sparseArray.put(12, r13);
        sparseArray.put(13, r14);
        sparseArray.put(14, r15);
        sparseArray.put(15, r02);
        sparseArray.put(16, r16);
        sparseArray.put(17, r23);
        sparseArray.put(18, r03);
        sparseArray.put(19, r17);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f20699v.clone();
    }
}