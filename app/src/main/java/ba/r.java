package ba;
import b.a;
import q.n1;
import q.q;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import g0.l2;
import java.util.List;
import q.c0;
import q.p1;
import q.w;
import r0.s;

/* loaded from: classes.dex */
public final class r implements r2.q, p1, r0.c {

    /* renamed from: u, reason: collision with root package name */
    public int f3161u;

    /* renamed from: v, reason: collision with root package name */
    public int f3162v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3163w;

    public r(int i, int i10, w wVar) {
        this.f3161u = i;
        this.f3162v = i10;
        this.f3163w = new j6.i(new c0(i, i10, wVar));
    }

    @Override // r0.c
    public void b(df.p pVar, Object obj) {
        ((r0.c) this.f3163w).b(pVar, obj);
    }

    @Override // r2.q
    public int c(int i) {
        int c10 = ((r2.q) this.f3163w).c(i);
        if (i >= 0 && i <= this.f3162v) {
            l2.c(c10, this.f3161u, i);
        }
        return c10;
    }

    @Override // r0.c
    public void d(int i, Object obj) {
        int i10;
        r0.c cVar = (r0.c) this.f3163w;
        if (this.f3162v == 0) {
            i10 = this.f3161u;
        } else {
            i10 = 0;
        }
        cVar.d(i + i10, obj);
    }

    @Override // r0.c
    public void e(Object obj) {
        this.f3162v++;
        ((r0.c) this.f3163w).e(obj);
    }

    @Override // r2.q
    public int g(int i) {
        int g8 = ((r2.q) this.f3163w).g(i);
        if (i >= 0 && i <= this.f3161u) {
            l2.b(g8, this.f3162v, i);
        }
        return g8;
    }

    @Override // r0.c
    public void h() {
        ((r0.c) this.f3163w).h();
    }

    @Override // n1
    public q i(long j10, q qVar, q qVar2, q qVar3) {
        return ((j6.i) this.f3163w).i(j10, qVar, qVar2, qVar3);
    }

    @Override // r0.c
    public void j(int i, int i10, int i11) {
        int i12;
        if (this.f3162v == 0) {
            i12 = this.f3161u;
        } else {
            i12 = 0;
        }
        ((r0.c) this.f3163w).j(i + i12, i10 + i12, i11);
    }

    @Override // r0.c
    public void k(int i, int i10) {
        int i11;
        r0.c cVar = (r0.c) this.f3163w;
        if (this.f3162v == 0) {
            i11 = this.f3161u;
        } else {
            i11 = 0;
        }
        cVar.k(i + i11, i10);
    }

    @Override // r0.c
    public void l() {
        if (this.f3162v <= 0) {
            s.c("OffsetApplier up called with no corresponding down");
        }
        this.f3162v--;
        ((r0.c) this.f3163w).l();
    }

    @Override // n1
    public q m(long j10, q qVar, q qVar2, q qVar3) {
        return ((j6.i) this.f3163w).m(j10, qVar, qVar2, qVar3);
    }

    @Override // r0.c
    public void n(int i, Object obj) {
        int i10;
        r0.c cVar = (r0.c) this.f3163w;
        if (this.f3162v == 0) {
            i10 = this.f3161u;
        } else {
            i10 = 0;
        }
        cVar.n(i + i10, obj);
    }

    @Override // r0.c
    public Object p() {
        return ((r0.c) this.f3163w).p();
    }

    @Override // p1
    public int q() {
        return this.f3162v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c7.f, java.lang.Object] */
    public c7.f r() {
        Object obj = new Object();
        obj.f3946a = this.f3161u;
        obj.f3947b = this.f3162v;
        obj.f3948c = (String) this.f3163w;
        return obj;
    }

    @Override // p1
    public int s() {
        return this.f3161u;
    }

    public synchronized int t() {
        PackageInfo packageInfo;
        if (this.f3161u == 0) {
            try {
                packageInfo = na.a((Context) this.f3163w).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f3161u = packageInfo.versionCode;
            }
        }
        return this.f3161u;
    }

    public synchronized int v() {
        int i = this.f3162v;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f3163w;
        PackageManager packageManager = context.getPackageManager();
        if (na.a(context).f3851u.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!la.b.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f3162v = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f3162v = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == la.b.h()) {
            i10 = 2;
        }
        this.f3162v = i10;
        return i10;
    }

    public r() {
        this.f3163w = new r[256];
        this.f3161u = 0;
        this.f3162v = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(int i, int i10, df.a aVar) {
        this.f3161u = i;
        this.f3162v = i10;
        this.f3163w = (kotlin.jvm.internal.m) aVar;
    }

    public r(r2.q qVar, int i, int i10) {
        this.f3163w = qVar;
        this.f3161u = i;
        this.f3162v = i10;
    }
}