package com.google.android.gms.internal.ads;
import a5.a;
import c7.x;
import f9.k;
import g3.a;
import k9.a0;
import l9.i;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    public final int f6066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6068c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6069d;
    public final x e;

    /* renamed from: f, reason: collision with root package name */
    public final q5 f6070f;

    /* renamed from: n, reason: collision with root package name */
    public int f6077n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6071g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6072h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6073j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f6074k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f6075l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f6076m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f6078o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f6079p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f6080q = "";

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.q5, java.lang.Object] */
    public fi(int i, int i10, int i11, int i12, int i13, int i14, int i15, boolean z3) {
        this.f6066a = i;
        this.f6067b = i10;
        this.f6068c = i11;
        this.f6069d = z3;
        this.e = new x(i12, 4);
        Object obj = new Object();
        obj.f9751u = i13;
        i14 = (i14 > 64 || i14 < 0) ? 64 : i14;
        if (i15 <= 0) {
            obj.f9752v = 1;
        } else {
            obj.f9752v = i15;
        }
        obj.f9753w = new oi(i14);
        this.f6070f = obj;
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb2.append((String) arrayList.get(i));
            sb2.append(' ');
            i++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    public final void a(String str, boolean z3, float f10, float f11, float f12, float f13) {
        c(str, z3, f10, f11, f12, f13);
        synchronized (this.f6071g) {
            try {
                if (this.f6076m < 0) {
                    int i = a0.f19634b;
                    i.a("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f6071g) {
            try {
                int i = this.f6074k;
                int i10 = this.f6075l;
                int i11 = this.f6067b;
                if (!this.f6069d) {
                    i11 = (i10 * i11) + (i * this.f6066a);
                }
                if (i11 > this.f6077n) {
                    this.f6077n = i11;
                    k kVar = k.C;
                    if (!kVar.f16817h.g().l()) {
                        x xVar = this.e;
                        this.f6078o = xVar.o(this.f6072h);
                        this.f6079p = xVar.o(this.i);
                    }
                    if (!kVar.f16817h.g().m()) {
                        this.f6080q = this.f6070f.a(this.i, this.f6073j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z3, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() >= this.f6068c) {
                synchronized (this.f6071g) {
                    try {
                        this.f6072h.add(str);
                        this.f6074k += str.length();
                        if (z3) {
                            this.i.add(str);
                            this.f6073j.add(new li(f10, f11, f12, f13, r10.size() - 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((fi) obj).f6078o;
        if (str == null || !str.equals(this.f6078o)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6078o.hashCode();
    }

    public final String toString() {
        int i = this.f6075l;
        int i10 = this.f6077n;
        int i11 = this.f6074k;
        String d2 = d(this.f6072h);
        String d10 = d(this.i);
        String str = this.f6078o;
        String str2 = this.f6079p;
        String str3 = this.f6080q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i11).length();
        int length4 = d2.length();
        int length5 = d10.length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        a.r(i, i10, "ActivityContent fetchId: ", " score:", sb2);
        sb2.append(" total_length:");
        sb2.append(i11);
        sb2.append("\n text: ");
        sb2.append(d2);
        a.t(sb2, "\n viewableText", d10, "\n signture: ", str);
        return a.l(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}