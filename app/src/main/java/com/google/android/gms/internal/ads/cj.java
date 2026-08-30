package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class cj extends f9.b {
    public final /* synthetic */ int S;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cj(android.content.Context r11, android.os.Looper r12, fa.b r13, fa.c r14, int r15) {
        /*
            r10 = this;
            r10.S = r15
            switch(r15) {
                case 2: goto L1a;
                default: goto L5;
            }
        L5:
            int r15 = com.google.android.gms.internal.ads.jv.f7549a
            android.content.Context r15 = r11.getApplicationContext()
            if (r15 != 0) goto Lf
            r1 = r11
            goto L10
        Lf:
            r1 = r15
        L10:
            r3 = 123(0x7b, float:1.72E-43)
            r0 = r10
            r2 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1a:
            r2 = r12
            r4 = r13
            r5 = r14
            int r12 = com.google.android.gms.internal.ads.jv.f7549a
            android.content.Context r12 = r11.getApplicationContext()
            if (r12 != 0) goto L26
            goto L27
        L26:
            r11 = r12
        L27:
            r7 = 8
            r6 = r2
            r8 = r4
            r9 = r5
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cj.<init>(android.content.Context, android.os.Looper, fa.b, fa.c, int):void");
    }

    public boolean A() {
        int i;
        ca.d[] j10 = j();
        if (((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue()) {
            if (j10 != null) {
                i = j10.length;
            } else {
                i = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    break;
                }
                if (fa.y.l(j10[i10], z8.u.f32009b)) {
                    if (i10 >= 0) {
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    @Override // fa.e
    public int i() {
        switch (this.S) {
            case 2:
                return 254730000;
            default:
                return super.i();
        }
    }

    @Override // fa.e
    public final IInterface n(IBinder iBinder) {
        switch (this.S) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                if (queryLocalInterface instanceof ej) {
                    return (ej) queryLocalInterface;
                }
                return new oh(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 0);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                if (queryLocalInterface2 instanceof bq) {
                    return (bq) queryLocalInterface2;
                }
                return new oh(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (queryLocalInterface3 instanceof wu) {
                    return (wu) queryLocalInterface3;
                }
                return new oh(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 0);
        }
    }

    @Override // fa.e
    public ca.d[] q() {
        switch (this.S) {
            case 0:
                return z8.u.f32010c;
            default:
                return super.q();
        }
    }

    @Override // fa.e
    public final String u() {
        switch (this.S) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // fa.e
    public final String v() {
        switch (this.S) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(Context context, Looper looper, int i, fa.b bVar, fa.c cVar) {
        super(context, looper, i, bVar, cVar);
        this.S = 1;
    }
}
