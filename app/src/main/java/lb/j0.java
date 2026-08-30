package lb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class j0 implements mb.f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20168u;

    /* renamed from: v, reason: collision with root package name */
    public final k6.i f20169v;

    public /* synthetic */ j0(k6.i iVar, int i) {
        this.f20168u = i;
        this.f20169v = iVar;
    }

    @Override // mb.f
    public final Object b() {
        switch (this.f20168u) {
            case 0:
                return new i0(((c4.n) this.f20169v.f19569v).f3851u);
            case 1:
                return new g1(((c4.n) this.f20169v.f19569v).f3851u);
            default:
                Context context = ((c4.n) this.f20169v.f19569v).f3851u;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        return bundle.getString("local_testing_dir");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
        }
    }
}
