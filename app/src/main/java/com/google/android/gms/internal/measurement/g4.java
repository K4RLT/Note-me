package com.google.android.gms.internal.measurement;
import a5.a;
import g3.a;
import j6.e;
import j6.n;
import o0.f;
import q.x;
import x.n;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile yb.b f13759a;

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static n b(i iVar, p pVar, j6.n nVar, ArrayList arrayList) {
        String str = pVar.f13877u;
        if (iVar.C(str)) {
            n o10 = iVar.o(str);
            if (o10 instanceof j) {
                return ((j) o10).e(nVar, arrayList);
            }
            q.x.n(a5.a.g(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            o0.f(1, "hasOwnProperty", arrayList);
            if (iVar.C(((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b())) {
                return n.f13852m;
            }
            return n.f13853n;
        }
        q.x.n(g3.a.k("Object has no function ", str));
        return null;
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
