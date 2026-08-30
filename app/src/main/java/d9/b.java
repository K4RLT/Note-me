package d9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ca.f;
import fa.y;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public ca.a f15807a;

    /* renamed from: b, reason: collision with root package name */
    public qa.d f15808b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15809c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15810d = new Object();
    public d e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f15811f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15812g;

    public b(Context context, long j10, boolean z3) {
        Context applicationContext;
        y.h(context);
        if (z3 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f15811f = context;
        this.f15809c = false;
        this.f15812g = j10;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a f10 = bVar.f();
            e(f10, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f10;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z3 = false;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            y.g("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.f15809c) {
                        synchronized (bVar.f15810d) {
                            d dVar = bVar.e;
                            if (dVar == null || !dVar.f15817x) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.f15809c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    y.h(bVar.f15807a);
                    y.h(bVar.f15808b);
                    try {
                        qa.b bVar2 = (qa.b) bVar.f15808b;
                        bVar2.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel R = bVar2.R(obtain, 6);
                        int i = qa.a.f23620a;
                        if (R.readInt() != 0) {
                            z3 = true;
                        }
                        R.recycle();
                    } catch (RemoteException e8) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.g();
            return z3;
        } finally {
            bVar.c();
        }
    }

    public static void e(a aVar, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (aVar != null) {
                if (true != aVar.f15806b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = aVar.f15805a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new c(hashMap).start();
        }
    }

    public final void c() {
        y.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f15811f != null && this.f15807a != null) {
                    try {
                        if (this.f15809c) {
                            ka.a.b().c(this.f15811f, this.f15807a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f15809c = false;
                    this.f15808b = null;
                    this.f15807a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z3) {
        qa.d bVar;
        y.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f15809c) {
                    c();
                }
                Context context = this.f15811f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c10 = f.f4036b.c(context, 12451000);
                    if (c10 != 0 && c10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ca.a aVar = new ca.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (ka.a.b().a(context, intent, aVar, 1)) {
                            this.f15807a = aVar;
                            try {
                                IBinder a10 = aVar.a();
                                int i = qa.c.f23622u;
                                IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                if (queryLocalInterface instanceof qa.d) {
                                    bVar = (qa.d) queryLocalInterface;
                                } else {
                                    bVar = new qa.b(a10);
                                }
                                this.f15808b = bVar;
                                this.f15809c = true;
                                if (z3) {
                                    g();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a f() {
        a aVar;
        y.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                boolean z3 = false;
                if (!this.f15809c) {
                    synchronized (this.f15810d) {
                        d dVar = this.e;
                        if (dVar == null || !dVar.f15817x) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f15809c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                y.h(this.f15807a);
                y.h(this.f15808b);
                try {
                    qa.b bVar = (qa.b) this.f15808b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel R = bVar.R(obtain, 1);
                    String readString = R.readString();
                    R.recycle();
                    qa.b bVar2 = (qa.b) this.f15808b;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = qa.a.f23620a;
                    obtain2.writeInt(1);
                    Parcel R2 = bVar2.R(obtain2, 2);
                    if (R2.readInt() != 0) {
                        z3 = true;
                    }
                    R2.recycle();
                    aVar = new a(readString, z3);
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f15810d) {
            d dVar = this.e;
            if (dVar != null) {
                dVar.f15816w.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f15812g;
            if (j10 > 0) {
                this.e = new d(this, j10);
            }
        }
    }
}
