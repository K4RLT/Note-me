package a1;

import android.os.Bundle;
import androidx.lifecycle.y;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements o, m5.e {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f220u;

    /* renamed from: v, reason: collision with root package name */
    public final j6.c f221v;

    /* renamed from: w, reason: collision with root package name */
    public final y f222w;

    /* renamed from: x, reason: collision with root package name */
    public final i0.m f223x;

    public r(p pVar) {
        Bundle bundle;
        this.f220u = pVar;
        j6.c cVar = new j6.c(new o5.b(this, new c(23, this)));
        this.f221v = cVar;
        this.f222w = new y(this, false);
        this.f223x = (i0.m) cVar.f18915w;
        Object e = pVar.e("androidx.savedstate.SavedStateRegistry");
        if (e instanceof Bundle) {
            bundle = (Bundle) e;
        } else {
            bundle = null;
        }
        cVar.f(bundle);
        pVar.d("androidx.savedstate.SavedStateRegistry", new c(1, this));
    }

    @Override // a1.o
    public final boolean b(Object obj) {
        return this.f220u.b(obj);
    }

    @Override // a1.o
    public final Map c() {
        return this.f220u.c();
    }

    @Override // a1.o
    public final n d(String str, df.a aVar) {
        return this.f220u.d(str, aVar);
    }

    @Override // a1.o
    public final Object e(String str) {
        return this.f220u.e(str);
    }

    @Override // m5.e
    public final i0.m f() {
        return this.f223x;
    }

    @Override // androidx.lifecycle.w
    public final y g() {
        return this.f222w;
    }
}
