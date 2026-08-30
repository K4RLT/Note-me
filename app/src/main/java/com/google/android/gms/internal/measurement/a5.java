package com.google.android.gms.internal.measurement;
import l4.a;
import q.x;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a5 implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public final b5 f13638u;

    /* renamed from: v, reason: collision with root package name */
    public b5 f13639v;

    public a5(b5 b5Var) {
        this.f13638u = b5Var;
        if (!b5Var.o()) {
            this.f13639v = (b5) b5Var.g(4);
        } else {
            x.n("Default instance must be immutable.");
            throw null;
        }
    }

    public final b5 a() {
        boolean o10 = this.f13639v.o();
        b5 b5Var = this.f13639v;
        if (o10) {
            b5Var.m();
            b5Var = this.f13639v;
        }
        boolean z3 = true;
        byte byteValue = ((Byte) b5Var.g(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z3 = false;
            } else {
                y5 y5Var = y5.f13983c;
                y5Var.getClass();
                z3 = y5Var.a(b5Var.getClass()).a(b5Var);
                b5Var.g(2);
            }
        }
        if (z3) {
            return b5Var;
        }
        throw new ab.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).", 9);
    }

    public final void b() {
        if (!this.f13639v.o()) {
            b5 b5Var = (b5) this.f13638u.g(4);
            b5 b5Var2 = this.f13639v;
            y5 y5Var = y5.f13983c;
            y5Var.getClass();
            y5Var.a(b5Var.getClass()).g(b5Var, b5Var2);
            this.f13639v = b5Var;
        }
    }

    public final void c(byte[] bArr, int i, v4 v4Var) {
        if (!this.f13639v.o()) {
            b5 b5Var = (b5) this.f13638u.g(4);
            b5 b5Var2 = this.f13639v;
            y5 y5Var = y5.f13983c;
            y5Var.getClass();
            y5Var.a(b5Var.getClass()).g(b5Var, b5Var2);
            this.f13639v = b5Var;
        }
        try {
            y5 y5Var2 = y5.f13983c;
            b5 b5Var3 = this.f13639v;
            y5Var2.getClass();
            a6 a10 = y5Var2.a(b5Var3.getClass());
            b5 b5Var4 = this.f13639v;
            com.google.android.gms.internal.ads.r7 r7Var = new com.google.android.gms.internal.ads.r7(3);
            v4Var.getClass();
            a10.h(b5Var4, bArr, 0, i, r7Var);
        } catch (h5 e) {
            throw e;
        } catch (IOException e8) {
            a.k("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw h5.d();
        }
    }

    public final Object clone() {
        a5 a5Var = (a5) this.f13638u.g(5);
        boolean o10 = this.f13639v.o();
        b5 b5Var = this.f13639v;
        if (o10) {
            b5Var.m();
            b5Var = this.f13639v;
        }
        a5Var.f13639v = b5Var;
        return a5Var;
    }
}
