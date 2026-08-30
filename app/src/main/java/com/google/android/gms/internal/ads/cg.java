package com.google.android.gms.internal.ads;
import ca.g;
import d9.b;

import java.io.IOException;

/* loaded from: classes.dex */
public final class cg implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5084u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ dg f5085v;

    public /* synthetic */ cg(dg dgVar, int i) {
        this.f5084u = i;
        this.f5085v = dgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5084u) {
            case 0:
                dg dgVar = this.f5085v;
                dgVar.getClass();
                try {
                    if (dgVar.f5422f == null && dgVar.f5423g) {
                        b bVar = new b(dgVar.f5418a, 30000L, false);
                        bVar.d(true);
                        dgVar.f5422f = bVar;
                        return;
                    }
                    return;
                } catch (g | IOException unused) {
                    dgVar.f5422f = null;
                    return;
                }
            default:
                sl.a(this.f5085v.f5418a);
                return;
        }
    }
}
