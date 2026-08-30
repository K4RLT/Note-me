package b2;
import d0.b;
import j0.h;
import a0.k0;
import b2.a;
import b2.j0;
import c2.y1;
import k1.d0;
import r0.d;
import z1.a1;
import z1.c;
import z1.o;

import java.util.HashMap;
import java.util.Map;
import ya.td;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f1505a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1507c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1508d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public a f1509f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1511h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1506b = true;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1510g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public j0(a aVar, int i) {
        this.f1511h = i;
        this.f1505a = (a1) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [df.p, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a1, a] */
    public static final void a(j0 j0Var, o oVar, int i, k1 k1Var) {
        float intBitsToFloat;
        HashMap hashMap = j0Var.f1510g;
        float f10 = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
        while (true) {
            long j10 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (j0Var.f1511h) {
                    case 0:
                        u1 u1Var = k1Var.f1531e0;
                        if (u1Var != null) {
                            y1 y1Var = (y1) u1Var;
                            float[] b10 = y1Var.b();
                            if (!y1Var.M) {
                                j10 = d0.b(j10, b10);
                            }
                        }
                        j10 = td.a(j10, k1Var.V);
                        break;
                    default:
                        s0 f12 = k1Var.f1();
                        f12.getClass();
                        long j11 = f12.J;
                        j10 = b.h((Float.floatToRawIntBits((int) (j11 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32), j10);
                        break;
                }
                k1Var = k1Var.M;
                k1Var.getClass();
                if (k1Var.equals(j0Var.f1505a.g())) {
                    if (oVar instanceof o) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(oVar)) {
                        int intValue = ((Number) qe.a(oVar, hashMap)).intValue();
                        o oVar2 = c.f31780a;
                        round = ((Number) oVar.f31852a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(oVar, Integer.valueOf(round));
                    return;
                }
            } while (!j0Var.b(k1Var).containsKey(oVar));
            float c10 = j0Var.c(k1Var, oVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c10);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c10);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(k1 k1Var) {
        switch (this.f1511h) {
            case 0:
                return k1Var.P0().b();
            default:
                s0 f12 = k1Var.f1();
                f12.getClass();
                return f12.P0().b();
        }
    }

    public final int c(k1 k1Var, o oVar) {
        switch (this.f1511h) {
            case 0:
                return k1Var.K0(oVar);
            default:
                s0 f12 = k1Var.f1();
                f12.getClass();
                return f12.K0(oVar);
        }
    }

    public final boolean d() {
        if (!this.f1507c && !this.f1508d && !this.e) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        h();
        if (this.f1509f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a1, a] */
    public final void f() {
        this.f1506b = true;
        Object r02 = this.f1505a;
        a h3 = r02.h();
        if (h3 == null) {
            return;
        }
        if (this.f1507c) {
            h3.requestLayout();
        }
        if (this.f1508d) {
            r02.X();
        }
        if (this.e) {
            r02.requestLayout();
        }
        h3.b().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a1, a] */
    public final void g() {
        HashMap hashMap = this.f1510g;
        hashMap.clear();
        k0 k0Var = new k0(5, this);
        Object r22 = this.f1505a;
        r22.m(k0Var);
        hashMap.putAll(b(r22.g()));
        this.f1506b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [a1, a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            a1 r1 = r2.f1505a
            if (r0 == 0) goto L9
            goto L51
        L9:
            a r0 = r1.h()
            if (r0 != 0) goto L10
            goto L53
        L10:
            b2.j0 r0 = b()
            a r1 = r0.f1509f
            if (r1 == 0) goto L23
            b2.j0 r0 = r1.b()
            boolean r0 = d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            a r0 = r2.f1509f
            if (r0 == 0) goto L53
            b2.j0 r1 = b()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            a r1 = h()
            if (r1 == 0) goto L41
            b2.j0 r1 = r1.b()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            a r0 = h()
            if (r0 == 0) goto L50
            b2.j0 r0 = b()
            if (r0 == 0) goto L50
            a r1 = r0.f1509f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f1509f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.j0.h():void");
    }
}