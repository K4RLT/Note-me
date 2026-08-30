package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.j61;
import com.google.android.gms.internal.ads.z81;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class f7 {

    /* renamed from: u, reason: collision with root package name */
    public static final s6 f14302u;

    /* renamed from: v, reason: collision with root package name */
    public static final t6 f14303v;

    static {
        int i = 1;
        f14302u = new s6(i);
        f14303v = new t6(i);
    }

    public static u6 a(Set set) {
        u6 u6Var = new u6();
        u6Var.f15054d = f14303v;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d6 d6Var = (d6) it.next();
            n5.e(d6Var, "key");
            boolean z3 = d6Var.f14186c;
            HashMap hashMap = u6Var.f15052b;
            HashMap hashMap2 = u6Var.f15051a;
            if (z3) {
                if (z3) {
                    hashMap2.remove(d6Var);
                    hashMap.put(d6Var, u6.f15050f);
                } else {
                    q.x.n("key must be repeating");
                    return null;
                }
            } else {
                hashMap.remove(d6Var);
                hashMap2.put(d6Var, u6.e);
            }
        }
        return u6Var;
    }

    public static ab b(ExecutorService executorService) {
        if (executorService instanceof ab) {
            return (ab) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new db((ScheduledExecutorService) executorService);
        }
        return new ab(executorService);
    }

    public static final File c(Uri uri) {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new IOException("Did not expect uri to have authority");
            }
            throw new IOException("Did not expect uri to have query");
        }
        throw new IOException("Scheme must be 'file'");
    }

    public static int d(int i) {
        if (i != 0) {
            switch (i) {
                case 950:
                    return 951;
                case 951:
                    return 952;
                case 952:
                    return 953;
                default:
                    switch (i) {
                        case AdError.NO_FILL_ERROR_CODE /* 1001 */:
                            return AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
                        case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                            return 1003;
                        case 1003:
                            return 1004;
                        case 1004:
                            return 1005;
                        case 1005:
                            return 1006;
                        default:
                            return 0;
                    }
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        n(r1, r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.tl.j(r8)
            r1 = r0 & r10
            int r2 = g(r1, r11)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = java.util.Objects.equals(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = java.util.Objects.equals(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            n(r1, r11, r7)
            return r2
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.f7.e(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static boolean f(j61 j61Var, Collection collection) {
        collection.getClass();
        if (collection instanceof v4) {
            collection = ((v4) collection).zza();
        }
        boolean z3 = false;
        if ((collection instanceof Set) && collection.size() > j61Var.size()) {
            Iterator<E> it = j61Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z3 = true;
                }
            }
            return z3;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z3 |= j61Var.remove(it2.next());
        }
        return z3;
    }

    public static int g(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Uri h(Context context, q2 q2Var, tr trVar) {
        String P;
        String str;
        if (!trVar.Q().isEmpty()) {
            P = trVar.Q();
        } else {
            P = trVar.P();
        }
        int y10 = trVar.y();
        Uri.Builder buildUpon = n5.a(context, q2Var).buildUpon().appendPath("links").build().buildUpon();
        int i = y10 - 1;
        if (i != 0) {
            if (i != 1) {
                str = "public_3p";
            } else {
                str = "private";
            }
        } else {
            str = "public";
        }
        return buildUpon.appendPath(str).build().buildUpon().appendPath(P).build();
    }

    public static final void i(StringBuilder sb2, Iterator it, String str) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e) {
            g5.q.f(e);
        }
    }

    public static tr j(tr trVar, long j10) {
        pr prVar = (pr) trVar.H().g();
        prVar.b();
        qr.D((qr) prVar.f14430v, j10);
        qr qrVar = (qr) prVar.i();
        rr rrVar = (rr) trVar.g();
        rrVar.l(qrVar);
        return (tr) rrVar.i();
    }

    public static Object k(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        q.x.n(g3.a.g(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static Executor l(Executor executor, ma maVar) {
        executor.getClass();
        if (executor == ia.f14473u) {
            return executor;
        }
        return new z81(executor, maVar, 1);
    }

    public static String m(or orVar) {
        if (p(orVar)) {
            return orVar.C();
        }
        return orVar.B();
    }

    public static void n(int i, Object obj, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }

    public static boolean o(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static boolean p(or orVar) {
        if (orVar.N()) {
            Iterator it = orVar.y().y().iterator();
            while (it.hasNext()) {
                if (((oq) it.next()).E()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean q(tr trVar) {
        if (trVar.w()) {
            Iterator it = trVar.T().iterator();
            while (it.hasNext()) {
                if (((or) it.next()).t() == 2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean r(or orVar) {
        return s(orVar.F(), n4.s(new Object[]{"file", "asset"}, 2));
    }

    public static boolean s(String str, n4 n4Var) {
        boolean z3;
        char c10;
        if (!str.isEmpty()) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                String substring = str.substring(0, indexOf);
                k5 k3 = n4Var.k();
                while (k3.hasNext()) {
                    String str2 = (String) k3.next();
                    int length = substring.length();
                    if (substring != str2) {
                        if (length == str2.length()) {
                            for (int i = 0; i < length; i++) {
                                if (substring.charAt(i) == str2.charAt(i) || ((c10 = (char) ((r5 | ' ') - 97)) < 26 && c10 == ((char) ((r6 | ' ') - 97)))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            q.x.o(tl.e("Invalid url: %s", str));
            return false;
        }
        return false;
    }
}
