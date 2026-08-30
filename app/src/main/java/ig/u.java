package ig;
import n.a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public final q f18580u;

    /* renamed from: v, reason: collision with root package name */
    public final mg.f f18581v;

    /* renamed from: w, reason: collision with root package name */
    public final s f18582w;

    /* renamed from: x, reason: collision with root package name */
    public b f18583x;

    /* renamed from: y, reason: collision with root package name */
    public final a4.b f18584y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18585z;

    public u(q qVar, a4.b bVar) {
        this.f18580u = qVar;
        this.f18584y = bVar;
        this.f18581v = new mg.f(qVar);
        s sVar = new s(0, this);
        this.f18582w = sVar;
        sVar.g(0);
    }

    public final void a() {
        mg.b bVar;
        lg.b bVar2;
        mg.f fVar = this.f18581v;
        fVar.f20829d = true;
        lg.e eVar = fVar.f20827b;
        if (eVar != null) {
            synchronized (eVar.f20390d) {
                eVar.f20397m = true;
                bVar = eVar.f20398n;
                bVar2 = eVar.f20394j;
            }
            if (bVar != null) {
                bVar.cancel();
            } else if (bVar2 != null) {
                jg.b.e(bVar2.f20374d);
            }
        }
    }

    public final w b() {
        synchronized (this) {
            if (!this.f18585z) {
                this.f18585z = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f18581v.f20828c = pg.h.f22833a.j();
        this.f18582w.j();
        this.f18583x.getClass();
        try {
            try {
                nd.o oVar = this.f18580u.f18564u;
                synchronized (oVar) {
                    ((ArrayDeque) oVar.f21273w).add(this);
                }
                return c();
            } catch (IOException e) {
                IOException e8 = e(e);
                this.f18583x.getClass();
                throw e8;
            }
        } finally {
            nd.o oVar2 = this.f18580u.f18564u;
            oVar2.i((ArrayDeque) oVar2.f21273w, this);
        }
    }

    public final w c() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f18580u;
        arrayList.addAll(qVar.f18568y);
        arrayList.add(this.f18581v);
        arrayList.add(new lg.a(1, qVar.C));
        int i = 0;
        arrayList.add(new kg.a(i));
        arrayList.add(new lg.a(i, qVar));
        arrayList.addAll(qVar.f18569z);
        arrayList.add(new kg.a(1));
        b bVar = this.f18583x;
        int i10 = qVar.P;
        int i11 = qVar.Q;
        int i12 = qVar.R;
        a4.b bVar2 = this.f18584y;
        return new mg.e(arrayList, null, null, null, 0, bVar2, this, bVar, i10, i11, i12).a(bVar2);
    }

    public final Object clone() {
        q qVar = this.f18580u;
        u uVar = new u(qVar, this.f18584y);
        qVar.A.getClass();
        uVar.f18583x = b.f18463d;
        return uVar;
    }

    public final String d() {
        m mVar;
        n nVar = (n) this.f18584y.f240c;
        nVar.getClass();
        try {
            mVar = new m();
            mVar.b(nVar, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        mVar.getClass();
        mVar.f18529b = a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        mVar.f18530c = a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return mVar.a().f18541h;
    }

    public final IOException e(IOException iOException) {
        if (!this.f18582w.k()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
