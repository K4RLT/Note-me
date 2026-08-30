package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.an1;
import com.google.android.gms.internal.ads.ap0;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.cl0;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.h30;
import com.google.android.gms.internal.ads.ht0;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.mp0;
import com.google.android.gms.internal.ads.no0;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.oo0;
import com.google.android.gms.internal.ads.op0;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qe0;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.s20;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tr1;
import com.google.android.gms.internal.ads.tt;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.uk0;
import com.google.android.gms.internal.ads.um0;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.w50;
import com.google.android.gms.internal.ads.wf0;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.wk0;
import com.google.android.gms.internal.ads.wv;
import com.google.android.gms.internal.ads.x21;
import com.google.android.gms.internal.ads.y10;
import com.google.android.gms.internal.ads.ya0;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.yp;
import com.google.android.gms.internal.ads.za0;
import com.google.android.gms.internal.ads.zt;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import f9.j;
import g9.c3;
import g9.f1;
import g9.g0;
import g9.k0;
import g9.r0;
import g9.s1;
import g9.w0;
import j9.d;
import java.util.HashMap;
import oa.a;
import oa.b;
import s9.i;

/* loaded from: classes.dex */
public class ClientApi extends ph implements w0 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // g9.w0
    public final g0 A3(a aVar, String str, vr vrVar, int i) {
        Context context = (Context) b.z1(aVar);
        return new uk0(y10.a(context, vrVar, i), context, str);
    }

    @Override // g9.w0
    public final eo C2(a aVar, a aVar2) {
        return new za0((FrameLayout) b.z1(aVar), (FrameLayout) b.z1(aVar2));
    }

    @Override // g9.w0
    public final k0 F3(a aVar, c3 c3Var, String str, vr vrVar, int i) {
        Context context = (Context) b.z1(aVar);
        y10 y10Var = y10.a(context, vrVar, i).f12709b;
        context.getClass();
        c3Var.getClass();
        str.getClass();
        return (cl0) new i20(y10Var, context, str, c3Var).f6968a.zzb();
    }

    @Override // g9.w0
    public final r0 H2(a aVar, vr vrVar, int i) {
        return (ht0) y10.a((Context) b.z1(aVar), vrVar, i).I.zzb();
    }

    @Override // g9.w0
    public final wv O2(a aVar, String str, vr vrVar, int i) {
        Context context = (Context) b.z1(aVar);
        y10 y10Var = y10.a(context, vrVar, i).f12709b;
        context.getClass();
        return (mp0) ((rr1) new pw(y10Var, context, str).f14822w).zzb();
    }

    @Override // g9.w0
    public final fx P1(a aVar, vr vrVar, int i) {
        return (i) y10.a((Context) b.z1(aVar), vrVar, i).T.zzb();
    }

    @Override // g9.w0
    public final k0 f3(a aVar, c3 c3Var, String str, vr vrVar, int i) {
        Context context = (Context) b.z1(aVar);
        y10 y10Var = y10.a(context, vrVar, i).f12709b;
        context.getClass();
        c3Var.getClass();
        str.getClass();
        tr1 a10 = tr1.a(context);
        tr1 a11 = tr1.a(c3Var);
        rr1 rr1Var = y10Var.f12728m;
        rr1 a12 = rr1.a(new s20(rr1Var, 27));
        oo0 oo0Var = (oo0) rr1.a(new w50(a10, y10Var.f12711c, a11, y10Var.J, a12, rr1.a(an1.D), rr1.a(x21.Z))).zzb();
        yk0 yk0Var = (yk0) a12.zzb();
        l9.a aVar2 = (l9.a) y10Var.f12707a.f7599b;
        lo1.b(aVar2);
        return new wk0(context, c3Var, str, oo0Var, yk0Var, aVar2, (be0) rr1Var.zzb());
    }

    @Override // g9.w0
    public final s1 m4(a aVar, vr vrVar, int i) {
        return (wf0) y10.a((Context) b.z1(aVar), vrVar, i).B.zzb();
    }

    @Override // g9.w0
    public final tt p3(a aVar, vr vrVar, int i) {
        return (wh0) y10.a((Context) b.z1(aVar), vrVar, i).P.zzb();
    }

    @Override // g9.w0
    public final k0 s4(a aVar, c3 c3Var, String str, vr vrVar, int i) {
        Context context = (Context) b.z1(aVar);
        y10 y10Var = y10.a(context, vrVar, i).f12709b;
        str.getClass();
        context.getClass();
        tr1 a10 = tr1.a(context);
        tr1 a11 = tr1.a(str);
        rr1 rr1Var = y10Var.L0;
        ap0 ap0Var = new ap0(a10, rr1Var, y10Var.M0, 0);
        rr1 a12 = rr1.a(new um0(rr1Var, 10));
        rr1 rr1Var2 = y10Var.f12711c;
        tr1 tr1Var = y10Var.J;
        u10 u10Var = y10Var.f12720h;
        return (no0) rr1.a(new w50(tr1Var, a10, a11, rr1.a(new h30(a10, rr1Var2, tr1Var, ap0Var, a12, u10Var)), a12, u10Var, y10Var.f12728m)).zzb();
    }

    @Override // g9.w0
    public final f1 u1(a aVar, int i) {
        return (p20) y10.a((Context) b.z1(aVar), null, i).H.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        yp ypVar = null;
        switch (i) {
            case 1:
                a v12 = b.v1(parcel.readStrongBinder());
                c3 c3Var = (c3) qh.b(parcel, c3.CREATOR);
                String readString = parcel.readString();
                vr v4 = tr.v4(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                qh.f(parcel);
                k0 f32 = f3(v12, c3Var, readString, v4, readInt);
                parcel2.writeNoException();
                qh.e(parcel2, f32);
                return true;
            case 2:
                a v13 = b.v1(parcel.readStrongBinder());
                c3 c3Var2 = (c3) qh.b(parcel, c3.CREATOR);
                String readString2 = parcel.readString();
                vr v42 = tr.v4(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                qh.f(parcel);
                k0 F3 = F3(v13, c3Var2, readString2, v42, readInt2);
                parcel2.writeNoException();
                qh.e(parcel2, F3);
                return true;
            case 3:
                a v14 = b.v1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                vr v43 = tr.v4(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                qh.f(parcel);
                g0 A3 = A3(v14, readString3, v43, readInt3);
                parcel2.writeNoException();
                qh.e(parcel2, A3);
                return true;
            case 4:
                b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a v15 = b.v1(parcel.readStrongBinder());
                a v16 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                eo C2 = C2(v15, v16);
                parcel2.writeNoException();
                qh.e(parcel2, C2);
                return true;
            case 6:
                a v17 = b.v1(parcel.readStrongBinder());
                vr v44 = tr.v4(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                qh.f(parcel);
                Context context = (Context) b.z1(v17);
                y10 y10Var = y10.a(context, v44, readInt4).f12709b;
                context.getClass();
                op0 op0Var = (op0) ((rr1) new pw(y10Var, context, (String) null).f14821v).zzb();
                parcel2.writeNoException();
                qh.e(parcel2, op0Var);
                return true;
            case 7:
                b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a v18 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                zt zzf = zzf(v18);
                parcel2.writeNoException();
                qh.e(parcel2, zzf);
                return true;
            case 9:
                a v19 = b.v1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                qh.f(parcel);
                f1 u12 = u1(v19, readInt5);
                parcel2.writeNoException();
                qh.e(parcel2, u12);
                return true;
            case 10:
                a v110 = b.v1(parcel.readStrongBinder());
                c3 c3Var3 = (c3) qh.b(parcel, c3.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                qh.f(parcel);
                j jVar = new j((Context) b.z1(v110), c3Var3, readString4, new l9.a(ModuleDescriptor.MODULE_VERSION, readInt6, 0, true, false));
                parcel2.writeNoException();
                qh.e(parcel2, jVar);
                return true;
            case 11:
                a v111 = b.v1(parcel.readStrongBinder());
                a v112 = b.v1(parcel.readStrongBinder());
                a v113 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                ya0 ya0Var = new ya0((View) b.z1(v111), (HashMap) b.z1(v112), (HashMap) b.z1(v113));
                parcel2.writeNoException();
                qh.e(parcel2, ya0Var);
                return true;
            case 12:
                a v114 = b.v1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                vr v45 = tr.v4(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                qh.f(parcel);
                wv O2 = O2(v114, readString5, v45, readInt7);
                parcel2.writeNoException();
                qh.e(parcel2, O2);
                return true;
            case 13:
                a v115 = b.v1(parcel.readStrongBinder());
                c3 c3Var4 = (c3) qh.b(parcel, c3.CREATOR);
                String readString6 = parcel.readString();
                vr v46 = tr.v4(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                qh.f(parcel);
                k0 s42 = s4(v115, c3Var4, readString6, v46, readInt8);
                parcel2.writeNoException();
                qh.e(parcel2, s42);
                return true;
            case 14:
                a v116 = b.v1(parcel.readStrongBinder());
                vr v47 = tr.v4(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                qh.f(parcel);
                fx P1 = P1(v116, v47, readInt9);
                parcel2.writeNoException();
                qh.e(parcel2, P1);
                return true;
            case 15:
                a v117 = b.v1(parcel.readStrongBinder());
                vr v48 = tr.v4(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                qh.f(parcel);
                tt p32 = p3(v117, v48, readInt10);
                parcel2.writeNoException();
                qh.e(parcel2, p32);
                return true;
            case 16:
                a v118 = b.v1(parcel.readStrongBinder());
                vr v49 = tr.v4(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    if (queryLocalInterface instanceof yp) {
                        ypVar = (yp) queryLocalInterface;
                    } else {
                        ypVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 0);
                    }
                }
                qh.f(parcel);
                Context context2 = (Context) b.z1(v118);
                y10 y10Var2 = y10.a(context2, v49, readInt11).f12709b;
                context2.getClass();
                ypVar.getClass();
                qe0 qe0Var = (qe0) new f20(y10Var2, context2, ypVar).e.zzb();
                parcel2.writeNoException();
                qh.e(parcel2, qe0Var);
                return true;
            case 17:
                a v119 = b.v1(parcel.readStrongBinder());
                vr v410 = tr.v4(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                qh.f(parcel);
                s1 m4 = m4(v119, v410, readInt12);
                parcel2.writeNoException();
                qh.e(parcel2, m4);
                return true;
            case 18:
                a v120 = b.v1(parcel.readStrongBinder());
                vr v411 = tr.v4(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                qh.f(parcel);
                r0 H2 = H2(v120, v411, readInt13);
                parcel2.writeNoException();
                qh.e(parcel2, H2);
                return true;
            default:
                return false;
        }
    }

    @Override // g9.w0
    public final zt zzf(a aVar) {
        Activity activity = (Activity) b.z1(aVar);
        AdOverlayInfoParcel a10 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a10 == null) {
            return new d(activity, 4);
        }
        int i = a10.E;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return new d(activity, 4);
                        }
                        return new d(activity, 0);
                    }
                    return new j9.b(activity, a10);
                }
                return new d(activity, 2);
            }
            return new d(activity, 1);
        }
        return new d(activity, 3);
    }
}
