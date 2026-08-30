package ng;

import g5.q;
import java.io.IOException;
import okio.BufferedSource;
import sg.i;
import sg.t;
import sg.v;

/* loaded from: classes.dex */
public abstract class a implements t {

    /* renamed from: u, reason: collision with root package name */
    public final i f21356u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21357v;

    /* renamed from: w, reason: collision with root package name */
    public long f21358w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m2.a f21359x;

    public a(m2.a aVar) {
        this.f21359x = aVar;
        this.f21356u = new i(((BufferedSource) aVar.e).a());
    }

    @Override // sg.t
    public final v a() {
        return this.f21356u;
    }

    public final void f(boolean z3, IOException iOException) {
        m2.a aVar = this.f21359x;
        int i = aVar.f20434a;
        if (i != 6) {
            if (i == 5) {
                i iVar = this.f21356u;
                v vVar = iVar.e;
                iVar.e = v.f25310d;
                vVar.a();
                vVar.b();
                aVar.f20434a = 6;
                lg.e eVar = (lg.e) aVar.f20437d;
                if (eVar != null) {
                    eVar.h(!z3, aVar, iOException);
                    return;
                }
                return;
            }
            q.d(aVar.f20434a, "state: ");
        }
    }

    @Override // sg.t
    public long q(sg.f fVar, long j10) {
        try {
            long q10 = ((BufferedSource) this.f21359x.e).q(fVar, j10);
            if (q10 > 0) {
                this.f21358w += q10;
                return q10;
            }
            return q10;
        } catch (IOException e) {
            f(false, e);
            throw e;
        }
    }
}
