package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class oh implements IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9119u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f9120v;

    /* renamed from: w, reason: collision with root package name */
    public final String f9121w;

    public /* synthetic */ oh(IBinder iBinder, String str, int i) {
        this.f9119u = i;
        this.f9120v = iBinder;
        this.f9121w = str;
    }

    public void M0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9120v.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel R() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9121w);
        return obtain;
    }

    public Parcel R0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9120v.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void T1(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9120v.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f9119u) {
            case 0:
                return this.f9120v;
            case 1:
                return this.f9120v;
            case 2:
                return this.f9120v;
            case 3:
                return this.f9120v;
            case 4:
                return this.f9120v;
            case 5:
                return this.f9120v;
            case 6:
                return this.f9120v;
            default:
                return this.f9120v;
        }
    }

    public Parcel b4() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9121w);
        return obtain;
    }

    public Parcel g0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9121w);
        return obtain;
    }

    public Parcel g2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9121w);
        return obtain;
    }

    public Parcel i4(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9120v.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel o1() {
        switch (this.f9119u) {
            case 5:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f9121w);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f9121w);
                return obtain2;
        }
    }

    public void o3(Parcel parcel, int i) {
        try {
            this.f9120v.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public void r0(Parcel parcel, int i) {
        try {
            this.f9120v.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel t1(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9120v.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel u2(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9120v.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel v1(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9120v.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void v2(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9120v.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void z1(Parcel parcel, int i) {
        switch (this.f9119u) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    this.f9120v.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    obtain.recycle();
                }
            default:
                try {
                    this.f9120v.transact(i, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
        }
    }
}
