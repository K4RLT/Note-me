package com.google.android.gms.internal.ads;
import a5.a;
import l4.a;
import q.x;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bn1 implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public final dn1 f4844u;

    /* renamed from: v, reason: collision with root package name */
    public dn1 f4845v;

    public bn1(dn1 dn1Var) {
        this.f4844u = dn1Var;
        if (!dn1Var.h()) {
            this.f4845v = dn1Var.p();
        } else {
            x.n("Default instance must be immutable.");
            throw null;
        }
    }

    public static void e(int i, List list) {
        int size = list.size() - i;
        String j10 = a.j(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(j10);
            }
        }
    }

    public final void a(byte[] bArr, wm1 wm1Var) {
        int length = bArr.length;
        b();
        try {
            ho1.f6854c.a(this.f4845v.getClass()).h(this.f4845v, bArr, 0, length, new fm1(wm1Var));
        } catch (pn1 e) {
            throw e;
        } catch (IOException e8) {
            a.k("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (!this.f4845v.h()) {
            dn1 p10 = this.f4844u.p();
            ho1.f6854c.a(p10.getClass()).e(p10, this.f4845v);
            this.f4845v = p10;
        }
    }

    public final dn1 c() {
        boolean h3 = this.f4845v.h();
        dn1 dn1Var = this.f4845v;
        if (h3) {
            dn1Var.getClass();
            ho1.f6854c.a(dn1Var.getClass()).d(dn1Var);
            dn1Var.i();
            dn1Var = this.f4845v;
        }
        dn1Var.getClass();
        if (dn1.w(dn1Var, true)) {
            return dn1Var;
        }
        throw new uo1();
    }

    public final Object clone() {
        bn1 bn1Var = (bn1) this.f4844u.v(5, null);
        boolean h3 = this.f4845v.h();
        dn1 dn1Var = this.f4845v;
        if (h3) {
            dn1Var.getClass();
            ho1.f6854c.a(dn1Var.getClass()).d(dn1Var);
            dn1Var.i();
            dn1Var = this.f4845v;
        }
        bn1Var.f4845v = dn1Var;
        return bn1Var;
    }

    public final bn1 d(dn1 dn1Var) {
        if (this.f4844u.equals(dn1Var)) {
            return this;
        }
        b();
        dn1 dn1Var2 = this.f4845v;
        ho1.f6854c.a(dn1Var2.getClass()).e(dn1Var2, dn1Var);
        return this;
    }
}
