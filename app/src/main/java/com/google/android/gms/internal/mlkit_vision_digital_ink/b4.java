package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b4 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14061a;

    /* renamed from: b, reason: collision with root package name */
    public int f14062b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14063c;

    public b4(int i) {
        n5.d(i, "initialCapacity");
        this.f14061a = new Object[i];
        this.f14062b = 0;
    }

    public static int b(int i, int i10) {
        if (i10 >= 0) {
            if (i10 <= i) {
                return i;
            }
            int i11 = i + (i >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        q.x.n("cannot store more than Integer.MAX_VALUE elements");
        return 0;
    }

    public final void a(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f14061a;
        int i = this.f14062b;
        this.f14062b = i + 1;
        objArr[i] = obj;
    }

    public final void c(int i) {
        int length = this.f14061a.length;
        int b10 = b(length, this.f14062b + i);
        if (b10 <= length && !this.f14063c) {
            return;
        }
        this.f14061a = Arrays.copyOf(this.f14061a, b10);
        this.f14063c = false;
    }
}
