package h8;
import d.a;

import a0.f0;
import android.graphics.DashPathEffect;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import k1.l0;
import kotlin.jvm.internal.y;
import pe.z;
import r0.a1;
import z1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17967u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f17968v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17969w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17970x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17971y;

    public /* synthetic */ n(float f10, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f17968v = f10;
        this.f17969w = a1Var;
        this.f17970x = a1Var2;
        this.f17971y = a1Var3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        int i10 = this.f17967u;
        z zVar = z.f22715a;
        Object obj2 = this.f17971y;
        Object obj3 = this.f17970x;
        Object obj4 = this.f17969w;
        float f10 = this.f17968v;
        switch (i10) {
            case 0:
                y yVar = (y) obj4;
                df.p pVar = (df.p) obj3;
                f0 f0Var = (f0) obj2;
                y2.l lVar = (y2.l) obj;
                long j10 = lVar.f30813a;
                int i11 = (int) (j10 >> 32);
                if (i11 != 0 && (i = (int) (j10 & 4294967295L)) != 0) {
                    k1.f g8 = l0.g(i11, i, 0, 24);
                    k1.a a10 = l0.a(g8);
                    pVar.invoke(a10, lVar);
                    a(a10, lVar.f30813a, f10, f0Var);
                    yVar.f19787u = g8;
                }
                return zVar;
            default:
                a1 a1Var = (a1) obj3;
                a1 a1Var2 = (a1) obj2;
                m1.d dVar = (m1.d) obj;
                dVar.getClass();
                j1.b bVar = (j1.b) ((a1) obj4).getValue();
                if (bVar != null) {
                    long j11 = bVar.f18762a;
                    j1.b bVar2 = (j1.b) a1Var.getValue();
                    if (bVar2 != null) {
                        long j12 = bVar2.f18762a;
                        x xVar = (x) a1Var2.getValue();
                        if (xVar != null) {
                            long f11 = xVar.f(j11);
                            long f12 = xVar.f(j12);
                            int i12 = (int) (f11 >> 32);
                            int i13 = (int) (f12 >> 32);
                            float min = Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
                            int i14 = (int) (f11 & 4294967295L);
                            int i15 = (int) (f12 & 4294967295L);
                            float min2 = Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
                            float max = Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)) - min;
                            float max2 = Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)) - min2;
                            m1.d.t(dVar, l0.c(337270476), (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min2) & 4294967295L), (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L), 0.0f, null, 120);
                            m1.d.t(dVar, l0.d(3860485836L), (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min2) & 4294967295L), (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L), 0.0f, new m1.h(f10 * 1.5f, 0.0f, 0, 0, new k1.i(new DashPathEffect(new float[]{12.0f, 8.0f}, 0.0f)), 14), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                        }
                    }
                }
                return zVar;
        }
    }

    public /* synthetic */ n(y yVar, df.p pVar, float f10, f0 f0Var) {
        this.f17969w = yVar;
        this.f17970x = pVar;
        this.f17968v = f10;
        this.f17971y = f0Var;
    }
}
