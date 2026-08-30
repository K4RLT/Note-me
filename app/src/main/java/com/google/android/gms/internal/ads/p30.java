package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class p30 implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9350u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q30 f9351v;

    public /* synthetic */ p30(q30 q30Var, int i) {
        this.f9350u = i;
        this.f9351v = q30Var;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        switch (this.f9350u) {
            case 0:
                q30 q30Var = this.f9351v;
                q30Var.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(q30Var.f9725a)) {
                        q30Var.f9727c.execute(new f(28, this));
                        return;
                    }
                    return;
                }
                return;
            default:
                q30 q30Var2 = this.f9351v;
                q30Var2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(q30Var2.f9725a)) {
                        q30Var2.f9727c.execute(new f(29, this));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
