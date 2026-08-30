package fa;
import f.a;
import g.a;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class g extends ga.a {
    public static final Parcelable.Creator<g> CREATOR = new c9.f(24);
    public static final Scope[] I = new Scope[0];
    public static final ca.d[] J = new ca.d[0];
    public Bundle A;
    public Account B;
    public ca.d[] C;
    public ca.d[] D;
    public final boolean E;
    public final int F;
    public boolean G;
    public final String H;

    /* renamed from: u, reason: collision with root package name */
    public final int f16857u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16858v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16859w;

    /* renamed from: x, reason: collision with root package name */
    public String f16860x;

    /* renamed from: y, reason: collision with root package name */
    public IBinder f16861y;

    /* renamed from: z, reason: collision with root package name */
    public Scope[] f16862z;

    public g(int i, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ca.d[] dVarArr, ca.d[] dVarArr2, boolean z3, int i12, boolean z9, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        ca.d[] dVarArr3;
        IInterface ohVar;
        if (scopeArr == null) {
            scopeArr2 = I;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        ca.d[] dVarArr4 = J;
        if (dVarArr == null) {
            dVarArr3 = dVarArr4;
        } else {
            dVarArr3 = dVarArr;
        }
        dVarArr4 = dVarArr2 != null ? dVarArr2 : dVarArr4;
        this.f16857u = i;
        this.f16858v = i10;
        this.f16859w = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f16860x = "com.google.android.gms";
        } else {
            this.f16860x = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f16835v;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    ohVar = (i) queryLocalInterface;
                } else {
                    ohVar = new oh(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var = (m0) ohVar;
                        Parcel R0 = m0Var.R0(m0Var.o1(), 2);
                        Account account3 = (Account) ua.a(R0, Account.CREATOR);
                        R0.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.B = account2;
        } else {
            this.f16861y = iBinder;
            this.B = account;
        }
        this.f16862z = scopeArr2;
        this.A = bundle2;
        this.C = dVarArr3;
        this.D = dVarArr4;
        this.E = z3;
        this.F = i12;
        this.G = z9;
        this.H = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c9.a(this, parcel, i);
    }
}
