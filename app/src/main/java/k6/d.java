package k6;
import a.a;
import m.b;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b6.r f19552w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f19553x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f19554y;

    public d(b6.r rVar, String str, boolean z3) {
        this.f19552w = rVar;
        this.f19553x = str;
        this.f19554y = z3;
    }

    @Override // jg.a
    public final void c() {
        b6.r rVar = this.f19552w;
        WorkDatabase workDatabase = rVar.f1774c;
        workDatabase.c();
        try {
            ArrayList h3 = workDatabase.C().h(this.f19553x);
            int size = h3.size();
            int i = 0;
            while (i < size) {
                Object obj = h3.get(i);
                i++;
                jg.a(rVar, (String) obj);
            }
            workDatabase.v();
            workDatabase.h();
            if (this.f19554y) {
                b6.b(rVar.f1773b, workDatabase, rVar.e);
            }
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
