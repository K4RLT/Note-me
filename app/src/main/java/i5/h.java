package i5;
import d.a;

import eb.w0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements p5.a, yf.a {

    /* renamed from: u, reason: collision with root package name */
    public final p5.a f18244u;

    /* renamed from: v, reason: collision with root package name */
    public final yf.a f18245v;

    /* renamed from: w, reason: collision with root package name */
    public te.g f18246w;

    /* renamed from: x, reason: collision with root package name */
    public Throwable f18247x;

    /* renamed from: y, reason: collision with root package name */
    public final w0 f18248y;

    public h(p5.a aVar) {
        yf.c a10 = yf.a();
        aVar.getClass();
        this.f18244u = aVar;
        this.f18245v = a10;
        this.f18248y = new w0(this);
    }

    @Override // p5.a
    public final boolean J() {
        return this.f18244u.J();
    }

    @Override // p5.a
    public final p5.c T(String str) {
        str.getClass();
        w0 w0Var = this.f18248y;
        if (w0Var != null) {
            Object c10 = w0Var.c(str);
            c10.getClass();
            return new g((p5.c) c10);
        }
        return this.f18244u.T(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        w0 w0Var = this.f18248y;
        if (w0Var != null) {
            w0Var.f(-1);
        }
        this.f18244u.close();
    }

    @Override // yf.a
    public final Object f(te.c cVar) {
        return this.f18245v.f(cVar);
    }

    @Override // yf.a
    public final void j(Object obj) {
        this.f18245v.j(null);
    }

    public final void k(StringBuilder sb2) {
        int i;
        if (this.f18246w == null && this.f18247x == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            te.g gVar = this.f18246w;
            if (gVar != null) {
                sb2.append("\t\tCoroutine: " + gVar);
                sb2.append('\n');
            }
            Throwable th = this.f18247x;
            if (th != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                Iterator it = qe.l.t(mf.f.w(stringWriter2), 1).iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        if (this.f18248y != null) {
            StringBuilder sb3 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            w0 w0Var = this.f18248y;
            synchronized (((mc.c) w0Var.f6523g)) {
                i = w0Var.f6520c;
            }
            sb3.append(i);
            sb2.append(sb3.toString());
            sb2.append('\n');
        }
    }

    public final String toString() {
        return this.f18244u.toString();
    }
}
