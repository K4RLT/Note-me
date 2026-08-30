package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b6.u;
import ce.b;
import g2.a;
import j6.c;
import j6.l;
import je.b;
import je.c;
import q1.b;
import ra.e;
import y6.a;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.i60;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14142d;

    public /* synthetic */ c1(int i, Object obj, Object obj2, Object obj3) {
        this.f14139a = i;
        this.f14140b = obj;
        this.f14141c = obj2;
        this.f14142d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        String str;
        q2 q2Var;
        om omVar;
        Uri uri;
        int i = 12;
        int i10 = 26;
        int i11 = 2;
        int i12 = 21;
        String str2 = null;
        int i13 = 1;
        int i14 = 3;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (this.f14139a) {
            case 0:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f14140b;
                w9 w9Var = (w9) this.f14141c;
                w9 w9Var2 = (w9) this.f14142d;
                if (n5.r(w9Var).equals(n5.r(w9Var2))) {
                    return n5.m(obj);
                }
                r0 r0Var = new r0(cVar, i13, w9Var2);
                int i15 = g2.f14354a;
                w9 q10 = n5.q(w9Var2, new r0(q1.b(), i14, r0Var), (eb) cVar.f13374y);
                synchronized (cVar.B) {
                }
                return q10;
            case 1:
                s0 s0Var = (s0) this.f14140b;
                r0 r0Var2 = (r0) this.f14141c;
                Executor executor = (Executor) this.f14142d;
                com.google.android.gms.internal.consent_sdk.c cVar2 = s0Var.f14947c;
                return ((j6.c) cVar2.C).p(g2.a(new b1(cVar2, cVar2.g(), r0Var2, executor, 0)), ia.f14473u);
            case 2:
                sl slVar = (sl) this.f14140b;
                ce.b bVar = (ce.b) this.f14141c;
                je.b bVar2 = (je.b) this.f14142d;
                y5 a10 = y6.a();
                kl t3 = lm.t();
                if (true == bVar.f4099a) {
                    i11 = 1;
                }
                t3.b();
                lm.u((lm) t3.f14430v, i11);
                a10.e = new s2((lm) t3.i());
                je.c cVar3 = bVar2.f19173c;
                if (cVar3 != null) {
                    str = cVar3.f18438a;
                } else {
                    str = "";
                }
                a10.f15276b = str;
                y6 b10 = a10.b();
                dt dtVar = slVar.f14973a;
                dtVar.getClass();
                return n5.o(g2.a(new j6.l(dtVar, i, b10)), dtVar.f14218g);
            case 3:
                dt dtVar2 = (dt) this.f14140b;
                fs fsVar = (fs) this.f14141c;
                y6 y6Var = (y6) this.f14142d;
                dw dwVar = (dw) obj;
                tr trVar = dwVar.f14226a;
                if (trVar != null) {
                    return n5.m(new lt(i11, trVar));
                }
                tr trVar2 = dwVar.f14227b;
                if (trVar2 == null) {
                    int i16 = jr.f14529v;
                    ra.e eVar = new ra.e(i12, (boolean) (objArr3 == true ? 1 : 0));
                    eVar.f24675v = vq.GROUP_NOT_FOUND_ERROR;
                    eVar.f24676w = "Nothing to download for file group: ".concat(String.valueOf(fsVar.w()));
                    return n5.l(eVar.C());
                }
                String S = trVar2.S();
                S.getClass();
                s2 s2Var = new s2(S);
                b bVar3 = b.DOWNLOADED;
                boolean z9 = y6Var.f15281c;
                b6.u uVar = dtVar2.f14214b;
                eb ebVar = dtVar2.f14218g;
                lx x9 = lx.w(dt.c(trVar2, s2Var, null, bVar3, z9, uVar, ebVar, dtVar2.f14215c)).x(new ys(4), ebVar).x(new ys(objArr2 == true ? 1 : 0), ebVar);
                jm jmVar = new jm(i10);
                ya yaVar = x9.f14794v;
                int i17 = g2.f14354a;
                yaVar.g(new ra((Object) yaVar, (int) (objArr == true ? 1 : 0), (Object) new pw(q1.b(), i, jmVar)), ebVar);
                return x9.x(new ys(i13), ia.f14473u);
            case 4:
                dt dtVar3 = (dt) this.f14140b;
                fs fsVar2 = (fs) this.f14141c;
                q2 q2Var2 = (q2) this.f14142d;
                t0 t0Var = dtVar3.i;
                b6.u uVar2 = dtVar3.f14214b;
                uVar2.getClass();
                cx.b("%s downloadFileGroup %s %s", "MDDManager", fsVar2.w(), fsVar2.x());
                ya e = uVar2.e();
                du duVar = new du(uVar2, fsVar2, q2Var2, t0Var);
                int i18 = g2.f14354a;
                return n5.q(e, new r0(q1.b(), i14, duVar), (Executor) uVar2.A);
            case 5:
                dt dtVar4 = (dt) this.f14140b;
                v8 v8Var = (v8) this.f14141c;
                fs fsVar3 = (fs) this.f14142d;
                tr trVar3 = (tr) obj;
                String str3 = v8Var.f15123a;
                if (trVar3 == null) {
                    cx.c("%s: File group with name %s not found", "MobileDataDownload", str3);
                } else {
                    cx.c("%s: File group with name %s found", "MobileDataDownload", str3);
                }
                boolean z10 = v8Var.f15124b;
                ss ssVar = dtVar4.f14216d;
                if (trVar3 != null) {
                    String S2 = trVar3.S();
                    S2.getClass();
                    q2Var = new s2(S2);
                } else {
                    q2Var = j2.f14494u;
                }
                q2 q2Var3 = q2Var;
                if (fsVar3.B()) {
                    str2 = fsVar3.v();
                }
                b bVar4 = b.DOWNLOADED;
                b6.u uVar3 = dtVar4.f14214b;
                eb ebVar2 = dtVar4.f14218g;
                ya c10 = dt.c(trVar3, q2Var3, str2, bVar4, z10, uVar3, ebVar2, dtVar4.f14215c);
                ys ysVar = new ys(i11);
                int i19 = g2.f14354a;
                return n5.p(c10, new f2(q1.b(), objArr4 == true ? 1 : 0, ysVar), ebVar2);
            case 6:
                List<or> list = (List) this.f14140b;
                i iVar = (i) this.f14141c;
                gx gxVar = (gx) this.f14142d;
                e5 e5Var = (e5) obj;
                for (or orVar : list) {
                    if (!e5Var.containsKey(orVar)) {
                        int i20 = jr.f14529v;
                        ra.e eVar2 = new ra.e(i12, (boolean) (objArr5 == true ? 1 : 0));
                        eVar2.f24675v = vq.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                        eVar2.f24676w = "getDataFileUris() resolved to null";
                        return n5.l(eVar2.C());
                    }
                    Uri uri2 = (Uri) e5Var.get(orVar);
                    try {
                        if (f7.p(orVar) && iVar.h(uri2)) {
                            String path = uri2.getPath();
                            if (path != null) {
                                ArrayList d2 = dt.d(iVar, uri2, path);
                                gxVar.b();
                                m.D((m) gxVar.f14430v, d2);
                            }
                        } else {
                            String D = orVar.D();
                            long v2 = orVar.v();
                            long w10 = orVar.w();
                            String uri3 = uri2.toString();
                            if (orVar.M()) {
                                omVar = orVar.x();
                            } else {
                                omVar = null;
                            }
                            ax a11 = dt.a(D, v2, w10, uri3, omVar, true, orVar.B());
                            gxVar.b();
                            m.F((m) gxVar.f14430v, a11);
                        }
                    } catch (IOException e8) {
                        cx.h(e8, "Failed to list files under directory:".concat(String.valueOf(uri2)));
                    }
                }
                return va.f15125v;
            case 7:
                final com.google.android.gms.internal.ads.hb hbVar = (com.google.android.gms.internal.ads.hb) this.f14140b;
                Executor executor2 = (Executor) hbVar.f6653y;
                AtomicReference atomicReference = (AtomicReference) this.f14141c;
                final fs fsVar4 = (fs) this.f14142d;
                Exception exc = (Exception) obj;
                tr trVar4 = (tr) atomicReference.get();
                if (trVar4 == null) {
                    trVar4 = tr.I();
                }
                final tr trVar5 = trVar4;
                boolean z11 = exc instanceof jr;
                ya yaVar2 = va.f15125v;
                if (z11) {
                    final jr jrVar = (jr) exc;
                    cx.c("%s: Logging DownloadException, resultCode = %s", "FileGroupManager", jrVar.f14530u);
                    final int i21 = 0;
                    ea eaVar = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.bu
                        @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                        public final ya l(Object obj2) {
                            switch (i21) {
                                case 0:
                                    tr trVar6 = trVar5;
                                    return hbVar.o(fsVar4, jrVar, trVar6.D(), trVar6.S());
                                default:
                                    tr trVar7 = trVar5;
                                    return hbVar.o(fsVar4, jrVar, trVar7.D(), trVar7.S());
                            }
                        }
                    };
                    int i22 = g2.f14354a;
                    yaVar2 = n5.q(yaVar2, new r0(q1.b(), i14, eaVar), executor2);
                } else if (exc instanceof o2) {
                    cx.a("%s: Logging AggregateException", "FileGroupManager");
                    z4 z4Var = ((o2) exc).f14731u;
                    int i23 = z4Var.f15327x;
                    for (int i24 = 0; i24 < i23; i24++) {
                        Throwable th = (Throwable) z4Var.get(i24);
                        if (!(th instanceof jr)) {
                            cx.f("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        } else {
                            final jr jrVar2 = (jr) th;
                            final int i25 = 1;
                            ea eaVar2 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.bu
                                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                                public final ya l(Object obj2) {
                                    switch (i25) {
                                        case 0:
                                            tr trVar6 = trVar5;
                                            return hbVar.o(fsVar4, jrVar2, trVar6.D(), trVar6.S());
                                        default:
                                            tr trVar7 = trVar5;
                                            return hbVar.o(fsVar4, jrVar2, trVar7.D(), trVar7.S());
                                    }
                                }
                            };
                            int i26 = g2.f14354a;
                            yaVar2 = n5.q(yaVar2, new r0(q1.b(), i14, eaVar2), executor2);
                        }
                    }
                }
                cu cuVar = new cu(0, exc);
                int i27 = g2.f14354a;
                return n5.q(yaVar2, new r0(q1.b(), i14, cuVar), executor2);
            case 8:
                com.google.android.gms.internal.ads.hb hbVar2 = (com.google.android.gms.internal.ads.hb) this.f14140b;
                un<or> unVar = (un) this.f14141c;
                e5 e5Var2 = (e5) this.f14142d;
                e5 e5Var3 = (e5) obj;
                for (or orVar2 : unVar) {
                    try {
                        Uri uri4 = (Uri) e5Var2.get(orVar2);
                        if (uri4 != null) {
                            Uri uri5 = (Uri) e5Var3.get(orVar2);
                            if (uri5 != null) {
                                Uri parse = Uri.parse(uri4.toString().substring(0, uri4.toString().lastIndexOf("/")));
                                i iVar2 = (i) hbVar2.f6652x;
                                if (!iVar2.g(parse)) {
                                    iVar2.j(parse.getScheme()).j(parse.buildUpon().fragment(null).build());
                                }
                                n5.f((Context) hbVar2.f6649u, uri4, uri5);
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        int i28 = jr.f14529v;
                        ra.e eVar3 = new ra.e(i12, (boolean) (objArr6 == true ? 1 : 0));
                        eVar3.f24675v = vq.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                        eVar3.f24676w = "Unable to create symlink";
                        eVar3.f24677x = e;
                        return n5.l(eVar3.C());
                    } catch (NullPointerException e11) {
                        e = e11;
                        int i282 = jr.f14529v;
                        ra.e eVar32 = new ra.e(i12, (boolean) (objArr6 == true ? 1 : 0));
                        eVar32.f24675v = vq.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                        eVar32.f24676w = "Unable to create symlink";
                        eVar32.f24677x = e;
                        return n5.l(eVar32.C());
                    }
                }
                return va.f15125v;
            case 9:
                return ((com.google.android.gms.internal.ads.hb) this.f14140b).l((os) obj, (or) this.f14141c, (tr) this.f14142d);
            case 10:
                ls lsVar = (ls) this.f14140b;
                tr trVar6 = (tr) this.f14141c;
                or orVar3 = (or) this.f14142d;
                cx.i("%s: Shared file not found, newFileKey = %s", "FileGroupManager", lsVar);
                com.google.android.gms.internal.ads.hb.x(trVar6, orVar3, 26);
                return n5.l((vv) obj);
            case 11:
                com.google.android.gms.internal.ads.hb hbVar3 = (com.google.android.gms.internal.ads.hb) this.f14140b;
                fs fsVar5 = (fs) this.f14141c;
                q2 q2Var4 = (q2) this.f14142d;
                tr trVar7 = (tr) obj;
                cx.c("%s: Received new config for group: %s", "FileGroupManager", fsVar5.w());
                q8 t10 = r8.t();
                t10.m(trVar7.P());
                t10.o(trVar7.R());
                t10.n(trVar7.B());
                t10.l(trVar7.D());
                t10.p(trVar7.S());
                z8 t11 = a9.t();
                c9 c9Var = (c9) q2Var4.a();
                t11.b();
                a9.u((a9) t11.f14430v, c9Var);
                ya p10 = hbVar3.p(trVar7, 0, trVar7.A());
                au auVar = new au(hbVar3, fsVar5, trVar7, 6);
                int i29 = g2.f14354a;
                return n5.q(p10, new r0(q1.b(), i14, auVar), (Executor) hbVar3.f6653y);
            case 12:
                ArrayList arrayList = (ArrayList) this.f14140b;
                tr trVar8 = (tr) this.f14141c;
                fs fsVar6 = (fs) this.f14142d;
                if (((pu) obj) == pu.f14813v) {
                    q8 t12 = r8.t();
                    t12.m(fsVar6.w());
                    t12.o(fsVar6.x());
                    t12.n(trVar8.B());
                    t12.l(trVar8.D());
                    t12.p(trVar8.S());
                    return n5.m(trVar8);
                }
                com.google.android.gms.internal.ads.hb.v(arrayList, fsVar6);
                throw null;
            case 13:
                tu tuVar = (tu) this.f14140b;
                f9 g8 = tuVar.g(tuVar.f15029c.e((fs) this.f14141c, (tr) this.f14142d));
                ru ruVar = new ru(tuVar, (hx) obj, i11);
                int i30 = g2.f14354a;
                return n5.q(g8, new r0(q1.b(), i14, ruVar), tuVar.f15033h);
            case 14:
                i60 i60Var = (i60) this.f14140b;
                ns nsVar = (ns) this.f14141c;
                ls lsVar2 = (ls) this.f14142d;
                ds dsVar = ds.DOWNLOAD_IN_PROGRESS;
                nsVar.b();
                os.F((os) nsVar.f14430v, dsVar);
                return ((wv) i60Var.f7024b).a(lsVar2, (os) nsVar.i());
            case 15:
                return ((i60) this.f14140b).c((String) obj, ((ls) this.f14141c).D(), ((or) this.f14142d).B());
            case 16:
                uw uwVar = (uw) this.f14140b;
                ls lsVar3 = (ls) this.f14141c;
                Uri uri6 = (Uri) this.f14142d;
                os osVar = (os) obj;
                if (osVar != null && osVar.v() == ds.DOWNLOAD_COMPLETE) {
                    uri = n5.j((Context) uwVar.f15100b, uwVar.f15099a, osVar.A(), lsVar3.w(), (q2) uwVar.f15104g, false);
                } else {
                    uri = null;
                }
                if (uri == null) {
                    int i31 = jr.f14529v;
                    ra.e eVar4 = new ra.e(i12, z3);
                    eVar4.f24675v = vq.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return n5.l(eVar4.C());
                }
                try {
                    i iVar3 = (i) uwVar.f15102d;
                    if (iVar3.g(uri6)) {
                        iVar3.d(uri6);
                        throw null;
                    }
                    throw null;
                } catch (IOException e12) {
                    cx.j(e12, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", ((ur) uwVar.f15103f).w(), ((or) uwVar.e).B());
                    int i32 = jr.f14529v;
                    ra.e eVar5 = new ra.e(i12, (boolean) (objArr7 == true ? 1 : 0));
                    eVar5.f24675v = vq.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    eVar5.f24677x = e12;
                    return n5.l(eVar5.C());
                }
            default:
                os osVar2 = (os) obj;
                ns nsVar2 = (ns) osVar2.g();
                ds dsVar2 = (ds) this.f14140b;
                nsVar2.b();
                os.F((os) nsVar2.f14430v, dsVar2);
                if (dsVar2.equals(ds.CORRUPTED)) {
                    int t13 = osVar2.t() + 1;
                    nsVar2.b();
                    os.D((os) nsVar2.f14430v, t13);
                }
                return ((wv) this.f14141c).a((ls) this.f14142d, (os) nsVar2.i());
        }
    }

    public /* synthetic */ c1(com.google.android.gms.internal.ads.hb hbVar, Object obj, tr trVar, nn nnVar, int i) {
        this.f14139a = i;
        this.f14140b = obj;
        this.f14141c = trVar;
        this.f14142d = nnVar;
    }

    public /* synthetic */ c1(Object obj, nn nnVar, Object obj2, Comparable comparable, int i) {
        this.f14139a = i;
        this.f14140b = obj;
        this.f14141c = nnVar;
        this.f14142d = obj2;
    }
}
