package q2;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.h0;
import wa.b9;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jb.f f23350a;

    /* renamed from: b, reason: collision with root package name */
    public final a f23351b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.e f23352c;

    /* renamed from: d, reason: collision with root package name */
    public final n f23353d;
    public final ic.c e;

    /* renamed from: f, reason: collision with root package name */
    public final a1.f f23354f;

    public j(jb.f fVar, a aVar) {
        j6.e eVar = k.f23355a;
        n nVar = new n(k.f23356b);
        ic.c cVar = new ic.c(22);
        this.f23350a = fVar;
        this.f23351b = aVar;
        this.f23352c = eVar;
        this.f23353d = nVar;
        this.e = cVar;
        this.f23354f = new a1.f(17, this);
    }

    public final f0 a(c0 c0Var) {
        j6.e eVar = this.f23352c;
        androidx.ink.authoring.compose.d dVar = new androidx.ink.authoring.compose.d(this, 14, c0Var);
        synchronized (((nf.a) eVar.f18918u)) {
            f0 f0Var = (f0) ((h0) eVar.f18919v).c(c0Var);
            if (f0Var != null) {
                if (f0Var.c()) {
                    return f0Var;
                }
            }
            try {
                f0 f0Var2 = (f0) dVar.invoke(new androidx.ink.authoring.compose.d(eVar, 15, c0Var));
                synchronized (((nf.a) eVar.f18918u)) {
                    if (((h0) eVar.f18919v).c(c0Var) == null && f0Var2.c()) {
                        ((h0) eVar.f18919v).d(c0Var, f0Var2);
                    }
                }
                return f0Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final f0 b(i iVar, s sVar, int i, int i10) {
        s sVar2;
        a aVar = this.f23351b;
        aVar.getClass();
        int i11 = aVar.f23323u;
        if (i11 != 0 && i11 != Integer.MAX_VALUE) {
            sVar2 = new s(b9.e(sVar.f23369u + i11, 1, AdError.NETWORK_ERROR_CODE));
        } else {
            sVar2 = sVar;
        }
        this.f23350a.getClass();
        return a(new c0(iVar, sVar2, i, i10, null));
    }
}
