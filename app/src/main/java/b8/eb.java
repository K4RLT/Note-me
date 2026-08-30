package b8;
import b1.v;
import j1.b;
import kb.d;
import r0.m;
import r0.y;
import v1.h0;
import v1.t;
import v1.w;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class eb implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2047u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f2048v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f2049w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2050x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pe.d f2051y;

    public /* synthetic */ eb(v vVar, float f10, float f11, w7.c1 c1Var) {
        this.f2050x = vVar;
        this.f2048v = f10;
        this.f2049w = f11;
        this.f2051y = c1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2047u) {
            case 0:
                ((Integer) obj2).getClass();
                d((File) this.f2050x, this.f2048v, this.f2049w, (df.a) this.f2051y, (m) obj, y.L(433));
                break;
            case 1:
                v vVar = (v) this.f2050x;
                w7.c1 c1Var = (w7.c1) this.f2051y;
                b bVar = (b) obj2;
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.f18762a >> 32)) / this.f2048v;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f18762a & 4294967295L)) / this.f2049w;
                vVar.add(new b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                c1Var.invoke(bVar);
                break;
            default:
                w wVar = (w) this.f2050x;
                df.l lVar = (df.l) this.f2051y;
                t tVar = (t) obj;
                tVar.getClass();
                tVar.a();
                float d2 = wa.b9.d(Float.intBitsToFloat((int) (tVar.f27343c >> 32)) / ((int) (((h0) wVar).S >> 32)), 0.0f, 1.0f);
                float f10 = this.f2049w;
                float f11 = this.f2048v;
                lVar.invoke(Float.valueOf(((f10 - f11) * d2) + f11));
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ eb(File file, float f10, float f11, df.a aVar, int i) {
        this.f2050x = file;
        this.f2048v = f10;
        this.f2049w = f11;
        this.f2051y = aVar;
    }

    public /* synthetic */ eb(w wVar, df.l lVar, float f10, float f11) {
        this.f2050x = wVar;
        this.f2051y = lVar;
        this.f2048v = f10;
        this.f2049w = f11;
    }
}
