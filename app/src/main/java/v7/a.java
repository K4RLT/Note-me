package v7;

import android.os.SystemClock;
import b2.f1;
import df.p;
import pf.z;

/* loaded from: classes.dex */
public final class a extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27395u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f1 f27396v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f27397w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f1 f1Var, String str, te.c cVar, int i) {
        super(2, cVar);
        this.f27395u = i;
        this.f27396v = f1Var;
        this.f27397w = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27395u) {
            case 0:
                return new a(this.f27396v, this.f27397w, cVar, 0);
            case 1:
                return new a(this.f27396v, this.f27397w, cVar, 1);
            default:
                return new a(this.f27396v, this.f27397w, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27395u) {
            case 0:
                a aVar = (a) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                aVar.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                a aVar2 = (a) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                aVar2.invokeSuspend(zVar3);
                return zVar3;
            default:
                a aVar3 = (a) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                aVar3.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27395u) {
            case 0:
                pe.a.e(obj);
                this.f27396v.f(this.f27397w);
                u7.e.e = SystemClock.uptimeMillis();
                return pe.z.f22715a;
            case 1:
                pe.a.e(obj);
                this.f27396v.f(this.f27397w);
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                this.f27396v.f(this.f27397w);
                u7.e.e = SystemClock.uptimeMillis();
                return pe.z.f22715a;
        }
    }
}
