package g6;

import a6.q;
import android.os.Build;
import j6.p;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f17556c = q.f("NetworkMeteredCtrlr");

    /* renamed from: b, reason: collision with root package name */
    public final int f17557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h6.e eVar) {
        super(eVar);
        eVar.getClass();
        this.f17557b = 7;
    }

    @Override // g6.c
    public final int a() {
        return this.f17557b;
    }

    @Override // g6.c
    public final boolean b(p pVar) {
        if (pVar.f18951j.f258a == 5) {
            return true;
        }
        return false;
    }

    @Override // g6.c
    public final boolean c(Object obj) {
        f6.d dVar = (f6.d) obj;
        dVar.getClass();
        boolean z3 = dVar.f16759a;
        if (Build.VERSION.SDK_INT < 26) {
            q.d().a(f17556c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z3) {
                return false;
            }
            return true;
        }
        if (z3 && dVar.f16761c) {
            return false;
        }
        return true;
    }
}
