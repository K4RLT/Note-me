package lb;
import p.a;

import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.rb;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f20112a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f20113b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f20114c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f20115d;
    public final mb.e e;

    /* renamed from: f, reason: collision with root package name */
    public final mb.e f20116f;

    public d1(v vVar, mb.e eVar, t0 t0Var, mb.e eVar2, n0 n0Var, f1 f1Var) {
        this.f20112a = vVar;
        this.e = eVar;
        this.f20113b = t0Var;
        this.f20116f = eVar2;
        this.f20114c = n0Var;
        this.f20115d = f1Var;
    }

    public final void a(c1 c1Var) {
        String str = (String) c1Var.f13135v;
        int i = c1Var.f13134u;
        int i10 = c1Var.f20099w;
        long j10 = c1Var.f20100x;
        v vVar = this.f20112a;
        vVar.getClass();
        File file = new File(vVar.d(str, j10, i10), "_packs");
        File file2 = new File(new File(vVar.d(str, j10, i10), "_slices"), "_metadata");
        if (file.exists() && file2.exists()) {
            File k3 = vVar.k(str, j10, i10);
            k3.mkdirs();
            if (file.renameTo(k3)) {
                new File(vVar.k(str, j10, i10), "merge.tmp").delete();
                File file3 = new File(vVar.k(str, j10, i10), "_metadata");
                file3.mkdirs();
                if (file2.renameTo(file3)) {
                    try {
                        this.f20115d.b(c1Var.f20099w, c1Var.f20100x, (String) c1Var.f13135v, c1Var.f20101y);
                        ((Executor) this.f20116f.b()).execute(new ou1(this, 23, c1Var));
                        t0 t0Var = this.f20113b;
                        t0Var.getClass();
                        t0Var.b(new rb(t0Var, str, i10, j10));
                        this.f20114c.b(str);
                        ((t1) this.e.b()).f(i, str);
                        return;
                    } catch (IOException e) {
                        throw new k0(a.l("Could not write asset pack version tag for pack ", str, ": ", e.getMessage()), i);
                    }
                }
                throw new k0("Cannot move metadata files to final location.", i);
            }
            throw new k0("Cannot move merged pack files to final location.", i);
        }
        throw new k0(a.k("Cannot find pack files to move for pack ", str, "."), i);
    }
}
