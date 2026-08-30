package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.bo;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.tt;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.uv;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.wv;
import com.google.android.gms.internal.ads.xt;
import com.google.android.gms.internal.ads.yt;
import com.google.android.gms.internal.ads.zt;

/* loaded from: classes.dex */
public final class v0 extends oh implements w0 {
    @Override // g9.w0
    public final g0 A3(oa.a aVar, String str, vr vrVar, int i) {
        g0 e0Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeString(str);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 3);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            e0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof g0) {
                e0Var = (g0) queryLocalInterface;
            } else {
                e0Var = new e0(readStrongBinder);
            }
        }
        u22.recycle();
        return e0Var;
    }

    @Override // g9.w0
    public final eo C2(oa.a aVar, oa.a aVar2) {
        eo boVar;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, aVar2);
        Parcel u22 = u2(g22, 5);
        IBinder readStrongBinder = u22.readStrongBinder();
        int i = co.f5136u;
        if (readStrongBinder == null) {
            boVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof eo) {
                boVar = (eo) queryLocalInterface;
            } else {
                boVar = new bo(readStrongBinder);
            }
        }
        u22.recycle();
        return boVar;
    }

    @Override // g9.w0
    public final k0 F3(oa.a aVar, c3 c3Var, String str, vr vrVar, int i) {
        k0 i0Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, c3Var);
        g22.writeString(str);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 2);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            i0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof k0) {
                i0Var = (k0) queryLocalInterface;
            } else {
                i0Var = new i0(readStrongBinder);
            }
        }
        u22.recycle();
        return i0Var;
    }

    @Override // g9.w0
    public final r0 H2(oa.a aVar, vr vrVar, int i) {
        r0 q0Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 18);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            q0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            if (queryLocalInterface instanceof r0) {
                q0Var = (r0) queryLocalInterface;
            } else {
                q0Var = new q0(readStrongBinder);
            }
        }
        u22.recycle();
        return q0Var;
    }

    @Override // g9.w0
    public final wv O2(oa.a aVar, String str, vr vrVar, int i) {
        wv tvVar;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeString(str);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 12);
        IBinder readStrongBinder = u22.readStrongBinder();
        int i10 = uv.f11728u;
        if (readStrongBinder == null) {
            tvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof wv) {
                tvVar = (wv) queryLocalInterface;
            } else {
                tvVar = new tv(readStrongBinder);
            }
        }
        u22.recycle();
        return tvVar;
    }

    @Override // g9.w0
    public final fx P1(oa.a aVar, vr vrVar, int i) {
        fx dxVar;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 14);
        IBinder readStrongBinder = u22.readStrongBinder();
        int i10 = ex.f5848u;
        if (readStrongBinder == null) {
            dxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof fx) {
                dxVar = (fx) queryLocalInterface;
            } else {
                dxVar = new dx(readStrongBinder);
            }
        }
        u22.recycle();
        return dxVar;
    }

    @Override // g9.w0
    public final k0 f3(oa.a aVar, c3 c3Var, String str, vr vrVar, int i) {
        k0 i0Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, c3Var);
        g22.writeString(str);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 1);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            i0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof k0) {
                i0Var = (k0) queryLocalInterface;
            } else {
                i0Var = new i0(readStrongBinder);
            }
        }
        u22.recycle();
        return i0Var;
    }

    @Override // g9.w0
    public final s1 m4(oa.a aVar, vr vrVar, int i) {
        s1 r1Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 17);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            r1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof s1) {
                r1Var = (s1) queryLocalInterface;
            } else {
                r1Var = new r1(readStrongBinder);
            }
        }
        u22.recycle();
        return r1Var;
    }

    @Override // g9.w0
    public final tt p3(oa.a aVar, vr vrVar, int i) {
        tt stVar;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 15);
        IBinder readStrongBinder = u22.readStrongBinder();
        int i10 = wh0.B;
        if (readStrongBinder == null) {
            stVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof tt) {
                stVar = (tt) queryLocalInterface;
            } else {
                stVar = new st(readStrongBinder);
            }
        }
        u22.recycle();
        return stVar;
    }

    @Override // g9.w0
    public final k0 s4(oa.a aVar, c3 c3Var, String str, vr vrVar, int i) {
        k0 i0Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, c3Var);
        g22.writeString(str);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 13);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            i0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof k0) {
                i0Var = (k0) queryLocalInterface;
            } else {
                i0Var = new i0(readStrongBinder);
            }
        }
        u22.recycle();
        return i0Var;
    }

    @Override // g9.w0
    public final f1 u1(oa.a aVar, int i) {
        f1 d1Var;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 9);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            d1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof f1) {
                d1Var = (f1) queryLocalInterface;
            } else {
                d1Var = new d1(readStrongBinder);
            }
        }
        u22.recycle();
        return d1Var;
    }

    @Override // g9.w0
    public final zt zzf(oa.a aVar) {
        zt xtVar;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        Parcel u22 = u2(g22, 8);
        IBinder readStrongBinder = u22.readStrongBinder();
        int i = yt.f12962u;
        if (readStrongBinder == null) {
            xtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zt) {
                xtVar = (zt) queryLocalInterface;
            } else {
                xtVar = new xt(readStrongBinder);
            }
        }
        u22.recycle();
        return xtVar;
    }
}
