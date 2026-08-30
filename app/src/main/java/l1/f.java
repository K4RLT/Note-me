package l1;
import j.c;
import j.d;
import j.f;
import j.g;
import r.e;
import r.h;

import k1.l0;

/* loaded from: classes.dex */
public final class f extends g {
    public final q e;

    /* renamed from: f, reason: collision with root package name */
    public final q f19836f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f19837g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] g8;
        this.e = qVar;
        this.f19836f = qVar2;
        float[] fArr = a.f19804b.f19805a;
        s sVar = qVar.f19860d;
        float[] fArr2 = qVar.i;
        s sVar2 = qVar2.f19860d;
        float[] fArr3 = qVar2.f19864j;
        if (d(sVar, sVar2)) {
            g8 = g(fArr3, fArr2);
        } else {
            float[] a10 = sVar.a();
            float[] a11 = sVar2.a();
            s sVar3 = j.f19844b;
            g8 = g(d(sVar2, sVar3) ? fArr3 : j.f(g(c(fArr, a11, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.i)), d(sVar, sVar3) ? fArr2 : g(c(fArr, a10, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f19837g = g8;
    }

    @Override // l1.g
    public final long a(long j10) {
        float h3 = k1.h(j10);
        float g8 = k1.g(j10);
        float e = k1.e(j10);
        float d2 = k1.d(j10);
        m mVar = this.e.f19870p;
        float invoke = (float) mVar.invoke(h3);
        float invoke2 = (float) mVar.invoke(g8);
        float invoke3 = (float) mVar.invoke(e);
        float[] fArr = this.f19837g;
        float f10 = (fArr[6] * invoke3) + (fArr[3] * invoke2) + (fArr[0] * invoke);
        float f11 = (fArr[7] * invoke3) + (fArr[4] * invoke2) + (fArr[1] * invoke);
        float f12 = (fArr[8] * invoke3) + (fArr[5] * invoke2) + (fArr[2] * invoke);
        q qVar = this.f19836f;
        float invoke4 = (float) qVar.f19867m.invoke(f10);
        m mVar2 = qVar.f19867m;
        return l0.b(invoke4, (float) mVar2.invoke(f11), (float) mVar2.invoke(f12), d2, qVar);
    }
}
