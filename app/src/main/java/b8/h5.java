package b8;
import j1.b;
import m5.d;
import r0.a1;
import r0.e1;
import t.k2;
import v1.w;
import y2.l;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class h5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f2153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf.z f2154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2156d;
    public final /* synthetic */ df.l e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f2157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f2158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f2159h;
    public final /* synthetic */ df.a i;

    public h5(e1 e1Var, pf.z zVar, a1 a1Var, boolean z3, df.l lVar, a1 a1Var2, a1 a1Var3, a1 a1Var4, df.a aVar) {
        this.f2153a = e1Var;
        this.f2154b = zVar;
        this.f2155c = a1Var;
        this.f2156d = z3;
        this.e = lVar;
        this.f2157f = a1Var2;
        this.f2158g = a1Var3;
        this.f2159h = a1Var4;
        this.i = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.f5] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final df.l lVar = this.e;
        final pf.z zVar = this.f2154b;
        final a1 a1Var = this.f2155c;
        final a1 a1Var2 = this.f2157f;
        final a1 a1Var3 = this.f2158g;
        final a1 a1Var4 = this.f2159h;
        final e1 e1Var = this.f2153a;
        final boolean z3 = this.f2156d;
        df.l r02 = new df.l() { // from class: b8.f5
            @Override // df.l
            public final Object invoke(Object obj) {
                b bVar = (b) obj;
                int i = m5.f2418b;
                e1 e1Var2 = e1Var;
                float h3 = e1Var2.h();
                pf.z zVar2 = zVar;
                a1 a1Var5 = a1Var;
                boolean z9 = z3;
                df.l lVar2 = lVar;
                a1 a1Var6 = a1Var2;
                if (h3 > 1.01f) {
                    d(zVar2, e1Var2, a1Var5, z9, lVar2, a1Var6, 1.0f, 0L);
                } else {
                    float f10 = ((int) (((l) r0.getValue()).f30813a >> 32)) / 2.0f;
                    float f11 = ((int) (((l) r0.getValue()).f30813a & 4294967295L)) / 2.0f;
                    d(zVar2, e1Var2, a1Var5, z9, lVar2, a1Var6, 2.5f, m5.f(a1Var4, a1Var3, b.i(b.g(bVar.f18762a, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), -1.5f), 2.5f));
                }
                return pe.z.f22715a;
            }
        };
        final df.a aVar = this.i;
        Object e = k2.e(wVar, r02, null, null, new df.l() { // from class: b8.g5
            @Override // df.l
            public final Object invoke(Object obj) {
                int i = m5.f2418b;
                e1 e1Var2 = e1Var;
                if (e1Var2.h() > 1.01f) {
                    d(zVar, e1Var2, a1Var, z3, lVar, a1Var2, 1.0f, 0L);
                } else {
                    df.a.this.invoke();
                }
                return pe.z.f22715a;
            }
        }, cVar, 6);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}