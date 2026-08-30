package ib;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class j implements e, d, b {
    public Exception A;
    public boolean B;

    /* renamed from: u, reason: collision with root package name */
    public final Object f18366u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final int f18367v;

    /* renamed from: w, reason: collision with root package name */
    public final o f18368w;

    /* renamed from: x, reason: collision with root package name */
    public int f18369x;

    /* renamed from: y, reason: collision with root package name */
    public int f18370y;

    /* renamed from: z, reason: collision with root package name */
    public int f18371z;

    public j(int i, o oVar) {
        this.f18367v = i;
        this.f18368w = oVar;
    }

    @Override // ib.b
    public final void a() {
        synchronized (this.f18366u) {
            this.f18371z++;
            this.B = true;
            b();
        }
    }

    public final void b() {
        int i = this.f18369x;
        int i10 = this.f18370y;
        int i11 = i + i10 + this.f18371z;
        int i12 = this.f18367v;
        if (i11 == i12) {
            Exception exc = this.A;
            o oVar = this.f18368w;
            if (exc != null) {
                oVar.o(new ExecutionException(i10 + " out of " + i12 + " underlying tasks failed", this.A));
                return;
            }
            if (this.B) {
                oVar.q();
            } else {
                oVar.p(null);
            }
        }
    }

    @Override // ib.e
    public final void d(Object obj) {
        synchronized (this.f18366u) {
            this.f18369x++;
            b();
        }
    }

    @Override // ib.d
    public final void w(Exception exc) {
        synchronized (this.f18366u) {
            this.f18370y++;
            this.A = exc;
            b();
        }
    }
}
