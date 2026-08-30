package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import b2.d2;
import fa.y;
import g3.a;
import g9.b1;
import g9.c1;
import g9.r;
import g9.w2;
import g9.z2;
import i0.m;
import k9.a0;
import l9.a;
import l9.i;
import l9.l;
import n9.e;
import n9.h;
import n9.n;
import n9.s;
import n9.v;
import oa.b;
import q.x;
import z8.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hq0 implements m7, ay, n, s, v, e, n80, a10, dr0, s90, zo0, w, zb0 {
    public static final c0 A;

    /* renamed from: y, reason: collision with root package name */
    public static hq0 f6869y;

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f6870z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6871u;

    /* renamed from: v, reason: collision with root package name */
    public Object f6872v;

    /* renamed from: w, reason: collision with root package name */
    public Object f6873w;

    /* renamed from: x, reason: collision with root package name */
    public Object f6874x;

    static {
        long j10 = -9223372036854775807L;
        f6870z = new c0(2, j10);
        A = new c0(3, j10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hq0(int i) {
        this(new long[10], new long[10], new long[10], 22, false);
        this.f6871u = i;
        switch (i) {
            case 5:
                this.f6872v = new ArrayList();
                this.f6873w = new ArrayList();
                this.f6874x = new ArrayList();
                return;
            case 22:
                return;
            case 23:
                this.f6872v = null;
                this.f6873w = null;
                this.f6874x = x91.f12520u;
                return;
            default:
                String str = bq0.f4860a;
                this.f6872v = new i0(0, Executors.newSingleThreadExecutor(new np0("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                return;
        }
    }

    public static String E(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (file.exists() && file.canRead()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[16384];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                    for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                        messageDigest.update(bArr, 0, read);
                    }
                    r61 f10 = r61.f10130f.f();
                    byte[] digest = messageDigest.digest();
                    String g8 = f10.g(digest, digest.length);
                    fileInputStream.close();
                    return g8;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
                return "";
            }
        }
        return "";
    }

    public static hq0 i(Context context) {
        synchronized (hq0.class) {
            try {
                hq0 hq0Var = f6869y;
                if (hq0Var != null) {
                    return hq0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) xm.f12589b.p()).longValue();
                c1 c1Var = null;
                if (longValue > 0 && longValue <= 262180000) {
                    try {
                        c1Var = b1.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        int i = a0.f19634b;
                        i.d("Failed to retrieve lite SDK info.", e);
                    }
                }
                hq0 hq0Var2 = new hq0(applicationContext, c1Var);
                f6869y = hq0Var2;
                return hq0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void r(hq0 hq0Var, com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar) {
        hq0 hq0Var2 = (hq0) iwVar.f14489v;
        long[] jArr = (long[]) hq0Var.f6872v;
        long[] jArr2 = (long[]) hq0Var2.f6872v;
        long[] jArr3 = (long[]) iwVar.f14490w;
        an1.K(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) hq0Var.f6873w;
        long[] jArr5 = (long[]) hq0Var2.f6873w;
        long[] jArr6 = (long[]) hq0Var2.f6874x;
        an1.K(jArr4, jArr5, jArr6);
        an1.K((long[]) hq0Var.f6874x, jArr6, jArr3);
    }

    public pa1 A() {
        bl0 bl0Var;
        gl1 b10;
        ra1 ra1Var = (ra1) this.f6872v;
        if (ra1Var != null && (bl0Var = (bl0) this.f6873w) != null) {
            if (ra1Var.f10188a == ((gl1) bl0Var.f4819v).f6427a.length) {
                if (ra1Var.a() && ((Integer) this.f6874x) == null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((ra1) this.f6872v).a() && ((Integer) this.f6874x) != null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                x91 x91Var = ((ra1) this.f6872v).f10189b;
                if (x91Var == x91.f12510k) {
                    b10 = kd1.f7721a;
                } else if (x91Var == x91.f12509j) {
                    b10 = kd1.a(((Integer) this.f6874x).intValue());
                } else if (x91Var == x91.i) {
                    b10 = kd1.b(((Integer) this.f6874x).intValue());
                } else {
                    x.o("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(x91Var)));
                    return null;
                }
                return new pa1((ra1) this.f6872v, (bl0) this.f6873w, b10, (Integer) this.f6874x);
            }
            androidx.datastore.preferences.protobuf.s1.q("Key size mismatch");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters and/or key material");
        return null;
    }

    public ie1 B() {
        Integer num = (Integer) this.f6872v;
        if (num != null) {
            if (((Integer) this.f6873w) != null) {
                return new ie1(num.intValue(), ((Integer) this.f6873w).intValue(), (x91) this.f6874x);
            }
            androidx.datastore.preferences.protobuf.s1.q("tag size not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("key size not set");
        return null;
    }

    public ej1 C() {
        gl1 a10;
        bj1 bj1Var = (bj1) this.f6872v;
        if (bj1Var != null) {
            ECPoint eCPoint = (ECPoint) this.f6873w;
            if (eCPoint != null) {
                qc1.a(eCPoint, bj1Var.f4811b.f4528b.getCurve());
                if (((bj1) this.f6872v).a() && ((Integer) this.f6874x) == null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((bj1) this.f6872v).a() && ((Integer) this.f6874x) != null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                x91 x91Var = ((bj1) this.f6872v).f4813d;
                if (x91Var == x91.f12524y) {
                    a10 = kd1.f7721a;
                } else if (x91Var != x91.f12523x && x91Var != x91.f12522w) {
                    if (x91Var == x91.f12521v) {
                        a10 = kd1.b(((Integer) this.f6874x).intValue());
                    } else {
                        x.o("Unknown EcdsaParameters.Variant: ".concat(x91Var.f12526b));
                        return null;
                    }
                } else {
                    a10 = kd1.a(((Integer) this.f6874x).intValue());
                }
                return new ej1((bj1) this.f6872v, (ECPoint) this.f6873w, a10, (Integer) this.f6874x);
            }
            androidx.datastore.preferences.protobuf.s1.q("Cannot build without public point");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters");
        return null;
    }

    public xj1 D() {
        gl1 a10;
        if (((vj1) this.f6872v) != null) {
            BigInteger bigInteger = (BigInteger) this.f6873w;
            if (bigInteger != null) {
                int bitLength = bigInteger.bitLength();
                vj1 vj1Var = (vj1) this.f6872v;
                int i = vj1Var.f11923a;
                if (bitLength == i) {
                    if (vj1Var.a() && ((Integer) this.f6874x) == null) {
                        androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                        return null;
                    }
                    if (!((vj1) this.f6872v).a() && ((Integer) this.f6874x) != null) {
                        androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                        return null;
                    }
                    w91 w91Var = ((vj1) this.f6872v).f11925c;
                    if (w91Var == w91.f12194u) {
                        a10 = kd1.f7721a;
                    } else if (w91Var != w91.f12193t && w91Var != w91.f12192s) {
                        if (w91Var == w91.f12191r) {
                            a10 = kd1.b(((Integer) this.f6874x).intValue());
                        } else {
                            x.o("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(w91Var)));
                            return null;
                        }
                    } else {
                        a10 = kd1.a(((Integer) this.f6874x).intValue());
                    }
                    return new xj1((vj1) this.f6872v, (BigInteger) this.f6873w, a10, (Integer) this.f6874x);
                }
                throw new GeneralSecurityException(a.f(bitLength, i, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length())));
            }
            androidx.datastore.preferences.protobuf.s1.q("Cannot build without modulus");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters");
        return null;
    }

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f6873w;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) r.e.f17698c.a((nl) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        x21.G(arrayList3, new nb("gad:dynamite_module:experiment_id", "", 4));
        x21.G(arrayList3, x21.D);
        x21.G(arrayList3, x21.E);
        x21.G(arrayList3, x21.F);
        x21.G(arrayList3, x21.G);
        x21.G(arrayList3, x21.H);
        x21.G(arrayList3, x21.X);
        x21.G(arrayList3, x21.I);
        x21.G(arrayList3, x21.P);
        x21.G(arrayList3, x21.Q);
        x21.G(arrayList3, x21.R);
        x21.G(arrayList3, x21.S);
        x21.G(arrayList3, x21.T);
        x21.G(arrayList3, x21.U);
        x21.G(arrayList3, x21.V);
        x21.G(arrayList3, x21.W);
        x21.G(arrayList3, x21.J);
        x21.G(arrayList3, x21.K);
        x21.G(arrayList3, x21.L);
        x21.G(arrayList3, x21.M);
        x21.G(arrayList3, x21.N);
        x21.G(arrayList3, x21.O);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public void G(v vVar) {
        tu1 tu1Var = (tu1) ((HashMap) this.f6872v).remove(vVar);
        tu1Var.getClass();
        ks1 ks1Var = (ks1) ((ls1) this.f6874x).f8129n.get(tu1Var);
        if (ks1Var != null) {
            synchronized (ks1Var) {
                ks1Var.f7869d--;
            }
        }
    }

    public ArrayList H() {
        ArrayList F = F();
        ArrayList arrayList = (ArrayList) this.f6874x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) r.e.f17698c.a((nl) obj);
            if (!TextUtils.isEmpty(str)) {
                F.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        x21.G(arrayList2, an1.f4557y);
        F.addAll(arrayList2);
        return F;
    }

    @Override // com.google.android.gms.internal.ads.m7
    public ArrayList a(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f6872v;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.f6873w;
            int i10 = i + i;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                v8 v8Var = (v8) list.get(i);
                s40 s40Var = v8Var.f11827a;
                if (s40Var.e == -3.4028235E38f) {
                    arrayList2.add(v8Var);
                } else {
                    arrayList.add(s40Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, c.I);
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            s40 s40Var2 = ((v8) arrayList2.get(i11)).f11827a;
            arrayList.add(new s40(s40Var2.f10501a, s40Var2.f10502b, s40Var2.f10503c, s40Var2.f10504d, (-1) - i11, 1, s40Var2.f10506g, s40Var2.f10507h, s40Var2.i, s40Var2.f10510l, s40Var2.f10511m, s40Var2.f10508j, s40Var2.f10509k, s40Var2.f10512n, s40Var2.f10513o, s40Var2.f10514p));
        }
        return arrayList;
    }

    public void b() {
        y.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error 0.");
        i.a(sb2.toString());
        try {
            ((as) this.f6872v).o0(0);
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    public void c(a aVar) {
        y.d("#008 Must be called on the main UI thread.");
        int i = aVar.f31969a;
        String str = aVar.f31970b;
        String str2 = aVar.f31971c;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        i.a(sb2.toString());
        try {
            ((as) this.f6872v).K2(aVar.a());
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // e
    public /* synthetic */ Object d(Object obj) {
        ps psVar = (ps) this.f6872v;
        try {
            ((dt) this.f6874x).f5492x = (h) obj;
            psVar.a();
        } catch (RemoteException e) {
            i.d("", e);
        }
        return new et((as) this.f6873w);
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
        Exception exc;
        try {
            iq0 iq0Var = (iq0) ((gi0) this.f6872v).f6407b;
            iq0Var.b(z3);
            int i = ((a) ((vi0) this.f6874x).f11910d).f20031w;
            int intValue = ((Integer) r.e.f17698c.a(sl.f10866o1)).intValue();
            xr xrVar = iq0Var.f7192a;
            if (i < intValue) {
                try {
                    xrVar.d();
                    return;
                } finally {
                }
            } else {
                try {
                    xrVar.k2(new b(context));
                    return;
                } finally {
                }
            }
        } catch (dq0 e) {
            int i10 = a0.f19634b;
            i.e("Cannot show interstitial.");
            throw new Exception(e.getCause());
        }
        int i102 = a0.f19634b;
        i.e("Cannot show interstitial.");
        throw new Exception(e.getCause());
    }

    public void f(a aVar) {
        y.d("#008 Must be called on the main UI thread.");
        int i = aVar.f31969a;
        String str = aVar.f31970b;
        String str2 = aVar.f31971c;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        i.a(sb2.toString());
        try {
            ((as) this.f6872v).K2(aVar.a());
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    public void g(a aVar) {
        y.d("#008 Must be called on the main UI thread.");
        int i = aVar.f31969a;
        String str = aVar.f31970b;
        String str2 = aVar.f31971c;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        i.a(sb2.toString());
        try {
            ((as) this.f6872v).K2(aVar.a());
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // com.google.android.gms.internal.ads.a10
    public void h(String str, int i, String str2, boolean z3) {
        fc0 fc0Var = (fc0) this.f6872v;
        h00 h00Var = (h00) this.f6873w;
        fj fjVar = (fj) this.f6874x;
        fc0Var.getClass();
        aq0 aq0Var = fc0Var.f6010a;
        if (((Boolean) r.e.f17698c.a(sl.N4)).booleanValue()) {
            if (z3) {
                w2 w2Var = aq0Var.f4578a;
                if (w2Var != null && h00Var.d() != null) {
                    h00Var.d().w4(w2Var);
                }
                fjVar.d();
                return;
            }
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Native Video WebView failed to load. Error code: ");
            sb2.append(i);
            sb2.append(", Description: ");
            sb2.append(str);
            fjVar.c(new cg0(1, a.k(sb2, ", Failing URL: ", str2)));
            return;
        }
        w2 w2Var2 = aq0Var.f4578a;
        if (w2Var2 != null && h00Var.d() != null) {
            h00Var.d().w4(w2Var2);
        }
        fjVar.d();
    }

    public q81 j(j60 j60Var) {
        b e;
        b S;
        zd1 zd1Var = (zd1) this.f6872v;
        Executor executor = (Executor) this.f6873w;
        tw twVar = new tw(zd1Var, j60Var, executor);
        vo0 vo0Var = (vo0) twVar.f11473y;
        if (vo0Var == null) {
            if (!((Boolean) dn.f5463a.p()).booleanValue()) {
                vo0 vo0Var2 = new vo0(null, twVar.s());
                twVar.f11473y = vo0Var2;
                S = ed1.e(vo0Var2);
            } else {
                i50 zza = j60Var.zza();
                qq0 qq0Var = (qq0) zd1Var.f13143w;
                i60 i60Var = zza.i;
                hr0 j10 = zza.f6990c.a(i60Var.e(), ir0.GET_CACHE_KEY).g(new mr(zza, 3, qq0Var)).j();
                tf tfVar = new tf(15, zza);
                j10.a(new t81(j10, 0, tfVar), zza.f6995j);
                S = ed1.S(ed1.d0(q81.t(j10), new uo0(twVar, 1), executor), vg0.class, new uo0(twVar, 0), executor);
            }
            e = ed1.d0(S, i6.f7012q, executor);
        } else {
            e = ed1.e(vo0Var);
        }
        return ed1.S(ed1.c0(q81.t(e), new mr(this, 13, j60Var), executor), Exception.class, new i6(16), executor);
    }

    @Override // com.google.android.gms.internal.ads.w
    /* renamed from: k, reason: collision with other method in class */
    public synchronized void mo204k() {
        ((ls1) this.f6874x).f8120c.mo204k();
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l, reason: collision with other method in class */
    public /* synthetic */ void mo205l(Object obj) {
        vr0 vr0Var;
        switch (this.f6871u) {
            case 6:
                a0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
                dr drVar = (dr) this.f6874x;
                synchronized (drVar.f5484c) {
                    try {
                        a0.k("loadNewJavascriptEngine (success): Lock acquired");
                        drVar.f5483b = 0;
                        cr crVar = (cr) drVar.f5487g;
                        if (crVar != null && ((cr) this.f6872v) != crVar) {
                            a0.k("New JS engine is loaded, marking previous one as destroyable.");
                            ((cr) drVar.f5487g).n();
                        }
                        drVar.f5487g = (cr) this.f6872v;
                        if (((Boolean) rm.f10241d.p()).booleanValue() && (vr0Var = (vr0) drVar.f5486f) != null) {
                            rr0 rr0Var = (rr0) this.f6873w;
                            rr0Var.a(true);
                            vr0Var.b(rr0Var.m());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                a0.k("loadNewJavascriptEngine (success): Lock released");
                return;
            case 10:
                ((s60) obj).v((iv) this.f6872v, (String) this.f6873w, (String) this.f6874x);
                return;
            default:
                ((by1) obj).n(0, (yx1) ((m) this.f6872v).f18055w, (qx1) this.f6873w, (vx1) this.f6874x);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public synchronized void m(v vVar) {
        ((ls1) this.f6874x).f8120c.m(vVar);
        G(vVar);
    }

    @Override // com.google.android.gms.internal.ads.w
    public synchronized void n(d6 d6Var) {
        ((ls1) this.f6874x).f8120c.n(d6Var);
        while (d6Var != null) {
            v vVar = (v) d6Var.f5317w;
            vVar.getClass();
            G(vVar);
            d6Var = (d6) d6Var.f5318x;
            if (d6Var == null || ((v) d6Var.f5317w) == null) {
                d6Var = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public /* bridge */ /* synthetic */ b o(x90 x90Var, yo0 yo0Var) {
        return j(null);
    }

    public void p(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f6872v = Integer.valueOf(i);
    }

    public void q(p2 p2Var, fa faVar) {
        int i = 0;
        while (true) {
            i3[] i3VarArr = (i3[]) this.f6873w;
            if (i < i3VarArr.length) {
                faVar.a();
                faVar.b();
                i3 A2 = p2Var.A(faVar.f5998d, 3);
                mw1 mw1Var = (mw1) ((List) this.f6872v).get(i);
                String str = mw1Var.f8459o;
                boolean z3 = true;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z3 = false;
                }
                b80.J(z3, "Invalid closed caption MIME type provided: %s", str);
                String str2 = mw1Var.f8447a;
                if (str2 == null) {
                    faVar.b();
                    str2 = faVar.e;
                }
                rv1 rv1Var = new rv1();
                rv1Var.f10296a = str2;
                rv1Var.d("video/mp2t");
                rv1Var.e(str);
                rv1Var.e = mw1Var.e;
                rv1Var.f10299d = mw1Var.f8450d;
                rv1Var.M = mw1Var.N;
                rv1Var.f10310q = mw1Var.f8462r;
                A2.e(new mw1(rv1Var));
                i3VarArr[i] = A2;
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0292, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        i.f(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02cd, code lost:
    
        throw new com.google.android.gms.internal.ads.cg0(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x020b, code lost:
    
        r13.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f0, code lost:
    
        return r12;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.ads.gh0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.gh0 s(com.google.android.gms.internal.ads.fh0 r22) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hq0.s(com.google.android.gms.internal.ads.fh0):com.google.android.gms.internal.ads.gh0");
    }

    public void t(int i) {
        if (i >= 10 && i <= 16) {
            this.f6873w = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(a.f(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
    }

    public String toString() {
        switch (this.f6871u) {
            case 20:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f6872v);
                sb2.append('{');
                com.google.android.gms.internal.measurement.e4 e4Var = (com.google.android.gms.internal.measurement.e4) ((com.google.android.gms.internal.measurement.e4) this.f6873w).f13729w;
                String str = "";
                while (e4Var != null) {
                    Object obj = e4Var.f13728v;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    e4Var = (com.google.android.gms.internal.measurement.e4) e4Var.f13729w;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public synchronized void u(z2 z2Var, int i) {
        this.f6874x = null;
        fl0 fl0Var = new fl0(i);
        jk0 jk0Var = new jk0(this);
        ((k60) this.f6872v).d(z2Var, (String) this.f6873w, fl0Var, jk0Var);
    }

    public byte[] v() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f6874x;
        an1.L(jArr4, jArr14);
        an1.L(jArr13, jArr4);
        an1.L(jArr12, jArr13);
        an1.K(jArr5, jArr12, jArr14);
        an1.K(jArr6, jArr5, jArr4);
        an1.L(jArr12, jArr6);
        an1.K(jArr7, jArr12, jArr5);
        an1.L(jArr12, jArr7);
        an1.L(jArr13, jArr12);
        an1.L(jArr12, jArr13);
        an1.L(jArr13, jArr12);
        an1.L(jArr12, jArr13);
        an1.K(jArr8, jArr12, jArr7);
        an1.L(jArr12, jArr8);
        an1.L(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            an1.L(jArr12, jArr13);
            an1.L(jArr13, jArr12);
        }
        an1.K(jArr9, jArr13, jArr8);
        an1.L(jArr12, jArr9);
        an1.L(jArr13, jArr12);
        for (int i10 = 2; i10 < 20; i10 += 2) {
            an1.L(jArr12, jArr13);
            an1.L(jArr13, jArr12);
        }
        an1.K(jArr12, jArr13, jArr9);
        an1.L(jArr13, jArr12);
        an1.L(jArr12, jArr13);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            an1.L(jArr13, jArr12);
            an1.L(jArr12, jArr13);
        }
        an1.K(jArr10, jArr12, jArr8);
        an1.L(jArr12, jArr10);
        an1.L(jArr13, jArr12);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            an1.L(jArr12, jArr13);
            an1.L(jArr13, jArr12);
        }
        an1.K(jArr11, jArr13, jArr10);
        an1.L(jArr13, jArr11);
        an1.L(jArr12, jArr13);
        for (int i13 = 2; i13 < 100; i13 += 2) {
            an1.L(jArr13, jArr12);
            an1.L(jArr12, jArr13);
        }
        an1.K(jArr13, jArr12, jArr11);
        an1.L(jArr12, jArr13);
        an1.L(jArr13, jArr12);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            an1.L(jArr12, jArr13);
            an1.L(jArr13, jArr12);
        }
        an1.K(jArr12, jArr13, jArr10);
        an1.L(jArr13, jArr12);
        an1.L(jArr12, jArr13);
        an1.L(jArr13, jArr12);
        an1.L(jArr12, jArr13);
        an1.L(jArr13, jArr12);
        an1.K(jArr, jArr13, jArr6);
        an1.K(jArr2, (long[]) this.f6872v, jArr);
        an1.K(jArr3, (long[]) this.f6873w, jArr);
        byte[] N = an1.N(jArr3);
        N[31] = (byte) (((an1.N(jArr2)[0] & 1) << 7) ^ N[31]);
        return N;
    }

    @Override // com.google.android.gms.internal.ads.m7
    public long w(int i) {
        boolean z3;
        boolean z9 = false;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        long[] jArr = (long[]) this.f6874x;
        if (i < jArr.length) {
            z9 = true;
        }
        b80.l(z9);
        return jArr[i];
    }

    public sp0 x() {
        return (sp0) ((wp0) this.f6872v).f12313b.f11471w;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(com.google.android.gms.internal.ads.vr r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6874x
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            com.google.android.gms.internal.ads.nb r1 = com.google.android.gms.internal.ads.xm.f12588a
            java.lang.Object r1 = r1.p()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.Object r1 = r3.f6873w
            c1 r1 = (c1) r1
            if (r1 != 0) goto L1b
        L19:
            r1 = r2
            goto L1f
        L1b:
            com.google.android.gms.internal.ads.vr r1 = r1.getAdapterCreator()     // Catch: android.os.RemoteException -> L19
        L1f:
            if (r1 == 0) goto L22
            goto L23
        L22:
            r1 = r4
        L23:
            boolean r4 = r0.compareAndSet(r2, r1)
            if (r4 == 0) goto L2a
            goto L3e
        L2a:
            java.lang.Object r4 = r0.get()
            if (r4 == 0) goto L23
            goto L3e
        L31:
            boolean r1 = r0.compareAndSet(r2, r4)
            if (r1 == 0) goto L38
            goto L3e
        L38:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L31
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hq0.y(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // e
    public void z(a aVar) {
        try {
            ((ps) this.f6872v).r(aVar.a());
        } catch (RemoteException e) {
            i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    /* renamed from: zza, reason: collision with other method in class */
    public synchronized v mo206zza() {
        v mo206zza;
        ls1 ls1Var = (ls1) this.f6874x;
        androidx.datastore.preferences.protobuf.i iVar = ls1Var.f8120c;
        HashMap hashMap = (HashMap) this.f6872v;
        mo206zza = iVar.mo206zza();
        tu1 tu1Var = (tu1) this.f6873w;
        hashMap.put(mo206zza, tu1Var);
        ks1 ks1Var = (ks1) ls1Var.f8129n.get(tu1Var);
        if (ks1Var != null) {
            synchronized (ks1Var) {
                ks1Var.f7869d++;
            }
        }
        return mo206zza;
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f6873w;
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public /* bridge */ /* synthetic */ Object k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.m7
    public int zza() {
        return ((long[]) this.f6874x).length;
    }

    public /* synthetic */ hq0(int i, boolean z3) {
        this.f6871u = i;
        this.f6872v = null;
        this.f6873w = null;
        this.f6874x = null;
    }

    public hq0(as asVar) {
        this.f6871u = 7;
        this.f6872v = asVar;
    }

    public hq0(y10 y10Var, Context context, wx wxVar) {
        this.f6871u = 13;
        this.f6873w = y10Var;
        this.f6872v = context;
        this.f6874x = wxVar;
    }

    public hq0(wp0 wp0Var, qp0 qp0Var, String str) {
        this.f6871u = 9;
        this.f6872v = wp0Var;
        this.f6873w = qp0Var;
        this.f6874x = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ hq0(Object obj, int i, Object obj2) {
        this.f6871u = i;
        this.f6872v = obj;
        this.f6873w = obj2;
    }

    public /* synthetic */ hq0(Object obj, Object obj2, Object obj3, int i, boolean z3) {
        this.f6871u = i;
        this.f6872v = obj;
        this.f6873w = obj2;
        this.f6874x = obj3;
    }

    public /* synthetic */ hq0(int i, Object obj, Object obj2, Object obj3) {
        this.f6871u = i;
        this.f6872v = obj2;
        this.f6873w = obj3;
        this.f6874x = obj;
    }

    public hq0(Context context, c1 c1Var) {
        this.f6871u = 0;
        this.f6874x = new AtomicReference();
        this.f6872v = context;
        this.f6873w = c1Var;
    }

    public hq0(Context context, Executor executor, sd sdVar, jk0 jk0Var) {
        this.f6871u = 4;
        this.f6873w = jk0Var;
        this.f6874x = sdVar;
        this.f6872v = ed1.E(new xe(this, 0, context), executor);
    }

    public hq0(zd1 zd1Var, wx wxVar) {
        this.f6871u = 18;
        this.f6874x = new ho0(3, (byte) 0);
        this.f6872v = zd1Var;
        this.f6873w = wxVar;
    }

    public hq0(ls1 ls1Var, tu1 tu1Var) {
        this.f6871u = 26;
        this.f6874x = ls1Var;
        this.f6872v = new HashMap();
        this.f6873w = tu1Var;
    }

    public /* synthetic */ hq0(tv1 tv1Var) {
        this.f6871u = 27;
        this.f6874x = tv1Var;
        Handler p10 = bq0.p();
        this.f6872v = p10;
        sv1 sv1Var = new sv1(this);
        this.f6873w = sv1Var;
        tv1Var.f11456a.registerStreamEventCallback(new k0(p10, 2), sv1Var);
    }

    public hq0(ArrayList arrayList) {
        this.f6871u = 2;
        this.f6872v = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f6873w = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            v8 v8Var = (v8) arrayList.get(i);
            long[] jArr = (long[]) this.f6873w;
            int i10 = i + i;
            jArr[i10] = v8Var.f11828b;
            jArr[i10 + 1] = v8Var.f11829c;
        }
        long[] jArr2 = (long[]) this.f6873w;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f6874x = copyOf;
        Arrays.sort(copyOf);
    }

    public hq0(List list) {
        this.f6871u = 3;
        this.f6872v = list;
        this.f6873w = new i3[list.size()];
        this.f6874x = new d2(new lx0(4, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.fw1, com.google.android.gms.internal.ads.e20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.w30, java.lang.Object] */
    public hq0(t10[] t10VarArr) {
        this.f6871u = 28;
        e20 e20Var = new e20();
        e20Var.f6196m = 0;
        e20Var.f6198o = 0;
        e20Var.f6199p = 0;
        byte[] bArr = bq0.f4861b;
        e20Var.f6197n = bArr;
        e20Var.f6200q = bArr;
        Object obj = new Object();
        obj.f12116c = 1.0f;
        obj.f12117d = 1.0f;
        a00 a00Var = a00.e;
        obj.e = a00Var;
        obj.f12118f = a00Var;
        obj.f12119g = a00Var;
        obj.f12120h = a00Var;
        ByteBuffer byteBuffer = t10.f11228a;
        obj.f12122k = byteBuffer;
        obj.f12123l = byteBuffer;
        obj.f12115b = -1;
        this.f6872v = r3;
        System.arraycopy(t10VarArr, 0, r3, 0, 0);
        this.f6873w = e20Var;
        this.f6874x = obj;
        t10[] t10VarArr2 = {e20Var, obj};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hq0(com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar) {
        this(22);
        this.f6871u = 22;
        r(this, iwVar);
    }

    public hq0(String str) {
        this.f6871u = 20;
        com.google.android.gms.internal.measurement.e4 e4Var = new com.google.android.gms.internal.measurement.e4(9, false);
        this.f6873w = e4Var;
        this.f6874x = e4Var;
        this.f6872v = str;
    }

    public hq0(hq0 hq0Var) {
        this.f6871u = 22;
        this.f6872v = Arrays.copyOf((long[]) hq0Var.f6872v, 10);
        this.f6873w = Arrays.copyOf((long[]) hq0Var.f6873w, 10);
        this.f6874x = Arrays.copyOf((long[]) hq0Var.f6874x, 10);
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public Object l(Object obj) {
        switch (this.f6871u) {
            case 14:
                return s((fh0) obj);
            default:
                rh0 rh0Var = (rh0) this.f6872v;
                l lVar = (l) this.f6873w;
                String str = (String) this.f6874x;
                rh0Var.getClass();
                rh0Var.f10221v.execute(new r1(7, (SQLiteDatabase) obj, str, lVar));
                return null;
        }
    }
}