package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class rm1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10245a;

    /* renamed from: b, reason: collision with root package name */
    public int f10246b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10247c;

    public static int h(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long i(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static com.google.android.gms.internal.mlkit_vision_digital_ink.um j(byte[] bArr, int i) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.um umVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.um(bArr, i);
        try {
            umVar.x(i);
            return umVar;
        } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.xn e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static pm1 k(byte[] bArr, int i, int i10) {
        pm1 pm1Var = new pm1(bArr, i, i10);
        try {
            pm1Var.b(i10);
            return pm1Var;
        } catch (pn1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int n(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long o(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract int F();

    public abstract boolean G();

    public abstract int H();

    public abstract String I();

    public abstract int J();

    public abstract String K();

    public abstract int L();

    public abstract mm1 M();

    public abstract int N();

    public abstract long O();

    public abstract int P();

    public abstract long Q();

    public abstract int R();

    public abstract long S();

    public abstract int T();

    public abstract long U();

    public abstract long V();

    public abstract long W();

    public abstract com.google.android.gms.internal.mlkit_vision_digital_ink.sm X();

    public abstract String Y();

    public abstract String Z();

    public abstract void a(int i);

    public abstract void a0(int i);

    public abstract int b(int i);

    public abstract void c(int i);

    public abstract boolean d();

    public abstract boolean e();

    public abstract int f();

    public abstract boolean g(int i);

    public void l() {
        int J;
        do {
            J = J();
            if (J != 0) {
                int i = this.f10245a;
                int i10 = this.f10246b;
                if (i + i10 < 100) {
                    this.f10246b = i10 + 1;
                    this.f10246b--;
                } else {
                    androidx.datastore.preferences.protobuf.s1.u("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return;
                }
            } else {
                return;
            }
        } while (g(J));
    }

    public void m() {
        int p10;
        do {
            p10 = p();
            if (p10 != 0) {
                int i = this.f10245a;
                int i10 = this.f10246b;
                if (i + i10 < 100) {
                    this.f10246b = i10 + 1;
                    this.f10246b--;
                } else {
                    androidx.datastore.preferences.protobuf.s1.t("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return;
                }
            } else {
                return;
            }
        } while (t(p10));
    }

    public abstract int p();

    public abstract double q();

    public abstract void r(int i);

    public abstract float s();

    public abstract boolean t(int i);

    public abstract double u();

    public abstract int v();

    public abstract float w();

    public abstract int x(int i);

    public abstract int y();

    public abstract long z();
}
