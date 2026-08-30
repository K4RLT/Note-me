package lb;
import v.b;
import v.e;
import v.g;
import v.h;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20123u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r1 f20124v;

    public /* synthetic */ e1(r1 r1Var, int i) {
        this.f20123u = i;
        this.f20124v = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20123u) {
            case 0:
                r1 r1Var = this.f20124v;
                t1 t1Var = (t1) r1Var.i.b();
                v vVar = r1Var.f20250a;
                ib.o i = t1Var.i(vVar.p());
                mb.e eVar = r1Var.f20257j;
                i.f((Executor) eVar.b(), new k6.i(4, vVar));
                i.e((Executor) eVar.b(), t.f20276x);
                return;
            default:
                v vVar2 = this.f20124v.f20250a;
                ArrayList f10 = vVar2.f();
                int size = f10.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = f10.get(i10);
                    i10++;
                    File file = (File) obj;
                    if (file.listFiles() != null) {
                        for (File file2 : file.listFiles()) {
                            File file3 = new File(file2, "stale.tmp");
                            if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > e) {
                                h(file2);
                            }
                        }
                    }
                }
                ArrayList f11 = vVar2.f();
                int size2 = f11.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = f11.get(i11);
                    i11++;
                    File file4 = (File) obj2;
                    if (file4.listFiles() != null) {
                        g(file4);
                        long b10 = b(file4, false);
                        if (vVar2.f20290b.a() != b10) {
                            try {
                                new File(new File(file4, String.valueOf(b10)), "stale.tmp").createNewFile();
                            } catch (IOException unused) {
                                v.f20287c.c("Could not write staleness marker.", new Object[0]);
                            }
                        }
                        for (File file5 : file4.listFiles()) {
                            g(file5);
                        }
                    }
                }
                if (new File(vVar2.e(), "_tmp").exists()) {
                    for (File file6 : new File(vVar2.e(), "_tmp").listFiles()) {
                        if (System.currentTimeMillis() - file6.lastModified() > v.f20288d) {
                            h(file6);
                        } else {
                            g(file6);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
