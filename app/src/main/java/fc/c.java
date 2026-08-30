package fc;
import a.a;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import eb.x;
import fa.y;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import z5.h;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f16948c;

    /* renamed from: a, reason: collision with root package name */
    public final h f16949a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16950b;

    public c(h hVar) {
        y.h(hVar);
        this.f16949a = hVar;
        this.f16950b = new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle, String str2) {
        if (!gc.a.d(str) || !gc.a(str2, bundle) || !gc.a.c(str, bundle, str2)) {
            return;
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        f1 f1Var = (f1) this.f16949a.f31922v;
        f1Var.e(new h1(f1Var, str, str2, bundle, true, 2));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, pd.c] */
    public final x b(String str, gw gwVar) {
        iw iwVar;
        if (gc.a.d(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f16950b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                h hVar = this.f16949a;
                if (equals) {
                    iw iwVar2 = new iw(15, false);
                    iwVar2.f14490w = gwVar;
                    hVar.m(new gc.b(0, iwVar2));
                    iwVar2.f14489v = new HashSet();
                    iwVar = iwVar2;
                } else if ("clx".equals(str)) {
                    Object obj = new Object();
                    obj.f22681u = gwVar;
                    hVar.m(new gc.b(1, obj));
                    iwVar = obj;
                } else {
                    iwVar = null;
                }
                if (iwVar != null) {
                    concurrentHashMap.put(str, iwVar);
                    return new x(21);
                }
            }
        }
        return null;
    }
}