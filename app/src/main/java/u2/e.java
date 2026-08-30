package u2;
import j.b;

import a0.f0;
import android.graphics.Paint;
import android.text.TextPaint;
import k1.l0;
import k1.n;
import k1.o0;
import k1.r;
import pe.u;
import r0.g0;
import x2.l;

/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public f0 f25832a;

    /* renamed from: b, reason: collision with root package name */
    public l f25833b;

    /* renamed from: c, reason: collision with root package name */
    public int f25834c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f25835d;
    public r e;

    /* renamed from: f, reason: collision with root package name */
    public n f25836f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f25837g;

    /* renamed from: h, reason: collision with root package name */
    public j1.e f25838h;
    public m1.e i;

    public final f0 a() {
        f0 f0Var = this.f25832a;
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this);
        this.f25832a = f0Var2;
        return f0Var2;
    }

    public final void b(int i) {
        if (i == this.f25834c) {
            return;
        }
        a().G(i);
        this.f25834c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r1 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(k1.n r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f25837g = r0
            r5.f25836f = r0
            r5.f25838h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof k1.r0
            if (r1 == 0) goto L1d
            k1.r0 r6 = (k1.r0) r6
            long r6 = r6.f19524a
            long r6 = ya.kd.a(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof k1.n0
            if (r1 == 0) goto L72
            k1.n r1 = r5.f25836f
            boolean r1 = kotlin.jvm.internal.l.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            j1.e r1 = r5.f25838h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f18774a
            boolean r1 = j1.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.f25836f = r6
            j1.e r1 = new j1.e
            r1.<init>(r7)
            r5.f25838h = r1
            u2.d r1 = new u2.d
            r2 = 0
            r1.<init>(r6, r7, r2)
            r0.g0 r6 = r0.y.r(r1)
            r5.f25837g = r6
        L59:
            a0.f0 r6 = r5.a()
            r0.g0 r7 = r5.f25837g
            if (r7 == 0) goto L68
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L69
        L68:
            r7 = r0
        L69:
            r6.L(r7)
            r5.e = r0
            u2.b(r5, r9)
            return
        L72:
            l4.a.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.e.c(k1.n, long, float):void");
    }

    public final void d(long j10) {
        boolean a10;
        r rVar = this.e;
        boolean z3 = false;
        if (rVar == null) {
            a10 = false;
        } else {
            a10 = u.a(rVar.f19523a, j10);
        }
        if (!a10) {
            if (j10 != 16) {
                z3 = true;
            }
            if (z3) {
                this.e = new r(j10);
                setColor(l0.F(j10));
                this.f25837g = null;
                this.f25836f = null;
                this.f25838h = null;
                setShader(null);
            }
        }
    }

    public final void e(m1.e eVar) {
        if (eVar != null && !kotlin.jvm.internal.l.a(this.i, eVar)) {
            this.i = eVar;
            if (eVar.equals(m1.g.f20429a)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (eVar instanceof m1.h) {
                a().P(1);
                m1.h hVar = (m1.h) eVar;
                a().O(hVar.f20430a);
                f0 a10 = a();
                ((Paint) a10.f48c).setStrokeMiter(hVar.f20431b);
                a().N(hVar.f20433d);
                a().M(hVar.f20432c);
                a().K(hVar.e);
                return;
            }
            l4.a.o();
        }
    }

    public final void f(o0 o0Var) {
        if (o0Var != null && !kotlin.jvm.internal.l.a(this.f25835d, o0Var)) {
            this.f25835d = o0Var;
            if (o0Var.equals(o0.f19508d)) {
                clearShadowLayer();
                return;
            }
            o0 o0Var2 = this.f25835d;
            float f10 = o0Var2.f19511c;
            if (f10 == 0.0f) {
                f10 = Float.MIN_VALUE;
            }
            setShadowLayer(f10, Float.intBitsToFloat((int) (o0Var2.f19510b >> 32)), Float.intBitsToFloat((int) (this.f25835d.f19510b & 4294967295L)), l0.F(this.f25835d.f19509a));
        }
    }

    public final void g(l lVar) {
        boolean z3;
        if (lVar != null && !kotlin.jvm.internal.l.a(this.f25833b, lVar)) {
            this.f25833b = lVar;
            int i = lVar.f30064a;
            boolean z9 = false;
            if ((i | 1) == i) {
                z3 = true;
            } else {
                z3 = false;
            }
            setUnderlineText(z3);
            int i10 = this.f25833b.f30064a;
            if ((i10 | 2) == i10) {
                z9 = true;
            }
            setStrikeThruText(z9);
        }
    }
}
