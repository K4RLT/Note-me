package s9;

import com.google.android.gms.internal.ads.j90;
import com.google.android.gms.internal.ads.zd0;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class v implements j90 {

    /* renamed from: u, reason: collision with root package name */
    public final zd0 f25119u;

    /* renamed from: v, reason: collision with root package name */
    public final u f25120v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25121w;

    public v(zd0 zd0Var, u uVar, String str) {
        this.f25119u = zd0Var;
        this.f25120v = uVar;
        this.f25121w = str;
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void a(m mVar) {
        if (mVar == null) {
            return;
        }
        u uVar = this.f25120v;
        String str = this.f25121w;
        zd0 zd0Var = this.f25119u;
        String str2 = mVar.f25084b;
        synchronized (uVar) {
            f9.k.C.f16819k.getClass();
            uVar.e.put(str, new t(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            uVar.b();
            uVar.c(zd0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void G(String str) {
    }
}
