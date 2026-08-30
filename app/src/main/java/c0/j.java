package c0;
import w.a;

import java.util.List;
import t.z0;
import z1.a1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3356a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3357b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3358c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3359d;
    public final d1.d e;

    /* renamed from: f, reason: collision with root package name */
    public final d1.i f3360f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.m f3361g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3362h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3363j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f3364k;

    /* renamed from: l, reason: collision with root package name */
    public int f3365l;

    /* renamed from: m, reason: collision with root package name */
    public int f3366m;

    public j(int i, int i10, List list, long j10, Object obj, z0 z0Var, d1.d dVar, d1.i iVar, y2.m mVar, boolean z3) {
        boolean z9;
        int i11;
        this.f3356a = i;
        this.f3357b = list;
        this.f3358c = j10;
        this.f3359d = obj;
        this.e = dVar;
        this.f3360f = iVar;
        this.f3361g = mVar;
        this.f3362h = z3;
        if (z0Var == z0.f25597u) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.i = z9;
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a1 a1Var = (a1) list.get(i13);
            if (!this.i) {
                i11 = a1Var.f31770v;
            } else {
                i11 = a1Var.f31769u;
            }
            i12 = Math.max(i12, i11);
        }
        this.f3363j = i12;
        this.f3364k = new int[this.f3357b.size() * 2];
        this.f3366m = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.f3365l += i;
        int[] iArr = this.f3364k;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolean z3 = this.i;
            if ((z3 && i10 % 2 == 1) || (!z3 && i10 % 2 == 0)) {
                iArr[i10] = iArr[i10] + i;
            }
        }
    }

    public final void b(int i, int i10, int i11) {
        int i12;
        int i13;
        this.f3365l = i;
        boolean z3 = this.i;
        if (z3) {
            i12 = i11;
        } else {
            i12 = i10;
        }
        this.f3366m = i12;
        List list = this.f3357b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            a1 a1Var = (a1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f3364k;
            if (z3) {
                d1.d dVar = this.e;
                if (dVar != null) {
                    iArr[i15] = dVar.a(a1Var.f31769u, i10, this.f3361g);
                    iArr[i15 + 1] = i;
                    i13 = a1Var.f31770v;
                } else {
                    a.b("null horizontalAlignment");
                    l4.a.p();
                    return;
                }
            } else {
                iArr[i15] = i;
                int i16 = i15 + 1;
                d1.i iVar = this.f3360f;
                if (iVar != null) {
                    iArr[i16] = iVar.a(a1Var.f31770v, i11);
                    i13 = a1Var.f31769u;
                } else {
                    a.b("null verticalAlignment");
                    l4.a.p();
                    return;
                }
            }
            i += i13;
        }
    }
}
