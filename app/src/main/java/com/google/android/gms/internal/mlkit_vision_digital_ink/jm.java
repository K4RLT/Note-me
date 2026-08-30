package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ba.p;
import k8.e;
import l1.f;
import l4.a;
import q.x;
import q1.a;
import q1.c;
import r5.c;
import r5.h;
import r5.j;
import x.n;
import z1.e;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.rm1;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jm implements go, h, k8.e, qa, ct, da, uq {

    /* renamed from: v, reason: collision with root package name */
    public static jm f14512v;

    /* renamed from: w, reason: collision with root package name */
    public static final jm f14513w = new jm(1);

    /* renamed from: x, reason: collision with root package name */
    public static final jm f14514x = new jm(2);

    /* renamed from: y, reason: collision with root package name */
    public static final jm f14515y = new jm(3);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14516u;

    public /* synthetic */ jm(int i) {
        this.f14516u = i;
    }

    public static x1 e(String str) {
        boolean z3;
        e2 E;
        a2 a2Var = z1.e;
        d2 a10 = q1.a();
        e2 e2Var = a10.f14179b;
        if (e2Var == v1.A) {
            e2Var = null;
            q1.c(a10, null);
            z3 = true;
        } else {
            z3 = false;
        }
        if (e2Var == null) {
            UUID b10 = r1.f14885c.b();
            String f10 = l1.f(b10);
            ba.p pVar = t1.A;
            n4 n4Var = (n4) q1.f14830a.get();
            if (!n4Var.isEmpty()) {
                n4Var.forEach(new s1(1));
            }
            E = new u1(b10, f10, str, a2Var, pVar, a10);
        } else if (e2Var instanceof n1) {
            E = ((n1) e2Var).v(str, a2Var, false, a10);
        } else {
            E = e2Var.E(str, a2Var, a10);
        }
        q1.c(a10, E);
        return new x1(E, z3);
    }

    public static final un f(long j10, Object obj) {
        int i;
        un unVar = (un) dp.h(j10, obj);
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            un f10 = unVar.f(i);
            dp.m(obj, j10, f10);
            return f10;
        }
        return unVar;
    }

    public static /* bridge */ yo g(Object obj) {
        nn nnVar = (nn) obj;
        yo yoVar = nnVar.zzc;
        if (yoVar == yo.f15293f) {
            yo b10 = yo.b();
            nnVar.zzc = b10;
            return b10;
        }
        return yoVar;
    }

    public static synchronized void h() {
        synchronized (jm.class) {
            if (f14512v == null) {
                f14512v = new jm(0);
            }
        }
    }

    public static final eo j(Object obj, Object obj2) {
        eo eoVar = (eo) obj;
        eo eoVar2 = (eo) obj2;
        if (!eoVar2.isEmpty()) {
            if (!eoVar.f14267u) {
                eoVar = eoVar.a();
            }
            eoVar.c();
            if (!eoVar2.isEmpty()) {
                eoVar.putAll(eoVar2);
            }
        }
        return eoVar;
    }

    public static void m(s5 s5Var, Map.Entry entry) {
        ym ymVar = (ym) s5Var.f14961v;
        ln lnVar = (ln) entry.getKey();
        gp gpVar = gp.f14373w;
        gp gpVar2 = lnVar.f14605v;
        int i = lnVar.f14604u;
        switch (gpVar2.ordinal()) {
            case 0:
                ymVar.n(i, Double.doubleToRawLongBits(((Double) entry.getValue()).doubleValue()));
                return;
            case 1:
                ymVar.l(i, Float.floatToRawIntBits(((Float) entry.getValue()).floatValue()));
                return;
            case 2:
                ymVar.z(i, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                ymVar.z(i, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ymVar.p(i, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                ymVar.n(i, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                ymVar.l(i, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                ymVar.g(i, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ymVar.u(i, (String) entry.getValue());
                return;
            case 9:
                s5Var.k(i, entry.getValue(), oo.f14756c.a(entry.getValue().getClass()));
                return;
            case 10:
                s5Var.m(i, entry.getValue(), oo.f14756c.a(entry.getValue().getClass()));
                return;
            case 11:
                ymVar.j(i, (tm) entry.getValue());
                return;
            case 12:
                ymVar.x(i, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ymVar.p(i, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                ymVar.l(i, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ymVar.n(i, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                int intValue = ((Integer) entry.getValue()).intValue();
                ymVar.x(i, (intValue >> 31) ^ (intValue + intValue));
                return;
            case 17:
                long longValue = ((Long) entry.getValue()).longValue();
                ymVar.z(i, (longValue >> 63) ^ (longValue + longValue));
                return;
            default:
                return;
        }
    }

    public static boolean n(int i, androidx.datastore.preferences.protobuf.i iVar, Object obj) {
        rm1 rm1Var = (rm1) iVar.f737y;
        int i10 = iVar.f734v;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                iVar.S0(5);
                                ((yo) obj).c(5 | (i11 << 3), Integer.valueOf(rm1Var.A()));
                                return true;
                            }
                            androidx.datastore.preferences.protobuf.s1.s();
                            return false;
                        }
                        if (i != 0) {
                            return false;
                        }
                        androidx.datastore.preferences.protobuf.s1.u("Protocol message end-group tag did not match expected tag.");
                        return false;
                    }
                    yo b10 = yo.b();
                    int i13 = i11 << 3;
                    int i14 = i + 1;
                    if (i14 >= 100) {
                        androidx.datastore.preferences.protobuf.s1.u("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return false;
                    }
                    while (iVar.Z0() != Integer.MAX_VALUE && n(i14, iVar, b10)) {
                    }
                    if ((i13 | 4) == iVar.f734v) {
                        if (b10.e) {
                            b10.e = false;
                        }
                        ((yo) obj).c(i13 | 3, b10);
                        return true;
                    }
                    androidx.datastore.preferences.protobuf.s1.u("Protocol message end-group tag did not match expected tag.");
                    return false;
                }
                ((yo) obj).c((i11 << 3) | 2, iVar.c1());
                return true;
            }
            iVar.S0(1);
            ((yo) obj).c((i11 << 3) | 1, Long.valueOf(rm1Var.O()));
            return true;
        }
        iVar.S0(0);
        ((yo) obj).c(i11 << 3, Long.valueOf(rm1Var.Q()));
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.go
    public qo a(Class cls) {
        switch (this.f14516u) {
            case 3:
                if (nn.class.isAssignableFrom(cls)) {
                    try {
                        return (qo) nn.h(cls.asSubclass(nn.class)).q(3, null);
                    } catch (Exception e) {
                        l4.a.k("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    q.x.n("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // k8.e
    public Object apply(Object obj) {
        switch (this.f14516u) {
            case 15:
                return (byte[]) obj;
            default:
                return (byte[]) obj;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.go
    public boolean b(Class cls) {
        switch (this.f14516u) {
            case 3:
                return nn.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        return new Object();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h
    public Object d(g gVar) {
        g0 g0Var;
        int i = 0;
        f fVar = null;
        switch (this.f14516u) {
            case 7:
                OutputStream h3 = gVar.f14346b.h(gVar.f14349f);
                ArrayList arrayList = new ArrayList();
                arrayList.add(h3);
                ArrayList arrayList2 = gVar.f14348d;
                if (!arrayList2.isEmpty()) {
                    Uri uri = gVar.e;
                    int i10 = f.f14287v;
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        kx kxVar = (kx) obj;
                        synchronized (kxVar.f14578b) {
                            g0Var = (g0) kxVar.f14580d.get(uri);
                        }
                        if (g0Var != null) {
                            arrayList3.add(g0Var);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        fVar = new f(h3, arrayList3);
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                e4 listIterator = gVar.f14347c.listIterator(0);
                if (listIterator.hasNext()) {
                    OutputStream outputStream = (OutputStream) gn.o(arrayList);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw new IOException("wrapForAppend not supported by compress");
                }
                Collections.reverse(arrayList);
                return (OutputStream) arrayList.get(0);
            case 8:
                Pair a10 = gVar.f14346b.a(gVar.f14349f);
                try {
                    if (gVar.f14347c.isEmpty()) {
                        Uri uri2 = (Uri) a10.first;
                        if (uri2.getScheme().equals("fd")) {
                            try {
                                ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(Integer.parseInt(uri2.getSchemeSpecificPart()));
                                ((Closeable) a10.second).close();
                                return new AssetFileDescriptor(fromFd, 0L, fromFd.getStatSize());
                            } catch (NumberFormatException e) {
                                throw new IOException(e);
                            }
                        }
                        throw new IOException("Scheme must be 'fd'");
                    }
                    throw new IOException("Accessing file descriptor directly would skip transforms for ".concat(String.valueOf(gVar.e)));
                } catch (Throwable th) {
                    ((Closeable) a10.second).close();
                    throw th;
                }
            case 9:
                ArrayList arrayList4 = new ArrayList();
                k(gVar.f14345a, gVar.f14349f, arrayList4);
                if (arrayList4.isEmpty()) {
                    return null;
                }
                IOException iOException = new IOException("Failed to delete one or more files");
                int size2 = arrayList4.size();
                while (i < size2) {
                    Object obj2 = arrayList4.get(i);
                    i++;
                    iOException.addSuppressed((IOException) obj2);
                }
                throw iOException;
            default:
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = gVar.f14345a;
                arrayDeque.addAll(iVar.b(gVar.e.buildUpon().fragment(null).build()));
                long j10 = 0;
                while (!arrayDeque.isEmpty()) {
                    Uri uri3 = (Uri) arrayDeque.remove();
                    if (iVar.h(uri3)) {
                        arrayDeque.addAll(iVar.b(uri3));
                    } else if (iVar.g(uri3)) {
                        j10 = iVar.a(uri3) + j10;
                    } else {
                        throw new FileNotFoundException(String.format("Child %s could not be opened", uri3));
                    }
                }
                return Long.valueOf(j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if ((android.system.Os.lstat(r0.getAbsolutePath()).st_mode & android.system.OsConstants.S_IFLNK) != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.h, com.google.android.gms.internal.mlkit_vision_digital_ink.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.google.android.gms.internal.mlkit_vision_digital_ink.i r5, android.net.Uri r6, java.util.ArrayList r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_digital_ink.h0 r0 = new com.google.android.gms.internal.mlkit_vision_digital_ink.h0
            r0.<init>()
            r1 = 1
            r0.f14388u = r1
            boolean r1 = r5.h(r6)     // Catch: java.io.IOException -> L44
            if (r1 == 0) goto L5f
            java.lang.Object r0 = r5.c(r6, r0)     // Catch: java.lang.Exception -> L2d
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L1d
            goto L2d
        L1d:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L2d
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: java.lang.Exception -> L2d
            int r0 = r0.st_mode     // Catch: java.lang.Exception -> L2d
            int r1 = android.system.OsConstants.S_IFLNK     // Catch: java.lang.Exception -> L2d
            r0 = r0 & r1
            if (r0 == 0) goto L2d
            goto L46
        L2d:
            java.util.ArrayList r0 = r5.b(r6)     // Catch: java.io.IOException -> L44
            int r1 = r0.size()     // Catch: java.io.IOException -> L44
            r2 = 0
        L36:
            if (r2 >= r1) goto L46
            java.lang.Object r3 = r0.get(r2)     // Catch: java.io.IOException -> L44
            int r2 = r2 + 1
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.io.IOException -> L44
            r4.k(r5, r3, r7)     // Catch: java.io.IOException -> L44
            goto L36
        L44:
            r5 = move-exception
            goto L63
        L46:
            java.lang.String r0 = r6.getScheme()     // Catch: java.io.IOException -> L44
            com.google.android.gms.internal.mlkit_vision_digital_ink.j0 r5 = r5.j(r0)     // Catch: java.io.IOException -> L44
            android.net.Uri$Builder r6 = r6.buildUpon()     // Catch: java.io.IOException -> L44
            r0 = 0
            android.net.Uri$Builder r6 = r6.fragment(r0)     // Catch: java.io.IOException -> L44
            android.net.Uri r6 = r6.build()     // Catch: java.io.IOException -> L44
            r5.k(r6)     // Catch: java.io.IOException -> L44
            return
        L5f:
            r5.d(r6)     // Catch: java.io.IOException -> L44
            return
        L63:
            r7.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jm.k(com.google.android.gms.internal.mlkit_vision_digital_ink.i, android.net.Uri, java.util.ArrayList):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ct
    public r8 l(Object obj) {
        return dt.b((m) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qa
    public /* bridge */ /* synthetic */ void r(Object obj) {
        switch (this.f14516u) {
            case 17:
                Log.i("MddModelManager", "File groups registered: ".concat(String.valueOf((Boolean) obj)));
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qa
    public void t(Throwable th) {
        switch (this.f14516u) {
            case 17:
                Log.i("MddModelManager", "Failed to register file groups.", th);
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        return va.f15125v;
    }

    private final void i(Throwable th) {
    }
}
