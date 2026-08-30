package com.google.android.gms.internal.ads;
import q.x;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class um1 {

    /* renamed from: v, reason: collision with root package name */
    public static MessageDigest f11687v;

    /* renamed from: u, reason: collision with root package name */
    public Object f11688u;

    public um1(Set set) {
        this.f11688u = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c90 c90Var = (c90) it.next();
                synchronized (this) {
                    L1(c90Var.f5049a, c90Var.f5050b);
                }
            }
        }
    }

    public static int T(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int V(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public abstract int A1();

    public abstract void B1(int i, String str);

    public abstract void C1(int i, om1 om1Var);

    public abstract void D1(om1 om1Var);

    public abstract boolean E1();

    public abstract void F1(byte[] bArr, int i);

    public abstract void G1();

    public abstract void H1(cm1 cm1Var);

    public abstract void I1(byte b10);

    public abstract uh J1();

    public abstract void K1(int i);

    public synchronized void L1(Object obj, Executor executor) {
        ((HashMap) this.f11688u).put(obj, executor);
    }

    public abstract void M1(int i);

    public abstract int N1();

    public abstract void O1(int i);

    public synchronized void P1(n80 n80Var) {
        for (Map.Entry entry : ((HashMap) this.f11688u).entrySet()) {
            ((Executor) entry.getValue()).execute(new t81(n80Var, 15, entry.getKey()));
        }
    }

    public abstract void Q1(long j10);

    public abstract void R1(long j10);

    public abstract void S1(String str);

    public void W() {
        if (q0() <= 0) {
            if (q0() >= 0) {
                return;
            }
            x.o("Wrote more data than expected.");
            return;
        }
        x.o("Did not write as much data as expected.");
    }

    public abstract void X(byte[] bArr, int i, int i10);

    public abstract boolean Y(long j10, Object obj);

    public MessageDigest Z() {
        synchronized (this.f11688u) {
            MessageDigest messageDigest = f11687v;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f11687v = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f11687v;
        }
    }

    public abstract void a0(int i, int i10);

    public abstract void b0(Object obj, long j10, boolean z3);

    public abstract float c0(long j10, Object obj);

    public abstract void d0(int i, int i10);

    public abstract void e0(int i, long j10);

    public abstract void f0(int i, int i10);

    public abstract void g0(Object obj, long j10, float f10);

    public abstract void h();

    public abstract int q0();

    public abstract double r1(long j10, Object obj);

    public abstract void s1(int i, int i10);

    public abstract void u1(int i, long j10);

    public abstract void v1(Object obj, long j10, double d2);

    public abstract void w1(int i, long j10);

    public abstract int x1();

    public abstract void y1(int i, boolean z3);

    public um1(View view) {
        this.f11688u = new WeakReference(view);
    }

    public um1(int i) {
        switch (i) {
            case 6:
                this.f11688u = new ah();
                return;
            default:
                this.f11688u = new Object();
                return;
        }
    }
}
