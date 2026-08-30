package k6;
import a.a;
import m.b;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b6.r f19549w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ UUID f19550x;

    public b(b6.r rVar, UUID uuid) {
        this.f19549w = rVar;
        this.f19550x = uuid;
    }

    @Override // jg.a
    public final void c() {
        b6.r rVar = this.f19549w;
        WorkDatabase workDatabase = rVar.f1774c;
        workDatabase.c();
        try {
            jg.a(rVar, this.f19550x.toString());
            workDatabase.v();
            workDatabase.h();
            b6.m.b(rVar.f1773b, rVar.f1774c, rVar.e);
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
