package w7;
import k1.r;
import r0.a1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class r implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f28970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28972d;
    public final /* synthetic */ a1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f28973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f28974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f28975h;

    public r(boolean z3, p pVar, long j10, int i, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4) {
        this.f28969a = z3;
        this.f28970b = pVar;
        this.f28971c = j10;
        this.f28972d = i;
        this.e = a1Var;
        this.f28973f = a1Var2;
        this.f28974g = a1Var3;
        this.f28975h = a1Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final boolean z3 = this.f28969a;
        final p pVar = this.f28970b;
        final long j10 = this.f28971c;
        final int i = this.f28972d;
        final a1 a1Var = this.e;
        final a1 a1Var2 = this.f28973f;
        final a1 a1Var3 = this.f28974g;
        final a1 a1Var4 = this.f28975h;
        Object e = t.k2.e(wVar, null, null, null, new df.l() { // from class: w7.q
            @Override // df.l
            public final Object invoke(Object obj) {
                boolean z9 = z3;
                p pVar2 = pVar;
                long j11 = j10;
                a1 a1Var5 = a1Var;
                a1 a1Var6 = a1Var2;
                a1 a1Var7 = a1Var4;
                if (!z9) {
                    pVar2.invoke(new k1.r(j11));
                    if (((Boolean) a1Var5.getValue()).booleanValue()) {
                        n4.f(a1Var6, a1Var5, a1Var7);
                    }
                } else {
                    pVar2.invoke(new k1.r(j11));
                    if (System.currentTimeMillis() - ((Number) a1Var6.getValue()).longValue() > 200) {
                        boolean booleanValue = ((Boolean) a1Var5.getValue()).booleanValue();
                        int i10 = i;
                        a1 a1Var8 = a1Var3;
                        if (booleanValue && n4.d(a1Var8) == i10) {
                            n4.f(a1Var6, a1Var5, a1Var7);
                        } else {
                            a1Var8.setValue(Integer.valueOf(i10));
                            a1Var5.setValue(Boolean.TRUE);
                        }
                    }
                }
                return pe.z.f22715a;
            }
        }, cVar, 7);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
