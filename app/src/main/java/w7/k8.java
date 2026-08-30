package w7;
import b.a;
import r.c;
import k1.a;
import k1.b;
import k1.l0;
import k1.p;
import k1.r;
import m1.d;
import y8.c;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class k8 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28584u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28585v;

    public /* synthetic */ k8(p8 p8Var) {
        this.f28585v = p8Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f28584u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f28585v;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                dVar.getClass();
                p j10 = dVar.p0().j();
                b.a(j10).save();
                a aVar = (a) j10;
                aVar.f19463a.translate(Float.intBitsToFloat((int) (dVar.e() >> 32)) / 2.0f, Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) / 2.0f);
                List list = y8.f29503a;
                c(aVar.f19463a, ((p8) obj2).f28914b, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)), Integer.valueOf(l0.F(r.c(r.f19515d, 0.85f))), null, 0.0f, 0.0f);
                aVar.f19463a.restore();
                return zVar;
            default:
                ((yf.c) obj2).j(null);
                return zVar;
        }
    }

    public /* synthetic */ k8(yf.c cVar, yf.b bVar) {
        this.f28585v = cVar;
    }
}
