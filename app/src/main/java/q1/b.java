package q1;
import d0.a;
import d0.d;
import d0.f;
import k.a;
import p.a;
import p.c0;
import r.e;
import r.g;
import r.h;

import j.i0;
import java.util.ArrayList;
import java.util.List;
import k1.r0;
import ya.s9;

/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: b, reason: collision with root package name */
    public float[] f23217b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23218c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f23219d = true;
    public long e = k1.r.f19521l;

    /* renamed from: f, reason: collision with root package name */
    public List f23220f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23221g;

    /* renamed from: h, reason: collision with root package name */
    public k1.h f23222h;
    public df.l i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f23223j;

    /* renamed from: k, reason: collision with root package name */
    public String f23224k;

    /* renamed from: l, reason: collision with root package name */
    public float f23225l;

    /* renamed from: m, reason: collision with root package name */
    public float f23226m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23227n;

    public b() {
        int i = a0.f23216a;
        this.f23220f = qe.s.f24023u;
        this.f23221g = true;
        this.f23223j = new c0(5, this);
        this.f23224k = "";
        this.f23225l = 1.0f;
        this.f23226m = 1.0f;
        this.f23227n = true;
    }

    @Override // q1.v
    public final void a(m1.d dVar) {
        if (this.f23227n) {
            float[] fArr = this.f23217b;
            if (fArr == null) {
                fArr = k1.a();
                this.f23217b = fArr;
            } else {
                k1.d(fArr);
            }
            k1.f(fArr, 0.0f, 0.0f);
            if (fArr.length >= 16) {
                double d2 = 0.0f * 0.017453292519943295d;
                float sin = (float) Math.sin(d2);
                float cos = (float) Math.cos(d2);
                float f10 = fArr[0];
                float f11 = fArr[4];
                float f12 = (sin * f11) + (cos * f10);
                float f13 = -sin;
                float f14 = (f11 * cos) + (f10 * f13);
                float f15 = fArr[1];
                float f16 = fArr[5];
                float f17 = (sin * f16) + (cos * f15);
                float f18 = (f16 * cos) + (f15 * f13);
                float f19 = fArr[2];
                float f20 = fArr[6];
                float f21 = (sin * f20) + (cos * f19);
                float f22 = (f20 * cos) + (f19 * f13);
                float f23 = fArr[3];
                float f24 = fArr[7];
                fArr[0] = f12;
                fArr[1] = f17;
                fArr[2] = f21;
                fArr[3] = (sin * f24) + (cos * f23);
                fArr[4] = f14;
                fArr[5] = f18;
                fArr[6] = f22;
                fArr[7] = (cos * f24) + (f13 * f23);
            }
            float f25 = this.f23225l;
            float f26 = this.f23226m;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f25;
                fArr[1] = fArr[1] * f25;
                fArr[2] = fArr[2] * f25;
                fArr[3] = fArr[3] * f25;
                fArr[4] = fArr[4] * f26;
                fArr[5] = fArr[5] * f26;
                fArr[6] = fArr[6] * f26;
                fArr[7] = fArr[7] * f26;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            k1.f(fArr, -0.0f, -0.0f);
            this.f23227n = false;
        }
        if (this.f23221g) {
            if (!this.f23220f.isEmpty()) {
                k1.h hVar = this.f23222h;
                if (hVar == null) {
                    hVar = k1.a();
                    this.f23222h = hVar;
                }
                s9.a(this.f23220f, hVar);
            }
            this.f23221g = false;
        }
        i0 p02 = dVar.p0();
        long r8 = p02.r();
        p02.j().l();
        try {
            ic.c cVar = (ic.c) p02.f18636v;
            float[] fArr2 = this.f23217b;
            if (fArr2 != null) {
                ((i0) cVar.f18393v).j().n(fArr2);
            }
            k1.h hVar2 = this.f23222h;
            if (!this.f23220f.isEmpty() && hVar2 != null) {
                cVar.d(hVar2, 1);
            }
            ArrayList arrayList = this.f23218c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((v) arrayList.get(i)).a(dVar);
            }
            a.v(p02, r8);
        } catch (Throwable th) {
            a.v(p02, r8);
            throw th;
        }
    }

    @Override // q1.v
    public final df.l b() {
        return this.i;
    }

    @Override // q1.v
    public final void d(c0 c0Var) {
        this.i = c0Var;
    }

    public final void e(int i, v vVar) {
        ArrayList arrayList = this.f23218c;
        if (i < arrayList.size()) {
            arrayList.set(i, vVar);
        } else {
            arrayList.add(vVar);
        }
        g(vVar);
        vVar.d(this.f23223j);
        c();
    }

    public final void f(long j10) {
        if (this.f23219d && j10 != 16) {
            long j11 = this.e;
            if (j11 == 16) {
                this.e = j10;
                return;
            }
            int i = a0.f23216a;
            if (k1.h(j11) != k1.h(j10) || k1.g(j11) != k1.g(j10) || k1.e(j11) != k1.e(j10)) {
                this.f23219d = false;
                this.e = k1.r.f19521l;
            }
        }
    }

    public final void g(v vVar) {
        if (vVar instanceof h) {
            h hVar = (h) vVar;
            k1.n nVar = hVar.f23264b;
            if (this.f23219d && nVar != null) {
                if (nVar instanceof r0) {
                    f(((r0) nVar).f19524a);
                } else {
                    this.f23219d = false;
                    this.e = k1.r.f19521l;
                }
            }
            k1.n nVar2 = hVar.f23267f;
            if (this.f23219d && nVar2 != null) {
                if (nVar2 instanceof r0) {
                    f(((r0) nVar2).f19524a);
                    return;
                } else {
                    this.f23219d = false;
                    this.e = k1.r.f19521l;
                    return;
                }
            }
            return;
        }
        if (vVar instanceof b) {
            b bVar = (b) vVar;
            if (bVar.f23219d && this.f23219d) {
                f(bVar.e);
            } else {
                this.f23219d = false;
                this.e = k1.r.f19521l;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f23224k);
        ArrayList arrayList = this.f23218c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v vVar = (v) arrayList.get(i);
            sb2.append("\t");
            sb2.append(vVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
