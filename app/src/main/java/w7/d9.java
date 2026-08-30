package w7;
import r0.i1;
import z.e;
import z0.c;
import z7.h;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28102u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28103v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28104w;

    public /* synthetic */ d9(Object obj, int i, Object obj2) {
        this.f28102u = i;
        this.f28103v = obj;
        this.f28104w = obj2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f28102u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f28104w;
        Object obj3 = this.f28103v;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                eVar.getClass();
                e.p(eVar, cb.f28050b.size(), null, new c(-1066991384, new n7((Integer) obj3, 1, (df.l) obj2), true), 6);
                return zVar;
            default:
                Context context = (Context) obj3;
                View view = (View) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                i1 i1Var = h.f31955a;
                context.getClass();
                h.f31955a.setValue(bool);
                context.getSharedPreferences("scraply_settings", 0).edit().putBoolean("haptics_enabled", booleanValue).apply();
                if (booleanValue) {
                    view.getClass();
                    if (h.a()) {
                        view.performHapticFeedback(0);
                    }
                }
                return zVar;
        }
    }
}
