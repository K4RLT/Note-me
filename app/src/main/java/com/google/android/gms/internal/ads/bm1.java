package com.google.android.gms.internal.ads;
import q.x;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class bm1 implements Closeable, Flushable {
    public static final Pattern D = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] E = new String[128];
    public final boolean A;
    public int B;
    public String C;

    /* renamed from: u, reason: collision with root package name */
    public final zl1 f4830u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f4831v;

    /* renamed from: w, reason: collision with root package name */
    public int f4832w;

    /* renamed from: x, reason: collision with root package name */
    public final jl1 f4833x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4834y;

    /* renamed from: z, reason: collision with root package name */
    public final String f4835z;

    static {
        for (int i = 0; i <= 31; i++) {
            E[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = E;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public bm1(zl1 zl1Var) {
        int[] iArr = new int[32];
        this.f4831v = iArr;
        boolean z3 = false;
        this.f4832w = 0;
        if (iArr.length == 0) {
            this.f4831v = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f4831v;
        int i = this.f4832w;
        this.f4832w = i + 1;
        iArr2[i] = 6;
        this.B = 2;
        this.f4830u = zl1Var;
        jl1 jl1Var = jl1.f7476d;
        Objects.requireNonNull(jl1Var);
        String str = jl1Var.f7477a;
        this.f4833x = jl1Var;
        this.f4835z = ",";
        if (jl1Var.f7479c) {
            this.f4834y = ": ";
            if (str.isEmpty()) {
                this.f4835z = ", ";
            }
        } else {
            this.f4834y = ":";
        }
        if (str.isEmpty() && jl1Var.f7478b.isEmpty()) {
            z3 = true;
        }
        this.A = z3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4830u.getClass();
        int i = this.f4832w;
        if (i <= 1 && (i != 1 || this.f4831v[0] == 7)) {
            this.f4832w = 0;
        } else {
            x.p("Incomplete document");
        }
    }

    public final void f(int i, int i10, char c10) {
        int j10 = j();
        if (j10 != i10 && j10 != i) {
            x.o("Nesting problem.");
            return;
        }
        String str = this.C;
        if (str == null) {
            this.f4832w--;
            if (j10 == i10) {
                o();
            }
            this.f4830u.write(c10);
            return;
        }
        x.o("Dangling name: ".concat(str));
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f4832w != 0) {
            this.f4830u.getClass();
        } else {
            x.o("JsonWriter is closed.");
        }
    }

    public final int j() {
        int i = this.f4832w;
        if (i != 0) {
            return this.f4831v[i - 1];
        }
        x.o("JsonWriter is closed.");
        return 0;
    }

    public final void k() {
        if (this.C != null) {
            int j10 = j();
            if (j10 == 5) {
                this.f4830u.write(this.f4835z);
            } else if (j10 != 3) {
                x.o("Nesting problem.");
                return;
            }
            o();
            this.f4831v[this.f4832w - 1] = 4;
            m(this.C);
            this.C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.String r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zl1 r0 = r8.f4830u
            r1 = 34
            r0.write(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L39
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 >= r7) goto L20
            java.lang.String[] r7 = com.google.android.gms.internal.ads.bm1.E
            r6 = r7[r6]
            if (r6 == 0) goto L37
            goto L2d
        L20:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L27
            java.lang.String r6 = "\\u2028"
            goto L2d
        L27:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2d:
            if (r4 >= r3) goto L33
            int r3 = r3 - r4
            r0.write(r9, r4, r3)
        L33:
            r0.write(r6)
            r4 = r5
        L37:
            r3 = r5
            goto Ld
        L39:
            if (r4 >= r2) goto L3f
            int r2 = r2 - r4
            r0.write(r9, r4, r2)
        L3f:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bm1.m(java.lang.String):void");
    }

    public final void o() {
        if (!this.A) {
            jl1 jl1Var = this.f4833x;
            String str = jl1Var.f7477a;
            zl1 zl1Var = this.f4830u;
            zl1Var.write(str);
            int i = this.f4832w;
            for (int i10 = 1; i10 < i; i10++) {
                zl1Var.write(jl1Var.f7478b);
            }
        }
    }

    public final void p() {
        int j10 = j();
        if (j10 != 1) {
            zl1 zl1Var = this.f4830u;
            if (j10 != 2) {
                if (j10 != 4) {
                    if (j10 != 6) {
                        if (j10 == 7) {
                            if (this.B != 1) {
                                x.o("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            x.o("Nesting problem.");
                            return;
                        }
                    }
                    this.f4831v[this.f4832w - 1] = 7;
                    return;
                }
                zl1Var.append((CharSequence) this.f4834y);
                this.f4831v[this.f4832w - 1] = 5;
                return;
            }
            zl1Var.append((CharSequence) this.f4835z);
            o();
            return;
        }
        this.f4831v[this.f4832w - 1] = 2;
        o();
    }
}
