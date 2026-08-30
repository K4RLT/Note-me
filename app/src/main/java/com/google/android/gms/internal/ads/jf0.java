package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class jf0 {

    /* renamed from: a, reason: collision with root package name */
    public final af0 f7433a;

    /* renamed from: b, reason: collision with root package name */
    public final nd0 f7434b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7435c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7436d = new ArrayList();
    public boolean e;

    public jf0(af0 af0Var, nd0 nd0Var) {
        this.f7433a = af0Var;
        this.f7434b = nd0Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f7435c) {
            try {
                if (!this.e) {
                    af0 af0Var = this.f7433a;
                    if (af0Var.f4471b) {
                        b(af0Var.b());
                    } else {
                        hf0 hf0Var = new hf0(0, this);
                        af0 af0Var2 = this.f7433a;
                        af0Var2.getClass();
                        af0Var2.e.f12998u.a(new t81(af0Var2, 19, hf0Var), af0Var2.f4477j);
                        return jSONArray;
                    }
                }
                ArrayList arrayList = this.f7436d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((if0) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        String str;
        boolean z3;
        String str2;
        ft ftVar;
        md0 b10;
        ft ftVar2;
        synchronized (this.f7435c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    eq eqVar = (eq) it.next();
                    nl nlVar = sl.Ga;
                    g9.r rVar = g9.r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        md0 b11 = this.f7434b.b(eqVar.f5751u);
                        if (b11 != null && (ftVar2 = b11.f8328c) != null) {
                            str = ftVar2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    if (!((Boolean) rVar.f17698c.a(sl.Ha)).booleanValue() || (b10 = this.f7434b.b(eqVar.f5751u)) == null || !b10.f8329d) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    ArrayList arrayList = this.f7436d;
                    String str4 = eqVar.f5751u;
                    md0 b12 = this.f7434b.b(str4);
                    if (b12 != null && (ftVar = b12.f8327b) != null) {
                        str2 = ftVar.toString();
                        arrayList.add(new if0(str4, str3, str2, eqVar.f5752v ? 1 : 0, eqVar.f5754x, eqVar.f5753w, z3));
                    }
                    str2 = "";
                    arrayList.add(new if0(str4, str3, str2, eqVar.f5752v ? 1 : 0, eqVar.f5754x, eqVar.f5753w, z3));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
