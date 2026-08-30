package lb;
import p.a;

import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.ads.rb;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f20176a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f20177b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f20178c;

    /* renamed from: d, reason: collision with root package name */
    public final mb.e f20179d;
    public final mb.e e;

    public k1(v vVar, mb.e eVar, t0 t0Var, mb.e eVar2, n0 n0Var) {
        this.f20176a = vVar;
        this.f20179d = eVar;
        this.f20177b = t0Var;
        this.e = eVar2;
        this.f20178c = n0Var;
    }

    public final void a(j1 j1Var) {
        String str = (String) j1Var.f13135v;
        int i = j1Var.f20171x;
        int i10 = j1Var.f13134u;
        int i11 = j1Var.f20170w;
        long j10 = j1Var.f20172y;
        v vVar = this.f20176a;
        File k3 = vVar.k(str, j10, i11);
        if (k3.exists()) {
            File k4 = vVar.k(str, j10, i);
            k4.mkdirs();
            if (k3.renameTo(k4)) {
                ((Executor) this.e.b()).execute(new pu1(this, 21, j1Var));
                t0 t0Var = this.f20177b;
                t0Var.getClass();
                t0Var.b(new rb(t0Var, str, i, j10));
                this.f20178c.b(str);
                ((t1) this.f20179d.b()).f(i10, str);
                return;
            }
            String absolutePath = k3.getAbsolutePath();
            String absolutePath2 = k4.getAbsolutePath();
            StringBuilder q10 = a.q("Cannot promote pack ", str, " from ", absolutePath, " to ");
            q10.append(absolutePath2);
            throw new k0(q10.toString(), i10);
        }
        throw new k0(a.l("Cannot find pack files to promote for pack ", str, " at ", k3.getAbsolutePath()), i10);
    }
}
