package com.google.android.gms.internal.ads;
import af.c;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class fy1 extends lx1 {

    /* renamed from: r, reason: collision with root package name */
    public static final y4 f6210r;

    /* renamed from: k, reason: collision with root package name */
    public final hx1[] f6211k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f6212l;

    /* renamed from: m, reason: collision with root package name */
    public final uh[] f6213m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6214n;

    /* renamed from: o, reason: collision with root package name */
    public int f6215o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f6216p;

    /* renamed from: q, reason: collision with root package name */
    public c f6217q;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.n, com.google.android.gms.internal.ads.b0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.android.gms.internal.ads.v1] */
    static {
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        List list = Collections.EMPTY_LIST;
        o3 o3Var = o3.f8931a;
        f6210r = new y4("MergingMediaSource", new n(), null, new Object(), a7.C);
    }

    public fy1(bx1 bx1Var, hx1... hx1VarArr) {
        this.f6211k = hx1VarArr;
        this.f6214n = new ArrayList(Arrays.asList(hx1VarArr));
        this.f6212l = new ArrayList(hx1VarArr.length);
        int i = 0;
        while (true) {
            int length = hx1VarArr.length;
            if (i < length) {
                this.f6212l.add(new ArrayList());
                i++;
            } else {
                this.f6213m = new uh[length];
                this.f6216p = new long[0];
                new HashMap();
                b80.l(new s41(0).isEmpty());
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void a(y4 y4Var) {
        this.f6211k[0].a(y4Var);
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void b(xx1 xx1Var) {
        xx1 xx1Var2;
        xx1 xx1Var3;
        dy1 dy1Var = (dy1) xx1Var;
        int i = 0;
        while (true) {
            hx1[] hx1VarArr = this.f6211k;
            if (i < hx1VarArr.length) {
                List list = (List) this.f6212l.get(i);
                boolean[] zArr = dy1Var.f5550v;
                xx1[] xx1VarArr = dy1Var.f5549u;
                if (zArr[i]) {
                    xx1Var2 = ((xy1) xx1VarArr[i]).f12666u;
                } else {
                    xx1Var2 = xx1VarArr[i];
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (((ey1) list.get(i10)).f5864b.equals(xx1Var2)) {
                        list.remove(i10);
                        break;
                    }
                    i10++;
                }
                hx1 hx1Var = hx1VarArr[i];
                if (dy1Var.f5550v[i]) {
                    xx1Var3 = ((xy1) xx1VarArr[i]).f12666u;
                } else {
                    xx1Var3 = xx1VarArr[i];
                }
                hx1Var.b(xx1Var3);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final xx1 c(yx1 yx1Var, w wVar, long j10) {
        hx1[] hx1VarArr = this.f6211k;
        int length = hx1VarArr.length;
        xx1[] xx1VarArr = new xx1[length];
        uh[] uhVarArr = this.f6213m;
        int e = uhVarArr[0].e(yx1Var.f13003a);
        for (int i = 0; i < length; i++) {
            yx1 a10 = yx1Var.a(uhVarArr[i].f(e));
            xx1VarArr[i] = hx1VarArr[i].c(a10, wVar, j10 - this.f6216p[e][i]);
            ((List) this.f6212l.get(i)).add(new ey1(a10, xx1VarArr[i]));
        }
        return new dy1(this.f6216p[e], xx1VarArr);
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final y4 f() {
        hx1[] hx1VarArr = this.f6211k;
        if (hx1VarArr.length > 0) {
            return hx1VarArr[0].f();
        }
        return f6210r;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void h(as1 as1Var) {
        this.f8178j = bq0.p();
        int i = 0;
        while (true) {
            hx1[] hx1VarArr = this.f6211k;
            if (i < hx1VarArr.length) {
                t(Integer.valueOf(i), hx1VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lx1, com.google.android.gms.internal.ads.hx1
    public final void j() {
        super.j();
        Arrays.fill(this.f6213m, (Object) null);
        this.f6215o = -1;
        this.f6217q = null;
        ArrayList arrayList = this.f6214n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f6211k);
    }

    @Override // com.google.android.gms.internal.ads.lx1, com.google.android.gms.internal.ads.hx1
    public final void r() {
        c cVar = this.f6217q;
        if (cVar == null) {
            super.r();
            return;
        }
        throw cVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [c, java.io.IOException] */
    @Override // com.google.android.gms.internal.ads.lx1
    public final void s(Object obj, hx1 hx1Var, uh uhVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.f6217q == null) {
            if (this.f6215o == -1) {
                i = uhVar.c();
                this.f6215o = i;
            } else {
                int c10 = uhVar.c();
                int i10 = this.f6215o;
                if (c10 != i10) {
                    this.f6217q = new IOException();
                    return;
                }
                i = i10;
            }
            int length = this.f6216p.length;
            uh[] uhVarArr = this.f6213m;
            if (length == 0) {
                this.f6216p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, uhVarArr.length);
            }
            ArrayList arrayList = this.f6214n;
            arrayList.remove(hx1Var);
            uhVarArr[num.intValue()] = uhVar;
            if (arrayList.isEmpty()) {
                k(uhVarArr[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public final /* synthetic */ yx1 v(Object obj, yx1 yx1Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f6212l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ey1) list.get(i)).f5863a.equals(yx1Var)) {
                return ((ey1) ((List) arrayList.get(0)).get(i)).f5863a;
            }
        }
        return null;
    }
}
