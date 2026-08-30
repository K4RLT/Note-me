package w7;
import j1.b;
import k1.r;
import r0.a1;
import r0.e1;
import r0.n2;
import v1.t;
import v1.w;

import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class t6 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f29138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f29139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df.l f29140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.p f29141d;
    public final /* synthetic */ a1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1 f29142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f29143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d5 f29144h;
    public final /* synthetic */ a1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n2 f29145j;

    public t6(a1 a1Var, float f10, df.l lVar, df.p pVar, a1 a1Var2, e1 e1Var, e1 e1Var2, d5 d5Var, a1 a1Var3, a1 a1Var4) {
        this.f29138a = a1Var;
        this.f29139b = f10;
        this.f29140c = lVar;
        this.f29141d = pVar;
        this.e = a1Var2;
        this.f29142f = e1Var;
        this.f29143g = e1Var2;
        this.f29144h = d5Var;
        this.i = a1Var3;
        this.f29145j = a1Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        a1 a1Var = this.f29138a;
        b8.a0 a0Var = new b8.a0(a1Var, 22);
        float f10 = this.f29139b;
        final df.l lVar = this.f29140c;
        df.p pVar = this.f29141d;
        final a1 a1Var2 = this.e;
        final e1 e1Var = this.f29142f;
        final e1 e1Var2 = this.f29143g;
        r6 r6Var = new r6(f10, lVar, pVar, a1Var2, e1Var, a1Var, e1Var2, 0);
        n6 n6Var = new n6(lVar, a1Var, a1Var2, 1);
        final d5 d5Var = this.f29144h;
        final a1 a1Var3 = this.i;
        final n2 n2Var = this.f29145j;
        Object h3 = t.f0.h(wVar, a0Var, r6Var, n6Var, new df.p() { // from class: w7.s6
            @Override // df.p
            public final Object invoke(Object obj, Object obj2) {
                t tVar = (t) obj;
                tVar.getClass();
                tVar.a();
                a1Var2.setValue(Boolean.TRUE);
                a1 a1Var4 = a1Var3;
                float intBitsToFloat = Float.intBitsToFloat((int) (((b) a1Var4.getValue()).f18762a & 4294967295L));
                long j10 = tVar.f27343c;
                e1Var.i(Float.intBitsToFloat((int) (j10 & 4294967295L)) + intBitsToFloat);
                e1Var2.i(Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (((b) a1Var4.getValue()).f18762a >> 32)));
                df.l.this.invoke(new q4(null, r.f19520k, null, b.h(((b) a1Var4.getValue()).f18762a, j10), d5Var, (Bitmap) n2Var.getValue(), null, 192));
                return pe.z.f22715a;
            }
        }, cVar);
        if (h3 == ue.a.f27192u) {
            return h3;
        }
        return pe.z.f22715a;
    }
}
