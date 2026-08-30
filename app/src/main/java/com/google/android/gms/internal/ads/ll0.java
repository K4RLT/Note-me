package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Set;

/* loaded from: classes.dex */
public final class ll0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8057a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8058b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8059c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8060d;
    public final Object e;

    public ll0(Context context, wx wxVar, aq0 aq0Var, l9.a aVar) {
        this.f8057a = 6;
        this.f8059c = context;
        this.f8060d = wxVar;
        this.f8058b = aq0Var;
        this.e = aVar;
    }

    public static final int a(int i, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f10);
    }

    public static final j3.c b(j3.c cVar, float f10) {
        if (f10 == 0.0f) {
            return j3.c.e;
        }
        return j3.c.b((int) Math.ceil(cVar.f18874a / f10), (int) Math.ceil(cVar.f18875b / f10), (int) Math.ceil(cVar.f18876c / f10), (int) Math.ceil(cVar.f18877d / f10));
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        wl0 wl0Var;
        switch (this.f8057a) {
            case 0:
                sl.a((Context) this.f8059c);
                return ((wx) this.f8060d).j(new qf(7, this));
            case 1:
                return ed1.d0(((nm0) this.f8060d).zza(), new cv(3, this), xx.f12657h);
            case 2:
                xl0 xl0Var = (xl0) this.e;
                nl nlVar = sl.f10688cd;
                g9.r rVar = g9.r.e;
                ql qlVar = rVar.f17698c;
                ql qlVar2 = rVar.f17698c;
                if (((Boolean) qlVar.a(nlVar)).booleanValue() && (wl0Var = xl0Var.f12587b) != null) {
                    return ed1.e(wl0Var);
                }
                if (!xy.y((String) qlVar2.a(sl.Y1)) && (((Boolean) qlVar2.a(nlVar)).booleanValue() || (!xl0Var.f12586a.get() && ((af0) this.f8058b).f4471b))) {
                    xl0Var.f12586a.set(true);
                    return ((wx) this.f8060d).j(new qf(9, this));
                }
                return ed1.e(new wl0(0, new Bundle()));
            case 3:
                return ((wx) this.f8060d).j(new qf(15, this));
            case 4:
                return ((wx) this.f8060d).j(new qf(19, this));
            case 5:
                return ((wx) this.f8060d).j(new qf(21, this));
            case 6:
                return ((wx) this.f8060d).j(new qf(23, this));
            case 7:
                return ((wx) this.f8060d).j(new qf(25, this));
            default:
                return ((wx) this.f8060d).j(new qf(28, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f8057a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            case 7:
                return 35;
            default:
                return 38;
        }
    }

    public ll0(wx wxVar, ViewGroup viewGroup, Context context, Set set) {
        this.f8057a = 4;
        this.f8060d = wxVar;
        this.f8058b = set;
        this.e = viewGroup;
        this.f8059c = context;
    }

    public /* synthetic */ ll0(wx wxVar, Object obj, Object obj2, Object obj3, int i) {
        this.f8057a = i;
        this.f8060d = wxVar;
        this.f8059c = obj;
        this.f8058b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ll0(Object obj, aq0 aq0Var, Object obj2, Object obj3, int i) {
        this.f8057a = i;
        this.f8060d = obj;
        this.f8058b = aq0Var;
        this.f8059c = obj2;
        this.e = obj3;
    }
}
