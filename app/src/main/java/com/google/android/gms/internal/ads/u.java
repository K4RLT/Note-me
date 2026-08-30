package com.google.android.gms.internal.ads;
import c.p;
import c2.z1;
import f9.k;
import g9.r;
import l3.a;
import p.y;
import pa.b;
import q.x;
import r.e;
import u.f;
import z1.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class u implements ba {

    /* renamed from: u, reason: collision with root package name */
    public int f11497u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f11498v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f11499w;

    /* renamed from: x, reason: collision with root package name */
    public Object f11500x;

    /* renamed from: y, reason: collision with root package name */
    public Object f11501y;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r3.intValue() >= r1.intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r0.compareTo(r1) >= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r3 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(android.content.Context r9) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r8.f11497u = r0
            android.content.Context r0 = r9.getApplicationContext()
            r8.f11498v = r0
            int r0 = l3.a.f19883a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 >= r2) goto L7b
            r2 = 33
            if (r0 < r2) goto L9f
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r2 = "REL"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2b
            goto L9f
        L2b:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r0.toUpperCase(r2)
            r3.getClass()
            java.lang.String r4 = "BAKLAVA"
            boolean r3 = r3.equals(r4)
            r5 = 0
            if (r3 == 0) goto L3f
            r3 = r1
            goto L40
        L3f:
            r3 = r5
        L40:
            java.lang.String r6 = "UpsideDownCake"
            java.lang.String r7 = r6.toUpperCase(r2)
            r7.getClass()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L50
            goto L51
        L50:
            r1 = r5
        L51:
            if (r3 == 0) goto L60
            if (r1 == 0) goto L60
            int r0 = r3.intValue()
            int r1 = r1.intValue()
            if (r0 < r1) goto L9f
            goto L7b
        L60:
            if (r3 != 0) goto L79
            if (r1 != 0) goto L79
            java.lang.String r0 = r0.toUpperCase(r2)
            r0.getClass()
            java.lang.String r1 = r6.toUpperCase(r2)
            r1.getClass()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L9f
            goto L7b
        L79:
            if (r3 == 0) goto L9f
        L7b:
            int r0 = c2.z1.a()
            r1 = 8
            if (r0 < r1) goto L9f
            boolean r0 = c.p.y()
            if (r0 == 0) goto L9a
            java.lang.Class r0 = androidx.ink.rendering.android.canvas.internal.a.m()
            java.lang.Object r9 = r9.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r9 = androidx.ink.rendering.android.canvas.internal.a.e(r9)
            java.lang.String r9 = com.google.android.gms.internal.ads.pa.b(r9)
            goto La3
        L9a:
            java.lang.String r9 = r9.getPackageName()
            goto La3
        L9f:
            java.lang.String r9 = r9.getPackageName()
        La3:
            r8.f11499w = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u.<init>(android.content.Context):void");
    }

    public boolean a() {
        if (this.f11497u == 2 && ((th) this.f11500x) != null && ((oa) this.f11501y) != null) {
            return true;
        }
        return false;
    }

    public boolean c(int i) {
        if (((au1[]) this.f11498v)[i] != null) {
            return true;
        }
        return false;
    }

    public boolean d(u uVar, int i) {
        if (uVar == null || !Objects.equals(((au1[]) this.f11498v)[i], ((au1[]) uVar.f11498v)[i]) || !Objects.equals(((r[]) this.f11499w)[i], ((r[]) uVar.f11499w)[i])) {
            return false;
        }
        return true;
    }

    public jk0 e() {
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", (String) this.f11499w);
            try {
                rh rhVar = (rh) ((th) this.f11500x);
                Parcel g22 = rhVar.g2();
                qh.c(g22, bundle);
                Parcel u22 = rhVar.u2(g22, 1);
                Bundle bundle2 = (Bundle) qh.b(u22, Bundle.CREATOR);
                u22.recycle();
                return new jk0(6, bundle2);
            } catch (RemoteException e) {
                an1.u("RemoteException getting install referrer information");
                this.f11497u = 0;
                throw e;
            }
        }
        q.x.o("Service not connected. Please start a connection before using the service.");
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x0214. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01db  */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.ca] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.ca] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.nb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.g9] */
    @Override // com.google.android.gms.internal.ads.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(com.google.android.gms.internal.ads.xk0 r29) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u.f(com.google.android.gms.internal.ads.xk0):void");
    }

    public synchronized void g() {
        boolean z3;
        po0 po0Var;
        if (((Boolean) g9.r.e.f17698c.a(sl.f10761h7)).booleanValue() && !f9.k.C.f16817h.g().n().f8478j) {
            ((ArrayDeque) this.f11500x).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((cu0) this.f11501y) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f11500x;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        po0Var = (po0) arrayDeque.pollFirst();
                        if (po0Var == null) {
                            break;
                        }
                        sq0 sq0Var = po0Var.f9571g;
                        if (sq0Var != null) {
                            zd1 zd1Var = (zd1) this.f11498v;
                            synchronized (zd1Var) {
                                nq0 nq0Var = (nq0) ((ConcurrentHashMap) zd1Var.f13142v).get(sq0Var);
                                if (nq0Var == null) {
                                    break;
                                }
                                qq0 qq0Var = (qq0) zd1Var.f13143w;
                                nq0Var.a();
                                if (nq0Var.f8820a.size() < qq0Var.f9976y) {
                                    break;
                                }
                            }
                        }
                    }
                    cu0 cu0Var = new cu0((zd1) this.f11498v, (hx0) this.f11499w, po0Var);
                    this.f11501y = cu0Var;
                    z11 z11Var = new z11(7, (Object) this, (Object) po0Var, false);
                    synchronized (cu0Var) {
                        b81 c02 = ed1.c0((h71) cu0Var.f5174d, x20.f12438m, po0Var.e);
                        c02.a(new t81(c02, 0, z11Var), po0Var.e);
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void b(dp0 dp0Var, p2 p2Var, fa faVar) {
    }

    public u(da daVar, int i) {
        Objects.requireNonNull(daVar);
        this.f11501y = daVar;
        this.f11498v = new tk0(new byte[5], 5);
        this.f11499w = new SparseArray();
        this.f11500x = new SparseIntArray();
        this.f11497u = i;
    }

    public u(zd1 zd1Var, mq0 mq0Var, hx0 hx0Var) {
        this.f11497u = 1;
        this.f11498v = zd1Var;
        this.f11499w = hx0Var;
        this.f11500x = new ArrayDeque();
        mq0Var.f8397a = new zq0(0, this);
    }

    public u(au1[] au1VarArr, r[] rVarArr, fo foVar, t tVar) {
        int length = au1VarArr.length;
        b80.l(length == rVarArr.length);
        this.f11498v = au1VarArr;
        this.f11499w = (r[]) rVarArr.clone();
        this.f11500x = foVar;
        this.f11501y = tVar;
        this.f11497u = length;
    }
}
