package xa;
import x.o;
import x.p;
import q.x;

import java.io.Closeable;
import java.io.Flushable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m2 implements Closeable, Flushable {
    public static final Pattern D = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] E = new String[128];
    public final boolean A;
    public int B;
    public String C;

    /* renamed from: u, reason: collision with root package name */
    public final StringWriter f30467u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f30468v;

    /* renamed from: w, reason: collision with root package name */
    public int f30469w;

    /* renamed from: x, reason: collision with root package name */
    public final x f30470x;

    /* renamed from: y, reason: collision with root package name */
    public final String f30471y;

    /* renamed from: z, reason: collision with root package name */
    public final String f30472z;

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

    public m2(StringWriter stringWriter) {
        int[] iArr = new int[32];
        this.f30468v = iArr;
        boolean z3 = false;
        this.f30469w = 0;
        if (iArr.length == 0) {
            this.f30468v = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f30468v;
        int i = this.f30469w;
        this.f30469w = i + 1;
        iArr2[i] = 6;
        this.B = 2;
        this.f30467u = stringWriter;
        x xVar = x.f30699d;
        Objects.requireNonNull(xVar);
        String str = xVar.f30700a;
        this.f30470x = xVar;
        this.f30472z = ",";
        if (xVar.f30702c) {
            this.f30471y = ": ";
            if (str.isEmpty()) {
                this.f30472z = ", ";
            }
        } else {
            this.f30471y = ":";
        }
        if (str.isEmpty() && xVar.f30701b.isEmpty()) {
            z3 = true;
        }
        this.A = z3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30467u.close();
        int i = this.f30469w;
        if (i <= 1 && (i != 1 || this.f30468v[0] == 7)) {
            this.f30469w = 0;
        } else {
            x.p("Incomplete document");
        }
    }

    public final int f() {
        int i = this.f30469w;
        if (i != 0) {
            return this.f30468v[i - 1];
        }
        x.o("JsonWriter is closed.");
        return 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f30469w != 0) {
            this.f30467u.flush();
        } else {
            x.o("JsonWriter is closed.");
        }
    }

    public final void j(int i, int i10, char c10) {
        int f10 = f();
        if (f10 != i10 && f10 != i) {
            x.o("Nesting problem.");
            return;
        }
        String str = this.C;
        if (str == null) {
            this.f30469w--;
            if (f10 == i10) {
                m();
            }
            this.f30467u.write(c10);
            return;
        }
        x.o("Dangling name: ".concat(str));
    }

    public final void k() {
        int f10 = f();
        if (f10 != 1) {
            StringWriter stringWriter = this.f30467u;
            if (f10 != 2) {
                if (f10 != 4) {
                    if (f10 != 6) {
                        if (f10 == 7) {
                            if (this.B != 1) {
                                x.o("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            x.o("Nesting problem.");
                            return;
                        }
                    }
                    this.f30468v[this.f30469w - 1] = 7;
                    return;
                }
                stringWriter.append((CharSequence) this.f30471y);
                this.f30468v[this.f30469w - 1] = 5;
                return;
            }
            stringWriter.append((CharSequence) this.f30472z);
            m();
            return;
        }
        this.f30468v[this.f30469w - 1] = 2;
        m();
    }

    public final void m() {
        if (!this.A) {
            x xVar = this.f30470x;
            String str = xVar.f30700a;
            StringWriter stringWriter = this.f30467u;
            stringWriter.write(str);
            int i = this.f30469w;
            for (int i10 = 1; i10 < i; i10++) {
                stringWriter.write(xVar.f30701b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r9) {
        /*
            r8 = this;
            java.io.StringWriter r0 = r8.f30467u
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
            java.lang.String[] r7 = xa.m2.E
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
        throw new UnsupportedOperationException("Method not decompiled: xa.m2.o(java.lang.String):void");
    }

    public final void p() {
        if (this.C != null) {
            int f10 = f();
            if (f10 == 5) {
                this.f30467u.write(this.f30472z);
            } else if (f10 != 3) {
                x.o("Nesting problem.");
                return;
            }
            m();
            this.f30468v[this.f30469w - 1] = 4;
            o(this.C);
            this.C = null;
        }
    }
}
