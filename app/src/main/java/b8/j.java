package b8;
import b2.l0;
import j.i0;
import k1.f;
import k1.o;
import k1.r;
import m1.b;
import m1.d;
import p.a;

import android.graphics.BitmapShader;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2231u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f2232v;

    public /* synthetic */ j(f fVar, int i) {
        this.f2231u = i;
        this.f2232v = fVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.l
    public final Object invoke(Object obj) {
        long j10;
        switch (this.f2231u) {
            case 0:
                d dVar = (d) obj;
                dVar.getClass();
                d.F(dVar, this.f2232v, 0L, 0.0f, null, 62);
                return pe.z.f22715a;
            default:
                f fVar = this.f2232v;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                l0Var.b();
                b bVar = l0Var.f1533u;
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) % 256.0f;
                i0 i0Var = bVar.f20424v;
                long r8 = i0Var.r();
                i0Var.j().l();
                try {
                    ((ic.c) i0Var.f18636v).D(0.0f, intBitsToFloat);
                    o oVar = new o(new BitmapShader(l0.m(fVar), l0.E(1), l0.E(1)));
                    long floatToRawIntBits = (Float.floatToRawIntBits(-intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.e() >> 32));
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) + intBitsToFloat;
                    j10 = r8;
                    try {
                        d.q(l0Var, oVar, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), 0.0f, null, 0, 120);
                        a.v(i0Var, j10);
                        long c10 = r.c(r.f19515d, 0.16f);
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (bVar.e() >> 32));
                        float l0 = l0Var.l0(1);
                        d.t(l0Var, c10, 0L, (Float.floatToRawIntBits(l0) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32), 0.0f, null, 122);
                        return pe.z.f22715a;
                    } catch (Throwable th) {
                        th = th;
                        a.v(i0Var, j10);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j10 = r8;
                }
        }
    }
}
