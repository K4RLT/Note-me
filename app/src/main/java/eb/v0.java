package eb;

import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16437a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ u0 f16438b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f16439c;

    public /* synthetic */ v0(int i) {
        this.f16437a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16437a) {
            case 0:
                pw pwVar = new pw(14, this.f16438b, this.f16439c, false);
                com.google.android.gms.internal.measurement.b bVar = new com.google.android.gms.internal.measurement.b("internal.remoteConfig", 1);
                bVar.f13785v.put("getValue", new l5(pwVar));
                return bVar;
            case 1:
                u0 u0Var = this.f16438b;
                String str = this.f16439c;
                n0 p02 = u0Var.w().p0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                hashMap.put("gmp_version", 97001L);
                if (p02 != null) {
                    String h3 = p02.h();
                    if (h3 != null) {
                        hashMap.put("app_version", h3);
                    }
                    hashMap.put("app_version_int", Long.valueOf(p02.z()));
                    hashMap.put("dynamite_version", Long.valueOf(p02.O()));
                }
                return hashMap;
            default:
                u0 u0Var2 = this.f16438b;
                String str2 = this.f16439c;
                v0 v0Var = new v0(1);
                v0Var.f16438b = u0Var2;
                v0Var.f16439c = str2;
                return new l5(v0Var);
        }
    }
}
