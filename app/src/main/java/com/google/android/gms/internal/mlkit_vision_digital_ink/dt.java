package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a1.t;
import b6.u;
import ra.e;
import tc.c;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14213a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14214b;

    /* renamed from: c, reason: collision with root package name */
    public final i f14215c;

    /* renamed from: d, reason: collision with root package name */
    public final ss f14216d;
    public final e e;

    /* renamed from: f, reason: collision with root package name */
    public final e f14217f;

    /* renamed from: g, reason: collision with root package name */
    public final eb f14218g;

    /* renamed from: h, reason: collision with root package name */
    public final s5 f14219h = new s5(22);
    public final t0 i = new t0(2);

    public dt(Context context, u uVar, eb ebVar, i iVar, ss ssVar) {
        this.f14213a = context;
        this.f14218g = ebVar;
        this.f14214b = uVar;
        this.f14215c = iVar;
        this.f14216d = ssVar;
        this.f14217f = new e(ebVar);
        this.e = new e(ebVar);
    }

    public static ax a(String str, long j10, long j11, String str2, om omVar, boolean z3, String str3) {
        tw u9 = ax.u();
        u9.b();
        ax.A((ax) u9.f14430v, str);
        u9.b();
        ax.C((ax) u9.f14430v, (int) j10);
        u9.b();
        ax.D((ax) u9.f14430v, z3);
        u9.b();
        ax.x((ax) u9.f14430v, str3);
        if (j11 > 0) {
            u9.b();
            ax.z((ax) u9.f14430v, (int) j11);
        }
        if (j10 > 2147483647L || j11 > 2147483647L) {
            mn mnVar = a1.zza;
            o0 t3 = t();
            t3.b();
            a1.v((a1) t3.f14430v, j10);
            t3.b();
            a1.u((a1) t3.f14430v, j11);
            u9.l(mnVar, (a1) t3.i());
        }
        if (str2 != null) {
            u9.b();
            ax.B((ax) u9.f14430v, str2);
        }
        if (omVar != null) {
            u9.b();
            ax.y((ax) u9.f14430v, omVar);
        }
        return (ax) u9.i();
    }

    public static r8 b(m mVar) {
        q8 t3 = r8.t();
        t3.m(mVar.z());
        t3.o(mVar.A());
        t3.n(mVar.u());
        int t10 = mVar.t();
        t3.b();
        r8.v((r8) t3.f14430v, t10);
        t3.p(mVar.B());
        t3.l(mVar.v());
        return (r8) t3.i();
    }

    public static ya c(final tr trVar, q2 q2Var, String str, b bVar, final boolean z3, final u uVar, eb ebVar, i iVar) {
        boolean z9;
        final boolean z10;
        lx y10;
        if (trVar == null) {
            return va.f15125v;
        }
        gx x9 = m.x();
        String P = trVar.P();
        x9.b();
        m.K((m) x9.f14430v, P);
        String R = trVar.R();
        x9.b();
        m.M((m) x9.f14430v, R);
        int B = trVar.B();
        x9.b();
        m.P((m) x9.f14430v, B);
        om N = trVar.N();
        x9.b();
        m.J((m) x9.f14430v, N);
        long D = trVar.D();
        x9.b();
        m.H((m) x9.f14430v, D);
        x9.b();
        m.N((m) x9.f14430v, bVar);
        un V = trVar.V();
        x9.b();
        m.E((m) x9.f14430v, V);
        if (q2Var.c()) {
            String str2 = (String) q2Var.a();
            x9.b();
            m.O((m) x9.f14430v, str2);
        }
        if (str != null) {
            x9.b();
            m.G((m) x9.f14430v, str);
        }
        if (trVar.x()) {
            om M = trVar.M();
            x9.b();
            m.I((m) x9.f14430v, M);
        }
        un T = trVar.T();
        va vaVar = va.f15125v;
        b bVar2 = b.DOWNLOADED;
        int i = 6;
        int i10 = 1;
        b bVar3 = b.PENDING_CUSTOM_VALIDATION;
        if (bVar != bVar2 && bVar != bVar3) {
            com.google.android.gms.internal.ads.hb hbVar = (com.google.android.gms.internal.ads.hb) uVar.f1782v;
            lx w10 = lx.w(n5.m(trVar.T()));
            at atVar = new at(trVar, 2);
            Executor executor = (Executor) hbVar.f6653y;
            lx x10 = w10.x(atVar, executor);
            y10 = lx.w(x10.y(new hu(hbVar, i10), executor).y(new vs(x10, i10), executor)).y(new r0(T, i, x9), ebVar);
        } else {
            if (trVar.w()) {
                uVar.getClass();
                pa.p(trVar.w());
                String uri = f7.h((Context) uVar.f1781u, (q2) uVar.f1786z, trVar).toString();
                x9.b();
                m.L((m) x9.f14430v, uri);
            }
            if (bVar == bVar3) {
                z9 = true;
            } else {
                z9 = false;
            }
            uVar.getClass();
            cx.c("%s: getDataFileUris %s", "MDDManager", trVar.P());
            if (!z9 && f7.q(trVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            j4 j4Var = new j4(4);
            if (z10) {
                j4Var.b(((com.google.android.gms.internal.ads.hb) uVar.f1782v).y(trVar).entrySet());
            }
            final e5 c10 = j4Var.c(false);
            lx w11 = lx.w(uVar.e());
            ea eaVar = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.gv
                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj) {
                    if (z10 && !z3) {
                        return n5.m(e5.A);
                    }
                    return ((com.google.android.gms.internal.ads.hb) u.this.f1782v).t(trVar);
                }
            };
            Executor executor2 = (Executor) uVar.A;
            y10 = lx.w(w11.y(eaVar, executor2).x(new m2() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.bv
                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
                public final Object l(Object obj) {
                    e5 e5Var = (e5) obj;
                    if (z10) {
                        boolean z11 = z3;
                        e5 e5Var2 = c10;
                        if (!z11) {
                            return e5Var2;
                        }
                        com.google.android.gms.internal.ads.hb hbVar2 = (com.google.android.gms.internal.ads.hb) u.this.f1782v;
                        j4 j4Var2 = new j4(4);
                        k5 k3 = e5Var.entrySet().k();
                        while (k3.hasNext()) {
                            Map.Entry entry = (Map.Entry) k3.next();
                            if (entry.getValue() != null && e5Var2.containsKey(entry.getKey())) {
                                Uri uri2 = (Uri) e5Var2.get(entry.getKey());
                                Uri uri3 = (Uri) entry.getValue();
                                try {
                                    if (!((i) hbVar2.f6652x).g(uri2)) {
                                        cx.g("%s verifyIsolatedFileUris isolated uri does not exist -- unable to verify it matches the expected target! %s %s", "FileGroupManager", uri2, uri3);
                                    } else {
                                        try {
                                            Context context = (Context) hbVar2.f6649u;
                                            try {
                                                String readlink = Os.readlink(nw.f(context, uri2).getAbsolutePath());
                                                if (readlink != null) {
                                                    Pattern pattern = l.f14581a;
                                                    c cVar = new c(context, 1);
                                                    cVar.l(readlink);
                                                    if (!cVar.k().toString().equals(uri3.toString())) {
                                                        cx.g("%s verifyIsolatedFileUris isolated file uri does match expected on-device uri! %s %s", "FileGroupManager", uri2, uri3);
                                                    } else {
                                                        j4Var2.a((or) entry.getKey(), uri2);
                                                    }
                                                } else {
                                                    throw new IOException("Unable to read symlink");
                                                }
                                            } catch (ErrnoException | x e) {
                                                throw new IOException("Unable to read symlink", e);
                                            }
                                        } catch (IOException unused) {
                                            cx.g("%s verifyIsolatedFileUris unable to read symlink using isolated file uri! %s %s", "FileGroupManager", uri2, uri3);
                                        }
                                    }
                                } catch (IOException unused2) {
                                    cx.g("%s verifyIsolatedFileUris unable to check if isolated uri exists! %s %s", "FileGroupManager", uri2, uri3);
                                }
                            }
                        }
                        return j4Var2.c(false);
                    }
                    return e5Var;
                }
            }, executor2).x(new rl(5, uVar), executor2)).y(new c1(i, T, iVar, x9), ebVar);
        }
        return lx.w(y10).x(new rl(i10, x9), ebVar).u(jr.class, new ys(3), ebVar);
    }

    public static ArrayList d(i iVar, Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList b10 = iVar.b(uri);
        int size = b10.size();
        int i = 0;
        while (i < size) {
            Object obj = b10.get(i);
            i++;
            Uri uri2 = (Uri) obj;
            if (iVar.h(uri2)) {
                arrayList.addAll(d(iVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    long a10 = iVar.a(uri2);
                    tw u9 = ax.u();
                    String replaceFirst = path.replaceFirst(str, "");
                    u9.b();
                    ax.A((ax) u9.f14430v, replaceFirst);
                    u9.b();
                    ax.C((ax) u9.f14430v, (int) a10);
                    String uri3 = uri2.toString();
                    u9.b();
                    ax.B((ax) u9.f14430v, uri3);
                    if (a10 > 2147483647L) {
                        mn mnVar = a1.zza;
                        o0 t3 = t();
                        t3.b();
                        a1.v((a1) t3.f14430v, a10);
                        u9.l(mnVar, (a1) t3.i());
                    }
                    arrayList.add((ax) u9.i());
                }
            }
        }
        return arrayList;
    }
}
