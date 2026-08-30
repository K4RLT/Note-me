package gc;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import eb.q1;
import eb.s1;
import java.util.HashSet;
import pd.c;
import zb.e;

/* loaded from: classes.dex */
public final class b implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17743b;

    public /* synthetic */ b(int i, Object obj) {
        this.f17742a = i;
        this.f17743b = obj;
    }

    @Override // eb.s1
    public final void a(long j10, Bundle bundle, String str, String str2) {
        int i = this.f17742a;
        Object obj = this.f17743b;
        switch (i) {
            case 0:
                iw iwVar = (iw) obj;
                if (((HashSet) iwVar.f14489v).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    e eVar = a.f17737a;
                    String c10 = q1.c(str2, q1.f16327g, q1.e);
                    if (c10 != null) {
                        str2 = c10;
                    }
                    bundle2.putString("events", str2);
                    ((gw) iwVar.f14490w).A(2, bundle2);
                    return;
                }
                return;
            default:
                if (str != null && !a.f17737a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j10);
                    bundle3.putBundle("params", bundle);
                    ((gw) ((c) obj).f22681u).A(3, bundle3);
                    return;
                }
                return;
        }
    }
}
