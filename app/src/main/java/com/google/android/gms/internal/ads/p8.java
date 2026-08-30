package com.google.android.gms.internal.ads;
import a0.l;
import ac.a;
import ac.b;
import c7.a;
import ca.b;
import f9.d;
import f9.k;
import fa.b;
import fa.c;
import g9.k1;
import g9.k2;
import g9.r;
import g9.y1;
import k9.a0;
import l9.h;
import l9.i;
import l9.k;
import l9.l;
import p.a;
import r.e;
import z8.s;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p8 implements m7, f9.d, s81, fa.b, fa.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9418u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f9419v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f9420w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f9421x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f9422y;

    /* renamed from: z, reason: collision with root package name */
    public Object f9423z;

    public p8(xo xoVar) {
        g9.k1 k1Var;
        zn znVar;
        this.f9418u = 1;
        this.f9420w = new ArrayList();
        this.f9422y = new z8.s();
        this.f9423z = new ArrayList();
        this.f9419v = xoVar;
        ao aoVar = null;
        try {
            List b10 = xoVar.b();
            if (b10 != null) {
                for (Object obj : b10) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        if (queryLocalInterface instanceof zn) {
                            znVar = (zn) queryLocalInterface;
                        } else {
                            znVar = new yn(iBinder);
                        }
                    } else {
                        znVar = null;
                    }
                    if (znVar != null) {
                        ((ArrayList) this.f9420w).add(new ao(znVar));
                    }
                }
            }
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        try {
            List s10 = ((xo) this.f9419v).s();
            if (s10 != null) {
                for (Object obj2 : s10) {
                    if (obj2 instanceof IBinder) {
                        k1Var = g9.k2.v4((IBinder) obj2);
                    } else {
                        k1Var = null;
                    }
                    if (k1Var != null) {
                        ((ArrayList) this.f9423z).add(new c7.a(k1Var));
                    }
                }
            }
        } catch (RemoteException e8) {
            l9.i.d("", e8);
        }
        try {
            zn d2 = ((xo) this.f9419v).d();
            if (d2 != null) {
                aoVar = new ao(d2);
            }
        } catch (RemoteException e10) {
            l9.i.d("", e10);
        }
        this.f9421x = aoVar;
        try {
            if (((xo) this.f9419v).j() != null) {
                new vn(((xo) this.f9419v).j(), 0);
            }
        } catch (RemoteException e11) {
            l9.i.d("", e11);
        }
    }

    public static je e() {
        wd B0 = je.B0();
        B0.g(32768L);
        return (je) B0.c();
    }

    @Override // fa.b
    public void R(int i) {
        try {
            ((LinkedBlockingQueue) this.f9422y).put(e());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.m7
    public ArrayList a(long j10) {
        Map map = (Map) this.f9421x;
        HashMap hashMap = (HashMap) this.f9422y;
        HashMap hashMap2 = (HashMap) this.f9423z;
        j8 j8Var = (j8) this.f9419v;
        ArrayList arrayList = new ArrayList();
        String str = j8Var.f7378h;
        j8Var.g(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        j8Var.h(j10, false, str, treeMap);
        j8Var.j(j10, map, hashMap, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) hashMap2.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                n8 n8Var = (n8) hashMap.get(pair.first);
                n8Var.getClass();
                arrayList2.add(new s40(null, null, null, decodeByteArray, n8Var.f8587c, 0, n8Var.e, n8Var.f8586b, 0, Integer.MIN_VALUE, -3.4028235E38f, n8Var.f8589f, n8Var.f8590g, n8Var.f8592j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            n8 n8Var2 = (n8) hashMap.get(entry.getKey());
            n8Var2.getClass();
            m40 m40Var = (m40) entry.getValue();
            CharSequence charSequence = m40Var.f8234a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (h8 h8Var : (h8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h8.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(h8Var), spannableStringBuilder.getSpanEnd(h8Var), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = n8Var2.f8587c;
            int i18 = n8Var2.f8588d;
            m40Var.e = f10;
            m40Var.f8238f = i18;
            m40Var.f8239g = n8Var2.e;
            m40Var.f8240h = n8Var2.f8586b;
            m40Var.f8243l = n8Var2.f8589f;
            float f11 = n8Var2.i;
            int i19 = n8Var2.f8591h;
            m40Var.f8242k = f11;
            m40Var.f8241j = i19;
            m40Var.f8245n = n8Var2.f8592j;
            arrayList2.add(m40Var.a());
        }
        return arrayList2;
    }

    public ac.b b(String str) {
        l9.k kVar = l9.k.f20055v;
        if (str != null) {
            if (!((Boolean) g9.r.e.f17698c.a(sl.f10738g)).booleanValue() || !str.isEmpty()) {
                try {
                    return f(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return ed1.e(kVar);
                }
            }
        }
        return ed1.e(kVar);
    }

    public ac.b f(final String str, final long j10, final int i) {
        final String str2;
        l9.h hVar = (l9.h) this.f9419v;
        if (i > hVar.f20049a) {
            vs0 vs0Var = (vs0) this.f9422y;
            if (vs0Var != null && hVar.f20052d) {
                f9.k.C.f16819k.getClass();
                rb rbVar = new rb(2, System.currentTimeMillis(), "", str);
                rh0 rh0Var = vs0Var.f11978a;
                rh0Var.getClass();
                rh0Var.f(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(rh0Var, 7, rbVar));
                return ed1.e(l9.k.f20057x);
            }
            return ed1.e(l9.k.f20056w);
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.L9)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            str2 = p.a.o(new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length()), valueOf, "&", encodedQuery);
        } else {
            str2 = str;
        }
        j81 j81Var = new j81() { // from class: com.google.android.gms.internal.ads.us0
            @Override // com.google.android.gms.internal.ads.j81
            public final ac.b l(Object obj) {
                l9.k kVar = (l9.k) obj;
                if (kVar != l9.k.f20056w) {
                    return ed1.e(kVar);
                }
                p8 p8Var = p8.this;
                l9.h hVar2 = (l9.h) p8Var.f9419v;
                long j11 = hVar2.f20050b;
                int i10 = i;
                if (i10 != 1) {
                    j11 = (long) (hVar2.f20051c * j10);
                }
                return p8Var.f(str, j11, i10 + 1);
            }
        };
        c91 c91Var = (c91) this.f9421x;
        if (j10 == 0) {
            final int i10 = 1;
            return ed1.c0(c91Var.j(new Callable(this) { // from class: com.google.android.gms.internal.ads.ts0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p8 f11433b;

                {
                    this.f11433b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i10) {
                        case 0:
                            return this.f11433b.g(str2);
                        default:
                            return this.f11433b.g(str2);
                    }
                }
            }), j81Var, c91Var);
        }
        final int i11 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.ts0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p8 f11433b;

            {
                this.f11433b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i11) {
                    case 0:
                        return this.f11433b.g(str2);
                    default:
                        return this.f11433b.g(str2);
                }
            }
        };
        c91Var.getClass();
        h91 h91Var = new h91(callable);
        return ed1.c0(new a91(h91Var, c91Var.f5051w.schedule(h91Var, j10, TimeUnit.MILLISECONDS)), j81Var, c91Var);
    }

    public l9.k g(String str) {
        h10 h10Var;
        l9.l lVar = (l9.l) this.f9420w;
        nl nlVar = sl.f10701da;
        g9.r rVar = g9.r.e;
        String str2 = null;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && (h10Var = (h10) this.f9423z) != null) {
            f9.k kVar = f9.k.C;
            if (kVar.f16813c.F(str) || kVar.f16813c.G(str)) {
                er1 er1Var = h10Var.f6537c;
                if (er1Var != null) {
                    str2 = Base64.encodeToString(er1Var.b(), 10);
                }
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put((String) rVar.f17698c.a(sl.f10715ea), str2);
                }
                return lVar.a(hashMap, str);
            }
        }
        return lVar.a(null, str);
    }

    @Override // fa.b
    public void g0() {
        tv0 tv0Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f9422y;
        HandlerThread handlerThread = (HandlerThread) this.f9423z;
        try {
            tv0Var = (tv0) ((qv0) this.f9419v).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            tv0Var = null;
        }
        if (tv0Var != null) {
            try {
                try {
                    rv0 rv0Var = new rv0((String) this.f9420w, 1, (String) this.f9421x);
                    Parcel g22 = tv0Var.g2();
                    qh.c(g22, rv0Var);
                    Parcel u22 = tv0Var.u2(g22, 1);
                    sv0 sv0Var = (sv0) qh.b(u22, sv0.CREATOR);
                    u22.recycle();
                    if (sv0Var.f11176v == null) {
                        try {
                            byte[] bArr = sv0Var.f11177w;
                            wm1 wm1Var = wm1.f12302a;
                            int i = em1.f5727a;
                            sv0Var.f11176v = je.A0(bArr, wm1.f12303b);
                            sv0Var.f11177w = null;
                        } catch (pn1 | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    sv0Var.zzb();
                    linkedBlockingQueue.put(sv0Var.f11176v);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(e());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                zzb();
                handlerThread.quit();
                throw th;
            }
            zzb();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        ur0 ur0Var;
        ur0 ur0Var2;
        ur0 ur0Var3;
        ur0 ur0Var4;
        switch (this.f9418u) {
            case 5:
                k60 k60Var = (k60) this.f9423z;
                z40 z40Var = (z40) obj;
                synchronized (k60Var) {
                    if (z40Var != null) {
                        try {
                            z40Var.b();
                        } finally {
                        }
                    }
                    ((c80) z40Var.f13072g.f5031u.f7466v).f5032v = (yk0) ((zd1) k60Var.f7669d).f13143w;
                    ((jk0) this.f9419v).e(z40Var);
                    ((y10) k60Var.f7668c).b().execute(new e50(this, 1));
                    if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var = (ur0) this.f9420w) != null) {
                        ur0Var.e(z40Var.f13067a.f12313b);
                        ur0Var.g(z40Var.f13071f.f9412u);
                        rr0 rr0Var = (rr0) this.f9421x;
                        rr0Var.a(true);
                        ur0Var.a(rr0Var);
                        ur0Var.h();
                    } else {
                        vr0 vr0Var = (vr0) k60Var.e;
                        rr0 rr0Var2 = (rr0) this.f9421x;
                        rr0Var2.e(z40Var.f13067a.f12313b);
                        rr0Var2.j(z40Var.f13071f.f9412u);
                        rr0Var2.a(true);
                        vr0Var.b(rr0Var2.m());
                    }
                }
                return;
            case 6:
                ko0 ko0Var = (ko0) this.f9423z;
                z40 z40Var2 = (z40) obj;
                synchronized (ko0Var) {
                    if (z40Var2 != null) {
                        try {
                            z40Var2.b();
                        } finally {
                        }
                    }
                    ko0Var.f7828j = null;
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10908q9)).booleanValue()) {
                        ((c80) z40Var2.f13072g.f5031u.f7466v).f5034x = ko0Var.f7824d;
                    }
                    ((el0) this.f9419v).e(z40Var2);
                    if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var2 = (ur0) this.f9420w) != null) {
                        ur0Var2.e(z40Var2.f13067a.f12313b);
                        ur0Var2.g(z40Var2.f13071f.f9412u);
                        rr0 rr0Var3 = (rr0) this.f9421x;
                        rr0Var3.a(true);
                        ur0Var2.a(rr0Var3);
                        ur0Var2.h();
                    } else {
                        vr0 vr0Var2 = ko0Var.f7827h;
                        rr0 rr0Var4 = (rr0) this.f9421x;
                        rr0Var4.e(z40Var2.f13067a.f12313b);
                        rr0Var4.j(z40Var2.f13071f.f9412u);
                        rr0Var4.a(true);
                        vr0Var2.b(rr0Var4.m());
                    }
                }
                return;
            case 7:
                fp0 fp0Var = (fp0) this.f9423z;
                n90 n90Var = (n90) obj;
                synchronized (fp0Var) {
                    if (n90Var != null) {
                        try {
                            n90Var.b();
                        } finally {
                        }
                    }
                    fp0Var.i = null;
                    nl nlVar = sl.f10924r9;
                    g9.r rVar = g9.r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        jk0 jk0Var = n90Var.f13072g.f5031u;
                        yk0 yk0Var = fp0Var.f6147d;
                        c80 c80Var = (c80) jk0Var.f7466v;
                        c80Var.f5032v = yk0Var;
                        c80Var.f5035y = fp0Var.e;
                    }
                    ((el0) this.f9419v).e(n90Var);
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        final int i = 1;
                        fp0Var.f6145b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ep0

                            /* renamed from: v, reason: collision with root package name */
                            public final /* synthetic */ p8 f5744v;

                            {
                                this.f5744v = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        ((fp0) this.f5744v.f9423z).e.e();
                                        return;
                                    default:
                                        ((fp0) this.f5744v.f9423z).f6147d.e();
                                        return;
                                }
                            }
                        });
                        final int i10 = 0;
                        fp0Var.f6145b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ep0

                            /* renamed from: v, reason: collision with root package name */
                            public final /* synthetic */ p8 f5744v;

                            {
                                this.f5744v = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i10) {
                                    case 0:
                                        ((fp0) this.f5744v.f9423z).e.e();
                                        return;
                                    default:
                                        ((fp0) this.f5744v.f9423z).f6147d.e();
                                        return;
                                }
                            }
                        });
                    }
                    if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var3 = (ur0) this.f9420w) != null) {
                        ur0Var3.e(n90Var.f13067a.f12313b);
                        ur0Var3.g(n90Var.f13071f.f9412u);
                        rr0 rr0Var5 = (rr0) this.f9421x;
                        rr0Var5.a(true);
                        ur0Var3.a(rr0Var5);
                        ur0Var3.h();
                    } else {
                        vr0 vr0Var3 = fp0Var.f6149g;
                        rr0 rr0Var6 = (rr0) this.f9421x;
                        rr0Var6.e(n90Var.f13067a.f12313b);
                        rr0Var6.j(n90Var.f13071f.f9412u);
                        rr0Var6.a(true);
                        vr0Var3.b(rr0Var6.m());
                    }
                }
                return;
            default:
                kp0 kp0Var = (kp0) this.f9423z;
                yc0 yc0Var = (yc0) obj;
                synchronized (kp0Var) {
                    if (yc0Var != null) {
                        try {
                            yc0Var.b();
                        } finally {
                        }
                    }
                    ((c80) yc0Var.f13072g.f5031u.f7466v).f5035y = kp0Var.f7837d;
                    ((el0) this.f9419v).e(yc0Var);
                    Executor executor = kp0Var.f7835b;
                    hp0 hp0Var = kp0Var.f7837d;
                    Objects.requireNonNull(hp0Var);
                    executor.execute(new e40(25, hp0Var));
                    kp0Var.f7837d.l();
                    if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var4 = (ur0) this.f9420w) != null) {
                        ur0Var4.e(yc0Var.f13067a.f12313b);
                        ur0Var4.g(yc0Var.f13071f.f9412u);
                        rr0 rr0Var7 = (rr0) this.f9421x;
                        rr0Var7.a(true);
                        ur0Var4.a(rr0Var7);
                        ur0Var4.h();
                    } else {
                        vr0 vr0Var4 = kp0Var.f7839g;
                        rr0 rr0Var8 = (rr0) this.f9421x;
                        rr0Var8.e(yc0Var.f13067a.f12313b);
                        rr0Var8.j(yc0Var.f13071f.f9412u);
                        rr0Var8.a(true);
                        vr0Var4.b(rr0Var8.m());
                    }
                }
                return;
        }
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
        try {
            ((LinkedBlockingQueue) this.f9422y).put(e());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        ur0 ur0Var;
        g9.y1 A;
        ur0 ur0Var2;
        ur0 ur0Var3;
        g9.y1 A2;
        ur0 ur0Var4;
        switch (this.f9418u) {
            case 5:
                rr0 rr0Var = (rr0) this.f9421x;
                if (((Boolean) g9.r.e.f17698c.a(sl.I6)).booleanValue()) {
                    k9.a0.l("Native ad failed to load", th);
                }
                x10 x10Var = (x10) this.f9422y;
                g9.y1 A3 = x21.A(th, ((i50) x10Var.f12413p.zzb()).f6997l);
                ((u60) x10Var.f12409l.zzb()).x(A3);
                k60 k60Var = (k60) this.f9423z;
                ((y10) k60Var.f7668c).b().execute(new t81(this, 22, A3));
                ay0.h(A3.f17714u, "NativeAdLoader.onFailure", th);
                ((jk0) this.f9419v).mo212zza();
                if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var = (ur0) this.f9420w) != null) {
                    ur0Var.f(A3);
                    rr0Var.b(th);
                    rr0Var.a(false);
                    ur0Var.a(rr0Var);
                    ur0Var.h();
                    return;
                }
                vr0 vr0Var = (vr0) k60Var.e;
                rr0Var.f(A3);
                rr0Var.b(th);
                rr0Var.a(false);
                vr0Var.b(rr0Var.m());
                return;
            case 6:
                nl nlVar = sl.I6;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    k9.a0.l("App open ad failed to load", th);
                }
                ko0 ko0Var = (ko0) this.f9423z;
                b20 b20Var = (b20) ko0Var.e.k();
                if (b20Var == null) {
                    A = x21.A(th, null);
                } else {
                    A = x21.A(th, b20Var.zza().f6997l);
                }
                synchronized (ko0Var) {
                    try {
                        ko0Var.f7828j = null;
                        if (b20Var != null) {
                            ((u60) b20Var.f4684m.zzb()).x(A);
                            if (((Boolean) rVar.f17698c.a(sl.f10908q9)).booleanValue()) {
                                ko0Var.f7822b.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 22, A));
                            }
                        } else {
                            ko0Var.f7824d.x(A);
                            ko0Var.b((go0) this.f9422y).a().zza().f6992f.D();
                        }
                        ay0.h(A.f17714u, "AppOpenAdLoader.onFailure", th);
                        ((el0) this.f9419v).mo201zza();
                        if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var2 = (ur0) this.f9420w) != null) {
                            ur0Var2.f(A);
                            rr0 rr0Var2 = (rr0) this.f9421x;
                            rr0Var2.b(th);
                            rr0Var2.a(false);
                            ur0Var2.a(rr0Var2);
                            ur0Var2.h();
                        } else {
                            vr0 vr0Var2 = ko0Var.f7827h;
                            rr0 rr0Var3 = (rr0) this.f9421x;
                            rr0Var3.f(A);
                            rr0Var3.b(th);
                            rr0Var3.a(false);
                            vr0Var2.b(rr0Var3.m());
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                nl nlVar2 = sl.I6;
                g9.r rVar2 = g9.r.e;
                if (((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                    k9.a0.l("Interstitial ad failed to load", th);
                }
                h20 h20Var = (h20) this.f9422y;
                g9.y1 A4 = x21.A(th, ((i50) h20Var.f6558o.zzb()).f6997l);
                fp0 fp0Var = (fp0) this.f9423z;
                synchronized (fp0Var) {
                    try {
                        fp0Var.i = null;
                        ((u60) h20Var.f6553j.zzb()).x(A4);
                        if (((Boolean) rVar2.f17698c.a(sl.f10924r9)).booleanValue()) {
                            fp0Var.f6145b.execute(new t81(this, 23, A4));
                            fp0Var.f6145b.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 23, A4));
                        }
                        ay0.h(A4.f17714u, "InterstitialAdLoader.onFailure", th);
                        ((el0) this.f9419v).mo201zza();
                        if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var3 = (ur0) this.f9420w) != null) {
                            ur0Var3.f(A4);
                            rr0 rr0Var4 = (rr0) this.f9421x;
                            rr0Var4.b(th);
                            rr0Var4.a(false);
                            ur0Var3.a(rr0Var4);
                            ur0Var3.h();
                        } else {
                            vr0 vr0Var3 = fp0Var.f6149g;
                            rr0 rr0Var5 = (rr0) this.f9421x;
                            rr0Var5.f(A4);
                            rr0Var5.b(th);
                            rr0Var5.a(false);
                            vr0Var3.b(rr0Var5.m());
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.I6)).booleanValue()) {
                    k9.a0.l("Rewarded ad failed to load", th);
                }
                kp0 kp0Var = (kp0) this.f9423z;
                k20 k20Var = (k20) kp0Var.e.k();
                if (k20Var == null) {
                    A2 = x21.A(th, null);
                } else {
                    A2 = x21.A(th, k20Var.zza().f6997l);
                }
                synchronized (kp0Var) {
                    try {
                        if (k20Var != null) {
                            ((u60) k20Var.f7622o.zzb()).x(A2);
                            kp0Var.f7835b.execute(new ac.a(this, 22, A2));
                        } else {
                            kp0Var.f7837d.x(A2);
                            kp0Var.b((jp0) this.f9422y).b().zza().f6992f.D();
                        }
                        ay0.h(A2.f17714u, "RewardedAdLoader.onFailure", th);
                        ((el0) this.f9419v).mo201zza();
                        if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var4 = (ur0) this.f9420w) != null) {
                            ur0Var4.f(A2);
                            rr0 rr0Var6 = (rr0) this.f9421x;
                            rr0Var6.b(th);
                            rr0Var6.a(false);
                            ur0Var4.a(rr0Var6);
                            ur0Var4.h();
                        } else {
                            vr0 vr0Var4 = kp0Var.f7839g;
                            rr0 rr0Var7 = (rr0) this.f9421x;
                            rr0Var7.f(A2);
                            rr0Var7.b(th);
                            rr0Var7.a(false);
                            vr0Var4.b(rr0Var7.m());
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.m7
    public long w(int i) {
        return ((long[]) this.f9420w)[i];
    }

    @Override // f9.d
    public void x(View view) {
        lk0 lk0Var = (lk0) this.f9422y;
        hx0 hx0Var = (hx0) ((fk0) this.f9423z).e;
        wp0 wp0Var = (wp0) this.f9420w;
        qp0 qp0Var = (qp0) this.f9421x;
        yx yxVar = (yx) this.f9419v;
        zc0 zc0Var = new zc0(new tf(hx0Var, 29, qp0Var), null, 1);
        hq0 hq0Var = new hq0(wp0Var, qp0Var, (String) null);
        h20 h20Var = (h20) hx0Var.f6914v;
        g20 g20Var = new g20(h20Var.f6547b, h20Var.f6548c, hq0Var, zc0Var);
        jk0 jk0Var = new jk0(hx0Var, g20Var);
        synchronized (lk0Var) {
            lk0Var.f8048u = jk0Var;
        }
        yxVar.b(g20Var.l0());
    }

    @Override // com.google.android.gms.internal.ads.m7
    public int zza() {
        return ((long[]) this.f9420w).length;
    }

    @Override // f9.d
    public void zzb() {
        switch (this.f9418u) {
            case 4:
                return;
            default:
                qv0 qv0Var = (qv0) this.f9419v;
                if (qv0Var != null) {
                    if (qv0Var.h() || qv0Var.e()) {
                        qv0Var.o();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void d() {
    }

    @Override // f9.d
    public void c() {
    }

    public /* synthetic */ p8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z3) {
        this.f9418u = i;
        this.f9419v = obj2;
        this.f9420w = obj3;
        this.f9421x = obj4;
        this.f9422y = obj5;
        this.f9423z = obj;
    }

    public p8(Context context, q00 q00Var, q00 q00Var2, be0 be0Var) {
        this.f9418u = 2;
        this.f9419v = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9421x = q00Var;
        this.f9420w = q00Var2;
        this.f9423z = null;
        this.f9422y = be0Var;
    }

    public p8(Context context, String str, String str2) {
        this.f9418u = 10;
        this.f9420w = str;
        this.f9421x = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f9423z = handlerThread;
        handlerThread.start();
        qv0 qv0Var = new qv0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f9419v = qv0Var;
        this.f9422y = new LinkedBlockingQueue();
        qv0Var.m();
    }

    public p8(j8 j8Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f9418u = 0;
        this.f9419v = j8Var;
        this.f9422y = hashMap2;
        this.f9423z = hashMap3;
        this.f9421x = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        j8Var.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f9420w = jArr;
    }

    public /* synthetic */ p8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f9418u = i;
        this.f9419v = obj;
        this.f9420w = obj2;
        this.f9421x = obj3;
        this.f9422y = obj4;
        this.f9423z = obj5;
    }
}
