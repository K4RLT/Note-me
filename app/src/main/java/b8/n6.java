package b8;
import l.a;

import com.google.android.gms.internal.ads.wd0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class n6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2448u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2449v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f2450w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f2451x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(String str, String str2, te.c cVar, int i) {
        super(2, cVar);
        this.f2448u = i;
        this.f2450w = str;
        this.f2451x = str2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2448u) {
            case 0:
                n6 n6Var = new n6(this.f2450w, this.f2451x, cVar, 0);
                n6Var.f2449v = obj;
                return n6Var;
            default:
                n6 n6Var2 = new n6(this.f2450w, this.f2451x, cVar, 1);
                n6Var2.f2449v = obj;
                return n6Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2448u) {
            case 0:
                return ((n6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        f6 f6Var;
        Object kVar2;
        Object kVar3;
        switch (this.f2448u) {
            case 0:
                pe.a.e(obj);
                String str = this.f2450w;
                String str2 = this.f2451x;
                try {
                    Serializable g8 = c8.a.g("auth/v1/token?grant_type=password", "{\"email\":\"" + e1.x(mf.f.I(str).toString()) + "\",\"password\":\"" + e1.x(str2) + "\"}");
                    pe.a.e(g8);
                    fg.s sVar = p6.f2525c;
                    sVar.getClass();
                    f6Var = (f6) sVar.a(f6.Companion.serializer(), (String) g8);
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (!mf.f.u(f6Var.f2080a)) {
                    p6.c(f6Var);
                    p6.b(f6Var.f2080a);
                    kVar = pe.z.f22715a;
                    Throwable a10 = pe.a(kVar);
                    if (a10 != null) {
                        wd0.o("entrar falló: ", a10.getMessage(), "UniverseAccount");
                    }
                    return new pe.l(kVar);
                }
                throw new IllegalStateException("respuesta sin token");
            default:
                pe.a.e(obj);
                String str3 = this.f2450w;
                String str4 = this.f2451x;
                try {
                    Serializable g10 = c8.a.g("auth/v1/signup", "{\"email\":\"" + e1.x(mf.f.I(str3).toString()) + "\",\"password\":\"" + e1.x(str4) + "\"}");
                    pe.a.e(g10);
                    String str5 = (String) g10;
                    try {
                        fg.s sVar2 = p6.f2525c;
                        sVar2.getClass();
                        kVar3 = (f6) sVar2.a(f6.Companion.serializer(), str5);
                    } catch (Throwable th2) {
                        kVar3 = new pe.k(th2);
                    }
                    if (kVar3 instanceof pe.k) {
                        kVar3 = null;
                    }
                    f6 f6Var2 = (f6) kVar3;
                    if (f6Var2 != null && !mf.f.u(f6Var2.f2080a)) {
                        p6.c(f6Var2);
                        p6.b(f6Var2.f2080a);
                    }
                    kVar2 = pe.z.f22715a;
                } catch (Throwable th3) {
                    kVar2 = new pe.k(th3);
                }
                Throwable a11 = pe.a(kVar2);
                if (a11 != null) {
                    wd0.o("registro falló: ", a11.getMessage(), "UniverseAccount");
                }
                return new pe.l(kVar2);
        }
    }
}
