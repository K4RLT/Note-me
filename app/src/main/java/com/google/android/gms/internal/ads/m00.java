package com.google.android.gms.internal.ads;
import a5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class m00 implements a10 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8197u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ fj f8198v;

    public /* synthetic */ m00(fj fjVar, int i) {
        this.f8197u = i;
        this.f8198v = fjVar;
    }

    @Override // com.google.android.gms.internal.ads.a10
    public final void h(String str, int i, String str2, boolean z3) {
        switch (this.f8197u) {
            case 0:
                this.f8198v.d();
                return;
            default:
                fj fjVar = this.f8198v;
                if (z3) {
                    fjVar.d();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                sb2.append("Image Web View failed to load. Error code: ");
                sb2.append(i);
                sb2.append(", Description: ");
                sb2.append(str);
                fjVar.c(new cg0(1, a5.a.k(sb2, ", Failing URL: ", str2)));
                return;
        }
    }
}
