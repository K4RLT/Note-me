package w0;
import l.a;

import g5.q;
import kotlin.jvm.internal.b0;
import ya.dd;

/* loaded from: classes.dex */
public class e extends c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public final d f27671x;

    /* renamed from: y, reason: collision with root package name */
    public Object f27672y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f27673z;

    public e(d dVar, l[] lVarArr) {
        super(dVar.f27667w, lVarArr);
        this.f27671x = dVar;
        this.A = dVar.f27669y;
    }

    public final void c(int i, k kVar, Object obj, int i10) {
        int i11 = i10 * 5;
        l[] lVarArr = this.f27662u;
        if (i11 > 30) {
            l lVar = lVarArr[i10];
            Object[] objArr = kVar.f27682d;
            lVar.a(objArr, objArr.length, 0);
            while (true) {
                l lVar2 = lVarArr[i10];
                if (!kotlin.jvm.internal.a(lVar2.f27683u[lVar2.f27685w], obj)) {
                    lVarArr[i10].f27685w += 2;
                } else {
                    this.f27663v = i10;
                    return;
                }
            }
        } else {
            int d2 = 1 << dd.d(i, i11);
            if (kVar.h(d2)) {
                lVarArr[i10].a(kVar.f27682d, Integer.bitCount(kVar.f27679a) * 2, kVar.f(d2));
                this.f27663v = i10;
            } else {
                int t3 = kVar.t(d2);
                k s10 = kVar.s(t3);
                lVarArr[i10].a(kVar.f27682d, Integer.bitCount(kVar.f27679a) * 2, t3);
                c(i, s10, obj, i10 + 1);
            }
        }
    }

    @Override // w0.c, java.util.Iterator
    public final Object next() {
        if (this.f27671x.f27669y == this.A) {
            if (this.f27664w) {
                l lVar = this.f27662u[this.f27663v];
                this.f27672y = lVar.f27683u[lVar.f27685w];
                this.f27673z = true;
                return super.next();
            }
            l4.a.c();
            return null;
        }
        l4.a.m();
        return null;
    }

    @Override // w0.c, java.util.Iterator
    public final void remove() {
        int i;
        if (this.f27673z) {
            boolean z3 = this.f27664w;
            d dVar = this.f27671x;
            if (z3) {
                if (z3) {
                    l lVar = this.f27662u[this.f27663v];
                    Object obj = lVar.f27683u[lVar.f27685w];
                    b0.a(dVar).remove(this.f27672y);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    c(i, dVar.f27667w, obj, 0);
                } else {
                    l4.a.c();
                    return;
                }
            } else {
                b0.a(dVar).remove(this.f27672y);
            }
            this.f27672y = null;
            this.f27673z = false;
            this.A = dVar.f27669y;
            return;
        }
        q.l();
    }
}
