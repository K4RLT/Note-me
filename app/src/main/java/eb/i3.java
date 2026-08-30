package eb;
import d1.d;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class i3 implements o0, n3 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h3 f16183u;

    public /* synthetic */ i3(h3 h3Var) {
        this.f16183u = h3Var;
    }

    @Override // eb.o0
    public void e(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.f16183u.v(str, i, th, bArr, map);
    }

    @Override // eb.n3
    public void f0(String str, Bundle bundle, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        h3 h3Var = this.f16183u;
        if (isEmpty) {
            d1 d1Var = h3Var.F;
            if (d1Var != null) {
                k0 k0Var = d1Var.C;
                d(k0Var);
                k0Var.A.f(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        h3Var.h().D(new b9.a(this, str, str2, bundle));
    }
}
