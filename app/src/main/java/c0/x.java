package c0;
import c0.x;
import u.m;

import java.util.List;
import java.util.Map;
import t.z0;
import z1.q0;

/* loaded from: classes.dex */
public final class x implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3421c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3422d;
    public final z0 e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3423f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3424g;

    /* renamed from: h, reason: collision with root package name */
    public final j f3425h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3426j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3427k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3428l;

    /* renamed from: m, reason: collision with root package name */
    public final m f3429m;

    /* renamed from: n, reason: collision with root package name */
    public final q0 f3430n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3431o;

    /* renamed from: p, reason: collision with root package name */
    public final List f3432p;

    /* renamed from: q, reason: collision with root package name */
    public final List f3433q;

    /* renamed from: r, reason: collision with root package name */
    public final pf.z f3434r;

    public x(List list, int i, int i10, int i11, z0 z0Var, int i12, int i13, j jVar, j jVar2, float f10, int i14, boolean z3, m mVar, q0 q0Var, boolean z9, List list2, List list3, pf.z zVar) {
        this.f3419a = list;
        this.f3420b = i;
        this.f3421c = i10;
        this.f3422d = i11;
        this.e = z0Var;
        this.f3423f = i12;
        this.f3424g = i13;
        this.f3425h = jVar;
        this.i = jVar2;
        this.f3426j = f10;
        this.f3427k = i14;
        this.f3428l = z3;
        this.f3429m = mVar;
        this.f3430n = q0Var;
        this.f3431o = z9;
        this.f3432p = list2;
        this.f3433q = list3;
        this.f3434r = zVar;
    }

    @Override // z1.q0
    public final void a() {
        this.f3430n.a();
    }

    @Override // z1.q0
    public final Map b() {
        return this.f3430n.b();
    }

    @Override // z1.q0
    public final df.l c() {
        return this.f3430n.c();
    }

    public final x d(int i) {
        int i10;
        float f10;
        int i11 = this.f3420b + this.f3421c;
        if (!this.f3431o) {
            List list = this.f3419a;
            if (!list.isEmpty() && this.f3425h != null && (i10 = this.f3427k - i) >= 0 && i10 < i11) {
                if (i11 != 0) {
                    f10 = i / i11;
                } else {
                    f10 = 0.0f;
                }
                float f11 = this.f3426j - f10;
                if (this.i != null && f11 < 0.5f && f11 > -0.5f) {
                    j jVar = (j) qe.l.w(list);
                    j jVar2 = (j) qe.l.C(list);
                    int i12 = this.f3424g;
                    int i13 = this.f3423f;
                    if (i < 0) {
                        if (Math.min((jVar.f3365l + i11) - i13, (jVar2.f3365l + i11) - i12) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(i13 - jVar.f3365l, i12 - jVar2.f3365l) <= i) {
                        return null;
                    }
                    int size = list.size();
                    boolean z3 = false;
                    for (int i14 = 0; i14 < size; i14++) {
                        ((j) list.get(i14)).a(i);
                    }
                    List list2 = this.f3432p;
                    int size2 = list2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        ((j) list2.get(i15)).a(i);
                    }
                    List list3 = this.f3433q;
                    int size3 = list3.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        ((j) list3.get(i16)).a(i);
                    }
                    if (this.f3428l || i > 0) {
                        z3 = true;
                    }
                    return new x(this.f3419a, this.f3420b, this.f3421c, this.f3422d, this.e, this.f3423f, this.f3424g, this.f3425h, this.i, f11, i10, z3, this.f3429m, this.f3430n, this.f3431o, this.f3432p, this.f3433q, this.f3434r);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long e() {
        q0 q0Var = this.f3430n;
        return (q0Var.getWidth() << 32) | (q0Var.getHeight() & 4294967295L);
    }

    @Override // z1.q0
    public final int getHeight() {
        return this.f3430n.getHeight();
    }

    @Override // z1.q0
    public final int getWidth() {
        return this.f3430n.getWidth();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ x(int r20, int r21, int r22, int r23, int r24, m r25, z1.q0 r26, pf.z r27) {
        /*
            r19 = this;
            r12 = 0
            r15 = 0
            qe.s r1 = qe.s.f24023u
            z0 r5 = z0.f25598v
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = r1
            r17 = r1
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r6 = r23
            r7 = r24
            r13 = r25
            r14 = r26
            r18 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.x.<init>(int, int, int, int, int, m, z1.q0, pf.z):void");
    }
}
