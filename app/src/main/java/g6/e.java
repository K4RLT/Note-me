package g6;

import a6.q;
import j6.p;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f17558b;

    static {
        q.f("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h6.e eVar) {
        super(eVar);
        eVar.getClass();
        this.f17558b = 7;
    }

    @Override // g6.c
    public final int a() {
        return this.f17558b;
    }

    @Override // g6.c
    public final boolean b(p pVar) {
        if (pVar.f18951j.f258a == 4) {
            return true;
        }
        return false;
    }

    @Override // g6.c
    public final boolean c(Object obj) {
        f6.d dVar = (f6.d) obj;
        dVar.getClass();
        if (dVar.f16759a && dVar.f16762d) {
            return false;
        }
        return true;
    }
}
