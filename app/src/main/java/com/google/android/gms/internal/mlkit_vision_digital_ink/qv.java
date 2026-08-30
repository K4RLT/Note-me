package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.ou1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class qv implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14860a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i60 f14861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ur f14862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or f14863d;
    public final /* synthetic */ ls e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fs f14864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f14866h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vr f14867j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14868k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f14869l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ om f14870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f14871n;

    public /* synthetic */ qv(i60 i60Var, ya yaVar, ur urVar, or orVar, ls lsVar, fs fsVar, int i, long j10, String str, vr vrVar, int i10, List list, om omVar) {
        this.f14861b = i60Var;
        this.f14871n = yaVar;
        this.f14862c = urVar;
        this.f14863d = orVar;
        this.e = lsVar;
        this.f14864f = fsVar;
        this.f14865g = i;
        this.f14866h = j10;
        this.i = str;
        this.f14867j = vrVar;
        this.f14868k = i10;
        this.f14869l = list;
        this.f14870m = omVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        ur urVar;
        int i = this.f14860a;
        Object obj2 = this.f14871n;
        switch (i) {
            case 0:
                String str = (String) obj2;
                os osVar = (os) obj;
                if (osVar.v() == ds.DOWNLOAD_COMPLETE) {
                    return va.f15125v;
                }
                ns nsVar = (ns) osVar.g();
                ls lsVar = this.e;
                int D = lsVar.D();
                or orVar = this.f14863d;
                String B = orVar.B();
                i60 i60Var = this.f14861b;
                ya c10 = i60Var.c(this.i, D, B);
                lx w10 = lx.w(c10);
                c1 c1Var = new c1(14, i60Var, nsVar, lsVar);
                Executor executor = (Executor) i60Var.i;
                return w10.y(c1Var, executor).y(new qv(i60Var, c10, this.f14862c, orVar, lsVar, this.f14864f, this.f14865g, this.f14866h, str, this.f14867j, this.f14868k, this.f14869l, this.f14870m), executor);
            default:
                final Uri uri = (Uri) n5.r((ya) obj2);
                i60 i60Var2 = this.f14861b;
                q2 q2Var = (q2) i60Var2.e;
                final lw lwVar = (lw) i60Var2.f7025c;
                boolean c11 = q2Var.c();
                Object obj3 = j2.f14494u;
                or orVar2 = this.f14863d;
                ls lsVar2 = this.e;
                final fs fsVar = this.f14864f;
                final int i10 = this.f14865g;
                final long j10 = this.f14866h;
                final String str2 = this.i;
                final vr vrVar = this.f14867j;
                final int i11 = this.f14868k;
                final List list = this.f14869l;
                final om omVar = this.f14870m;
                if (c11 && (urVar = this.f14862c) != null) {
                    Context context = (Context) i60Var2.f7023a;
                    wv wvVar = (wv) i60Var2.f7024b;
                    i iVar = (i) i60Var2.f7026d;
                    kw kwVar = (kw) i60Var2.f7030j;
                    int D2 = lsVar2.D();
                    if (q2Var.a() == null) {
                        final uw uwVar = new uw(context, wvVar, iVar, kwVar, orVar2, D2, urVar, (dx) i60Var2.f7032l, fsVar, i10, j10, str2, (q2) i60Var2.f7029h, (ss) i60Var2.f7028g, (Executor) i60Var2.i);
                        i60Var2.b(fsVar, uri);
                        final String w11 = lsVar2.w();
                        final String w12 = urVar.w();
                        final long t3 = urVar.t();
                        ((ss) lwVar.B).getClass();
                        ya yaVar = (ya) ((HashMap) lwVar.C).get(uri);
                        if (yaVar != null) {
                            obj3 = new s2(yaVar);
                        }
                        va m4 = n5.m(obj3);
                        ea eaVar = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ww
                            @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                            public final ya l(Object obj4) {
                                q2 q2Var2 = (q2) obj4;
                                if (q2Var2.c()) {
                                    return (ya) q2Var2.a();
                                }
                                final lw lwVar2 = lw.this;
                                final fs fsVar2 = fsVar;
                                final int i12 = i10;
                                final long j11 = j10;
                                final String str3 = str2;
                                final Uri uri2 = uri;
                                final String str4 = w12;
                                final long j12 = t3;
                                final vr vrVar2 = vrVar;
                                final int i13 = i11;
                                final List list2 = list;
                                final om omVar2 = omVar;
                                ea eaVar2 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.xw
                                    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.fm] */
                                    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.im] */
                                    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                                    public final ya l(Object obj5) {
                                        long j13;
                                        int i14;
                                        om omVar3;
                                        vr vrVar3;
                                        float min;
                                        et etVar;
                                        int i15;
                                        lw lwVar3 = lw.this;
                                        fs fsVar3 = fsVar2;
                                        int i16 = i12;
                                        long j14 = j11;
                                        String str5 = str3;
                                        Uri uri3 = uri2;
                                        String str6 = str4;
                                        long j15 = j12;
                                        vr vrVar4 = vrVar2;
                                        int i17 = i13;
                                        List<wr> list3 = list2;
                                        om omVar4 = omVar2;
                                        if (str6.startsWith("http")) {
                                            ((ss) lwVar3.B).getClass();
                                            if (!str6.startsWith("https")) {
                                                cx.i("%s: File url = %s is not secure", "MddFileDownloader", str6);
                                                int i18 = jr.f14529v;
                                                ra.e eVar = new ra.e(21, false);
                                                eVar.f24675v = vq.INSECURE_URL_ERROR;
                                                return n5.l(eVar.C());
                                            }
                                        }
                                        try {
                                            j13 = ((i) lwVar3.f14643u).a(uri3);
                                        } catch (IOException unused) {
                                            j13 = 0;
                                        }
                                        try {
                                            Context context2 = (Context) lwVar3.f14646x;
                                            long j16 = j15 - j13;
                                            ((ss) lwVar3.B).getClass();
                                            int i19 = n4.f14693w;
                                            if (f7.s(str6, new h5("inlinefile")) && j16 == 0) {
                                                vrVar3 = vrVar4;
                                                i14 = i17;
                                                omVar3 = omVar4;
                                            } else {
                                                StatFs statFs = new StatFs(context2.getFilesDir().getAbsolutePath());
                                                i14 = i17;
                                                omVar3 = omVar4;
                                                long blockSize = (statFs.getBlockSize() * statFs.getAvailableBlocks()) - j16;
                                                float blockSize2 = ((float) (statFs.getBlockSize() * statFs.getBlockCount())) * 0.1f;
                                                double min2 = Math.min(blockSize2, 5.24288E8f);
                                                if (vrVar4 != null) {
                                                    int y10 = vrVar4.y() - 1;
                                                    vrVar3 = vrVar4;
                                                    if (y10 != 1) {
                                                        if (y10 == 2) {
                                                            min = Math.min(blockSize2, 2097152.0f);
                                                        }
                                                    } else {
                                                        min = Math.min(blockSize2, 1.048576E8f);
                                                    }
                                                    min2 = min;
                                                } else {
                                                    vrVar3 = vrVar4;
                                                }
                                                if (blockSize <= min2) {
                                                    int i20 = jr.f14529v;
                                                    ra.e eVar2 = new ra.e(21, false);
                                                    eVar2.f24675v = vq.LOW_DISK_ERROR;
                                                    throw eVar2.C();
                                                }
                                            }
                                            kx kxVar = (kx) lwVar3.f14644v;
                                            ex exVar = (ex) lwVar3.f14648z;
                                            kxVar.getClass();
                                            xr x9 = yr.x();
                                            x9.b();
                                            yr.C((yr) x9.f14430v, fsVar3);
                                            x9.b();
                                            yr.z((yr) x9.f14430v, j14);
                                            x9.b();
                                            yr.D((yr) x9.f14430v, str5);
                                            x9.b();
                                            yr.B((yr) x9.f14430v, i16);
                                            yr yrVar = (yr) x9.i();
                                            synchronized (kxVar.f14578b) {
                                                try {
                                                    HashMap hashMap = kxVar.f14579c;
                                                    if (!hashMap.containsKey(yrVar)) {
                                                        u0 u0Var = new u0(kxVar.f14577a, exVar, yrVar);
                                                        Objects.requireNonNull(kxVar.e);
                                                        hashMap.put(yrVar, new g0(u0Var));
                                                    }
                                                    kxVar.f14580d.put(uri3, (g0) hashMap.get(yrVar));
                                                } finally {
                                                }
                                            }
                                            q2 q2Var3 = (q2) lwVar3.f14645w;
                                            if (!q2Var3.c()) {
                                                e4 e4Var = h4.f14393v;
                                                if (z4.f15325y != null) {
                                                    if (om.t() != null) {
                                                        if (uri3 != null) {
                                                            if (vrVar3 != null && vrVar3.x() == 2) {
                                                                etVar = et.f14273d;
                                                                if (etVar == null) {
                                                                    g5.q.h("Null downloadConstraints");
                                                                    return null;
                                                                }
                                                            } else {
                                                                etVar = et.f14272c;
                                                                if (etVar == null) {
                                                                    g5.q.h("Null downloadConstraints");
                                                                    return null;
                                                                }
                                                            }
                                                            et etVar2 = etVar;
                                                            if (i14 > 0) {
                                                                i15 = i14;
                                                            } else {
                                                                i15 = -1;
                                                            }
                                                            n5.d(4, "initialCapacity");
                                                            Object[] objArr = new Object[4];
                                                            int i21 = 0;
                                                            for (wr wrVar : list3) {
                                                                Pair create = Pair.create(wrVar.t(), wrVar.u());
                                                                create.getClass();
                                                                int length = objArr.length;
                                                                int i22 = i21 + 1;
                                                                int b10 = b4.b(length, i22);
                                                                if (b10 > length) {
                                                                    objArr = Arrays.copyOf(objArr, b10);
                                                                }
                                                                objArr[i21] = create;
                                                                i21 = i22;
                                                            }
                                                            z4 r8 = h4.r(objArr, i21);
                                                            if (r8 != null) {
                                                                if (omVar3 != null) {
                                                                    ul ulVar = (ul) ((z2) lwVar3.f14647y).zza();
                                                                    if (!str6.startsWith("inlinefile")) {
                                                                        ft ftVar = new ft(uri3, str6, etVar2, i15, r8, omVar3);
                                                                        ulVar.getClass();
                                                                        String lastPathSegment = uri3.getLastPathSegment();
                                                                        lastPathSegment.getClass();
                                                                        try {
                                                                            File parentFile = nw.f(ulVar.f15058a, uri3).getParentFile();
                                                                            parentFile.getClass();
                                                                            try {
                                                                                g i23 = ulVar.f15060c.i(uri3);
                                                                                boolean isEmpty = i23.f14347c.isEmpty();
                                                                                Uri uri4 = i23.e;
                                                                                if (isEmpty) {
                                                                                    com.google.android.gms.internal.measurement.e4 e4Var2 = new com.google.android.gms.internal.measurement.e4(12, i23.f14345a, uri4, false);
                                                                                    Object obj6 = new Object();
                                                                                    obj6.f14308c = new Object();
                                                                                    hm hmVar = new hm(obj6);
                                                                                    obj6.f14307b = hmVar;
                                                                                    obj6.f14306a = tl.class;
                                                                                    try {
                                                                                        obj6.f14306a = ul.a(ulVar, ftVar, parentFile, lastPathSegment, e4Var2, obj6);
                                                                                        return hmVar;
                                                                                    } catch (jr e) {
                                                                                        hmVar.b(e);
                                                                                        return hmVar;
                                                                                    }
                                                                                }
                                                                                throw new IOException("Transforms are not supported by this Opener: ".concat(String.valueOf(uri4)));
                                                                            } catch (IOException e8) {
                                                                                Log.e("OffroadFileDownloader", String.format("Unable to create mobstore ResponseWriter for file %s", uri3), e8);
                                                                                int i24 = jr.f14529v;
                                                                                ra.e eVar3 = new ra.e(21, false);
                                                                                eVar3.f24675v = vq.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                                                                                eVar3.f24677x = e8;
                                                                                return n5.l(eVar3.C());
                                                                            }
                                                                        } catch (IOException e10) {
                                                                            Log.e("OffroadFileDownloader", String.format("The file uri is malformed, uri = %s", uri3));
                                                                            int i25 = jr.f14529v;
                                                                            ra.e eVar4 = new ra.e(21, false);
                                                                            eVar4.f24675v = vq.MALFORMED_FILE_URI_ERROR;
                                                                            eVar4.f24677x = e10;
                                                                            return n5.l(eVar4.C());
                                                                        }
                                                                    }
                                                                    q.x.n("InlineDownloadParams must be set when using inlinefile: scheme");
                                                                    return null;
                                                                }
                                                                g5.q.h("Null customDownloaderMetadata");
                                                                return null;
                                                            }
                                                            g5.q.h("Null extraHttpHeaders");
                                                            return null;
                                                        }
                                                        g5.q.h("Null fileUri");
                                                        return null;
                                                    }
                                                    g5.q.h("Null customDownloaderMetadata");
                                                    return null;
                                                }
                                                g5.q.h("Null extraHttpHeaders");
                                                return null;
                                            }
                                            q2Var3.a().getClass();
                                            g5.q.b();
                                            return null;
                                        } catch (jr e11) {
                                            cx.i("%s: Not enough space to download file %s", "MddFileDownloader", str6);
                                            return n5.l(e11);
                                        }
                                    }
                                };
                                za zaVar = new za(new fa(3));
                                lx w13 = lx.w(zaVar);
                                Executor executor2 = (Executor) lwVar2.A;
                                lx y10 = w13.y(eaVar2, executor2);
                                yw ywVar = uwVar;
                                lx v2 = y10.y(new r0(ywVar, 19, uri2), executor2).v(Exception.class, new r0(lwVar2, 20, ywVar), executor2);
                                ((ss) lwVar2.B).getClass();
                                ((HashMap) lwVar2.C).put(uri2, v2);
                                lx y11 = lx.w(va.f15125v).y(new bt(zaVar, v2, 1), executor2);
                                y11.g(new ou1(lwVar2, w11, uri2), executor2);
                                return y11;
                            }
                        };
                        int i12 = g2.f14354a;
                        return n5.q(m4, new r0(q1.b(), 3, eaVar), (Executor) lwVar.A);
                    }
                    g5.q.b();
                    return null;
                }
                final vw vwVar = new vw((wv) i60Var2.f7024b, (i) i60Var2.f7026d, orVar2, lsVar2.D(), (dx) i60Var2.f7032l, fsVar, i10, j10, str2, (ss) i60Var2.f7028g, (Executor) i60Var2.i, (jm) i60Var2.f7031k);
                i60Var2.b(fsVar, uri);
                final String w13 = lsVar2.w();
                final String F = orVar2.F();
                final long v2 = orVar2.v();
                ((ss) lwVar.B).getClass();
                ya yaVar2 = (ya) ((HashMap) lwVar.C).get(uri);
                if (yaVar2 != null) {
                    obj3 = new s2(yaVar2);
                }
                va m10 = n5.m(obj3);
                ea eaVar2 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ww
                    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                    public final ya l(Object obj4) {
                        q2 q2Var2 = (q2) obj4;
                        if (q2Var2.c()) {
                            return (ya) q2Var2.a();
                        }
                        final lw lwVar2 = lw.this;
                        final fs fsVar2 = fsVar;
                        final int i122 = i10;
                        final long j11 = j10;
                        final String str3 = str2;
                        final Uri uri2 = uri;
                        final String str4 = F;
                        final long j12 = v2;
                        final vr vrVar2 = vrVar;
                        final int i13 = i11;
                        final List list2 = list;
                        final om omVar2 = omVar;
                        ea eaVar22 = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.xw
                            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.fm] */
                            /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.im] */
                            @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                            public final ya l(Object obj5) {
                                long j13;
                                int i14;
                                om omVar3;
                                vr vrVar3;
                                float min;
                                et etVar;
                                int i15;
                                lw lwVar3 = lw.this;
                                fs fsVar3 = fsVar2;
                                int i16 = i122;
                                long j14 = j11;
                                String str5 = str3;
                                Uri uri3 = uri2;
                                String str6 = str4;
                                long j15 = j12;
                                vr vrVar4 = vrVar2;
                                int i17 = i13;
                                List<wr> list3 = list2;
                                om omVar4 = omVar2;
                                if (str6.startsWith("http")) {
                                    ((ss) lwVar3.B).getClass();
                                    if (!str6.startsWith("https")) {
                                        cx.i("%s: File url = %s is not secure", "MddFileDownloader", str6);
                                        int i18 = jr.f14529v;
                                        ra.e eVar = new ra.e(21, false);
                                        eVar.f24675v = vq.INSECURE_URL_ERROR;
                                        return n5.l(eVar.C());
                                    }
                                }
                                try {
                                    j13 = ((i) lwVar3.f14643u).a(uri3);
                                } catch (IOException unused) {
                                    j13 = 0;
                                }
                                try {
                                    Context context2 = (Context) lwVar3.f14646x;
                                    long j16 = j15 - j13;
                                    ((ss) lwVar3.B).getClass();
                                    int i19 = n4.f14693w;
                                    if (f7.s(str6, new h5("inlinefile")) && j16 == 0) {
                                        vrVar3 = vrVar4;
                                        i14 = i17;
                                        omVar3 = omVar4;
                                    } else {
                                        StatFs statFs = new StatFs(context2.getFilesDir().getAbsolutePath());
                                        i14 = i17;
                                        omVar3 = omVar4;
                                        long blockSize = (statFs.getBlockSize() * statFs.getAvailableBlocks()) - j16;
                                        float blockSize2 = ((float) (statFs.getBlockSize() * statFs.getBlockCount())) * 0.1f;
                                        double min2 = Math.min(blockSize2, 5.24288E8f);
                                        if (vrVar4 != null) {
                                            int y10 = vrVar4.y() - 1;
                                            vrVar3 = vrVar4;
                                            if (y10 != 1) {
                                                if (y10 == 2) {
                                                    min = Math.min(blockSize2, 2097152.0f);
                                                }
                                            } else {
                                                min = Math.min(blockSize2, 1.048576E8f);
                                            }
                                            min2 = min;
                                        } else {
                                            vrVar3 = vrVar4;
                                        }
                                        if (blockSize <= min2) {
                                            int i20 = jr.f14529v;
                                            ra.e eVar2 = new ra.e(21, false);
                                            eVar2.f24675v = vq.LOW_DISK_ERROR;
                                            throw eVar2.C();
                                        }
                                    }
                                    kx kxVar = (kx) lwVar3.f14644v;
                                    ex exVar = (ex) lwVar3.f14648z;
                                    kxVar.getClass();
                                    xr x9 = yr.x();
                                    x9.b();
                                    yr.C((yr) x9.f14430v, fsVar3);
                                    x9.b();
                                    yr.z((yr) x9.f14430v, j14);
                                    x9.b();
                                    yr.D((yr) x9.f14430v, str5);
                                    x9.b();
                                    yr.B((yr) x9.f14430v, i16);
                                    yr yrVar = (yr) x9.i();
                                    synchronized (kxVar.f14578b) {
                                        try {
                                            HashMap hashMap = kxVar.f14579c;
                                            if (!hashMap.containsKey(yrVar)) {
                                                u0 u0Var = new u0(kxVar.f14577a, exVar, yrVar);
                                                Objects.requireNonNull(kxVar.e);
                                                hashMap.put(yrVar, new g0(u0Var));
                                            }
                                            kxVar.f14580d.put(uri3, (g0) hashMap.get(yrVar));
                                        } finally {
                                        }
                                    }
                                    q2 q2Var3 = (q2) lwVar3.f14645w;
                                    if (!q2Var3.c()) {
                                        e4 e4Var = h4.f14393v;
                                        if (z4.f15325y != null) {
                                            if (om.t() != null) {
                                                if (uri3 != null) {
                                                    if (vrVar3 != null && vrVar3.x() == 2) {
                                                        etVar = et.f14273d;
                                                        if (etVar == null) {
                                                            g5.q.h("Null downloadConstraints");
                                                            return null;
                                                        }
                                                    } else {
                                                        etVar = et.f14272c;
                                                        if (etVar == null) {
                                                            g5.q.h("Null downloadConstraints");
                                                            return null;
                                                        }
                                                    }
                                                    et etVar2 = etVar;
                                                    if (i14 > 0) {
                                                        i15 = i14;
                                                    } else {
                                                        i15 = -1;
                                                    }
                                                    n5.d(4, "initialCapacity");
                                                    Object[] objArr = new Object[4];
                                                    int i21 = 0;
                                                    for (wr wrVar : list3) {
                                                        Pair create = Pair.create(wrVar.t(), wrVar.u());
                                                        create.getClass();
                                                        int length = objArr.length;
                                                        int i22 = i21 + 1;
                                                        int b10 = b4.b(length, i22);
                                                        if (b10 > length) {
                                                            objArr = Arrays.copyOf(objArr, b10);
                                                        }
                                                        objArr[i21] = create;
                                                        i21 = i22;
                                                    }
                                                    z4 r8 = h4.r(objArr, i21);
                                                    if (r8 != null) {
                                                        if (omVar3 != null) {
                                                            ul ulVar = (ul) ((z2) lwVar3.f14647y).zza();
                                                            if (!str6.startsWith("inlinefile")) {
                                                                ft ftVar = new ft(uri3, str6, etVar2, i15, r8, omVar3);
                                                                ulVar.getClass();
                                                                String lastPathSegment = uri3.getLastPathSegment();
                                                                lastPathSegment.getClass();
                                                                try {
                                                                    File parentFile = nw.f(ulVar.f15058a, uri3).getParentFile();
                                                                    parentFile.getClass();
                                                                    try {
                                                                        g i23 = ulVar.f15060c.i(uri3);
                                                                        boolean isEmpty = i23.f14347c.isEmpty();
                                                                        Uri uri4 = i23.e;
                                                                        if (isEmpty) {
                                                                            com.google.android.gms.internal.measurement.e4 e4Var2 = new com.google.android.gms.internal.measurement.e4(12, i23.f14345a, uri4, false);
                                                                            Object obj6 = new Object();
                                                                            obj6.f14308c = new Object();
                                                                            hm hmVar = new hm(obj6);
                                                                            obj6.f14307b = hmVar;
                                                                            obj6.f14306a = tl.class;
                                                                            try {
                                                                                obj6.f14306a = ul.a(ulVar, ftVar, parentFile, lastPathSegment, e4Var2, obj6);
                                                                                return hmVar;
                                                                            } catch (jr e) {
                                                                                hmVar.b(e);
                                                                                return hmVar;
                                                                            }
                                                                        }
                                                                        throw new IOException("Transforms are not supported by this Opener: ".concat(String.valueOf(uri4)));
                                                                    } catch (IOException e8) {
                                                                        Log.e("OffroadFileDownloader", String.format("Unable to create mobstore ResponseWriter for file %s", uri3), e8);
                                                                        int i24 = jr.f14529v;
                                                                        ra.e eVar3 = new ra.e(21, false);
                                                                        eVar3.f24675v = vq.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                                                                        eVar3.f24677x = e8;
                                                                        return n5.l(eVar3.C());
                                                                    }
                                                                } catch (IOException e10) {
                                                                    Log.e("OffroadFileDownloader", String.format("The file uri is malformed, uri = %s", uri3));
                                                                    int i25 = jr.f14529v;
                                                                    ra.e eVar4 = new ra.e(21, false);
                                                                    eVar4.f24675v = vq.MALFORMED_FILE_URI_ERROR;
                                                                    eVar4.f24677x = e10;
                                                                    return n5.l(eVar4.C());
                                                                }
                                                            }
                                                            q.x.n("InlineDownloadParams must be set when using inlinefile: scheme");
                                                            return null;
                                                        }
                                                        g5.q.h("Null customDownloaderMetadata");
                                                        return null;
                                                    }
                                                    g5.q.h("Null extraHttpHeaders");
                                                    return null;
                                                }
                                                g5.q.h("Null fileUri");
                                                return null;
                                            }
                                            g5.q.h("Null customDownloaderMetadata");
                                            return null;
                                        }
                                        g5.q.h("Null extraHttpHeaders");
                                        return null;
                                    }
                                    q2Var3.a().getClass();
                                    g5.q.b();
                                    return null;
                                } catch (jr e11) {
                                    cx.i("%s: Not enough space to download file %s", "MddFileDownloader", str6);
                                    return n5.l(e11);
                                }
                            }
                        };
                        za zaVar = new za(new fa(3));
                        lx w132 = lx.w(zaVar);
                        Executor executor2 = (Executor) lwVar2.A;
                        lx y10 = w132.y(eaVar22, executor2);
                        yw ywVar = vwVar;
                        lx v22 = y10.y(new r0(ywVar, 19, uri2), executor2).v(Exception.class, new r0(lwVar2, 20, ywVar), executor2);
                        ((ss) lwVar2.B).getClass();
                        ((HashMap) lwVar2.C).put(uri2, v22);
                        lx y11 = lx.w(va.f15125v).y(new bt(zaVar, v22, 1), executor2);
                        y11.g(new ou1(lwVar2, w13, uri2), executor2);
                        return y11;
                    }
                };
                int i13 = g2.f14354a;
                return n5.q(m10, new r0(q1.b(), 3, eaVar2), (Executor) lwVar.A);
        }
    }

    public /* synthetic */ qv(i60 i60Var, ls lsVar, String str, or orVar, ur urVar, fs fsVar, int i, long j10, String str2, vr vrVar, int i10, List list, om omVar) {
        this.f14861b = i60Var;
        this.e = lsVar;
        this.i = str;
        this.f14863d = orVar;
        this.f14862c = urVar;
        this.f14864f = fsVar;
        this.f14865g = i;
        this.f14866h = j10;
        this.f14871n = str2;
        this.f14867j = vrVar;
        this.f14868k = i10;
        this.f14869l = list;
        this.f14870m = omVar;
    }
}
