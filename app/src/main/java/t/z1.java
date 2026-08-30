package t;
import b.a;
import x.o;
import z1.b;
import b2.l;
import p.c0;
import q.x;
import r.f;
import r.u0;
import t.u1;
import t.w1;
import t.z1;
import u1.d;
import u1.g;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public s1 f25600a;

    /* renamed from: b, reason: collision with root package name */
    public f f25601b;

    /* renamed from: c, reason: collision with root package name */
    public n0 f25602c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f25603d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public d f25604f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f25605g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25606h;
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public f1 f25607j = androidx.compose.foundation.gestures.a.f474a;

    /* renamed from: k, reason: collision with root package name */
    public final x1 f25608k = new x1(this);

    /* renamed from: l, reason: collision with root package name */
    public final c0 f25609l = new c0(10, this);

    public z1(s1 s1Var, f fVar, n0 n0Var, z0 z0Var, boolean z3, d dVar, h0 h0Var) {
        this.f25600a = s1Var;
        this.f25601b = fVar;
        this.f25602c = n0Var;
        this.f25603d = z0Var;
        this.e = z3;
        this.f25604f = dVar;
        this.f25605g = h0Var;
    }

    public static final long a(z1 z1Var, f1 f1Var, long j10, int i) {
        g gVar;
        long j11;
        int i10;
        g gVar2 = z1Var.f25604f.f25809a;
        g gVar3 = null;
        if (gVar2 != null && gVar2.H) {
            gVar = (g) l.i(gVar2);
        } else {
            gVar = null;
        }
        long j12 = 0;
        if (gVar != null) {
            j11 = gVar.U(i, j10);
        } else {
            j11 = 0;
        }
        long g8 = b.g(j10, j11);
        if (z1Var.f25603d == z0.f25598v) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        long e = z1Var.e(z1Var.h(f1Var.a(z1Var.g(z1Var.e(b.a(g8, i10, 0.0f))))));
        long g10 = b.g(g8, e);
        g gVar4 = z1Var.f25604f.f25809a;
        if (gVar4 != null && gVar4.H) {
            gVar3 = (g) l.i(gVar4);
        }
        g gVar5 = gVar3;
        if (gVar5 != null) {
            j12 = gVar5.z(e, i, g10);
        }
        return b.h(b.h(j11, e), j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, ve.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof u1
            if (r0 == 0) goto L13
            r0 = r12
            u1 r0 = (u1) r0
            int r1 = r0.f25535y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25535y = r1
            goto L18
        L13:
            u1 r0 = new u1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f25533w
            int r1 = r0.f25535y
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            kotlin.jvm.internal.x r10 = r0.f25532v
            t.z1 r11 = r0.f25531u
            pe.a.e(r12)
            r4 = r9
            goto L58
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r10)
            r10 = 0
            return r10
        L31:
            pe.a.e(r12)
            kotlin.jvm.internal.x r5 = new kotlin.jvm.internal.x
            r5.<init>()
            r5.f19786u = r10
            r9.f25606h = r2
            w1 r3 = new w1
            r8 = 0
            r4 = r9
            r6 = r10
            r3.<init>(r4, r5, r6, r8)
            r0.f25531u = r4
            r0.f25532v = r5
            r0.f25535y = r2
            u0 r10 = u0.f24148u
            java.lang.Object r10 = r9.f(r10, r3, r0)
            ue.a r11 = ue.a.f27192u
            if (r10 != r11) goto L56
            return r11
        L56:
            r11 = r4
            r10 = r5
        L58:
            r12 = 0
            r11.f25606h = r12
            long r10 = r10.f19786u
            y2.q r12 = new y2.q
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z1.b(long, ve.c):java.lang.Object");
    }

    public final Object c(long j10, boolean z3, ve.i iVar) {
        int i;
        pe.z zVar = pe.z.f22715a;
        if (z3) {
            return zVar;
        }
        if (this.f25603d == z0.f25598v) {
            i = 1;
        } else {
            i = 2;
        }
        long a10 = y2.a(j10, 0.0f, 0.0f, i);
        y1 y1Var = new y1(this, null);
        f fVar = this.f25601b;
        ue.a aVar = ue.a.f27192u;
        if (fVar != null && (this.f25600a.c() || this.f25600a.b())) {
            Object b10 = fVar.b(a10, y1Var, iVar);
            if (b10 == aVar) {
                return b10;
            }
        } else {
            y1 y1Var2 = new y1(y1Var.f25590x, iVar);
            y1Var2.f25589w = a10;
            Object invokeSuspend = y1Var2.invokeSuspend(zVar);
            if (invokeSuspend == aVar) {
                return invokeSuspend;
            }
        }
        return zVar;
    }

    public final float d(float f10) {
        if (this.e) {
            return f10 * (-1);
        }
        return f10;
    }

    public final long e(long j10) {
        if (this.e) {
            return b.i(j10, -1.0f);
        }
        return j10;
    }

    public final Object f(u0 u0Var, df.p pVar, ve.c cVar) {
        Object e = this.f25600a.e(u0Var, new m1(this, pVar, (te.c) null), cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }

    public final float g(long j10) {
        long j11;
        if (this.f25603d == z0.f25598v) {
            j11 = j10 >> 32;
        } else {
            j11 = j10 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j11);
    }

    public final long h(float f10) {
        long floatToRawIntBits;
        long j10;
        if (f10 == 0.0f) {
            return 0L;
        }
        if (this.f25603d == z0.f25598v) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f10);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j10 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f10);
            j10 = floatToRawIntBits3 << 32;
        }
        return j10 | (floatToRawIntBits & 4294967295L);
    }
}
