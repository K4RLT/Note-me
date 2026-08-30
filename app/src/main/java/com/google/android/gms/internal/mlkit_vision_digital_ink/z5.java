package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public abstract class z5 implements a6 {

    /* renamed from: a, reason: collision with root package name */
    public static final w5 f15328a = new Object();

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogSite{ class=");
        sb2.append(b());
        sb2.append(", method=");
        sb2.append(d());
        sb2.append(", line=");
        sb2.append(a());
        if (c() != null) {
            sb2.append(", file=");
            sb2.append(c());
        }
        if (e() != null) {
            sb2.append(", filePath=");
            sb2.append(e());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
