package k9;

import android.content.Context;
import g9.m1;
import g9.y1;

/* loaded from: classes.dex */
public final class h extends m1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f19696u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f19697v;

    public h(j jVar, Context context) {
        this.f19696u = context;
        this.f19697v = jVar;
    }

    @Override // g9.n1
    public final void n4(y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        this.f19697v.i(this.f19696u, y1Var.f17715v, true, true);
    }
}
