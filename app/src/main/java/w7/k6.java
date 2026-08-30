package w7;
import b.a;
import k1.a;
import k1.b;
import k1.p;
import m1.d;
import r0.a1;
import r0.n2;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final /* synthetic */ class k6 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28577u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d5 f28578v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f28579w;

    public /* synthetic */ k6(d5 d5Var, a1 a1Var, int i) {
        this.f28577u = i;
        this.f28578v = d5Var;
        this.f28579w = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f28577u) {
            case 0:
                dVar.getClass();
                d5 d5Var = this.f28578v;
                pe.j v2 = c5.v(d5Var);
                float floatValue = ((Number) v2.f22693u).floatValue();
                float floatValue2 = ((Number) v2.f22694v).floatValue();
                float min = Math.min(Float.intBitsToFloat((int) (dVar.e() >> 32)) / floatValue, Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) / floatValue2);
                p j10 = dVar.p0().j();
                b.a(j10).save();
                a aVar = (a) j10;
                aVar.f19463a.translate(Float.intBitsToFloat((int) (dVar.e() >> 32)) / 2.0f, Float.intBitsToFloat((int) (4294967295L & dVar.e())) / 2.0f);
                aVar.f19463a.scale(min, min);
                c5.e(aVar.f19463a, d5Var, null, floatValue, floatValue2, false, null, null, null, (Bitmap) this.f28579w.getValue());
                aVar.f19463a.restore();
                break;
            default:
                dVar.getClass();
                p j11 = dVar.p0().j();
                d5 d5Var2 = this.f28578v;
                pe.j v4 = c5.v(d5Var2);
                float floatValue3 = ((Number) v4.f22693u).floatValue();
                float floatValue4 = ((Number) v4.f22694v).floatValue();
                float min2 = Math.min(Float.intBitsToFloat((int) (dVar.e() >> 32)) / floatValue3, Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) / floatValue4);
                b.a(j11).save();
                a aVar2 = (a) j11;
                aVar2.f19463a.translate(Float.intBitsToFloat((int) (dVar.e() >> 32)) / 2.0f, Float.intBitsToFloat((int) (4294967295L & dVar.e())) / 2.0f);
                aVar2.f19463a.scale(min2, min2);
                c5.e(aVar2.f19463a, d5Var2, null, floatValue3, floatValue4, false, null, null, null, (Bitmap) this.f28579w.getValue());
                aVar2.f19463a.restore();
                break;
        }
        return pe.z.f22715a;
    }
}
