package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final /* synthetic */ class x20 implements j81 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x20 f12429b = new x20(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x20 f12430c = new x20(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x20 f12431d = new x20(3);
    public static final /* synthetic */ x20 e = new x20(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x20 f12432f = new x20(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x20 f12433g = new x20(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x20 f12434h = new x20(8);
    public static final /* synthetic */ x20 i = new x20(9);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x20 f12435j = new x20(10);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x20 f12436k = new x20(11);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ x20 f12437l = new x20(12);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x20 f12438m = new x20(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ x20 f12439n = new x20(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12440a;

    public /* synthetic */ x20(int i10) {
        this.f12440a = i10;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        int i10 = -1;
        String str = "";
        int i11 = 0;
        String str2 = null;
        int i12 = 1;
        switch (this.f12440a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) g9.r.e.f17698c.a(sl.Pb)).booleanValue()) {
                    f9.k.C.f16817h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    f9.k.C.f16817h.e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                b51 b51Var = d51.f5314v;
                return ed1.e(new e5.b(y51.f12781y));
            case 1:
                k9.a0.l("Error during loading assets.", (Exception) obj);
                return v81.f11836v;
            case 2:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return ed1.A(th2);
            case 3:
                return ed1.A(new cg0(5));
            case 4:
                return ed1.e(((wg0) obj).f12238a);
            case 5:
                return v81.f11836v;
            case 6:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return ed1.A(th3);
            case 7:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                xx.f12651a.execute(new t81((InputStream) obj, 24, createPipe[1]));
                return ed1.e(parcelFileDescriptor);
            case 8:
                if (((Throwable) obj) instanceof TimeoutException) {
                    return ed1.e(new ql0(Integer.toString(17), i12));
                }
                return ed1.e(new ql0(str2, i12));
            case 9:
                return ed1.e(new ql0((String) obj, i12));
            case 10:
                y9.b bVar = (y9.b) obj;
                if (bVar == null) {
                    return ed1.e(new dm0(str2, i10, i11));
                }
                return ed1.e(new dm0(bVar.f30998a, bVar.f30999b, i11));
            case 11:
                e5.b bVar2 = (e5.b) obj;
                if (bVar2 == null) {
                    return ed1.e(new dm0(str, i12, i12));
                }
                kp1 z3 = lp1.z();
                for (e5.c cVar : bVar2.f15912a) {
                    ip1 z9 = jp1.z();
                    int i13 = cVar.f15915c;
                    z9.b();
                    ((jp1) z9.f4845v).A(i13);
                    long j10 = cVar.f15914b;
                    z9.b();
                    ((jp1) z9.f4845v).B(j10);
                    long j11 = cVar.f15913a;
                    z9.b();
                    ((jp1) z9.f4845v).C(j11);
                    jp1 jp1Var = (jp1) z9.c();
                    z3.b();
                    ((lp1) z3.f4845v).A(jp1Var);
                }
                return ed1.e(new dm0(Base64.encodeToString(((lp1) z3.c()).b(), 1), i12, i12));
            case 12:
                y9.b bVar3 = (y9.b) obj;
                int i14 = 2;
                if (bVar3 == null) {
                    return ed1.e(new dm0(str2, i10, i14));
                }
                return ed1.e(new dm0(bVar3.f30998a, bVar3.f30999b, i14));
            case 13:
                return v81.f11836v;
            case 14:
                return ed1.e("");
            default:
                wy0 wy0Var = (wy0) obj;
                return ed1.d0(wy0Var.zzb(), new cv(8, wy0Var), o81.f9033u);
        }
    }
}
