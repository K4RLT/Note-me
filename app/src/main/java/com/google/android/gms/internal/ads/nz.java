package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nz {

    /* renamed from: a, reason: collision with root package name */
    public final d51 f8893a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8894b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f8895c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f8896d;

    public nz(d51 d51Var) {
        this.f8893a = d51Var;
        a00 a00Var = a00.e;
        this.f8896d = false;
    }

    public final a00 a(a00 a00Var) {
        if (!a00Var.equals(a00.e)) {
            int i = 0;
            while (true) {
                d51 d51Var = this.f8893a;
                if (i < d51Var.size()) {
                    t10 t10Var = (t10) d51Var.get(i);
                    a00 h3 = t10Var.h(a00Var);
                    if (t10Var.c()) {
                        b80.K(!h3.equals(r0));
                        a00Var = h3;
                    }
                    i++;
                } else {
                    return a00Var;
                }
            }
        } else {
            throw new i10("Unhandled input format:", a00Var);
        }
    }

    public final boolean b() {
        if (!this.f8894b.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f8896d && ((t10) this.f8894b.get(e())).e() && !this.f8895c[e()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z3;
        ByteBuffer byteBuffer2;
        do {
            z3 = false;
            for (int i = 0; i <= e(); i++) {
                if (!this.f8895c[i].hasRemaining()) {
                    ArrayList arrayList = this.f8894b;
                    t10 t10Var = (t10) arrayList.get(i);
                    if (t10Var.e()) {
                        if (!this.f8895c[i].hasRemaining() && i < e()) {
                            ((t10) arrayList.get(i + 1)).a();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.f8895c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = t10.f11228a;
                        }
                        long remaining = byteBuffer2.remaining();
                        t10Var.g(byteBuffer2);
                        this.f8895c[i] = t10Var.b();
                        boolean z9 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f8895c[i].hasRemaining()) {
                            z9 = false;
                        }
                        z3 |= z9;
                    }
                }
            }
        } while (z3);
    }

    public final int e() {
        return this.f8895c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz)) {
            return false;
        }
        d51 d51Var = this.f8893a;
        int size = d51Var.size();
        d51 d51Var2 = ((nz) obj).f8893a;
        if (size != d51Var2.size()) {
            return false;
        }
        for (int i = 0; i < d51Var.size(); i++) {
            if (d51Var.get(i) != d51Var2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f8893a.hashCode();
    }
}
