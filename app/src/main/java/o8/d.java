package o8;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.internal.ads.z11;
import j.i0;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final z11 f21863a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f21864b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21865c;

    public d(Context context, i0 i0Var) {
        z11 z11Var = new z11(context);
        this.f21865c = new HashMap();
        this.f21863a = z11Var;
        this.f21864b = i0Var;
    }

    public final synchronized e a(String str) {
        if (this.f21865c.containsKey(str)) {
            return (e) this.f21865c.get(str);
        }
        CctBackendFactory h3 = this.f21863a.h(str);
        if (h3 == null) {
            return null;
        }
        i0 i0Var = this.f21864b;
        e create = h3.create(new b((Context) i0Var.f18636v, (w8.a) i0Var.f18637w, (w8.a) i0Var.f18638x, str));
        this.f21865c.put(str, create);
        return create;
    }
}
