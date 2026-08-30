package b8;
import z5.d;

import android.util.Log;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2003u;

    /* renamed from: v, reason: collision with root package name */
    public int f2004v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f2005w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, String str, te.c cVar) {
        super(2, cVar);
        this.f2003u = i;
        this.f2005w = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2003u) {
            case 0:
                return new e0(0, this.f2005w, cVar);
            case 1:
                return new e0(1, this.f2005w, cVar);
            case 2:
                return new e0(2, this.f2005w, cVar);
            default:
                return new e0(3, this.f2005w, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2003u) {
            case 0:
                return ((e0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((e0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((e0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((e0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        te.c cVar = null;
        switch (this.f2003u) {
            case 0:
                ue.a aVar = ue.a.f27192u;
                int i = this.f2004v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                sf.a0 a0Var = q0.f2561k;
                d0 d0Var = new d0(0, this.f2005w, cVar);
                this.f2004v = 1;
                Object i10 = sf.e0.i(a0Var, d0Var, this);
                if (i10 == aVar) {
                    return aVar;
                }
                return i10;
            case 1:
                ue.a aVar2 = ue.a.f27192u;
                int i11 = this.f2004v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        ((pe.l) obj).getClass();
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    p6 p6Var = p6.f2523a;
                    String str = this.f2005w;
                    this.f2004v = 1;
                    if (p6Var.e(str, this) == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            case 2:
                ue.a aVar3 = ue.a.f27192u;
                int i12 = this.f2004v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    p6 p6Var2 = p6.f2523a;
                    this.f2004v = 1;
                    obj = p6.h(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    return null;
                }
                Serializable j10 = c8.a.j("toggle_heart", "{\"p_listing\":\"" + this.f2005w + "\"}", str2);
                if (j10 instanceof pe.k) {
                    j10 = null;
                }
                if (((String) j10) == null) {
                    return null;
                }
                z5 z5Var = z5.f3075a;
                d();
                return null;
            default:
                ue.a aVar4 = ue.a.f27192u;
                int i13 = this.f2004v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    wd.c cVar2 = wd.c.f29888a;
                    this.f2004v = 1;
                    obj = cVar2.b(this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                }
                Collection<oc.j> values = ((Map) obj).values();
                String str3 = this.f2005w;
                for (oc.j jVar : values) {
                    wd.e eVar = new wd.e(str3);
                    jVar.getClass();
                    String str4 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                    oc.i iVar = jVar.f21888b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f21886c, str3)) {
                            oc.i.a(iVar.f21884a, iVar.f21885b, str3);
                            iVar.f21886c = str3;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + wd.d.f29890u + " of new session " + str3);
                }
                return pe.z.f22715a;
        }
    }
}
