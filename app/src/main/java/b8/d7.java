package b8;
import b0.c;
import r0.a1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* loaded from: classes.dex */
public final class d7 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1981u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f1982v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f1983w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f1984x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(boolean z3, Context context, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f1981u = z3;
        this.f1982v = context;
        this.f1983w = a1Var;
        this.f1984x = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new d7(this.f1981u, this.f1982v, this.f1983w, this.f1984x, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        d7 d7Var = (d7) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        d7Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        float f10 = f7.f2084a;
        v6 v6Var = (v6) this.f1983w.getValue();
        pe.z zVar = pe.z.f22715a;
        if (v6Var != null) {
            a1 a1Var = this.f1984x;
            if (((Number) a1Var.getValue()).intValue() == 0 && !this.f1981u && !ia.e()) {
                a1Var.setValue(1);
                sf.n0 n0Var = z6.f3087a;
                Context context = this.f1982v;
                context.getClass();
                z6.f3089c.setValue(Boolean.TRUE);
                SharedPreferences sharedPreferences = context.getSharedPreferences("universe_arrival", 0);
                Set<String> set = qe.u.f24025u;
                Set<String> stringSet = sharedPreferences.getStringSet("anunciadas", set);
                if (stringSet != null) {
                    set = stringSet;
                }
                sharedPreferences.edit().putStringSet("anunciadas", qe.l.U(qe.c(set, v6Var.f2886d))).putLong("last_at", System.currentTimeMillis()).apply();
                c.s("arrival_shown");
            }
        }
        return zVar;
    }
}
