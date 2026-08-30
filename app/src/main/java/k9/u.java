package k9;

import android.content.Context;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.xx;

/* loaded from: classes.dex */
public final class u extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final l9.l f19719w;

    /* renamed from: x, reason: collision with root package name */
    public final String f19720x;

    /* renamed from: y, reason: collision with root package name */
    public final ic.c f19721y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, String str, String str2, ic.c cVar) {
        super(3);
        String E = f9.k.C.f16813c.E(context, str);
        this.f19719w = new l9.l(context, E);
        this.f19720x = str2;
        this.f19721y = cVar;
    }

    @Override // c1.a
    public final void q() {
        String str = this.f19720x;
        ic.c cVar = this.f19721y;
        l9.l lVar = this.f19719w;
        if (cVar != null) {
            new p8((l9.h) cVar.f18393v, lVar, xx.e, null, null, 9).b(str);
        } else {
            lVar.a(null, str);
        }
    }
}
