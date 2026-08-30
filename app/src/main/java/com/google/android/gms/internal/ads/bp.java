package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bp extends ph implements uo {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4858u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4859v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f4858u = i;
        this.f4859v = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:6|(2:7|8)|9|(2:10|11)|12|(2:13|14)|15|(2:16|17)|18|(2:19|20)|(4:(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|f9)|51|52|54)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:6|(2:7|8)|9|10|11|12|(2:13|14)|15|(2:16|17)|18|(2:19|20)|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|f9)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:6|(2:7|8)|9|10|11|12|13|14|15|(2:16|17)|18|(2:19|20)|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|f9)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        l9.i.d("Exception occurred while getting video controller", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        l9.i.d("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009f, code lost:
    
        l9.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0092, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0093, code lost:
    
        l9.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[Catch: RemoteException -> 0x00b0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00b0, blocks: (B:31:0x00a5, B:33:0x00ab), top: B:30:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[Catch: RemoteException -> 0x00cd, TRY_LEAVE, TryCatch #5 {RemoteException -> 0x00cd, blocks: (B:37:0x00bf, B:39:0x00c5), top: B:36:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.ads.mediation.a] */
    @Override // com.google.android.gms.internal.ads.uo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h4(com.google.android.gms.internal.ads.xo r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bp.h4(com.google.android.gms.internal.ads.xo):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        xo ohVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                ohVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                if (queryLocalInterface instanceof xo) {
                    ohVar = (xo) queryLocalInterface;
                } else {
                    ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 0);
                }
            }
            qh.f(parcel);
            h4(ohVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
