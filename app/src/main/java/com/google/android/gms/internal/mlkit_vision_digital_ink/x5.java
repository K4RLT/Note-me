package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;

import java.io.File;

/* loaded from: classes.dex */
public final class x5 extends z5 {

    /* renamed from: b, reason: collision with root package name */
    public final String f15227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15228c;

    /* renamed from: d, reason: collision with root package name */
    public int f15229d = 0;

    public x5(String str, int i) {
        this.f15227b = str;
        this.f15228c = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z5
    public final int a() {
        return (char) this.f15228c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z5
    public final String b() {
        return "com/google/android/libraries/mdi/download/internal/logging/LogUtil".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z5
    public final String c() {
        return "LogUtil.java".substring("LogUtil.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z5
    public final String d() {
        return this.f15227b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z5
    public final String e() {
        return "LogUtil.java";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            x5 x5Var = (x5) obj;
            if (this.f15227b.equals(x5Var.f15227b) && this.f15228c == x5Var.f15228c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f15229d;
        if (i == 0) {
            int e = g3.a.e(this.f15227b, 4867, 31) + this.f15228c;
            this.f15229d = e;
            return e;
        }
        return i;
    }
}
