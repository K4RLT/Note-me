package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ha0 extends ph implements xn {

    /* renamed from: u, reason: collision with root package name */
    public final ra0 f6642u;

    /* renamed from: v, reason: collision with root package name */
    public oa.a f6643v;

    public ha0(ra0 ra0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f6642u = ra0Var;
    }

    public static float v4(oa.a aVar) {
        Drawable drawable;
        if (aVar != null && (drawable = (Drawable) oa.b.z1(aVar)) != null && drawable.getIntrinsicWidth() != -1 && drawable.getIntrinsicHeight() != -1) {
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final oa.a e() {
        oa.a aVar = this.f6643v;
        if (aVar != null) {
            return aVar;
        }
        zn b10 = this.f6642u.b();
        if (b10 == null) {
            return null;
        }
        return b10.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        float f10;
        float f11;
        x0 l0;
        int i10;
        int i11;
        ro ohVar;
        h00 h00Var;
        float f12 = 0.0f;
        int i12 = 0;
        switch (i) {
            case 2:
                ra0 ra0Var = this.f6642u;
                synchronized (ra0Var) {
                    f10 = ra0Var.f10186x;
                }
                if (f10 != 0.0f) {
                    synchronized (ra0Var) {
                        f12 = ra0Var.f10186x;
                    }
                } else if (ra0Var.r() != null) {
                    try {
                        f12 = ra0Var.r().m();
                    } catch (RemoteException e) {
                        int i13 = k9.a0.f19634b;
                        l9.i.d("Remote exception getting video controller aspect ratio.", e);
                    }
                } else {
                    oa.a aVar = this.f6643v;
                    if (aVar != null) {
                        f12 = v4(aVar);
                    } else if (((Boolean) g9.r.e.f17698c.a(sl.Od)).booleanValue() && ra0Var.i() != null && (l0 = ra0Var.i().l0()) != null && (i10 = l0.f12386c) >= 0 && (i11 = l0.f12385b) > 0) {
                        f12 = i10 / i11;
                    } else {
                        zn b10 = ra0Var.b();
                        if (b10 != null) {
                            if (b10.k() != -1 && b10.a() != -1) {
                                f11 = b10.k() / b10.a();
                            } else {
                                f11 = 0.0f;
                            }
                            f12 = f11 == 0.0f ? v4(b10.zza()) : f11;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f12);
                return true;
            case 3:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                this.f6643v = v12;
                parcel2.writeNoException();
                return true;
            case 4:
                oa.a e8 = e();
                parcel2.writeNoException();
                qh.e(parcel2, e8);
                return true;
            case 5:
                ra0 ra0Var2 = this.f6642u;
                if (ra0Var2.r() != null) {
                    f12 = ra0Var2.r().f();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f12);
                return true;
            case 6:
                ra0 ra0Var3 = this.f6642u;
                if (ra0Var3.r() != null) {
                    f12 = ra0Var3.r().i();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f12);
                return true;
            case 7:
                g9.z1 r8 = this.f6642u.r();
                parcel2.writeNoException();
                qh.e(parcel2, r8);
                return true;
            case 8:
                if (this.f6642u.r() != null) {
                    i12 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(i12);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ohVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof ro) {
                        ohVar = (ro) queryLocalInterface;
                    } else {
                        ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 0);
                    }
                }
                qh.f(parcel);
                ra0 ra0Var4 = this.f6642u;
                if (ra0Var4.r() instanceof u00) {
                    u00 u00Var = (u00) ra0Var4.r();
                    synchronized (u00Var.f11503v) {
                        u00Var.H = ohVar;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                ra0 ra0Var5 = this.f6642u;
                synchronized (ra0Var5) {
                    h00Var = ra0Var5.f10172j;
                }
                if (h00Var != null) {
                    i12 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }
}
