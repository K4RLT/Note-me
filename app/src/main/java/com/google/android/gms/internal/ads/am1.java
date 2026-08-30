package com.google.android.gms.internal.ads;
import a5.a;
import g5.q;
import q.f;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class am1 implements Closeable {
    public long B;
    public int C;
    public int[] D;
    public String[] F;
    public int[] G;

    /* renamed from: u, reason: collision with root package name */
    public final StringReader f4541u;

    /* renamed from: v, reason: collision with root package name */
    public final char[] f4542v = new char[1024];

    /* renamed from: w, reason: collision with root package name */
    public int f4543w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f4544x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f4545y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f4546z = 0;
    public int A = 0;
    public int E = 1;

    public am1(StringReader stringReader) {
        int[] iArr = new int[32];
        this.D = iArr;
        iArr[0] = 6;
        this.F = new String[32];
        this.G = new int[32];
        this.f4541u = stringReader;
    }

    public final boolean A(int i) {
        int i10;
        int i11 = this.f4546z;
        int i12 = this.f4543w;
        this.f4546z = i11 - i12;
        int i13 = this.f4544x;
        char[] cArr = this.f4542v;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f4544x = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f4544x = 0;
        }
        this.f4543w = 0;
        do {
            int i15 = this.f4544x;
            int read = this.f4541u.read(cArr, i15, 1024 - i15);
            if (read == -1) {
                return false;
            }
            i10 = this.f4544x + read;
            this.f4544x = i10;
            if (this.f4545y == 0 && this.f4546z == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f4543w++;
                this.f4546z = 1;
                i++;
            }
        } while (i10 < i);
        return true;
    }

    public final int B(boolean z3) {
        int i = this.f4543w;
        int i10 = this.f4544x;
        while (true) {
            if (i == i10) {
                this.f4543w = i;
                if (!A(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(k()));
                }
                i = this.f4543w;
                i10 = this.f4544x;
            }
            int i11 = i + 1;
            char c10 = this.f4542v[i];
            if (c10 == '\n') {
                this.f4545y++;
                this.f4546z = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f4543w = i11;
                    if (i11 == i10) {
                        this.f4543w = i;
                        boolean A = A(2);
                        this.f4543w++;
                        if (!A) {
                            return 47;
                        }
                    }
                    H();
                    throw null;
                }
                if (c10 != '#') {
                    this.f4543w = i11;
                    return c10;
                }
                this.f4543w = i11;
                H();
                throw null;
            }
            i = i11;
        }
    }

    public final void H() {
        K("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void K(String str) {
        String k3 = k();
        throw new IOException(p.a.o(new StringBuilder(str.length() + k3.length() + 79), str, k3, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException L(String str) {
        String str2;
        int m4 = m();
        String a10 = lr1.a(m());
        String k3 = k();
        int v2 = g3.a.v(a10, str.length() + 18, k3.length());
        if (m4 == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2);
        StringBuilder sb2 = new StringBuilder(concat.length() + v2 + 5);
        g3.a.t(sb2, "Expected ", str, " but was ", a10);
        return new IllegalStateException(p.a.o(sb2, k3, "\nSee ", concat));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A = 0;
        this.D[0] = 8;
        this.E = 1;
        this.f4541u.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a9, code lost:
    
        if (o(r13) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ac, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ad, code lost:
    
        if (r7 != r1) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01af, code lost:
    
        if (r8 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b5, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b7, code lost:
    
        if (r19 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c2, code lost:
    
        if (r9 != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c4, code lost:
    
        if (r6 != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ca, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01cb, code lost:
    
        r25.B = r9;
        r25.f4543w += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d4, code lost:
    
        r25.A = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c7, code lost:
    
        if (r6 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bb, code lost:
    
        r5 = 2;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        if (r7 == r5) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01db, code lost:
    
        if (r7 == 4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01de, code lost:
    
        if (r7 != 7) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        r25.C = r4;
        r7 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d7, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f() {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.am1.f():int");
    }

    public final String j() {
        String str;
        int i = this.A;
        if (i == 0) {
            i = f();
        }
        if (i == 10) {
            str = r();
        } else if (i == 8) {
            str = p('\'');
        } else if (i == 9) {
            str = p('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.B);
        } else if (i == 16) {
            str = new String(this.f4542v, this.f4543w, this.C);
            this.f4543w += this.C;
        } else {
            throw L("a string");
        }
        this.A = 0;
        int[] iArr = this.G;
        int i10 = this.E - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final String k() {
        int i = this.f4545y + 1;
        int i10 = this.f4543w - this.f4546z;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < this.E; i11++) {
            int i12 = this.D[i11];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.G[i11];
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.F[i11];
                    if (str != null) {
                        sb2.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    g5.q.f(a5.a.f(i12, "Unknown scope value: ", new StringBuilder(String.valueOf(i12).length() + 21)));
                    return null;
            }
        }
        int i14 = i10 + 1;
        String sb3 = sb2.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i14).length();
        StringBuilder sb4 = new StringBuilder(sb3.length() + length2 + length + 17 + 6);
        g3.a.r(i, i14, " at line ", " column ", sb4);
        return a5.a.k(sb4, " path ", sb3);
    }

    public final int m() {
        int i = this.A;
        if (i == 0) {
            i = f();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean o(char c10) {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            H();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0116, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0122, code lost:
    
        r1.append(r7, r3, r4);
        r11.f4543w = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ca, code lost:
    
        K("Malformed Unicode escape \\u".concat(new java.lang.String(r7, r11.f4543w, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0112, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0114, code lost:
    
        if (r1 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p(char r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.am1.p(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0049, code lost:
    
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0043. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String r() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.f4543w
            int r4 = r4 + r2
            int r5 = r7.f4544x
            char[] r6 = r7.f4542v
            if (r4 >= r5) goto L4d
            char r4 = r6[r4]
            r5 = 9
            if (r4 == r5) goto L5a
            r5 = 10
            if (r4 == r5) goto L5a
            r5 = 12
            if (r4 == r5) goto L5a
            r5 = 13
            if (r4 == r5) goto L5a
            r5 = 32
            if (r4 == r5) goto L5a
            r5 = 35
            if (r4 == r5) goto L49
            r5 = 44
            if (r4 == r5) goto L5a
            r5 = 47
            if (r4 == r5) goto L49
            r5 = 61
            if (r4 == r5) goto L49
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5a
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5a
            r5 = 58
            if (r4 == r5) goto L5a
            r5 = 59
            if (r4 == r5) goto L49
            switch(r4) {
                case 91: goto L5a;
                case 92: goto L49;
                case 93: goto L5a;
                default: goto L46;
            }
        L46:
            int r2 = r2 + 1
            goto L4
        L49:
            r7.H()
            throw r1
        L4d:
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 >= r4) goto L5c
            int r4 = r2 + 1
            boolean r4 = r7.A(r4)
            if (r4 == 0) goto L5a
            goto L4
        L5a:
            r0 = r2
            goto L7a
        L5c:
            if (r3 != 0) goto L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L69:
            int r4 = r7.f4543w
            r3.append(r6, r4, r2)
            int r4 = r7.f4543w
            int r4 = r4 + r2
            r7.f4543w = r4
            r2 = 1
            boolean r2 = r7.A(r2)
            if (r2 != 0) goto L91
        L7a:
            int r1 = r7.f4543w
            if (r3 != 0) goto L84
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6, r1, r0)
            goto L8b
        L84:
            r3.append(r6, r1, r0)
            java.lang.String r2 = r3.toString()
        L8b:
            int r1 = r7.f4543w
            int r1 = r1 + r0
            r7.f4543w = r1
            return r2
        L91:
            r2 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.am1.r():java.lang.String");
    }

    public final String toString() {
        return am1.class.getSimpleName().concat(k());
    }

    public final void w(int i) {
        int i10 = this.E;
        if (i10 - 1 < 1280) {
            int[] iArr = this.D;
            if (i10 == iArr.length) {
                int i11 = i10 + i10;
                this.D = Arrays.copyOf(iArr, i11);
                this.G = Arrays.copyOf(this.G, i11);
                this.F = (String[]) Arrays.copyOf(this.F, i11);
            }
            int[] iArr2 = this.D;
            int i12 = this.E;
            this.E = i12 + 1;
            iArr2[i12] = i;
            return;
        }
        String k3 = k();
        throw new IOException(a5.a.k(new StringBuilder(k3.length() + 26), "Nesting limit 1280 reached", k3));
    }
}
