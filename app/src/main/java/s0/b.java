package s0;
import s.c;

import java.util.ArrayList;
import r0.a2;
import ya.sb;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final r0.r f24854a;

    /* renamed from: b, reason: collision with root package name */
    public a f24855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24856c;

    /* renamed from: f, reason: collision with root package name */
    public int f24858f;

    /* renamed from: g, reason: collision with root package name */
    public int f24859g;

    /* renamed from: l, reason: collision with root package name */
    public int f24863l;

    /* renamed from: d, reason: collision with root package name */
    public final b2.t f24857d = new b2.t(3, (byte) 0);
    public boolean e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f24860h = new ArrayList();
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f24861j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f24862k = -1;

    public b(r0.r rVar, a aVar) {
        this.f24854a = rVar;
        this.f24855b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f24860h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.f24859g++;
        }
    }

    public final void b() {
        int i = this.f24859g;
        if (i > 0) {
            k0 k0Var = this.f24855b.f24852a;
            k0Var.e(g0.f24875c);
            k0Var.f24885c[k0Var.f24886d - k0Var.f24883a[k0Var.f24884b - 1].f24879a] = i;
            this.f24859g = 0;
        }
        ArrayList arrayList = this.f24860h;
        if (!arrayList.isEmpty()) {
            a aVar = this.f24855b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = arrayList.get(i10);
            }
            aVar.getClass();
            if (size != 0) {
                k0 k0Var2 = aVar.f24852a;
                k0Var2.e(k.f24882c);
                sb.a(k0Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i = this.f24863l;
        if (i > 0) {
            int i10 = this.i;
            if (i10 >= 0) {
                b();
                k0 k0Var = this.f24855b.f24852a;
                k0Var.e(y.f24904c);
                int i11 = k0Var.f24886d - k0Var.f24883a[k0Var.f24884b - 1].f24879a;
                int[] iArr = k0Var.f24885c;
                iArr[i11] = i10;
                iArr[i11 + 1] = i;
                this.i = -1;
            } else {
                int i12 = this.f24862k;
                int i13 = this.f24861j;
                b();
                k0 k0Var2 = this.f24855b.f24852a;
                k0Var2.e(v.f24901c);
                int i14 = k0Var2.f24886d - k0Var2.f24883a[k0Var2.f24884b - 1].f24879a;
                int[] iArr2 = k0Var2.f24885c;
                iArr2[i14 + 1] = i12;
                iArr2[i14] = i13;
                iArr2[i14 + 2] = i;
                this.f24861j = -1;
                this.f24862k = -1;
            }
            this.f24863l = 0;
        }
    }

    public final void d(boolean z3) {
        int i;
        a2 a2Var = this.f24854a.G;
        if (z3) {
            i = a2Var.i;
        } else {
            i = a2Var.f24183g;
        }
        int i10 = i - this.f24858f;
        if (i10 < 0) {
            r0.c("Tried to seek backward");
        }
        if (i10 > 0) {
            k0 k0Var = this.f24855b.f24852a;
            k0Var.e(d.f24868c);
            k0Var.f24885c[k0Var.f24886d - k0Var.f24883a[k0Var.f24884b - 1].f24879a] = i10;
            this.f24858f = i;
        }
    }

    public final void e(int i, int i10) {
        boolean z3;
        if (i10 > 0) {
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                r0.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.f24863l += i10;
                return;
            }
            c();
            this.i = i;
            this.f24863l = i10;
        }
    }
}
