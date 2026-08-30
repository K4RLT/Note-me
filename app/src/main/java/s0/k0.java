package s0;

import com.google.android.gms.internal.ads.hb;
import java.util.Arrays;
import r0.e2;
import ya.tb;

/* loaded from: classes.dex */
public final class k0 extends tb {

    /* renamed from: b, reason: collision with root package name */
    public int f24884b;

    /* renamed from: d, reason: collision with root package name */
    public int f24886d;

    /* renamed from: f, reason: collision with root package name */
    public int f24887f;

    /* renamed from: a, reason: collision with root package name */
    public i0[] f24883a = new i0[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f24885c = new int[16];
    public Object[] e = new Object[16];

    public final void a() {
        this.f24884b = 0;
        this.f24886d = 0;
        Arrays.fill(this.e, 0, this.f24887f, (Object) null);
        this.f24887f = 0;
    }

    public final void b(r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        if (d()) {
            androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(this);
            k0 k0Var = (k0) iVar.f737y;
            while (true) {
                i0 i0Var = k0Var.f24883a[iVar.f734v];
                r0.a b10 = i0Var.b(iVar);
                r0.c cVar2 = cVar;
                e2 e2Var2 = e2Var;
                hb hbVar2 = hbVar;
                j0 j0Var2 = j0Var;
                try {
                    i0Var.a(iVar, cVar2, e2Var2, hbVar2, j0Var2);
                    int i = iVar.f734v;
                    int i10 = k0Var.f24884b;
                    if (i < i10) {
                        i0 i0Var2 = k0Var.f24883a[i];
                        iVar.f735w += i0Var2.f24879a;
                        iVar.f736x += i0Var2.f24880b;
                        int i11 = i + 1;
                        iVar.f734v = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        cVar = cVar2;
                        e2Var = e2Var2;
                        hbVar = hbVar2;
                        j0Var = j0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public final boolean c() {
        if (this.f24884b == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f24884b != 0) {
            return true;
        }
        return false;
    }

    public final void e(i0 i0Var) {
        int i;
        int i10;
        int i11 = this.f24884b;
        i0[] i0VarArr = this.f24883a;
        int i12 = 1024;
        if (i11 == i0VarArr.length) {
            if (i11 > 1024) {
                i10 = 1024;
            } else {
                i10 = i11;
            }
            i0[] i0VarArr2 = new i0[i10 + i11];
            System.arraycopy(i0VarArr, 0, i0VarArr2, 0, i11);
            this.f24883a = i0VarArr2;
        }
        int i13 = this.f24886d;
        int i14 = i0Var.f24879a;
        int i15 = i0Var.f24880b;
        int i16 = i13 + i14;
        int[] iArr = this.f24885c;
        int length = iArr.length;
        if (i16 > length) {
            if (length > 1024) {
                i = 1024;
            } else {
                i = length;
            }
            int i17 = i + length;
            if (i17 >= i16) {
                i16 = i17;
            }
            int[] iArr2 = new int[i16];
            qe.k.c(0, 0, length, iArr, iArr2);
            this.f24885c = iArr2;
        }
        int i18 = this.f24887f + i15;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i18 > length2) {
            if (length2 <= 1024) {
                i12 = length2;
            }
            int i19 = i12 + length2;
            if (i19 >= i18) {
                i18 = i19;
            }
            Object[] objArr2 = new Object[i18];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        i0[] i0VarArr3 = this.f24883a;
        int i20 = this.f24884b;
        this.f24884b = i20 + 1;
        i0VarArr3[i20] = i0Var;
        this.f24886d += i0Var.f24879a;
        this.f24887f += i15;
    }
}
