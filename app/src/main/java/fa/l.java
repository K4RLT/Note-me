package fa;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l implements d, b, c {

    /* renamed from: v, reason: collision with root package name */
    public static l f16893v;

    /* renamed from: w, reason: collision with root package name */
    public static final m f16894w = new m(0, 0, 0, false, false);

    /* renamed from: u, reason: collision with root package name */
    public Object f16895u;

    public l(e eVar) {
        Objects.requireNonNull(eVar);
        this.f16895u = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fa.l, java.lang.Object] */
    public static synchronized l b() {
        l lVar;
        synchronized (l.class) {
            try {
                if (f16893v == null) {
                    f16893v = new Object();
                }
                lVar = f16893v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // fa.b
    public void R(int i) {
        ((da.g) this.f16895u).R(i);
    }

    @Override // fa.d
    public void a(ca.b bVar) {
        boolean z3;
        if (bVar.f4022v == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        e eVar = (e) this.f16895u;
        if (z3) {
            eVar.c(null, eVar.s());
            return;
        }
        c cVar = eVar.J;
        if (cVar != null) {
            cVar.r0(bVar);
        }
    }

    @Override // fa.b
    public void g0() {
        ((da.g) this.f16895u).g0();
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
        ((da.h) this.f16895u).r0(bVar);
    }

    public /* synthetic */ l(Object obj) {
        this.f16895u = obj;
    }
}
