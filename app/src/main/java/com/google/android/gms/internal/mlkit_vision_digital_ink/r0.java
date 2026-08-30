package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ba.j;
import ce.c;
import g2.a;
import g3.a;
import j6.c;
import j6.s;
import je.b;
import je.c;
import ke.a;
import p1.a;
import q.x;
import q1.a;
import q1.b;
import q1.c;
import ra.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.z11;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r0 implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14882a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14883b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14884c;

    public /* synthetic */ r0(Object obj, int i, Object obj2) {
        this.f14882a = i;
        this.f14883b = obj;
        this.f14884c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.m2, java.lang.Object] */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        String str;
        long elapsedRealtime;
        om omVar;
        boolean z3;
        jr C;
        int i = 11;
        int i10 = 21;
        int i11 = 2;
        int i12 = 1;
        int i13 = 3;
        boolean z9 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.f14882a) {
            case 0:
                g1 g1Var = (g1) obj;
                List list = (List) this.f14883b;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                e4 listIterator = ((h4) list).listIterator(0);
                while (listIterator.hasNext()) {
                    x0 x0Var = (x0) listIterator.next();
                    x0Var.getClass();
                    v0 v0Var = new v0(x0Var, i12);
                    Executor executor = x0Var.f15217b;
                    hb hbVar = new hb(v0Var);
                    executor.execute(hbVar);
                    arrayList.add(hbVar);
                }
                q0 q0Var = new q0(this, arrayList, size);
                int i14 = g2.f14354a;
                r0 r0Var = new r0(b(), i13, q0Var);
                ia iaVar = ia.f14473u;
                return n5.q(n5.p(n5.q(n5.n(g1Var.f14353a.e.z()), new r0(b(), i13, new r0(g1Var, i11, r0Var)), iaVar), new Object(), iaVar), new r0(b(), i13, new q0(this, size, arrayList, i12)), iaVar);
            case 1:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f14883b;
                w9 w9Var = (w9) this.f14884c;
                Uri uri = (Uri) n5.r((ya) cVar.f13372w);
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
                try {
                    jm jmVar = (jm) cVar.A;
                    String str2 = "Write " + ((String) cVar.f13371v);
                    jmVar.getClass();
                    x1 e = jm.e(str2);
                    try {
                        z11 z11Var = new z11(i, (boolean) (objArr == true ? 1 : 0));
                        try {
                            i iVar = (i) cVar.f13375z;
                            s5 s5Var = new s5(2);
                            s5Var.f14961v = new z11[]{z11Var};
                            OutputStream outputStream = (OutputStream) iVar.c(build, s5Var);
                            try {
                                km kmVar = (km) obj;
                                kmVar.getClass();
                                nn nnVar = (nn) kmVar;
                                int e8 = nnVar.e();
                                Logger logger = ym.f15284b;
                                if (e8 > 4096) {
                                    e8 = 4096;
                                }
                                xm xmVar = new xm(outputStream, e8);
                                nnVar.p(xmVar);
                                if (xmVar.f15241f > 0) {
                                    xmVar.B();
                                }
                                if (((a0) z11Var.f13047w) != null) {
                                    ((OutputStream) z11Var.f13046v).flush();
                                    ((a0) z11Var.f13047w).f14001u.getFD().sync();
                                    outputStream.close();
                                    e.close();
                                    ((i) cVar.f13375z).e(build, uri);
                                    synchronized (cVar.B) {
                                        cVar.D = w9Var;
                                    }
                                    return n5.m(obj);
                                }
                                throw new IOException("Cannot sync underlying stream");
                            } finally {
                            }
                        } catch (IOException e10) {
                            throw tl.d((i) cVar.f13375z, uri, e10, (String) cVar.f13371v);
                        }
                    } finally {
                    }
                } catch (IOException e11) {
                    i iVar2 = (i) cVar.f13375z;
                    if (iVar2.g(build)) {
                        try {
                            iVar2.d(build);
                            throw e11;
                        } catch (IOException e12) {
                            e11.addSuppressed(e12);
                            throw e11;
                        }
                    }
                    throw e11;
                }
            case 2:
                com.google.android.gms.internal.consent_sdk.c cVar2 = ((g1) this.f14883b).f14353a.f14947c;
                r0 r0Var2 = (r0) this.f14884c;
                ia iaVar2 = ia.f14473u;
                return ((c) cVar2.C).p(a(new b1(cVar2, cVar2.g(), r0Var2, iaVar2, 0)), iaVar2);
            case 3:
                e2 e2Var = (e2) this.f14883b;
                d2 a10 = a();
                e2 c10 = c(a10, e2Var);
                try {
                    ya l10 = ((ea) this.f14884c).l(obj);
                    if (l10 != null) {
                        return l10;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } catch (Throwable th) {
                    try {
                        a(th);
                        throw th;
                    } finally {
                        c(a10, c10);
                    }
                }
            case 4:
                a aVar = (a) this.f14883b;
                byte b10 = (byte) (((byte) (0 | 1)) | 2);
                c cVar3 = ((b) ((c) this.f14884c)).f19173c;
                if (cVar3 != null) {
                    str = cVar3.f18438a;
                } else {
                    str = "";
                }
                if (b10 == 3) {
                    v8 v8Var = new v8(str, true);
                    dt dtVar = aVar.f14973a;
                    dtVar.getClass();
                    if (tv.f15034a) {
                        elapsedRealtime = SystemClock.elapsedRealtimeNanos();
                    } else {
                        elapsedRealtime = SystemClock.elapsedRealtime() * 1000000;
                    }
                    long j10 = elapsedRealtime;
                    ya i15 = dtVar.f14219h.i(new s(dtVar, i, v8Var), dtVar.f14218g);
                    q8 t3 = r8.t();
                    t3.m(str);
                    t3.b();
                    r8.y((r8) t3.f14430v);
                    t3.n(-1);
                    t3.l(-1L);
                    ws wsVar = new ws(dtVar, j10, (r8) t3.i(), i15, new jm(24), new jm(23), 4);
                    int i16 = g2.f14354a;
                    i15.g(new j(8, new Object(), b(), wsVar), ia.f14473u);
                    return i15;
                }
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" preserveZipDirectories");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" verifyIsolatedStructure");
                }
                x.o("Missing required properties:".concat(sb2.toString()));
                return null;
            case 5:
                dt dtVar2 = (dt) this.f14883b;
                w9 d2 = dtVar2.f14214b.d((fs) this.f14884c, true);
                at atVar = new at((tr) obj, objArr3 == true ? 1 : 0);
                int i17 = g2.f14354a;
                return n5.p(d2, new f2(b(), objArr2 == true ? 1 : 0, atVar), dtVar2.f14218g);
            case 6:
                List<or> list2 = (List) this.f14883b;
                gx gxVar = (gx) this.f14884c;
                e5 e5Var = (e5) obj;
                for (or orVar : list2) {
                    String D = orVar.D();
                    long v2 = orVar.v();
                    long w10 = orVar.w();
                    if (orVar.M()) {
                        omVar = orVar.x();
                    } else {
                        omVar = null;
                    }
                    if (e5Var.containsKey(orVar) && e5Var.get(orVar) == ds.DOWNLOAD_COMPLETE) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ax a11 = dt.a(D, v2, w10, null, omVar, z3, orVar.B());
                    gxVar.b();
                    m.F((m) gxVar.f14430v, a11);
                }
                return va.f15125v;
            case 7:
                dt dtVar3 = (dt) this.f14883b;
                ht htVar = (ht) this.f14884c;
                e eVar = dtVar3.f14217f;
                String str3 = htVar.f14438a;
                eVar.getClass();
                cx.l("%s: submitting request to remove in-progress download future with key: %s", str3);
                return ((s5) eVar.f24675v).i(new s(eVar, 12, str3), (Executor) eVar.f24676w);
            case 8:
                if (!((Boolean) obj).booleanValue()) {
                    return n5.l(new IOException("Failed to write updated group: ".concat(String.valueOf(((fs) this.f14883b).w()))));
                }
                return (lx) this.f14884c;
            case 9:
                com.google.android.gms.internal.ads.hb hbVar2 = (com.google.android.gms.internal.ads.hb) this.f14883b;
                tr trVar = (tr) n5.r((ya) this.f14884c);
                if (trVar != null) {
                    q8 t10 = r8.t();
                    t10.m(trVar.P());
                    t10.o(trVar.R());
                    t10.n(trVar.B());
                    t10.l(trVar.D());
                    t10.p(trVar.S());
                    trVar.H().getClass();
                    return ((zw) hbVar2.C).g(h4.u(trVar));
                }
                return va.f15125v;
            case 10:
                tr trVar2 = (tr) obj;
                if (trVar2 == null) {
                    fs fsVar = (fs) this.f14883b;
                    int i18 = jr.f14529v;
                    e eVar2 = new e(i10, (boolean) (objArr4 == true ? 1 : 0));
                    eVar2.f24675v = vq.GROUP_NOT_FOUND_ERROR;
                    eVar2.f24676w = "Nothing to download for file group: ".concat(String.valueOf(fsVar.w()));
                    return n5.l(eVar2.C());
                }
                ((AtomicReference) this.f14884c).set(trVar2);
                return n5.m(trVar2);
            case 11:
                q8 q8Var = (q8) this.f14883b;
                tr trVar3 = (tr) obj;
                if (trVar3 != null) {
                    q8Var.n(trVar3.B());
                }
                ((jr) this.f14884c).f14530u.getClass();
                return va.f15125v;
            case 12:
                tu tuVar = (tu) this.f14883b;
                f9 g8 = tuVar.g(tuVar.f15029c.c((tr) this.f14884c));
                ru ruVar = new ru(tuVar, (hx) obj, i12);
                int i19 = g2.f14354a;
                return n5.q(g8, new r0(b(), i13, ruVar), tuVar.f15033h);
            case 13:
                yu yuVar = (yu) this.f14883b;
                f9 e13 = yuVar.e(yuVar.f15306b.c((ls) this.f14884c));
                wu wuVar = new wu(yuVar, (hx) obj, i11);
                int i20 = g2.f14354a;
                return n5.q(e13, new r0(b(), i13, wuVar), yuVar.f15311h);
            case 14:
                yu yuVar2 = (yu) this.f14883b;
                Boolean bool = (Boolean) this.f14884c;
                List list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(yuVar2.f15305a.c((ls) it.next()));
                }
                h4 s10 = h4.s(arrayList2);
                b1 b1Var = new b1(yuVar2, list3, arrayList2, bool, 2);
                Executor executor2 = yuVar2.f15311h;
                iw a12 = a(b1Var);
                ha haVar = new ha(s10, false);
                haVar.H = new ga(haVar, a12, executor2, 0);
                haVar.w();
                return haVar;
            case 15:
                yu yuVar3 = (yu) this.f14883b;
                f9 e14 = yuVar3.e(yuVar3.f15306b.b((n4) this.f14884c));
                wu wuVar2 = new wu(yuVar3, (hx) obj, i13);
                int i21 = g2.f14354a;
                return n5.q(e14, new r0(b(), i13, wuVar2), yuVar3.f15311h);
            case 16:
                i60 i60Var = (i60) this.f14883b;
                ls lsVar = (ls) this.f14884c;
                if (((os) obj) != null) {
                    return n5.m(Boolean.TRUE);
                }
                SharedPreferences d10 = nw.d((Context) i60Var.f7023a, "gms_icing_mdd_shared_file_manager_metadata", (q2) i60Var.f7029h);
                long j11 = d10.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!d10.edit().putLong("next_file_name_v2", 1 + j11).commit()) {
                    cx.i("%s: Unable to update file name %s", "SharedFileManager", lsVar);
                    return n5.m(Boolean.FALSE);
                }
                String h3 = a.h(j11, "datadownloadfile_");
                ns w11 = os.w();
                ds dsVar = ds.SUBSCRIBED;
                w11.b();
                os.F((os) w11.f14430v, dsVar);
                w11.b();
                os.E((os) w11.f14430v, h3);
                ya a13 = ((wv) i60Var.f7024b).a(lsVar, (os) w11.i());
                rv rvVar = new rv(lsVar, i11);
                Executor executor3 = (Executor) i60Var.i;
                int i22 = g2.f14354a;
                return n5.q(a13, new r0(b(), i13, rvVar), executor3);
            case 17:
                i60 i60Var2 = (i60) this.f14883b;
                n4 n4Var = (n4) this.f14884c;
                e5 e5Var2 = (e5) obj;
                j4 j4Var = new j4(4);
                k5 k3 = n4Var.k();
                while (k3.hasNext()) {
                    ls lsVar2 = (ls) k3.next();
                    if (!e5Var2.containsKey(lsVar2)) {
                        cx.i("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", lsVar2);
                        return n5.l(new Exception());
                    }
                    os osVar = (os) e5Var2.get(lsVar2);
                    Object j12 = n5.j((Context) i60Var2.f7023a, lsVar2.D(), osVar.A(), osVar.z(), (q2) i60Var2.f7029h, osVar.H());
                    if (j12 != null) {
                        j4Var.a(lsVar2, j12);
                    }
                }
                return n5.m(j4Var.c(false));
            case 18:
                uw uwVar = (uw) this.f14883b;
                Uri uri2 = (Uri) this.f14884c;
                i iVar3 = (i) uwVar.f15102d;
                or orVar2 = (or) uwVar.e;
                if (!tl.m(iVar3, uri2).equals(orVar2.B())) {
                    cx.i("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri2);
                    int i23 = jr.f14529v;
                    e eVar3 = new e(i10, (boolean) (objArr5 == true ? 1 : 0));
                    eVar3.f24675v = vq.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                    return n5.l(eVar3.C());
                }
                return vw.c(ds.DOWNLOAD_COMPLETE, orVar2, uwVar.f15099a, (wv) uwVar.f15101c, (Executor) uwVar.i);
            case 19:
                return ((yw) this.f14883b).a((Uri) this.f14884c);
            default:
                lw lwVar = (lw) this.f14883b;
                yw ywVar = (yw) this.f14884c;
                Exception exc = (Exception) obj;
                if (exc instanceof jr) {
                    C = (jr) exc;
                } else {
                    int i24 = jr.f14529v;
                    e eVar4 = new e(i10, z9);
                    eVar4.f24677x = exc;
                    eVar4.f24675v = vq.UNKNOWN_ERROR;
                    C = eVar4.C();
                }
                lx b11 = ywVar.b(C);
                cu cuVar = new cu(1, exc);
                Executor executor4 = (Executor) lwVar.A;
                int i25 = g2.f14354a;
                return n5.q(b11, new r0(b(), i13, cuVar), executor4);
        }
    }

    public String toString() {
        switch (this.f14882a) {
            case 3:
                return "propagating=[" + ((ea) this.f14884c) + "]";
            default:
                return super.toString();
        }
    }
}
