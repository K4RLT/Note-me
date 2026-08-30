package c2;
import g1.b;
import j1.e;
import y2.d;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.j implements df.q {
    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            x xVar = (x) this.receiver;
            Resources resources = xVar.getContext().getResources();
            return Boolean.valueOf(i0.f3554a.a(xVar, null, new b(new d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((e) obj2).f18774a, (df.l) obj3)));
        }
        g5.b();
        return null;
    }
}
