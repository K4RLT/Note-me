package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mg extends wg {
    public static final lx0 i = new lx0(7);

    /* renamed from: h, reason: collision with root package name */
    public final Context f8344h;

    public mg(dg dgVar, wd wdVar, int i10, Context context) {
        super(dgVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", wdVar, i10, 29);
        this.f8344h = context;
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        wd wdVar = this.f12235d;
        wdVar.b();
        ((je) wdVar.f4845v).z("E");
        Context context = this.f8344h;
        AtomicReference i10 = i.i(context.getPackageName());
        if (i10.get() == null) {
            synchronized (i10) {
                try {
                    if (i10.get() == null) {
                        i10.set((String) this.e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) i10.get();
        wd wdVar2 = this.f12235d;
        synchronized (wdVar2) {
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            wdVar2.b();
            ((je) wdVar2.f4845v).z(encodeToString);
        }
    }
}
