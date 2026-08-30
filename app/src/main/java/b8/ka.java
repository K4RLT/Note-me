package b8;
import j.y;
import b0.j;
import f7.c;
import ia.a;
import r0.a1;
import u7.k0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* loaded from: classes.dex */
public final class ka extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2329u;

    /* renamed from: v, reason: collision with root package name */
    public int f2330v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2331w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f2332x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f2333y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(Context context, boolean z3, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f2329u = 0;
        this.f2332x = context;
        this.f2331w = z3;
        this.f2333y = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2329u) {
            case 0:
                return new ka(this.f2332x, this.f2331w, this.f2333y, cVar);
            case 1:
                return new ka(this.f2331w, this.f2332x, this.f2333y, cVar, 1);
            default:
                return new ka(this.f2331w, this.f2332x, this.f2333y, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2329u) {
            case 0:
                return ((ka) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((ka) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((ka) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor putLong;
        int i = this.f2329u;
        int i10 = 0;
        boolean z3 = this.f2331w;
        ue.a aVar = ue.a.f27192u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f2333y;
        Context context = this.f2332x;
        te.c cVar = null;
        switch (i) {
            case 0:
                int i11 = this.f2330v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Context context2 = ia.f2220a;
                    context.getClass();
                    if (!a()) {
                        ia.f2221b.setValue(Boolean.TRUE);
                        ia.f2223d.setValue(1);
                        context.getSharedPreferences("universe_notice", 0).edit().putLong("armed_at", System.currentTimeMillis()).putInt("launches", 1).apply();
                        c.s("armed");
                    }
                    if (!z3 && !((Boolean) a1Var.getValue()).booleanValue() && ia.d()) {
                        this.f2330v = 1;
                        if (pf.j(2200L, this) == aVar) {
                            return aVar;
                        }
                    }
                    return zVar;
                }
                a1Var.setValue(Boolean.TRUE);
                c(true);
                ia.f2224f++;
                ia.f2225g = System.currentTimeMillis();
                Context context3 = ia.f2220a;
                if (context3 != null && (sharedPreferences = context3.getSharedPreferences("universe_notice", 0)) != null && (edit = sharedPreferences.edit()) != null && (putInt = edit.putInt("shows", ia.f2224f)) != null && (putLong = putInt.putLong("last_at", ia.f2225g)) != null) {
                    putLong.apply();
                }
                c.s("bubble_shown");
                return zVar;
            case 1:
                int i12 = this.f2330v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    if (z3) {
                        wf.e eVar = pf.l0.f22767a;
                        wf.d dVar = wf.d.f29913w;
                        k0 k0Var = new k0(context, a1Var, cVar, i10);
                        this.f2330v = 1;
                        if (pf.b0.J(dVar, k0Var, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return zVar;
            default:
                int i13 = this.f2330v;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            pe.a.e(obj);
                        } else {
                            q.x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        pe.a.e(obj);
                        if (z3) {
                            context.getClass();
                            SharedPreferences sharedPreferences2 = context.getSharedPreferences("scraply_notices", 0);
                            Set<String> set = qe.u.f24025u;
                            Set<String> stringSet = sharedPreferences2.getStringSet("seen_notices", set);
                            if (stringSet != null) {
                                set = stringSet;
                            }
                            if (!set.contains("hint_remove_sticker_pack")) {
                                j.y(context, "hint_remove_sticker_pack");
                                a1Var.setValue(Boolean.TRUE);
                                this.f2330v = 1;
                                if (pf.j(5000L, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        return zVar;
                    }
                    return zVar;
                } finally {
                    a1Var.setValue(Boolean.FALSE);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka(boolean z3, Context context, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f2329u = i;
        this.f2331w = z3;
        this.f2332x = context;
        this.f2333y = a1Var;
    }
}
