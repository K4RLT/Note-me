package ea;
import a.a;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c0.z;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.ads.ou1;
import fa.y;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class u extends com.google.android.gms.internal.play_billing.d implements da.g, da.h {
    public static final fb.b C = fb.c.f16934a;
    public gb.a A;
    public z B;

    /* renamed from: v, reason: collision with root package name */
    public final Context f16039v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f16040w;

    /* renamed from: x, reason: collision with root package name */
    public final fb.b f16041x;

    /* renamed from: y, reason: collision with root package name */
    public final Set f16042y;

    /* renamed from: z, reason: collision with root package name */
    public final g9.n f16043z;

    public u(Context context, bb.a aVar, g9.n nVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 3);
        this.f16039v = context;
        this.f16040w = aVar;
        this.f16043z = nVar;
        this.f16042y = (Set) nVar.f17678v;
        this.f16041x = C;
    }

    @Override // da.g
    public final void R(int i) {
        z zVar = this.B;
        l lVar = (l) ((d) zVar.f3441z).D.get((a) zVar.f3438w);
        if (lVar != null) {
            if (lVar.C) {
                lVar.m(new ca.b(17, null, null));
            } else {
                lVar.R(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean R0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                sa.a.b(parcel);
                break;
            case 4:
                sa.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                sa.a.b(parcel);
                break;
            case 7:
                sa.a.b(parcel);
                break;
            case 8:
                gb.f fVar = (gb.f) sa.a(parcel, gb.f.CREATOR);
                sa.a.b(parcel);
                this.f16040w.post(new ou1(8, this, fVar, false));
                break;
            case 9:
                sa.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // da.g
    public final void g0() {
        GoogleSignInAccount googleSignInAccount;
        gb.a aVar = this.A;
        aVar.getClass();
        try {
            aVar.U.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f16844w;
                ReentrantLock reentrantLock = aa.a.f357c;
                y.h(context);
                ReentrantLock reentrantLock2 = aa.a.f357c;
                reentrantLock2.lock();
                try {
                    if (aa.a.f358d == null) {
                        aa.a.f358d = new aa.a(context.getApplicationContext());
                    }
                    aa.a aVar2 = aa.a.f358d;
                    reentrantLock2.unlock();
                    String a10 = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a10)) {
                        String a11 = aVar2.a("googleSignInAccount:" + a10);
                        if (a11 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a11);
                            } catch (JSONException unused) {
                            }
                            Integer num = aVar.W;
                            y.h(num);
                            fa.r rVar = new fa.r(2, account, num.intValue(), googleSignInAccount);
                            gb.c cVar = (gb.c) aVar.t();
                            gb.e eVar = new gb.e(1, rVar);
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(cVar.f9121w);
                            sa.a.c(obtain, eVar);
                            obtain.writeStrongBinder(this);
                            cVar.M0(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = aVar.W;
            y.h(num2);
            fa.r rVar2 = new fa.r(2, account, num2.intValue(), googleSignInAccount);
            gb.c cVar2 = (gb.c) aVar.t();
            gb.e eVar2 = new gb.e(1, rVar2);
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(cVar2.f9121w);
            sa.a.c(obtain2, eVar2);
            obtain2.writeStrongBinder(this);
            cVar2.M0(obtain2, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f16040w.post(new ou1(8, this, new gb.f(1, new ca.b(8, null, null), null), false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // da.h
    public final void r0(ca.b bVar) {
        this.B.d(bVar);
    }
}
