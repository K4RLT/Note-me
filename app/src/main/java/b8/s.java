package b8;
import t1.e;
import a0.g;
import b0.i;
import b2.k0;
import b5.a;
import c0.d;
import c0.n;
import k0.h0;
import t.f0;
import t.g0;
import t.r1;
import t.t1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.ads.n00;

/* loaded from: classes.dex */
public final class s implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2690b;

    public /* synthetic */ s(int i, Object obj) {
        this.f2689a = i;
        this.f2690b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f2689a) {
            case 0:
                final x5 x5Var = (x5) this.f2690b;
                final int i = 0;
                final int i10 = 1;
                Object f10 = f0.f(wVar, new p(x5Var, 1), new df.a() { // from class: b8.r
                    @Override // df.a
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                x5 x5Var2 = x5Var;
                                x5Var2.e = false;
                                x5Var2.f2976c = Float.NaN;
                                x5Var2.f2977d = Float.NaN;
                                break;
                            default:
                                x5 x5Var3 = x5Var;
                                x5Var3.e = false;
                                x5Var3.f2976c = Float.NaN;
                                x5Var3.f2977d = Float.NaN;
                                break;
                        }
                        return pe.z.f22715a;
                    }
                }, new df.a() { // from class: b8.r
                    @Override // df.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                x5 x5Var2 = x5Var;
                                x5Var2.e = false;
                                x5Var2.f2976c = Float.NaN;
                                x5Var2.f2977d = Float.NaN;
                                break;
                            default:
                                x5 x5Var3 = x5Var;
                                x5Var3.e = false;
                                x5Var3.f2976c = Float.NaN;
                                x5Var3.f2977d = Float.NaN;
                                break;
                        }
                        return pe.z.f22715a;
                    }
                }, new l(wVar, 1, x5Var), cVar);
                if (f10 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return f10;
            case 1:
                Object i11 = pf.i(new a(wVar, (d) this.f2690b, null, 10), cVar);
                if (i11 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return i11;
            case 2:
                Object e = t1.e(wVar, new g((a) this.f2690b, null, 1), cVar);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            case 3:
                Object c12 = ((r.d) this.f2690b).c1(wVar, cVar);
                if (c12 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return c12;
            case 4:
                Object e8 = t1.e(wVar, new h0((r.f) this.f2690b, null, 2), cVar);
                if (e8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e8;
            default:
                n00 n00Var = new n00(2);
                r1 r1Var = (r1) this.f2690b;
                Object i12 = pf.i(new g0(r1Var, wVar, new n(r1Var, 8, n00Var), new k0(20, n00Var, wVar, r1Var), new h0(r1Var, 0), new h0(r1Var, 1), new g(n00Var, 13, r1Var), null), cVar);
                if (i12 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return i12;
        }
    }
}
