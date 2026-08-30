package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class q5 implements p5, c6 {
    public static final String i = new String();

    /* renamed from: a, reason: collision with root package name */
    public final Level f14837a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14838b;

    /* renamed from: c, reason: collision with root package name */
    public v5 f14839c;

    /* renamed from: d, reason: collision with root package name */
    public z5 f14840d;
    public h6 e;

    /* renamed from: f, reason: collision with root package name */
    public e7 f14841f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f14842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s5 f14843h;

    public q5(s5 s5Var, Level level) {
        this.f14843h = s5Var;
        b7.f14067a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f14839c = null;
        this.f14840d = null;
        this.e = null;
        this.f14841f = null;
        this.f14842g = null;
        n5.e(level, "level");
        this.f14837a = level;
        this.f14838b = nanos;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c6
    public final void a(String str, Object obj, Object obj2) {
        if (i()) {
            h(str, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c6
    public final c6 b(int i10, String str) {
        x5 x5Var = new x5(str, i10);
        if (this.f14840d == null) {
            this.f14840d = x5Var;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c6
    public final void c(String str, Object[] objArr) {
        if (i()) {
            h(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c6
    public final void d(Object obj, String str) {
        if (i()) {
            h(str, obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c6
    public final c6 e(Throwable th) {
        d6 d6Var = u5.f15043a;
        n5.e(d6Var, "metadata key");
        if (th != null) {
            g(d6Var, th);
        }
        return this;
    }

    public final gn f() {
        v5 v5Var = this.f14839c;
        if (v5Var != null) {
            return v5Var;
        }
        return r6.f14892a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.v5, java.lang.Object] */
    public final void g(d6 d6Var, Object obj) {
        if (this.f14839c == null) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.v5 obj2 = new Object();
            obj2.f15118a = new Object[8];
            obj2.f15119b = 0;
            this.f14839c = obj2;
        }
        this.f14839c.t(d6Var, obj);
    }

    public final void h(String str, Object... objArr) {
        this.f14842g = objArr;
        for (Object obj : objArr) {
        }
        if (str != i) {
            z7 z7Var = z7.f15330b;
            this.f14841f = new e7(str);
        }
        ((g7) b7.f14067a).getClass();
        u7 b10 = l7.f14597b.b();
        if (!b10.f15057a.isEmpty()) {
            gn f10 = f();
            d6 d6Var = u5.f15049h;
            u7 u7Var = (u7) f10.n(d6Var);
            if (u7Var != null) {
                t7 t7Var = u7Var.f15057a;
                if (!t7Var.isEmpty()) {
                    t7 t7Var2 = b10.f15057a;
                    if (!t7Var2.isEmpty()) {
                        u7Var = new u7(new t7(t7Var2, t7Var));
                    }
                    b10 = u7Var;
                }
            }
            g(d6Var, b10);
        }
        cp cpVar = (cp) this.f14843h.f14961v;
        try {
            c8 c8Var = (c8) c8.f14151v.get();
            int i10 = c8Var.f14152u + 1;
            c8Var.f14152u = i10;
            if (i10 != 0) {
                try {
                    if (i10 <= 100) {
                        cpVar.f(this);
                    } else {
                        s5.j("unbounded recursion in log statement", this);
                    }
                    c8Var.close();
                    return;
                } finally {
                }
            }
            throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
        } catch (RuntimeException e) {
            try {
                cpVar.e(e, this);
            } catch (RuntimeException e8) {
                s5.j(e8.getClass().getName() + ": " + e8.getMessage(), this);
                try {
                    e8.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.q5.i():boolean");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c6
    public final boolean j() {
        v5 v5Var = this.f14839c;
        if ((v5Var != null && Boolean.TRUE.equals(v5Var.n(u5.f15048g))) || ((cp) this.f14843h.f14961v).i(this.f14837a)) {
            return true;
        }
        return false;
    }
}
