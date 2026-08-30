package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ug extends wg {

    /* renamed from: h, reason: collision with root package name */
    public final ig f11635h;
    public final long i;

    public ug(dg dgVar, wd wdVar, int i, ig igVar) {
        super(dgVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", wdVar, i, 53);
        View view;
        this.f11635h = igVar;
        if (igVar != null) {
            if (igVar.F <= -2) {
                WeakReference weakReference = igVar.B;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if (view == null) {
                    igVar.F = -3L;
                }
            }
            this.i = igVar.F;
        }
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        if (this.f11635h != null) {
            long longValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            wd wdVar = this.f12235d;
            wdVar.b();
            ((je) wdVar.f4845v).R(longValue);
        }
    }
}
