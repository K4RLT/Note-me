package h8;
import f.b;

import a0.f0;
import b8.q6;
import eb.x;
import k1.l0;
import k1.r;
import pe.u;
import pf.z;
import r0.e1;
import r0.f1;
import r0.i1;
import r0.y;
import sf.e0;
import sf.n0;
import wa.q7;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final z f17923a;

    /* renamed from: b, reason: collision with root package name */
    public long f17924b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f17925c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f17926d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f17927f;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f17928g;

    /* renamed from: h, reason: collision with root package name */
    public final e1 f17929h;
    public final e1 i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f17930j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f17931k;

    /* renamed from: l, reason: collision with root package name */
    public final float f17932l;

    /* renamed from: m, reason: collision with root package name */
    public final f0 f17933m;

    /* renamed from: n, reason: collision with root package name */
    public final i1 f17934n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17935o;

    /* renamed from: p, reason: collision with root package name */
    public final f1 f17936p;

    /* renamed from: q, reason: collision with root package name */
    public final n0 f17937q;

    /* renamed from: r, reason: collision with root package name */
    public q6 f17938r;

    public f(z zVar) {
        this.f17923a = zVar;
        i1 B = y.B(new j1.b(0L));
        this.f17925c = B;
        this.f17926d = B;
        long j10 = r.f19520k;
        i1 B2 = y.B(new r(j10));
        this.e = B2;
        this.f17927f = B2;
        this.f17928g = y.B(new r(j10));
        this.f17929h = new e1(1.0f);
        this.i = new e1(1.0f);
        this.f17930j = e0.b(null);
        this.f17931k = y.B(null);
        this.f17932l = 12;
        f0 i = l0.i();
        i.H(r.f19515d);
        this.f17933m = i;
        this.f17934n = y.B(Boolean.TRUE);
        this.f17936p = new f1(0);
        this.f17937q = e0.b(null);
    }

    public final void a(boolean z3) {
        long j10 = ((r) this.e.getValue()).f19523a;
        float f10 = 255;
        e eVar = new e(j10, w7.i1.d(q7.a((int) (r.d(j10) * f10)), q7.a((int) (r.h(j10) * f10)), q7.a((int) (r.g(j10) * f10)), q7.a((int) (r.e(j10) * f10))), z3);
        n0 n0Var = this.f17937q;
        n0Var.getClass();
        n0Var.k(null, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r10) {
        /*
            r9 = this;
            pe.o r0 = wa.q7.b(r10)
            java.lang.Object r1 = r0.f22703u
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r2 = r0.f22704v
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Object r0 = r0.f22705w
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r10 = k1.r.d(r10)
            long r3 = r9.f17924b
            long r3 = wa.u8.b(r3)
            r11 = 1016003125(0x3c8efa35, float:0.017453292)
            float r1 = r1 * r11
            float r11 = -r1
            float r1 = j1.b.e(r3)
            float r5 = j1.b.f(r3)
            float r1 = java.lang.Math.min(r1, r5)
            float r1 = r1 * r2
            double r5 = (double) r11
            double r7 = java.lang.Math.cos(r5)
            float r11 = (float) r7
            float r11 = r11 * r1
            double r5 = java.lang.Math.sin(r5)
            float r2 = (float) r5
            float r2 = r2 * r1
            long r1 = wa.r8.a(r11, r2)
            long r1 = j1.b.h(r1, r3)
            boolean r11 = r9.c(r1)
            r0.i1 r1 = r9.f17934n
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L91
            r0.e1 r1 = r9.f17929h
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L71
            goto L91
        L71:
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            r1.setValue(r11)
            r0.i1 r11 = r9.f17927f
            java.lang.Object r11 = r11.getValue()
            k1.r r11 = (k1.r) r11
            long r3 = r11.f19523a
            long r10 = k1.r.c(r3, r10)
            k1.r r1 = new k1.r
            r1.<init>(r10)
            r0.i1 r10 = r9.e
            r10.setValue(r1)
            goto L93
        L91:
            if (r11 == 0) goto L95
        L93:
            r10 = 1
            goto L96
        L95:
            r10 = r2
        L96:
            boolean r11 = r9.d(r0)
            if (r11 != 0) goto La0
            if (r10 == 0) goto L9f
            goto La0
        L9f:
            return
        La0:
            r9.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.b(long):void");
    }

    public final boolean c(long j10) {
        q6 q6Var = this.f17938r;
        if (((Boolean) this.f17934n.getValue()).booleanValue() && q6Var != null) {
            pe.j jVar = (pe.j) q6Var.invoke(new j1.b(j10));
            long j11 = ((r) jVar.f22693u).f19523a;
            this.f17925c.setValue(new j1.b(((j1.b) jVar.f22694v).f18762a));
            i1 i1Var = this.f17928g;
            if (!u.a(((r) i1Var.getValue()).f19523a, j11)) {
                pe.o b10 = q7.b(j11);
                float floatValue = ((Number) b10.f22703u).floatValue();
                float floatValue2 = ((Number) b10.f22704v).floatValue();
                float floatValue3 = ((Number) b10.f22705w).floatValue();
                if (this.f17935o) {
                    floatValue3 = ((Number) this.i.getValue()).floatValue();
                }
                int i = r.f19522m;
                this.e.setValue(new r(x.h(floatValue, floatValue2, floatValue3, 1.0f, 16)));
                i1Var.setValue(new r(j11));
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(float f10) {
        if (((Boolean) this.f17934n.getValue()).booleanValue()) {
            e1 e1Var = this.i;
            if (((Number) e1Var.getValue()).floatValue() != f10) {
                e1Var.setValue(Float.valueOf(f10));
                pe.o b10 = q7.b(((r) this.f17928g.getValue()).f19523a);
                float floatValue = ((Number) b10.f22703u).floatValue();
                float floatValue2 = ((Number) b10.f22704v).floatValue();
                int i = r.f19522m;
                this.e.setValue(new r(x.h(floatValue, floatValue2, f10, ((Number) this.f17929h.getValue()).floatValue(), 16)));
                return true;
            }
            return false;
        }
        return false;
    }
}
