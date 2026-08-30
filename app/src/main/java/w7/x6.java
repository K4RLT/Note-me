package w7;
import j1.b;
import k1.f;
import k1.r;
import r0.a1;
import r0.e1;
import v1.t;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class x6 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f29443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f29444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.l f29445d;
    public final /* synthetic */ df.p e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f29446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f29447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1 f29448h;
    public final /* synthetic */ a1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f29449j;

    public x6(a1 a1Var, float f10, df.l lVar, df.p pVar, a1 a1Var2, e1 e1Var, e1 e1Var2, String str, a1 a1Var3) {
        this.f29442a = 2;
        this.f29443b = a1Var;
        this.f29444c = f10;
        this.f29445d = lVar;
        this.e = pVar;
        this.f29446f = a1Var2;
        this.f29447g = e1Var;
        this.f29448h = e1Var2;
        this.f29449j = str;
        this.i = a1Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f29442a) {
            case 0:
                a1 a1Var = this.f29443b;
                b8.a0 a0Var = new b8.a0(a1Var, 23);
                float f10 = this.f29444c;
                final df.l lVar = this.f29445d;
                df.p pVar = this.e;
                final a1 a1Var2 = this.f29446f;
                final e1 e1Var = this.f29447g;
                final e1 e1Var2 = this.f29448h;
                r6 r6Var = new r6(f10, lVar, pVar, a1Var2, e1Var, a1Var, e1Var2, 1);
                n6 n6Var = new n6(lVar, a1Var, a1Var2, 2);
                final a1 a1Var3 = (a1) this.f29449j;
                final int i = 0;
                final a1 a1Var4 = this.i;
                Object h3 = t.f0.h(wVar, a0Var, r6Var, n6Var, new df.p() { // from class: w7.w6
                    @Override // df.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i) {
                            case 0:
                                t tVar = (t) obj;
                                tVar.getClass();
                                tVar.a();
                                a1Var2.setValue(Boolean.TRUE);
                                a1 a1Var5 = a1Var4;
                                float intBitsToFloat = Float.intBitsToFloat((int) (((b) a1Var5.getValue()).f18762a >> 32));
                                long j10 = tVar.f27343c;
                                e1Var2.i(Float.intBitsToFloat((int) (j10 >> 32)) + intBitsToFloat);
                                e1Var.i(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (((b) a1Var5.getValue()).f18762a & 4294967295L)));
                                lVar.invoke(new q4((f) a1Var3.getValue(), r.f19520k, null, b.h(((b) a1Var5.getValue()).f18762a, j10), null, null, null, 240));
                                break;
                            default:
                                t tVar2 = (t) obj;
                                tVar2.getClass();
                                tVar2.a();
                                a1Var2.setValue(Boolean.TRUE);
                                a1 a1Var6 = a1Var4;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (((b) a1Var6.getValue()).f18762a >> 32));
                                long j11 = tVar2.f27343c;
                                e1Var2.i(Float.intBitsToFloat((int) (j11 >> 32)) + intBitsToFloat2);
                                e1Var.i(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (((b) a1Var6.getValue()).f18762a & 4294967295L)));
                                lVar.invoke(new q4((f) a1Var3.getValue(), r.f19520k, null, b.h(((b) a1Var6.getValue()).f18762a, j11), null, null, null, 112));
                                break;
                        }
                        return pe.z.f22715a;
                    }
                }, cVar);
                if (h3 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return h3;
            case 1:
                a1 a1Var5 = this.f29443b;
                z8 z8Var = new z8(a1Var5, 1);
                float f11 = this.f29444c;
                final df.l lVar2 = this.f29445d;
                df.p pVar2 = this.e;
                final a1 a1Var6 = this.f29446f;
                final e1 e1Var3 = this.f29447g;
                final e1 e1Var4 = this.f29448h;
                r6 r6Var2 = new r6(f11, lVar2, pVar2, a1Var6, e1Var3, a1Var5, e1Var4, 3);
                n6 n6Var2 = new n6(lVar2, a1Var5, a1Var6, 4);
                final a1 a1Var7 = (a1) this.f29449j;
                final int i10 = 1;
                final a1 a1Var8 = this.i;
                Object h10 = t.f0.h(wVar, z8Var, r6Var2, n6Var2, new df.p() { // from class: w7.w6
                    @Override // df.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i10) {
                            case 0:
                                t tVar = (t) obj;
                                tVar.getClass();
                                tVar.a();
                                a1Var6.setValue(Boolean.TRUE);
                                a1 a1Var52 = a1Var8;
                                float intBitsToFloat = Float.intBitsToFloat((int) (((b) a1Var52.getValue()).f18762a >> 32));
                                long j10 = tVar.f27343c;
                                e1Var4.i(Float.intBitsToFloat((int) (j10 >> 32)) + intBitsToFloat);
                                e1Var3.i(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (((b) a1Var52.getValue()).f18762a & 4294967295L)));
                                lVar2.invoke(new q4((f) a1Var7.getValue(), r.f19520k, null, b.h(((b) a1Var52.getValue()).f18762a, j10), null, null, null, 240));
                                break;
                            default:
                                t tVar2 = (t) obj;
                                tVar2.getClass();
                                tVar2.a();
                                a1Var6.setValue(Boolean.TRUE);
                                a1 a1Var62 = a1Var8;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (((b) a1Var62.getValue()).f18762a >> 32));
                                long j11 = tVar2.f27343c;
                                e1Var4.i(Float.intBitsToFloat((int) (j11 >> 32)) + intBitsToFloat2);
                                e1Var3.i(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (((b) a1Var62.getValue()).f18762a & 4294967295L)));
                                lVar2.invoke(new q4((f) a1Var7.getValue(), r.f19520k, null, b.h(((b) a1Var62.getValue()).f18762a, j11), null, null, null, 112));
                                break;
                        }
                        return pe.z.f22715a;
                    }
                }, cVar);
                if (h10 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return h10;
            default:
                a1 a1Var9 = this.f29443b;
                z8 z8Var2 = new z8(a1Var9, 0);
                float f12 = this.f29444c;
                df.l lVar3 = this.f29445d;
                df.p pVar3 = this.e;
                a1 a1Var10 = this.f29446f;
                e1 e1Var5 = this.f29447g;
                e1 e1Var6 = this.f29448h;
                Object h11 = t.f0.h(wVar, z8Var2, new r6(f12, lVar3, pVar3, a1Var10, e1Var5, a1Var9, e1Var6, 2), new n6(lVar3, a1Var9, a1Var10, 3), new a4(lVar3, (String) this.f29449j, a1Var10, this.i, e1Var6, e1Var5), cVar);
                if (h11 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return h11;
        }
    }

    public /* synthetic */ x6(a1 a1Var, float f10, df.l lVar, df.p pVar, a1 a1Var2, e1 e1Var, e1 e1Var2, a1 a1Var3, a1 a1Var4, int i) {
        this.f29442a = i;
        this.f29443b = a1Var;
        this.f29444c = f10;
        this.f29445d = lVar;
        this.e = pVar;
        this.f29446f = a1Var2;
        this.f29447g = e1Var;
        this.f29448h = e1Var2;
        this.i = a1Var3;
        this.f29449j = a1Var4;
    }
}
