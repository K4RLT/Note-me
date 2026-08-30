package wa;
import da.d;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class i6 {
    public static void a(Status status, Object obj, ib.h hVar) {
        d dVar;
        if (status.f4283u <= 0) {
            hVar.f18363a.r(obj);
            return;
        }
        if (status.f4285w != null) {
            dVar = new d(status);
        } else {
            dVar = new d(status);
        }
        hVar.c(dVar);
    }
}
