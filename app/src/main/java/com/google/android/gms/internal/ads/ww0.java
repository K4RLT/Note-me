package com.google.android.gms.internal.ads;
import df.p;
import pe.a;
import pe.z;
import pf.z;
import te.c;
import ue.a;
import ve.a;
import ve.i;

/* loaded from: classes.dex */
public final class ww0 extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12349u;

    /* renamed from: v, reason: collision with root package name */
    public int f12350v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gx0 f12351w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww0(gx0 gx0Var, c cVar, int i) {
        super(2, cVar);
        this.f12349u = i;
        this.f12351w = gx0Var;
    }

    @Override // a
    public final c create(Object obj, c cVar) {
        switch (this.f12349u) {
            case 0:
                return new ww0(this.f12351w, cVar, 0);
            case 1:
                return new ww0(this.f12351w, cVar, 1);
            case 2:
                return new ww0(this.f12351w, cVar, 2);
            case 3:
                return new ww0(this.f12351w, cVar, 3);
            case 4:
                return new ww0(this.f12351w, cVar, 4);
            default:
                return new ww0(this.f12351w, cVar, 5);
        }
    }

    @Override // p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        c cVar = (c) obj2;
        switch (this.f12349u) {
            case 0:
                return ((ww0) create(zVar, cVar)).invokeSuspend(z.f22715a);
            case 1:
                return ((ww0) create(zVar, cVar)).invokeSuspend(z.f22715a);
            case 2:
                return ((ww0) create(zVar, cVar)).invokeSuspend(z.f22715a);
            case 3:
                return ((ww0) create(zVar, cVar)).invokeSuspend(z.f22715a);
            case 4:
                return ((ww0) create(zVar, cVar)).invokeSuspend(z.f22715a);
            default:
                return ((ww0) create(zVar, cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // a
    public final Object invokeSuspend(Object obj) {
        switch (this.f12349u) {
            case 0:
                int i = this.f12350v;
                a.e(obj);
                if (i == 0) {
                    this.f12350v = 1;
                    Object f10 = gx0.f(this.f12351w, this);
                    a aVar = a.f27192u;
                    if (f10 == aVar) {
                        return aVar;
                    }
                }
                return z.f22715a;
            case 1:
                int i10 = this.f12350v;
                a.e(obj);
                if (i10 == 0) {
                    this.f12350v = 1;
                    Object j10 = gx0.j(this.f12351w, this);
                    a aVar2 = a.f27192u;
                    if (j10 == aVar2) {
                        return aVar2;
                    }
                }
                return z.f22715a;
            case 2:
                int i11 = this.f12350v;
                a.e(obj);
                if (i11 == 0) {
                    this.f12350v = 1;
                    Object h3 = gx0.h(this.f12351w, this);
                    a aVar3 = a.f27192u;
                    if (h3 == aVar3) {
                        return aVar3;
                    }
                }
                return z.f22715a;
            case 3:
                int i12 = this.f12350v;
                a.e(obj);
                if (i12 == 0) {
                    this.f12350v = 1;
                    Object d2 = gx0.d(this.f12351w, this);
                    a aVar4 = a.f27192u;
                    if (d2 == aVar4) {
                        return aVar4;
                    }
                }
                return z.f22715a;
            case 4:
                int i13 = this.f12350v;
                a.e(obj);
                if (i13 == 0) {
                    this.f12350v = 1;
                    Object i14 = gx0.i(this.f12351w, this);
                    a aVar5 = a.f27192u;
                    if (i14 == aVar5) {
                        return aVar5;
                    }
                }
                return z.f22715a;
            default:
                int i15 = this.f12350v;
                a.e(obj);
                if (i15 == 0) {
                    this.f12350v = 1;
                    Object g8 = gx0.g(this.f12351w, this);
                    a aVar6 = a.f27192u;
                    if (g8 == aVar6) {
                        return aVar6;
                    }
                }
                return z.f22715a;
        }
    }
}
