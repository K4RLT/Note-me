package eb;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16177u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16178v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f16179w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f16180x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f16181y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f16182z;

    public /* synthetic */ i1(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i) {
        this.f16177u = i;
        this.f16178v = obj2;
        this.f16179w = obj3;
        this.f16181y = obj4;
        this.f16180x = j10;
        this.f16182z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16177u) {
            case 0:
                String str = (String) this.f16179w;
                h3 h3Var = ((f1) this.f16182z).f16128u;
                String str2 = (String) this.f16178v;
                if (str2 == null) {
                    h3Var.h().u();
                    String str3 = h3Var.Z;
                    if (str3 == null || str3.equals(str)) {
                        h3Var.Z = str;
                        h3Var.Y = null;
                        return;
                    }
                    return;
                }
                k2 k2Var = new k2(this.f16180x, (String) this.f16181y, str2);
                h3Var.h().u();
                String str4 = h3Var.Z;
                if (str4 != null) {
                    str4.equals(str);
                }
                h3Var.Z = str;
                h3Var.Y = k2Var;
                return;
            case 1:
                t1 t1Var = (t1) this.f16182z;
                String str5 = (String) this.f16178v;
                String str6 = (String) this.f16179w;
                t1Var.C(this.f16180x, this.f16181y, str5, str6);
                return;
            default:
                l2 l2Var = (l2) this.f16182z;
                Bundle bundle = (Bundle) this.f16178v;
                k2 k2Var2 = (k2) this.f16179w;
                k2 k2Var3 = (k2) this.f16181y;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                l2Var.F(k2Var2, k2Var3, this.f16180x, true, l2Var.t().E("screen_view", bundle, null, false));
                return;
        }
    }
}
