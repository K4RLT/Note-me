package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v5 extends gn {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f15118a;

    /* renamed from: b, reason: collision with root package name */
    public int f15119b;

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.gn
    public final int a() {
        return this.f15119b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.gn
    public final d6 i(int i) {
        if (i < this.f15119b) {
            return (d6) this.f15118a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.gn
    public final Object n(d6 d6Var) {
        int u9 = u(d6Var);
        if (u9 != -1) {
            return d6Var.f14185b.cast(this.f15118a[u9 + u9 + 1]);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.gn
    public final Object r(int i) {
        if (i < this.f15119b) {
            return this.f15118a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final void t(d6 d6Var, Object obj) {
        int u9;
        if (!d6Var.f14186c && (u9 = u(d6Var)) != -1) {
            n5.e(obj, "metadata value");
            this.f15118a[u9 + u9 + 1] = obj;
            return;
        }
        int i = this.f15119b + 1;
        Object[] objArr = this.f15118a;
        int length = objArr.length;
        if (i + i > length) {
            this.f15118a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f15118a;
        int i10 = this.f15119b;
        int i11 = i10 + i10;
        objArr2[i11] = d6Var;
        n5.e(obj, "metadata value");
        objArr2[i11 + 1] = obj;
        this.f15119b++;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f15119b; i++) {
            sb2.append(" '");
            sb2.append(i(i));
            sb2.append("': ");
            sb2.append(r(i));
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public final int u(d6 d6Var) {
        for (int i = 0; i < this.f15119b; i++) {
            if (this.f15118a[i + i].equals(d6Var)) {
                return i;
            }
        }
        return -1;
    }
}
