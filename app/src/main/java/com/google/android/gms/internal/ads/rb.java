package com.google.android.gms.internal.ads;
import g3.a;
import j6.c;
import j6.e;
import lb.q0;
import lb.s0;
import lb.t0;
import lb.v;
import mb.a;
import mb.b;
import mb.c;
import ob.a;
import p.a;
import v.h;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class rb implements lb.s0 {

    /* renamed from: u, reason: collision with root package name */
    public long f10190u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10191v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f10192w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f10193x;

    public rb(File file) {
        this.f10192w = new LinkedHashMap(16, 0.75f, true);
        this.f10190u = 0L;
        this.f10193x = new tf(this, 6, file);
        this.f10191v = 20971520;
    }

    public static byte[] f(pb pbVar, long j10) {
        long j11 = pbVar.f9453v - pbVar.f9454w;
        if (j10 >= 0 && j10 <= j11) {
            int i = (int) j10;
            if (i == j10) {
                byte[] bArr = new byte[i];
                new DataInputStream(pbVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(j11).length());
        g3.a.s(sb2, "streamToBytes length=", j10, ", maxLength=");
        sb2.append(j11);
        throw new IOException(sb2.toString());
    }

    public static void g(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static int h(pb pbVar) {
        return (n(pbVar) << 24) | n(pbVar) | (n(pbVar) << 8) | (n(pbVar) << 16);
    }

    public static void i(BufferedOutputStream bufferedOutputStream, long j10) {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }

    public static long j(pb pbVar) {
        return (n(pbVar) & 255) | ((n(pbVar) & 255) << 8) | ((n(pbVar) & 255) << 16) | ((n(pbVar) & 255) << 24) | ((n(pbVar) & 255) << 32) | ((n(pbVar) & 255) << 40) | ((n(pbVar) & 255) << 48) | ((n(pbVar) & 255) << 56);
    }

    public static void k(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String l(pb pbVar) {
        return new String(f(pbVar, j(pbVar)), "UTF-8");
    }

    public static int n(pb pbVar) {
        int read = pbVar.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized xa a(String str) {
        ob obVar = (ob) ((LinkedHashMap) this.f10192w).get(str);
        if (obVar == null) {
            return null;
        }
        File e = e(str);
        try {
            pb pbVar = new pb(new BufferedInputStream(new FileInputStream(e)), e.length());
            try {
                String str2 = ob.a(pbVar).f9072b;
                if (!TextUtils.equals(str, str2)) {
                    mb.b("%s: key=%s, found=%s", e.getAbsolutePath(), str, str2);
                    ob obVar2 = (ob) ((LinkedHashMap) this.f10192w).remove(str);
                    if (obVar2 != null) {
                        this.f10190u -= obVar2.f9071a;
                    }
                    return null;
                }
                byte[] f10 = f(pbVar, pbVar.f9453v - pbVar.f9454w);
                xa xaVar = new xa();
                xaVar.f12527a = f10;
                xaVar.f12528b = obVar.f9073c;
                xaVar.f12529c = obVar.f9074d;
                xaVar.f12530d = obVar.e;
                xaVar.e = obVar.f9075f;
                xaVar.f12531f = obVar.f9076g;
                List<ab> list = obVar.f9077h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (ab abVar : list) {
                    treeMap.put(abVar.f4428a, abVar.f4429b);
                }
                xaVar.f12532g = treeMap;
                xaVar.f12533h = Collections.unmodifiableList(list);
                return xaVar;
            } finally {
                pbVar.close();
            }
        } catch (IOException e8) {
            mb.b("%s: %s", e.getAbsolutePath(), e8.toString());
            synchronized (this) {
                boolean delete = e(str).delete();
                ob obVar3 = (ob) ((LinkedHashMap) this.f10192w).remove(str);
                if (obVar3 != null) {
                    this.f10190u -= obVar3.f9071a;
                }
                if (!delete) {
                    mb.b("Could not delete cache entry for key=%s, filename=%s", str, o(str));
                }
                return null;
            }
        }
    }

    @Override // lb.s0
    public Object b() {
        int i;
        lb.t0 t0Var = (lb.t0) this.f10192w;
        String str = (String) this.f10193x;
        long j10 = this.f10190u;
        t0Var.getClass();
        lb.q0 q0Var = (lb.q0) ((Map) t0Var.b(new j6.e(t0Var, Arrays.asList(str)))).get(str);
        if (q0Var == null || (i = q0Var.f20236c.f6274b) == 5 || i == 6 || i == 4) {
            lb.t0.f20278f.c(p.a.k("Could not find pack ", str, " while trying to complete it"), new Object[0]);
        }
        lb.v vVar = t0Var.f20279a;
        int i10 = this.f10191v;
        if (vVar.d(str, j10, i10).exists()) {
            lb.v.h(vVar.d(str, j10, i10));
        }
        q0Var.f20236c.f6274b = 4;
        return null;
    }

    public synchronized void c(String str, xa xaVar) {
        float f10;
        try {
            long j10 = this.f10190u;
            int length = xaVar.f12527a.length;
            long j11 = j10 + length;
            int i = this.f10191v;
            float f11 = 0.9f;
            if (j11 <= i || length <= i * 0.9f) {
                File e = e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                    ob obVar = new ob(str, xaVar);
                    try {
                        g(bufferedOutputStream, 538247942);
                        k(bufferedOutputStream, str);
                        String str2 = obVar.f9073c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        k(bufferedOutputStream, str2);
                        i(bufferedOutputStream, obVar.f9074d);
                        i(bufferedOutputStream, obVar.e);
                        i(bufferedOutputStream, obVar.f9075f);
                        i(bufferedOutputStream, obVar.f9076g);
                        List<ab> list = obVar.f9077h;
                        if (list != null) {
                            g(bufferedOutputStream, list.size());
                            for (ab abVar : list) {
                                k(bufferedOutputStream, abVar.f4428a);
                                k(bufferedOutputStream, abVar.f4429b);
                            }
                        } else {
                            g(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(xaVar.f12527a);
                        bufferedOutputStream.close();
                        obVar.f9071a = e.length();
                        m(str, obVar);
                        long j12 = this.f10190u;
                        int i10 = this.f10191v;
                        if (j12 >= i10) {
                            boolean z3 = mb.f8298a;
                            if (z3) {
                                mb.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.f10190u;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f10192w).entrySet().iterator();
                            int i11 = 0;
                            while (it.hasNext()) {
                                ob obVar2 = (ob) ((Map.Entry) it.next()).getValue();
                                String str3 = obVar2.f9072b;
                                if (e(str3).delete()) {
                                    f10 = f11;
                                    this.f10190u -= obVar2.f9071a;
                                } else {
                                    f10 = f11;
                                    mb.b("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it.remove();
                                i11++;
                                if (((float) this.f10190u) < i10 * f10) {
                                    break;
                                } else {
                                    f11 = f10;
                                }
                            }
                            if (z3) {
                                mb.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f10190u - j13), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e8) {
                        mb.b("%s", e8.toString());
                        bufferedOutputStream.close();
                        mb.b("Failed to write header for %s", e.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!e.delete()) {
                        mb.b("Could not clean up file %s", e.getAbsolutePath());
                    }
                    if (!((qb) this.f10193x).zza().exists()) {
                        mb.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f10192w).clear();
                        this.f10190u = 0L;
                        d();
                    }
                }
            }
        } finally {
        }
    }

    public synchronized void d() {
        long length;
        pb pbVar;
        File zza = ((qb) this.f10193x).zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                mb.c("Unable to create cache dir %s", zza.getAbsolutePath());
            }
        } else {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        pbVar = new pb(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        ob a10 = ob.a(pbVar);
                        a10.f9071a = length;
                        m(a10.f9072b, a10);
                        pbVar.close();
                    } catch (Throwable th) {
                        pbVar.close();
                        throw th;
                        break;
                    }
                }
            }
        }
    }

    public File e(String str) {
        return new File(((qb) this.f10193x).zza(), o(str));
    }

    public void m(String str, ob obVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10192w;
        if (!linkedHashMap.containsKey(str)) {
            this.f10190u += obVar.f9071a;
        } else {
            this.f10190u = (obVar.f9071a - ((ob) linkedHashMap.get(str)).f9071a) + this.f10190u;
        }
        linkedHashMap.put(str, obVar);
    }

    public /* synthetic */ rb(lb.t0 t0Var, String str, int i, long j10) {
        this.f10192w = t0Var;
        this.f10193x = str;
        this.f10191v = i;
        this.f10190u = j10;
    }

    public rb(j6.c cVar) {
        this.f10192w = new LinkedHashMap(16, 0.75f, true);
        this.f10190u = 0L;
        this.f10193x = cVar;
        this.f10191v = 5242880;
    }

    public rb(int i, long j10, String str, String str2) {
        this.f10190u = j10;
        this.f10192w = str;
        this.f10193x = str2;
        this.f10191v = i;
    }
}
