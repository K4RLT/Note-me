package c2;
import a2.c;
import e2.a;
import k0.h1;

import android.view.ActionMode;

/* loaded from: classes.dex */
public final class v0 implements o2 {

    /* renamed from: a, reason: collision with root package name */
    public final x f3663a;

    /* renamed from: b, reason: collision with root package name */
    public ActionMode f3664b;

    /* renamed from: c, reason: collision with root package name */
    public final j.m0 f3665c;

    /* renamed from: d, reason: collision with root package name */
    public p2 f3666d;

    /* JADX WARN: Type inference failed for: r3v1, types: [j.m0, java.lang.Object] */
    public v0(x xVar) {
        this.f3663a = xVar;
        c cVar = new c(6, this);
        Object obj = new Object();
        obj.f18662u = cVar;
        obj.f18663v = c.e;
        obj.f18664w = null;
        obj.f18665x = null;
        obj.f18666y = null;
        obj.f18667z = null;
        obj.A = null;
        this.f3665c = obj;
        this.f3666d = p2.f3622v;
    }

    public final void a(c cVar, df.a aVar, h1 h1Var, df.a aVar2, df.a aVar3, h1 h1Var2) {
        j.m0 m0Var = this.f3665c;
        m0Var.f18663v = cVar;
        m0Var.f18664w = aVar;
        m0Var.f18666y = aVar2;
        m0Var.f18665x = h1Var;
        m0Var.f18667z = aVar3;
        m0Var.A = h1Var2;
        ActionMode actionMode = this.f3664b;
        if (actionMode == null) {
            this.f3666d = p2.f3621u;
            this.f3664b = this.f3663a.startActionMode(new a(m0Var), 1);
            return;
        }
        actionMode.invalidate();
    }
}