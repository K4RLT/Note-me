package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tn1 implements zn1, r31, ie0, re0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ tn1 f11401v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ tn1 f11402w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ tn1 f11403x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11404u;

    static {
        byte b10 = 0;
        f11401v = new tn1(4, b10);
        f11402w = new tn1(6, b10);
        f11403x = new tn1(11, b10);
    }

    public /* synthetic */ tn1(float f10) {
        this.f11404u = 12;
    }

    public static final kn1 c(long j10, Object obj) {
        int i;
        kn1 kn1Var = (kn1) zo1.f(j10, obj);
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            kn1 B = kn1Var.B(i);
            zo1.g(obj, j10, B);
            return B;
        }
        return kn1Var;
    }

    public static final xn1 d(Object obj, Object obj2) {
        xn1 xn1Var = (xn1) obj;
        xn1 xn1Var2 = (xn1) obj2;
        if (!xn1Var2.isEmpty()) {
            if (!xn1Var.f12599u) {
                xn1Var = xn1Var.a();
            }
            xn1Var.c();
            if (!xn1Var2.isEmpty()) {
                xn1Var.putAll(xn1Var2);
            }
        }
        return xn1Var;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public boolean a(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public jo1 b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.re0
    public /* synthetic */ void f(Object obj, jv1 jv1Var) {
        ((ie) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f11404u) {
            case 5:
                ((ie) obj).A();
                return;
            case 6:
                return;
            case 7:
                int i = ys1.f12938v0;
                ((ie) obj).a();
                return;
            case 8:
                ((ie) obj).e();
                return;
            case 9:
                int i10 = ys1.f12938v0;
                ((ie) obj).x();
                return;
            case 10:
                int i11 = ys1.f12938v0;
                ((ie) obj).j();
                return;
            case 11:
                int i12 = ys1.f12938v0;
                ((ie) obj).e0(new ns1(2, new ab.b("Player release timed out.", 7), 1003));
                return;
            case 12:
                int i13 = ys1.f12938v0;
                ((ie) obj).v();
                return;
            case 13:
                int i14 = ys1.f12938v0;
                ((ie) obj).c();
                return;
            case 14:
            default:
                return;
            case 15:
                return;
            case 16:
                return;
            case 17:
                return;
            case 18:
                return;
            case 19:
                return;
            case 20:
                return;
            case gl.zzm /* 21 */:
                return;
            case 22:
                return;
            case 23:
                return;
            case 24:
                return;
            case 25:
                return;
            case 26:
                return;
            case 27:
                return;
            case 28:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r31
    public /* synthetic */ Object zza() {
        return new ls1();
    }

    public /* synthetic */ tn1(int i) {
        this.f11404u = 10;
    }

    public /* synthetic */ tn1(int i, byte b10) {
        this.f11404u = i;
    }

    public /* synthetic */ tn1(int i, int i10) {
        this.f11404u = 9;
    }

    public /* synthetic */ tn1(int i, Object obj) {
        this.f11404u = i;
    }

    public /* synthetic */ tn1(y4 y4Var, int i) {
        this.f11404u = 13;
    }

    public /* synthetic */ tn1(boolean z3) {
        this.f11404u = 5;
    }
}
