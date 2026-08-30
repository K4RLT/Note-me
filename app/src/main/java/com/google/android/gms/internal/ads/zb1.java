package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zb1 {

    /* renamed from: u, reason: collision with root package name */
    public final int f13134u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13135v;

    public zb1(com.google.android.gms.internal.mlkit_vision_digital_ink.o6 o6Var, int i) {
        if (o6Var != null) {
            if (i >= 0) {
                this.f13134u = i;
                this.f13135v = o6Var;
                return;
            } else {
                q.x.n(g3.a.g(i, "invalid index: "));
                throw null;
            }
        }
        q.x.n("format options cannot be null");
        throw null;
    }

    public abstract q3.q0 d(q3.q0 q0Var, List list);

    public abstract j6.l e(q3.a0 a0Var, j6.l lVar);

    public abstract int[] f(int i, int[] iArr);

    public abstract int g();

    public abstract void h(c4.t tVar, Object obj);

    public ByteBuffer i(byte[] bArr, int i) {
        int[] f10 = f(i, xb1.c(bArr));
        int[] iArr = (int[]) f10.clone();
        xb1.a(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            f10[i10] = f10[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(f10, 0, 16);
        return order;
    }

    public void b() {
    }

    public zb1(int i, String str) {
        this.f13134u = i;
        this.f13135v = str;
    }

    public void a(q3.a0 a0Var) {
    }

    public zb1(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f13135v = xb1.c(bArr);
            this.f13134u = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public zb1(int i) {
        this.f13134u = i;
    }
}
