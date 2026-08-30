package com.google.android.gms.internal.ads;
import i0.m;
import l9.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ak0 implements s90 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public Object F;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4529u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4530v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4531w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f4532x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4533y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f4534z;

    public ak0(et1 et1Var, ku1 ku1Var, io0 io0Var, tu1 tu1Var, a0 a0Var) {
        this.f4530v = tu1Var;
        this.f4531w = a0Var;
        this.A = et1Var;
        this.F = new uy1();
        this.f4533y = new IdentityHashMap();
        this.f4534z = new HashMap();
        this.f4532x = new ArrayList();
        this.D = ku1Var;
        this.E = io0Var;
        this.B = new HashMap();
        this.C = new HashSet();
    }

    public uh a(int i, int i10, List list) {
        boolean z3;
        ArrayList arrayList = (ArrayList) this.f4532x;
        boolean z9 = true;
        if (i >= 0 && i <= i10 && i10 <= arrayList.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        if (list.size() != i10 - i) {
            z9 = false;
        }
        b80.l(z9);
        for (int i11 = i; i11 < i10; i11++) {
            ((tt1) arrayList.get(i11)).f11443a.a((y4) list.get(i11 - i));
        }
        return d();
    }

    public boolean b() {
        return this.f4529u;
    }

    public void c() {
        b80.K(!this.f4529u);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f4532x;
            if (i < arrayList.size()) {
                tt1 tt1Var = (tt1) arrayList.get(i);
                l(tt1Var);
                ((HashSet) this.C).add(tt1Var);
                i++;
            } else {
                this.f4529u = true;
                return;
            }
        }
    }

    public uh d() {
        ArrayList arrayList = (ArrayList) this.f4532x;
        if (!arrayList.isEmpty()) {
            int i = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tt1 tt1Var = (tt1) arrayList.get(i10);
                tt1Var.f11446d = i;
                i += tt1Var.f11443a.f11746o.f9656b.a();
            }
            return new zt1(arrayList, (uy1) this.F);
        }
        return uh.f11636a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // com.google.android.gms.internal.ads.s90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r24, android.content.Context r25, com.google.android.gms.internal.ads.y60 r26) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ak0.e(boolean, android.content.Context, com.google.android.gms.internal.ads.y60):void");
    }

    public uh f(List list, uy1 uy1Var) {
        ArrayList arrayList = (ArrayList) this.f4532x;
        k(0, arrayList.size());
        return g(arrayList.size(), list, uy1Var);
    }

    public uh g(int i, List list, uy1 uy1Var) {
        ArrayList arrayList = (ArrayList) this.f4532x;
        if (!list.isEmpty()) {
            this.F = uy1Var;
            for (int i10 = i; i10 < list.size() + i; i10++) {
                tt1 tt1Var = (tt1) list.get(i10 - i);
                if (i10 > 0) {
                    tt1 tt1Var2 = (tt1) arrayList.get(i10 - 1);
                    tt1Var.f11446d = tt1Var2.f11443a.f11746o.f9656b.a() + tt1Var2.f11446d;
                    tt1Var.e = false;
                    tt1Var.f11445c.clear();
                } else {
                    tt1Var.f11446d = 0;
                    tt1Var.e = false;
                    tt1Var.f11445c.clear();
                }
                int a10 = tt1Var.f11443a.f11746o.f9656b.a();
                for (int i11 = i10; i11 < arrayList.size(); i11++) {
                    ((tt1) arrayList.get(i11)).f11446d += a10;
                }
                arrayList.add(i10, tt1Var);
                ((HashMap) this.f4534z).put(tt1Var.f11444b, tt1Var);
                if (this.f4529u) {
                    l(tt1Var);
                    if (((IdentityHashMap) this.f4533y).isEmpty()) {
                        ((HashSet) this.C).add(tt1Var);
                    } else {
                        st1 st1Var = (st1) ((HashMap) this.B).get(tt1Var);
                        if (st1Var != null) {
                            st1Var.f11133a.p(st1Var.f11134b);
                        }
                    }
                }
            }
        }
        return d();
    }

    public uh h(int i, int i10, uy1 uy1Var) {
        boolean z3 = false;
        if (i >= 0 && i <= i10 && i10 <= ((ArrayList) this.f4532x).size()) {
            z3 = true;
        }
        b80.l(z3);
        this.F = uy1Var;
        k(i, i10);
        return d();
    }

    public uh i(uy1 uy1Var) {
        int size = ((ArrayList) this.f4532x).size();
        if (uy1Var.f11756b.length != size) {
            uy1Var = new uy1(new Random(uy1Var.f11755a.nextLong())).a(size);
        }
        this.F = uy1Var;
        return d();
    }

    public void j() {
        Iterator it = ((HashSet) this.C).iterator();
        while (it.hasNext()) {
            tt1 tt1Var = (tt1) it.next();
            if (tt1Var.f11445c.isEmpty()) {
                st1 st1Var = (st1) ((HashMap) this.B).get(tt1Var);
                if (st1Var != null) {
                    st1Var.f11133a.p(st1Var.f11134b);
                }
                it.remove();
            }
        }
    }

    public void k(int i, int i10) {
        ArrayList arrayList = (ArrayList) this.f4532x;
        while (true) {
            i10--;
            if (i10 >= i) {
                tt1 tt1Var = (tt1) arrayList.remove(i10);
                ((HashMap) this.f4534z).remove(tt1Var.f11444b);
                int i11 = -tt1Var.f11443a.f11746o.f9656b.a();
                for (int i12 = i10; i12 < arrayList.size(); i12++) {
                    ((tt1) arrayList.get(i12)).f11446d += i11;
                }
                tt1Var.e = true;
                if (this.f4529u) {
                    m(tt1Var);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.ut1, com.google.android.gms.internal.ads.zx1] */
    public void l(tt1 tt1Var) {
        ux1 ux1Var = tt1Var.f11443a;
        zx1 r12 = new zx1() { // from class: com.google.android.gms.internal.ads.ut1
            @Override // com.google.android.gms.internal.ads.zx1
            public final void a(hx1 hx1Var, uh uhVar) {
                io0 io0Var = ((et1) ak0.this.A).A;
                io0Var.d(2);
                io0Var.c(22);
            }
        };
        rt1 rt1Var = new rt1(this, tt1Var);
        ((HashMap) this.B).put(tt1Var, new st1(ux1Var, r12, rt1Var));
        String str = bq0.f4860a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        m mVar = ux1Var.f6917c;
        mVar.getClass();
        ((CopyOnWriteArrayList) mVar.f18054v).add(new ay1(handler, rt1Var));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        z11 z11Var = ux1Var.f6918d;
        z11Var.getClass();
        ((CopyOnWriteArrayList) z11Var.f13047w).add(new jw1(rt1Var));
        ux1Var.n(r12, (tu1) this.f4530v, (a0) this.f4531w);
    }

    public void m(tt1 tt1Var) {
        if (tt1Var.e && tt1Var.f11445c.isEmpty()) {
            st1 st1Var = (st1) ((HashMap) this.B).remove(tt1Var);
            st1Var.getClass();
            hx1 hx1Var = st1Var.f11133a;
            hx1Var.q(st1Var.f11134b);
            rt1 rt1Var = st1Var.f11135c;
            hx1Var.l(rt1Var);
            hx1Var.m(rt1Var);
            ((HashSet) this.C).remove(tt1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f4534z;
    }

    public ak0(Context context, gd0 gd0Var, aq0 aq0Var, a aVar, qp0 qp0Var, yx yxVar, h00 h00Var, op opVar, boolean z3, wh0 wh0Var, zd0 zd0Var, be0 be0Var) {
        this.f4530v = context;
        this.f4531w = gd0Var;
        this.f4532x = aq0Var;
        this.f4533y = aVar;
        this.f4534z = qp0Var;
        this.A = yxVar;
        this.B = h00Var;
        this.C = opVar;
        this.f4529u = z3;
        this.D = wh0Var;
        this.E = zd0Var;
        this.F = be0Var;
    }
}