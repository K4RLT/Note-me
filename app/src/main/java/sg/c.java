package sg;
import c.q;

import com.google.android.gms.internal.ads.is0;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25264u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f25265v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25266w;

    public c(is0 is0Var) {
        this.f25264u = 2;
        this.f25266w = is0Var;
        this.f25265v = new Object();
    }

    @Override // sg.t
    public final v a() {
        switch (this.f25264u) {
            case 0:
                return (s) this.f25265v;
            case 1:
                return (v) this.f25266w;
            default:
                return (v) this.f25265v;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f25264u) {
            case 0:
                s sVar = (s) this.f25265v;
                try {
                    try {
                        ((c) this.f25266w).close();
                        sVar.l(true);
                        return;
                    } catch (IOException e) {
                        if (!sVar.k()) {
                            throw e;
                        }
                        throw sVar.m(e);
                    }
                } catch (Throwable th) {
                    sVar.l(false);
                    throw th;
                }
            case 1:
                ((InputStream) this.f25265v).close();
                return;
            default:
                synchronized (((f) ((is0) this.f25266w).f7206w)) {
                    is0 is0Var = (is0) this.f25266w;
                    is0Var.f7205v = true;
                    f fVar = (f) is0Var.f7206w;
                    if (fVar != null) {
                        fVar.notifyAll();
                    } else {
                        throw new ClassCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r9 != false) goto L48;
     */
    @Override // sg.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(sg.f r8, long r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.q(sg.f, long):long");
    }

    public String toString() {
        switch (this.f25264u) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f25266w) + ')';
            case 1:
                return "source(" + ((InputStream) this.f25265v) + ')';
            default:
                return super.toString();
        }
    }

    public c(InputStream inputStream, v vVar) {
        this.f25264u = 1;
        inputStream.getClass();
        this.f25265v = inputStream;
        this.f25266w = vVar;
    }

    public c(s sVar, c cVar) {
        this.f25264u = 0;
        this.f25265v = sVar;
        this.f25266w = cVar;
    }
}
