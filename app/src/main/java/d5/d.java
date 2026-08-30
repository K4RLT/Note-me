package d5;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import pe.z;
import pf.l;
import ya.rc;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f15729a;

    public d(Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) androidx.ink.rendering.android.canvas.internal.a.C());
        systemService.getClass();
        this.f15729a = androidx.ink.rendering.android.canvas.internal.a.d(systemService);
    }

    public Object a(a aVar, te.c cVar) {
        new l(1, rc.b(cVar)).s();
        b.q();
        throw null;
    }

    public Object b(te.c cVar) {
        l lVar = new l(1, rc.b(cVar));
        lVar.s();
        this.f15729a.getMeasurementApiStatus(new c(0), new l3.b(lVar));
        return lVar.r();
    }

    public Object c(Uri uri, InputEvent inputEvent, te.c cVar) {
        l lVar = new l(1, rc.b(cVar));
        lVar.s();
        this.f15729a.registerSource(uri, inputEvent, new c(0), new l3.b(lVar));
        Object r8 = lVar.r();
        if (r8 == ue.a.f27192u) {
            return r8;
        }
        return z.f22715a;
    }

    public Object d(Uri uri, te.c cVar) {
        l lVar = new l(1, rc.b(cVar));
        lVar.s();
        this.f15729a.registerTrigger(uri, new c(0), new l3.b(lVar));
        Object r8 = lVar.r();
        if (r8 == ue.a.f27192u) {
            return r8;
        }
        return z.f22715a;
    }

    public Object e(e eVar, te.c cVar) {
        new l(1, rc.b(cVar)).s();
        b.B();
        throw null;
    }

    public Object f(f fVar, te.c cVar) {
        new l(1, rc.b(cVar)).s();
        b.C();
        throw null;
    }
}
