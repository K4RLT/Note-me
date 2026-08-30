package b5;
import a.a;

import a0.j0;
import a6.f;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import d5.d;
import d5.e;
import pf.b0;
import pf.l0;
import te.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f1713a;

    public b(d dVar) {
        this.f1713a = dVar;
    }

    public static final b b(Context context) {
        int i;
        d dVar;
        context.getClass();
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        z4.a aVar = z4.a.f31910a;
        if (i10 >= 30) {
            i = aVar.a();
        } else {
            i = 0;
        }
        sb2.append(i);
        Log.d("MeasurementManager", sb2.toString());
        if (i10 >= 30) {
            i11 = aVar.a();
        }
        if (i11 >= 5) {
            dVar = new d(context);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        return new b(dVar);
    }

    public ac.b a(d5.a aVar) {
        throw null;
    }

    public ac.b c() {
        return ff.a(b0.e(b0.b(l0.f22767a), new j0(this, null, 2), 3));
    }

    public ac.b d(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return ff.a(b0.e(b0.b(l0.f22767a), new f(this, uri, inputEvent, (c) null, 1), 3));
    }

    public ac.b e(Uri uri) {
        uri.getClass();
        return ff.a(b0.e(b0.b(l0.f22767a), new a(this, uri, null, 0), 3));
    }

    public ac.b f(e eVar) {
        throw null;
    }

    public ac.b g(d5.f fVar) {
        throw null;
    }
}
