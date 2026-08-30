package b1;
import l.c;
import n.j0;
import p.c;
import p.d;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: o, reason: collision with root package name */
    public final d f1330o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1331p;

    public e(long j10, m mVar, df.l lVar, df.l lVar2, d dVar) {
        super(j10, mVar, lVar, lVar2);
        this.f1330o = dVar;
        dVar.k();
    }

    @Override // b1.d, b1.i
    public final void c() {
        if (!this.f1347c) {
            super.c();
            if (!this.f1331p) {
                this.f1331p = true;
                this.f1330o.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b1.w, java.lang.Object] */
    @Override // b1.d
    public final w w() {
        HashMap hashMap;
        e eVar;
        d dVar = this.f1330o;
        if (!dVar.f1327m && !dVar.f1347c) {
            j0 j0Var = this.f1323h;
            long j10 = this.f1346b;
            if (j0Var != null) {
                hashMap = c(dVar.g(), this, this.f1330o.d());
            } else {
                hashMap = null;
            }
            Object obj = p.f1387c;
            synchronized (obj) {
                try {
                    d(this);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (j0Var == null || j0Var.f20901d == 0) {
                        eVar = this;
                        a();
                    } else {
                        eVar = this;
                        w z3 = eVar.z(this.f1330o.g(), j0Var, hashMap, this.f1330o.d());
                        if (!z3.equals(k.f1352c)) {
                            return z3;
                        }
                        j0 x9 = eVar.f1330o.x();
                        if (x9 != null) {
                            x9.k(j0Var);
                        } else {
                            eVar.f1330o.B(j0Var);
                            eVar.f1323h = null;
                        }
                    }
                    if (kotlin.jvm.internal.c(eVar.f1330o.g(), j10) < 0) {
                        eVar.f1330o.v();
                    }
                    d dVar2 = eVar.f1330o;
                    dVar2.r(dVar2.d().b(j10).a(eVar.f1324j));
                    eVar.f1330o.A(j10);
                    d dVar3 = eVar.f1330o;
                    int i = eVar.f1348d;
                    eVar.f1348d = -1;
                    if (i >= 0) {
                        int[] iArr = dVar3.f1325k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        dVar3.f1325k = copyOf;
                    } else {
                        dVar3.getClass();
                    }
                    d dVar4 = eVar.f1330o;
                    m mVar = eVar.f1324j;
                    dVar4.getClass();
                    synchronized (obj) {
                        dVar4.f1324j = dVar4.f1324j.k(mVar);
                        d dVar5 = eVar.f1330o;
                        int[] iArr2 = eVar.f1325k;
                        dVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = dVar5.f1325k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            dVar5.f1325k = iArr2;
                        }
                    }
                    eVar.f1327m = true;
                    if (!eVar.f1331p) {
                        eVar.f1331p = true;
                        eVar.f1330o.l();
                    }
                    return k.f1352c;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        return new Object();
    }
}
