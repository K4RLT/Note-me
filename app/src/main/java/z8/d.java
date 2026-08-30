package z8;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.tr;
import fa.y;
import g9.f0;
import g9.g0;
import g9.m2;
import g9.w2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31979a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f31980b;

    public d(Context context, String str) {
        y.i(context, "context cannot be null");
        g9.n nVar = g9.p.f17688g.f17690b;
        tr trVar = new tr();
        nVar.getClass();
        g0 g0Var = (g0) new g9.j(nVar, context, str, trVar).d(context, false);
        this.f31979a = context;
        this.f31980b = g0Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [g9.f0, g9.n2] */
    public final e a() {
        Context context = this.f31979a;
        try {
            return new e(context, this.f31980b.a());
        } catch (RemoteException e) {
            l9.i.d("Failed to build AdLoader.", e);
            return new e(context, new m2(new f0()));
        }
    }

    public final void b(q9.d dVar) {
        w2 w2Var;
        try {
            g0 g0Var = this.f31980b;
            boolean z3 = dVar.f23611a;
            boolean z9 = dVar.f23613c;
            int i = dVar.f23614d;
            t tVar = dVar.e;
            if (tVar != null) {
                w2Var = new w2(tVar);
            } else {
                w2Var = null;
            }
            g0Var.k4(new rn(4, z3, -1, z9, i, w2Var, dVar.f23615f, dVar.f23612b, dVar.f23617h, dVar.f23616g, dVar.i - 1));
        } catch (RemoteException e) {
            l9.i.g("Failed to specify native ad options", e);
        }
    }
}
