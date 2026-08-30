package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class gb implements Comparable {
    public Integer A;
    public hb B;
    public boolean C;
    public xa D;
    public tw E;
    public final com.google.android.filament.k F;

    /* renamed from: u, reason: collision with root package name */
    public final lb f6353u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6354v;

    /* renamed from: w, reason: collision with root package name */
    public final String f6355w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6356x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6357y;

    /* renamed from: z, reason: collision with root package name */
    public final ib f6358z;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.filament.k, java.lang.Object] */
    public gb(int i, String str, ib ibVar) {
        lb lbVar;
        Uri parse;
        String host;
        if (lb.f8000c) {
            lbVar = new lb();
        } else {
            lbVar = null;
        }
        this.f6353u = lbVar;
        this.f6357y = new Object();
        int i10 = 0;
        this.C = false;
        this.D = null;
        this.f6354v = i;
        this.f6355w = str;
        this.f6358z = ibVar;
        Object obj = new Object();
        obj.f4254a = 2500;
        this.F = obj;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i10 = host.hashCode();
        }
        this.f6356x = i10;
    }

    public final void a(String str) {
        if (lb.f8000c) {
            this.f6353u.a(Thread.currentThread().getId(), str);
        }
    }

    public final void b(String str) {
        hb hbVar = this.B;
        if (hbVar != null) {
            HashSet hashSet = (HashSet) hbVar.f6650v;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) hbVar.C;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
            hbVar.z();
        }
        if (lb.f8000c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new t1(this, str, id2, 1));
                return;
            }
            lb lbVar = this.f6353u;
            lbVar.a(id2, str);
            lbVar.b(toString());
        }
    }

    public final void c() {
        hb hbVar = this.B;
        if (hbVar != null) {
            hbVar.z();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A.intValue() - ((gb) obj).A.intValue();
    }

    public final String d() {
        int i = this.f6354v;
        String str = this.f6355w;
        if (i != 0) {
            String num = Integer.toString(1);
            return p.a.o(new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length()), num, "-", str);
        }
        return str;
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f6357y) {
            z3 = this.C;
        }
        return z3;
    }

    public abstract d h(eb ebVar);

    public abstract void i(Object obj);

    public final void j(d dVar) {
        tw twVar;
        List list;
        synchronized (this.f6357y) {
            twVar = this.E;
        }
        if (twVar != null) {
            xa xaVar = (xa) dVar.f5231w;
            if (xaVar != null) {
                if (xaVar.e >= System.currentTimeMillis()) {
                    String d2 = d();
                    synchronized (twVar) {
                        list = (List) ((HashMap) twVar.f11470v).remove(d2);
                    }
                    if (list != null) {
                        if (mb.f8298a) {
                            mb.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), d2);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((lx0) twVar.f11473y).j((gb) it.next(), dVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            twVar.k(this);
        }
    }

    public final void k() {
        tw twVar;
        synchronized (this.f6357y) {
            twVar = this.E;
        }
        if (twVar != null) {
            twVar.k(this);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f6356x));
        synchronized (this.f6357y) {
        }
        Integer num = this.A;
        String str = this.f6355w;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb2 = new StringBuilder(concat.length() + length + 5 + 8 + length2);
        g3.a.t(sb2, "[ ] ", str, " ", concat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }
}
