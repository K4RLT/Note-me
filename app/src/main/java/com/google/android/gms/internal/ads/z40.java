package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import r.e;

/* loaded from: classes.dex */
public abstract class z40 implements rj0 {

    /* renamed from: a, reason: collision with root package name */
    public final wp0 f13067a;

    /* renamed from: b, reason: collision with root package name */
    public final qp0 f13068b;

    /* renamed from: c, reason: collision with root package name */
    public final e70 f13069c;

    /* renamed from: d, reason: collision with root package name */
    public final j70 f13070d;
    public final wo0 e;

    /* renamed from: f, reason: collision with root package name */
    public final p60 f13071f;

    /* renamed from: g, reason: collision with root package name */
    public final c80 f13072g;

    /* renamed from: h, reason: collision with root package name */
    public final l70 f13073h;
    public final a90 i;

    /* renamed from: j, reason: collision with root package name */
    public final c60 f13074j;

    /* renamed from: k, reason: collision with root package name */
    public final me0 f13075k;

    public z40(hb hbVar) {
        this.f13067a = (wp0) hbVar.f6649u;
        this.f13068b = (qp0) hbVar.f6650v;
        this.f13069c = (e70) hbVar.f6651w;
        this.f13070d = (j70) hbVar.f6652x;
        this.e = (wo0) hbVar.f6653y;
        this.f13071f = (p60) hbVar.f6654z;
        this.f13072g = (c80) hbVar.A;
        this.f13073h = (l70) hbVar.B;
        this.i = (a90) hbVar.C;
        this.f13074j = (c60) hbVar.D;
        this.f13075k = (me0) hbVar.E;
    }

    public void a() {
        this.f13070d.e();
        this.f13073h.C(this);
    }

    public final void b() {
        me0 me0Var;
        y51 y51Var = this.f13068b.C0;
        if (y51Var != null && !y51Var.isEmpty() && (me0Var = this.f13075k) != null) {
            if (((Boolean) g9.r.e.f17698c.a(sl.I8)).booleanValue() && !y51Var.isEmpty()) {
                b51 listIterator = y51Var.listIterator(0);
                while (listIterator.hasNext()) {
                    ne0 ne0Var = (ne0) listIterator.next();
                    int[] iArr = ne0Var.f8677b;
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (iArr[i] == 1) {
                            long j10 = ne0Var.f8676a;
                            f9.k.C.f16819k.getClass();
                            me0Var.a(j10, 1, System.currentTimeMillis());
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj0
    public final void m() {
        this.i.g();
    }
}
