package w7;
import j.i0;
import j1.b;
import j1.c;
import k1.h0;
import k1.h;
import k1.k;
import k1.l0;
import k1.m0;
import k1.r;
import m1.d;
import p.a;
import v1.t;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28186u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f28187v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28188w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28189x;

    public /* synthetic */ f(float f10, q.d dVar, q.d dVar2) {
        this.f28186u = 1;
        this.f28187v = f10;
        this.f28188w = dVar;
        this.f28189x = dVar2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.l
    public final Object invoke(Object obj) {
        i0 i0Var;
        long j10;
        switch (this.f28186u) {
            case 0:
                q.d dVar = (q.d) this.f28188w;
                q.d dVar2 = (q.d) this.f28189x;
                d dVar3 = (d) obj;
                dVar3.getClass();
                float floatValue = ((Number) dVar.e()).floatValue();
                h a10 = k.a();
                float intBitsToFloat = (Float.intBitsToFloat((int) (dVar3.e() >> 32)) / 2.0f) - floatValue;
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (dVar3.e() & 4294967295L)) / 2.0f) - floatValue;
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                float f10 = floatValue * 2.0f;
                c a11 = wa.s8.a(floatToRawIntBits, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
                if (a10.f19482b == null) {
                    a10.f19482b = new RectF();
                }
                RectF rectF = a10.f19482b;
                rectF.getClass();
                rectF.set(a11.f18763a, a11.f18764b, a11.f18765c, a11.f18766d);
                Path path = a10.f19481a;
                RectF rectF2 = a10.f19482b;
                rectF2.getClass();
                path.addOval(rectF2, k.b(h0.f19485u));
                i0 p02 = dVar3.p0();
                long r8 = p02.r();
                p02.j().l();
                try {
                    ((ic.c) p02.f18636v).d(a10, 0);
                    try {
                        i0Var = p02;
                        j10 = r8;
                        try {
                            d.t(dVar3, r.f19513b, 0L, 0L, 0.0f, null, 126);
                            a.v(i0Var, j10);
                            if (floatValue > 1.0f && floatValue < this.f28187v * 0.98f) {
                                long c10 = r.c(r.f19515d, 0.28f);
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar3.e() >> 32)) / 2.0f;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L)) / 2.0f;
                                d.D(dVar3, c10, floatValue, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), new h(dVar3.l0(2), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                            }
                            if (((Number) dVar2.e()).floatValue() > 0.0f) {
                                d.t(dVar3, r.c(r.f19515d, ((Number) dVar2.e()).floatValue()), 0L, 0L, 0.0f, null, 126);
                            }
                            return pe.z.f22715a;
                        } catch (Throwable th) {
                            th = th;
                            a.v(i0Var, j10);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j10 = r8;
                        i0Var = p02;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i0Var = p02;
                    j10 = r8;
                }
                break;
            case 1:
                q.d dVar4 = (q.d) this.f28188w;
                q.d dVar5 = (q.d) this.f28189x;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.m(l0.k(this.f28187v, 1.0f));
                m0Var.h(((Number) dVar4.e()).floatValue());
                m0Var.i(((Number) dVar4.e()).floatValue());
                m0Var.b(((Number) dVar5.e()).floatValue());
                return pe.z.f22715a;
            default:
                t tVar = (t) this.f28188w;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f28189x;
                t tVar2 = (t) obj;
                if (b.d(b.g(tVar2.f27343c, tVar.f27343c)) > this.f28187v) {
                    uVar.f19783u = true;
                }
                tVar2.a();
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ f(float f10, int i, Object obj, Object obj2) {
        this.f28186u = i;
        this.f28188w = obj;
        this.f28187v = f10;
        this.f28189x = obj2;
    }
}
