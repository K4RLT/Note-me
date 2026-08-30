package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class cc0 implements ai {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5074u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h00 f5075v;

    public /* synthetic */ cc0(h00 h00Var, int i) {
        this.f5074u = i;
        this.f5075v = h00Var;
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final /* synthetic */ void k(zh zhVar) {
        String str;
        switch (this.f5074u) {
            case 0:
                HashMap hashMap = new HashMap();
                if (true != zhVar.f13171j) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                this.f5075v.b("onAdVisibilityChanged", hashMap);
                return;
            case 1:
                Rect rect = zhVar.f13167d;
                this.f5075v.j0().o(rect.left, rect.top);
                return;
            default:
                Rect rect2 = zhVar.f13167d;
                this.f5075v.j0().o(rect2.left, rect2.top);
                return;
        }
    }
}
