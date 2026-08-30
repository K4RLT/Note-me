package com.google.android.gms.internal.ads;
import ac.b;
import b2.f1;
import c7.x;
import f9.k;
import g9.r;
import k9.a0;
import l9.a;
import mf.b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eh0 extends ph implements wu {
    public final h10 A;

    /* renamed from: u, reason: collision with root package name */
    public final Context f5687u;

    /* renamed from: v, reason: collision with root package name */
    public final wx f5688v;

    /* renamed from: w, reason: collision with root package name */
    public final hx0 f5689w;

    /* renamed from: x, reason: collision with root package name */
    public final y10 f5690x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f5691y;

    /* renamed from: z, reason: collision with root package name */
    public final vr0 f5692z;

    public eh0(Context context, wx wxVar, fp fpVar, y10 y10Var, hx0 hx0Var, ArrayDeque arrayDeque, vr0 vr0Var, h10 h10Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        sl.a(context);
        this.f5687u = context;
        this.f5688v = wxVar;
        this.f5689w = hx0Var;
        this.f5690x = y10Var;
        this.f5691y = arrayDeque;
        this.f5692z = vr0Var;
        this.A = h10Var;
    }

    public static hr0 z4(hr0 hr0Var, kr0 kr0Var, jr jrVar, ur0 ur0Var, rr0 rr0Var) {
        lr a10 = jrVar.a("AFMA_getAdDictionary", ct.f5155w, v80.M);
        ed1.v(hr0Var, rr0Var);
        hr0 j10 = kr0Var.a(hr0Var, ir0.BUILD_URL).g(a10).j();
        if (!((Boolean) rm.f10240c.p()).booleanValue()) {
            return j10;
        }
        q81 t3 = q81.t(j10);
        com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(ur0Var, 8, rr0Var);
        t3.a(new t81(t3, 0, pwVar), xx.f12657h);
        return j10;
    }

    public final void A4(b bVar, av avVar, dv dvVar) {
        b81 c02 = ed1.c0(bVar, new x20(7), xx.f12651a);
        z11 z11Var = new z11(this, dvVar, avVar, 6);
        c02.a(new t81(c02, 0, z11Var), xx.f12657h);
    }

    public final synchronized bh0 B4(String str) {
        Iterator it = this.f5691y.iterator();
        while (it.hasNext()) {
            bh0 bh0Var = (bh0) it.next();
            if (bh0Var.f4793c.equals(str)) {
                it.remove();
                return bh0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void R2(dv dvVar, av avVar) {
        A4(w4(dvVar, Binder.getCallingUid()), avVar, dvVar);
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void X1(dv dvVar, av avVar) {
        Bundle bundle;
        if (((Boolean) r.e.f17698c.a(sl.J2)).booleanValue() && (bundle = dvVar.G) != null) {
            k.C.f16819k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        hr0 v4 = v4(dvVar, Binder.getCallingUid());
        A4(v4, avVar, dvVar);
        if (((Boolean) wm.i.p()).booleanValue()) {
            hx0 hx0Var = this.f5689w;
            Objects.requireNonNull(hx0Var);
            v4.a(new dh0(hx0Var, 1), this.f5688v);
        }
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void s3(dv dvVar, av avVar) {
        Bundle bundle;
        if (((Boolean) r.e.f17698c.a(sl.J2)).booleanValue() && (bundle = dvVar.G) != null) {
            k.C.f16819k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        A4(y4(dvVar, Binder.getCallingUid()), avVar, dvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        av avVar = null;
        bv bvVar = null;
        av avVar2 = null;
        av avVar3 = null;
        av avVar4 = null;
        switch (i) {
            case 1:
                qh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof xu) {
                    }
                }
                qh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                dv dvVar = (dv) qh.b(parcel, dv.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof av) {
                        avVar = (av) queryLocalInterface2;
                    } else {
                        avVar = new yu(readStrongBinder2);
                    }
                }
                qh.f(parcel);
                X1(dvVar, avVar);
                parcel2.writeNoException();
                return true;
            case 5:
                dv dvVar2 = (dv) qh.b(parcel, dv.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof av) {
                        avVar4 = (av) queryLocalInterface3;
                    } else {
                        avVar4 = new yu(readStrongBinder3);
                    }
                }
                qh.f(parcel);
                s3(dvVar2, avVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                dv dvVar3 = (dv) qh.b(parcel, dv.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof av) {
                        avVar3 = (av) queryLocalInterface4;
                    } else {
                        avVar3 = new yu(readStrongBinder4);
                    }
                }
                qh.f(parcel);
                R2(dvVar3, avVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof av) {
                        avVar2 = (av) queryLocalInterface5;
                    } else {
                        avVar2 = new yu(readStrongBinder5);
                    }
                }
                qh.f(parcel);
                z2(readString, avVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                uu uuVar = (uu) qh.b(parcel, uu.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    if (queryLocalInterface6 instanceof bv) {
                        bvVar = (bv) queryLocalInterface6;
                    } else {
                        bvVar = new oh(readStrongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 0);
                    }
                }
                qh.f(parcel);
                if (!((Boolean) jn.f7485a.p()).booleanValue()) {
                    try {
                        Parcel g22 = bvVar.g2();
                        g22.writeString("");
                        qh.c(g22, uuVar);
                        bvVar.v2(g22, 1);
                    } catch (RemoteException e) {
                        a0.l("Service can't call client", e);
                    }
                } else {
                    this.f5690x.getClass();
                    String str = uuVar.f11721u;
                    v81 v81Var = v81.f11836v;
                    x90 x90Var = new x90(this, bvVar, uuVar);
                    v81Var.a(new t81(v81Var, 0, x90Var), xx.f12657h);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                qh.f(parcel);
                y0(readString2);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    public final hr0 v4(dv dvVar, int i) {
        bh0 B4;
        rr0 rr0Var;
        boolean z3;
        hr0 j10;
        kl klVar = kl.f7797f;
        tw twVar = k.C.f16826r;
        a a10 = a.a();
        vr0 vr0Var = this.f5692z;
        Context context = this.f5687u;
        jr b10 = twVar.b(context, a10, vr0Var);
        y10 y10Var = this.f5690x;
        y10Var.getClass();
        f1 f1Var = new f1(y10Var.f12709b, new x(dvVar, i, 6));
        lr a11 = b10.a("google.afma.response.normalize", ch0.f5087d, fp.f6139w);
        Object obj = null;
        if (!((Boolean) dn.f5463a.p()).booleanValue()) {
            String str = dvVar.D;
            if (str != null && !str.isEmpty()) {
                a0.k("Request contained a PoolKey but split request is disabled.");
            }
            B4 = null;
        } else {
            B4 = B4(dvVar.B);
            if (B4 == null) {
                a0.k("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (B4 == null) {
            rr0Var = rr0.d(context, 9);
        } else {
            rr0Var = B4.f4794d;
        }
        ur0 ur0Var = (ur0) ((rr1) f1Var.D).zzb();
        ur0Var.b(dvVar.f5526u.getStringArrayList("ad_types"));
        ih0 ih0Var = new ih0(dvVar.A, ur0Var, rr0Var, this.A);
        hq0 hq0Var = new hq0(context, dvVar.f5527v.f20029u, obj, 14, false);
        kr0 kr0Var = (kr0) ((rr1) f1Var.E).zzb();
        rr0 d2 = rr0.d(context, 11);
        int i10 = 8;
        ir0 ir0Var = ir0.PRE_PROCESS;
        ir0 ir0Var2 = ir0.HTTP;
        if (B4 == null) {
            mr mrVar = new mr(f1Var, i10, dvVar);
            v80 v80Var = v80.L;
            k60 a12 = kr0Var.a(ed1.e(dvVar.f5526u), ir0.GMS_SIGNALS);
            wx wxVar = kr0Var.f7851a;
            hr0 j11 = a12.g(mrVar).e(v80Var).j();
            hr0 z42 = z4(j11, kr0Var, b10, ur0Var, rr0Var);
            rr0 d10 = rr0.d(context, 10);
            List asList = Arrays.asList(z42, j11);
            h60 h60Var = new h60(z42, dvVar, j11);
            b51 b51Var = d51.f5314v;
            asList.getClass();
            d51 u9 = d51.u(asList);
            wx wxVar2 = xx.f12657h;
            e81 e81Var = new e81(u9, true, false);
            e81Var.J = new m81(e81Var, klVar, wxVar2);
            e81Var.x();
            e81 e81Var2 = new e81(u9, true, false);
            e81Var2.J = new m81(e81Var2, h60Var, wxVar);
            e81Var2.x();
            hr0 j12 = new k60(kr0Var, ir0Var2, null, e81Var, asList, e81Var2).e(ih0Var).e(new to0(2, d10)).e(hq0Var).j();
            ed1.V(j12, ur0Var, d10, false);
            ed1.v(j12, d2);
            List asList2 = Arrays.asList(j11, z42, j12);
            vb0 vb0Var = new vb0(dvVar, j12, j11, z42, 1);
            b51 b51Var2 = d51.f5314v;
            asList2.getClass();
            d51 u10 = d51.u(asList2);
            wx wxVar3 = xx.f12657h;
            e81 e81Var3 = new e81(u10, true, false);
            e81Var3.J = new m81(e81Var3, klVar, wxVar3);
            e81Var3.x();
            e81 e81Var4 = new e81(u10, true, false);
            e81Var4.J = new m81(e81Var4, vb0Var, wxVar);
            e81Var4.x();
            j10 = new k60(kr0Var, ir0Var, null, e81Var3, asList2, e81Var4).g(a11).j();
            z3 = false;
        } else {
            hh0 hh0Var = new hh0(B4.f4792b, B4.f4791a);
            rr0 d11 = rr0.d(context, 10);
            hr0 j13 = kr0Var.a(ed1.e(hh0Var), ir0Var2).e(ih0Var).e(new to0(2, d11)).e(hq0Var).j();
            z3 = false;
            ed1.V(j13, ur0Var, d11, false);
            v81 e = ed1.e(B4);
            ed1.v(j13, d2);
            List asList3 = Arrays.asList(j13, e);
            xe xeVar = new xe(j13, i10, e);
            b51 b51Var3 = d51.f5314v;
            asList3.getClass();
            d51 u11 = d51.u(asList3);
            wx wxVar4 = xx.f12657h;
            e81 e81Var5 = new e81(u11, true, false);
            e81Var5.J = new m81(e81Var5, klVar, wxVar4);
            e81Var5.x();
            wx wxVar5 = kr0Var.f7851a;
            e81 e81Var6 = new e81(u11, true, false);
            e81Var6.J = new m81(e81Var6, xeVar, wxVar5);
            e81Var6.x();
            j10 = new k60(kr0Var, ir0Var, null, e81Var5, asList3, e81Var6).g(a11).j();
        }
        ed1.V(j10, ur0Var, d2, z3);
        return j10;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.n81, b, com.google.android.gms.internal.ads.e81] */
    public final b w4(final dv dvVar, int i) {
        if (!((Boolean) dn.f5463a.p()).booleanValue()) {
            return ed1.A(new Exception("Split request is disabled."));
        }
        qq0 qq0Var = dvVar.C;
        if (qq0Var == null) {
            return ed1.A(new Exception("Pool configuration missing from request."));
        }
        if (qq0Var.f9975x != 0 && qq0Var.f9976y != 0) {
            tw twVar = k.C.f16826r;
            a a10 = a.a();
            Context context = this.f5687u;
            jr b10 = twVar.b(context, a10, this.f5692z);
            y10 y10Var = this.f5690x;
            y10Var.getClass();
            f1 f1Var = new f1(y10Var.f12709b, new x(dvVar, i, 6));
            kr0 kr0Var = (kr0) ((rr1) f1Var.E).zzb();
            final hr0 j10 = kr0Var.a(ed1.e(dvVar.f5526u), ir0.GMS_SIGNALS).g(new mr(f1Var, 8, dvVar)).e(v80.L).j();
            ur0 ur0Var = (ur0) ((rr1) f1Var.D).zzb();
            final rr0 d2 = rr0.d(context, 9);
            final hr0 z42 = z4(j10, kr0Var, b10, ur0Var, d2);
            List asList = Arrays.asList(j10, z42);
            Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.ah0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eh0 eh0Var = eh0.this;
                    hr0 hr0Var = z42;
                    hr0 hr0Var2 = j10;
                    dv dvVar2 = dvVar;
                    rr0 rr0Var = d2;
                    String str = ((ev) hr0Var.f6877w.get()).i;
                    bh0 bh0Var = new bh0((ev) hr0Var.f6877w.get(), (JSONObject) hr0Var2.f6877w.get(), dvVar2.B, rr0Var);
                    synchronized (eh0Var) {
                        synchronized (eh0Var) {
                            int intValue = ((Long) dn.f5464b.p()).intValue();
                            while (true) {
                                ArrayDeque arrayDeque = eh0Var.f5691y;
                                if (arrayDeque.size() >= intValue) {
                                    arrayDeque.removeFirst();
                                }
                            }
                        }
                        return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                    }
                    eh0Var.f5691y.addLast(bh0Var);
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
            };
            b51 b51Var = d51.f5314v;
            asList.getClass();
            d51 u9 = d51.u(asList);
            kl klVar = kl.f7797f;
            wx wxVar = xx.f12657h;
            e81 e81Var = new e81(u9, true, false);
            e81Var.J = new m81(e81Var, klVar, wxVar);
            e81Var.x();
            wx wxVar2 = kr0Var.f7851a;
            e81 e81Var2 = new e81(u9, true, false);
            e81Var2.J = new m81(e81Var2, callable, wxVar2);
            e81Var2.x();
            return new k60(kr0Var, ir0.GET_URL_AND_CACHE_KEY, null, e81Var, asList, e81Var2).j();
        }
        return ed1.A(new Exception("Caching is disabled."));
    }

    public final b x4(String str) {
        if (!((Boolean) dn.f5463a.p()).booleanValue()) {
            return ed1.A(new Exception("Split request is disabled."));
        }
        InputStream inputStream = new InputStream();
        if (B4(str) == null) {
            return ed1.A(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return ed1.e(inputStream);
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void y0(String str) {
        gh0 s10;
        Binder.getCallingUid();
        nl nlVar = sl.Gf;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            String str2 = (String) rVar.f17698c.a(sl.Hf);
            if (!str2.isEmpty()) {
                mf b10 = b(new a31(','));
                a0.k("AdRequestServiceImpl: Preconnecting");
                Iterator f10 = ((p31) b10.f8338w).f(b10, str2);
                do {
                    o31 o31Var = (o31) f10;
                    if (o31Var.hasNext()) {
                        String str3 = (String) o31Var.next();
                        Context context = this.f5687u;
                        hq0 hq0Var = new hq0(context, str, "HEAD", 14, false);
                        HashMap hashMap = new HashMap();
                        hashMap.put("User-Agent", k.C.f16813c.E(context, str));
                        try {
                            s10 = hq0Var.s(new fh0(str3, 30000, hashMap, new byte[0], ""));
                        } catch (Exception e) {
                            throw new RemoteException(e.getMessage());
                        }
                    } else {
                        return;
                    }
                } while (s10.f6396a == 200);
                int i = s10.f6396a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 32);
                sb2.append("Unexpected preconnect response: ");
                sb2.append(i);
                throw new RemoteException(sb2.toString());
            }
        }
    }

    public final b y4(dv dvVar, int i) {
        tw twVar = k.C.f16826r;
        a a10 = a.a();
        vr0 vr0Var = this.f5692z;
        Context context = this.f5687u;
        jr b10 = twVar.b(context, a10, vr0Var);
        if (!((Boolean) hn.f6841a.p()).booleanValue()) {
            return ed1.A(new Exception("Signal collection disabled."));
        }
        y10 y10Var = this.f5690x;
        y10Var.getClass();
        x xVar = new x(dvVar, i, 6);
        y10 y10Var2 = y10Var.f12709b;
        do0 do0Var = new do0(xVar, 0);
        z20 z20Var = new z20(21, do0Var);
        rr1 rr1Var = y10Var2.f12713d;
        o10 o10Var = y10Var2.f12718g;
        l40 l40Var = new l40(rr1Var, o10Var, 10);
        int i10 = 1;
        do0 do0Var2 = new do0(xVar, i10);
        do0 do0Var3 = new do0(xVar, 2);
        do0 do0Var4 = new do0(xVar, 3);
        r40 r40Var = new r40((wr1) o10Var, (wr1) rr1Var, (sr1) do0Var2, (sr1) do0Var3, (wr1) do0Var4, 15);
        bn0 bn0Var = new bn0(i10);
        um0 um0Var = new um0(o10Var, 9);
        rr1 rr1Var2 = y10Var2.F;
        rw rwVar = new rw(do0Var, rr1Var2, rr1Var, 28);
        r40 r40Var2 = new r40(rr1Var2, do0Var4, do0Var, rr1Var, new do0(xVar, 5), 16);
        rr1 a11 = rr1.a(new um0(y10Var2.f12749x, 13));
        do0 do0Var5 = new do0(xVar, 4);
        rr1 a12 = rr1.a(ay0.f4634z);
        rr1 a13 = rr1.a(b80.F);
        rr1 a14 = rr1.a(x21.f12442b0);
        rr1 a15 = rr1.a(ed1.F);
        int i11 = ur1.f11707b;
        LinkedHashMap d2 = gm1.d(4);
        d2.put(ir0.GMS_SIGNALS, a12);
        d2.put(ir0.BUILD_URL, a13);
        d2.put(ir0.HTTP, a14);
        d2.put(ir0.PRE_PROCESS, a15);
        rr1 a16 = rr1.a(new rw(do0Var5, y10Var2.f12718g, new qr1(d2), 10));
        int i12 = xr1.f12610c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a16);
        rr1 a17 = rr1.a(new sm0(y10Var2.f12713d, new r60(new xr1(list, arrayList), 25)));
        rr1 rr1Var3 = y10Var2.Q0;
        Context context2 = (Context) y10Var2.f12707a.f7600c;
        lo1.b(context2);
        Object zzb = rr1Var3.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        String string = ((dv) xVar.f4003w).f5526u.getString("ms");
        if (string == null) {
            string = "";
        }
        am0 am0Var = new am0(wxVar, 5, string);
        wx wxVar2 = xx.f12651a;
        lo1.b(wxVar2);
        List list2 = dvVar.f5530y;
        lo1.b(list2);
        am0 am0Var2 = new am0(wxVar2, 6, list2);
        pr1 b11 = rr1.b(r40Var);
        pr1 b12 = rr1.b(um0Var);
        rr1.b(z20Var);
        pr1 b13 = rr1.b(l40Var);
        pr1 b14 = rr1.b(bn0Var);
        rr1.b(r40Var2);
        pr1 b15 = rr1.b(rwVar);
        lo1.b(wxVar2);
        ur0 ur0Var = (ur0) a11.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((ao0) zzb);
        hashSet.add(am0Var);
        hashSet.add(am0Var2);
        nl nlVar = sl.J6;
        ql qlVar = r.e.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            hashSet.add((qn0) b11.zzb());
        }
        if (((Boolean) qlVar.a(sl.K6)).booleanValue()) {
            hashSet.add((qn0) b12.zzb());
        }
        if (((Boolean) qlVar.a(sl.M6)).booleanValue()) {
            hashSet.add((qn0) b13.zzb());
        }
        if (((Boolean) qlVar.a(sl.N6)).booleanValue()) {
            hashSet.add((qn0) b14.zzb());
        }
        if (((Boolean) qlVar.a(sl.T3)).booleanValue()) {
            hashSet.add((qn0) b15.zzb());
        }
        tw twVar2 = new tw(context2, wxVar2, hashSet, ur0Var);
        lr a18 = b10.a("google.afma.request.getSignals", ct.f5155w, fp.f6139w);
        rr0 d10 = rr0.d(context, 22);
        kr0 kr0Var = (kr0) a17.zzb();
        Bundle bundle = dvVar.f5526u;
        k60 g8 = kr0Var.a(ed1.e(bundle), ir0.GET_SIGNALS).e(new to0(2, d10)).g(new mr(twVar2, 9, dvVar));
        hr0 j10 = ((kr0) g8.f7670f).a(g8.j(), ir0.JS_SIGNALS).g(a18).j();
        ur0 ur0Var2 = (ur0) a11.zzb();
        ur0Var2.b(bundle.getStringArrayList("ad_types"));
        ur0Var2.d(bundle.getBundle("extras"));
        ed1.V(j10, ur0Var2, d10, true);
        if (((Boolean) wm.f12288j.p()).booleanValue()) {
            hx0 hx0Var = this.f5689w;
            Objects.requireNonNull(hx0Var);
            j10.a(new dh0(hx0Var, 0), this.f5688v);
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void z2(String str, av avVar) {
        A4(x4(str), avVar, null);
    }
}