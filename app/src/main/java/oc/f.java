package oc;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: u, reason: collision with root package name */
    public static final f f21878u;

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap f21879v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f[] f21880w;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, oc.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oc.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, oc.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, oc.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, oc.f] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, java.lang.Object, oc.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, java.lang.Object, oc.f] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, oc.f] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, oc.f] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, java.lang.Object, oc.f] */
    static {
        f r02 = new Enum("X86_32", 0);
        f r12 = new Enum("X86_64", 1);
        f r22 = new Enum("ARM_UNKNOWN", 2);
        f r32 = new Enum("PPC", 3);
        f r42 = new Enum("PPC64", 4);
        f r52 = new Enum("ARMV6", 5);
        f r62 = new Enum("ARMV7", 6);
        f r72 = new Enum("UNKNOWN", 7);
        f21878u = r72;
        f r8 = new Enum("ARMV7S", 8);
        f r92 = new Enum("ARM64", 9);
        f21880w = new f[]{r02, r12, r22, r32, r42, r52, r62, r72, r8, r92};
        HashMap hashMap = new HashMap(4);
        f21879v = hashMap;
        hashMap.put("armeabi-v7a", r62);
        hashMap.put("armeabi", r52);
        hashMap.put("arm64-v8a", r92);
        hashMap.put("x86", r02);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f21880w.clone();
    }
}