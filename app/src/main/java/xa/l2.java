package xa;
import p.a;
import q.f;

import com.google.android.gms.internal.ads.wd0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l2 implements Closeable {
    public long C;
    public int D;
    public String E;
    public int[] F;
    public String[] H;
    public int[] I;

    /* renamed from: u, reason: collision with root package name */
    public final InputStreamReader f30456u;

    /* renamed from: v, reason: collision with root package name */
    public int f30457v = 2;

    /* renamed from: w, reason: collision with root package name */
    public final char[] f30458w = new char[1024];

    /* renamed from: x, reason: collision with root package name */
    public int f30459x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f30460y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f30461z = 0;
    public int A = 0;
    public int B = 0;
    public int G = 1;

    static {
        m1.f30465w = new m1(10);
    }

    public l2(InputStreamReader inputStreamReader) {
        int[] iArr = new int[32];
        this.F = iArr;
        iArr[0] = 6;
        this.H = new String[32];
        this.I = new int[32];
        this.f30456u = inputStreamReader;
    }

    public final boolean A(char c10) {
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
            k();
            return false;
        }
        return false;
    }

    public final double B() {
        char c10;
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 15) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.C;
        }
        if (i == 16) {
            int i11 = this.f30459x;
            int i12 = this.D;
            this.E = new String(this.f30458w, i11, i12);
            this.f30459x = i11 + i12;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.E = j();
            } else if (i != 11) {
                throw g0("a double");
            }
        } else {
            if (i == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.E = f(c10);
        }
        this.B = 11;
        double parseDouble = Double.parseDouble(this.E);
        if (this.f30457v != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            f0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.E = null;
        this.B = 0;
        int[] iArr2 = this.I;
        int i13 = this.G - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        r25 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0225, code lost:
    
        if (A(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a7, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0229, code lost:
    
        if (r2 != 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022b, code lost:
    
        if (r9 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0231, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0233, code lost:
    
        if (r13 == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0235, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023d, code lost:
    
        if (r11 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x023f, code lost:
    
        if (r5 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0245, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0246, code lost:
    
        r26.C = r11;
        r26.f30459x += r25;
        r5 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0250, code lost:
    
        r26.B = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0242, code lost:
    
        if (r5 == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023a, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0237, code lost:
    
        r2 = 2;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0253, code lost:
    
        if (r2 == r8) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0256, code lost:
    
        if (r2 == 4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0259, code lost:
    
        if (r2 != 7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x025b, code lost:
    
        r26.D = r25;
        r5 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H() {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.l2.H():int");
    }

    public final int K() {
        char c10;
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 15) {
            long j10 = this.C;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.B = 0;
                int[] iArr = this.I;
                int i11 = this.G - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + j10 + M());
        }
        if (i == 16) {
            int i12 = this.f30459x;
            int i13 = this.D;
            this.E = new String(this.f30458w, i12, i13);
            this.f30459x = i12 + i13;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw g0("an int");
            }
            if (i == 10) {
                this.E = j();
            } else {
                if (i == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.E = f(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.E);
                this.B = 0;
                int[] iArr2 = this.I;
                int i14 = this.G - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.B = 11;
        double parseDouble = Double.parseDouble(this.E);
        int i15 = (int) parseDouble;
        if (i15 == parseDouble) {
            this.E = null;
            this.B = 0;
            int[] iArr3 = this.I;
            int i16 = this.G - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        }
        throw new NumberFormatException(a.k("Expected an int but was ", this.E, M()));
    }

    public final long L() {
        char c10;
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 15) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.C;
        }
        if (i == 16) {
            int i11 = this.f30459x;
            int i12 = this.D;
            this.E = new String(this.f30458w, i11, i12);
            this.f30459x = i11 + i12;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw g0("a long");
            }
            if (i == 10) {
                this.E = j();
            } else {
                if (i == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.E = f(c10);
            }
            try {
                long parseLong = Long.parseLong(this.E);
                this.B = 0;
                int[] iArr2 = this.I;
                int i13 = this.G - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.B = 11;
        double parseDouble = Double.parseDouble(this.E);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.E = null;
            this.B = 0;
            int[] iArr3 = this.I;
            int i14 = this.G - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return j10;
        }
        throw new NumberFormatException(a.k("Expected a long but was ", this.E, M()));
    }

    public final String M() {
        int i = this.f30461z + 1;
        int i10 = this.f30459x - this.A;
        String h02 = h0(false);
        StringBuilder m4 = g3.a.m(" at line ", i, " column ");
        m4.append(i10 + 1);
        m4.append(" path ");
        m4.append(h02);
        return m4.toString();
    }

    public final String N() {
        String f10;
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 14) {
            f10 = j();
        } else if (i == 12) {
            f10 = f('\'');
        } else if (i == 13) {
            f10 = f('\"');
        } else {
            throw g0("a name");
        }
        this.B = 0;
        this.H[this.G - 1] = f10;
        return f10;
    }

    public final String O() {
        String str;
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 10) {
            str = j();
        } else if (i == 8) {
            str = f('\'');
        } else if (i == 9) {
            str = f('\"');
        } else if (i == 11) {
            str = this.E;
            this.E = null;
        } else if (i == 15) {
            str = Long.toString(this.C);
        } else if (i == 16) {
            str = new String(this.f30458w, this.f30459x, this.D);
            this.f30459x += this.D;
        } else {
            throw g0("a string");
        }
        this.B = 0;
        int[] iArr = this.I;
        int i10 = this.G - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final void R() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 3) {
            m(1);
            this.I[this.G - 1] = 0;
            this.B = 0;
            return;
        }
        throw g0("BEGIN_ARRAY");
    }

    public final void V() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 1) {
            m(3);
            this.B = 0;
            return;
        }
        throw g0("BEGIN_OBJECT");
    }

    public final void W() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 4) {
            int i10 = this.G;
            this.G = i10 - 1;
            int[] iArr = this.I;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.B = 0;
            return;
        }
        throw g0("END_ARRAY");
    }

    public final void X() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 2) {
            int i10 = this.G;
            int i11 = i10 - 1;
            this.G = i11;
            this.H[i11] = null;
            int[] iArr = this.I;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.B = 0;
            return;
        }
        throw g0("END_OBJECT");
    }

    public final void Y() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 7) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw g0("null");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void Z() {
        int i = 0;
        do {
            int i10 = this.B;
            if (i10 == 0) {
                i10 = H();
            }
            switch (i10) {
                case 1:
                    m(3);
                    i++;
                    this.B = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.H[this.G - 1] = null;
                        i = 0;
                    }
                    this.G--;
                    i--;
                    this.B = 0;
                    break;
                case 3:
                    m(1);
                    i++;
                    this.B = 0;
                    break;
                case 4:
                    this.G--;
                    i--;
                    this.B = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.B = 0;
                    break;
                case 8:
                    o('\'');
                    this.B = 0;
                    break;
                case 9:
                    o('\"');
                    this.B = 0;
                    break;
                case 10:
                    r();
                    this.B = 0;
                    break;
                case 12:
                    o('\'');
                    if (i == 0) {
                        this.H[this.G - 1] = "<skipped>";
                        i = 0;
                    }
                    this.B = 0;
                    break;
                case 13:
                    o('\"');
                    if (i == 0) {
                        this.H[this.G - 1] = "<skipped>";
                        i = 0;
                    }
                    this.B = 0;
                    break;
                case 14:
                    r();
                    if (i == 0) {
                        this.H[this.G - 1] = "<skipped>";
                        i = 0;
                    }
                    this.B = 0;
                    break;
                case 16:
                    this.f30459x += this.D;
                    this.B = 0;
                    break;
                case 17:
                    return;
            }
        } while (i > 0);
        int[] iArr = this.I;
        int i11 = this.G - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final boolean a0() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        int i = this.B;
        if (i == 0) {
            i = H();
        }
        if (i == 5) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i == 6) {
            this.B = 0;
            int[] iArr2 = this.I;
            int i11 = this.G - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw g0("a boolean");
    }

    public final int c0() {
        int i = this.B;
        if (i == 0) {
            i = H();
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = 0;
        this.F[0] = 8;
        this.G = 1;
        this.f30456u.close();
    }

    public final char d0() {
        int i;
        if (this.f30459x == this.f30460y && !w(1)) {
            f0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f30459x;
        int i11 = i10 + 1;
        this.f30459x = i11;
        char[] cArr = this.f30458w;
        char c10 = cArr[i10];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 != 'b') {
                            if (c10 != 'f') {
                                if (c10 == 'n') {
                                    return '\n';
                                }
                                if (c10 != 'r') {
                                    if (c10 != 't') {
                                        if (c10 == 'u') {
                                            if (i10 + 5 > this.f30460y && !w(4)) {
                                                f0("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i12 = this.f30459x;
                                            int i13 = i12 + 4;
                                            int i14 = 0;
                                            while (i12 < i13) {
                                                int i15 = i14 << 4;
                                                char c11 = cArr[i12];
                                                if (c11 >= '0' && c11 <= '9') {
                                                    i = c11 - '0';
                                                } else if (c11 >= 'a' && c11 <= 'f') {
                                                    i = c11 - 'W';
                                                } else if (c11 >= 'A' && c11 <= 'F') {
                                                    i = c11 - '7';
                                                } else {
                                                    f0("Malformed Unicode escape \\u".concat(new String(cArr, this.f30459x, 4)));
                                                    throw null;
                                                }
                                                i14 = i + i15;
                                                i12++;
                                            }
                                            this.f30459x += 4;
                                            return (char) i14;
                                        }
                                        f0("Invalid escape sequence");
                                        throw null;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c10;
        }
        if (this.f30457v != 3) {
            this.f30461z++;
            this.A = i11;
        } else {
            f0("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.f30457v == 3) {
            f0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c10;
    }

    public final int e0(boolean z3) {
        int i = this.f30459x;
        int i10 = this.f30460y;
        while (true) {
            if (i == i10) {
                this.f30459x = i;
                if (!w(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(M()));
                }
                i = this.f30459x;
                i10 = this.f30460y;
            }
            int i11 = i + 1;
            char[] cArr = this.f30458w;
            char c10 = cArr[i];
            if (c10 == '\n') {
                this.f30461z++;
                this.A = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f30459x = i11;
                    if (i11 == i10) {
                        this.f30459x = i;
                        boolean w10 = w(2);
                        this.f30459x++;
                        if (!w10) {
                            break;
                        }
                    }
                    k();
                    int i12 = this.f30459x;
                    char c11 = cArr[i12];
                    if (c11 != '*') {
                        if (c11 != '/') {
                            break;
                        }
                        this.f30459x = i12 + 1;
                        p();
                        i = this.f30459x;
                        i10 = this.f30460y;
                    } else {
                        this.f30459x = i12 + 1;
                        while (true) {
                            if (this.f30459x + 2 > this.f30460y && !w(2)) {
                                f0("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.f30459x;
                            if (cArr[i13] == '\n') {
                                this.f30461z++;
                                this.A = i13 + 1;
                            } else {
                                int i14 = 0;
                                while (true) {
                                    int i15 = this.f30459x;
                                    if (i14 < 2) {
                                        if (cArr[i15 + i14] == "*/".charAt(i14)) {
                                            i14++;
                                        }
                                    } else {
                                        i = i15 + 2;
                                        i10 = this.f30460y;
                                        break;
                                    }
                                }
                            }
                            this.f30459x++;
                        }
                    }
                } else if (c10 == '#') {
                    this.f30459x = i11;
                    k();
                    p();
                    i = this.f30459x;
                    i10 = this.f30460y;
                } else {
                    this.f30459x = i11;
                    return c10;
                }
            }
            i = i11;
        }
        return 47;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r1.append(r7, r3, r4);
        r11.f30459x = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f30459x
            int r3 = r11.f30460y
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f30458w
            if (r2 >= r4) goto L6e
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f30457v
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.f0(r12)
            throw r0
        L23:
            if (r2 != r12) goto L3b
            int r12 = r8 - r3
            int r12 = r12 + (-1)
            r11.f30459x = r8
            if (r1 != 0) goto L33
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r3, r12)
            return r0
        L33:
            r1.append(r7, r3, r12)
            java.lang.String r12 = r1.toString()
            return r12
        L3b:
            r9 = 92
            if (r2 != r9) goto L61
            int r2 = r8 - r3
            int r4 = r2 + (-1)
            r11.f30459x = r8
            if (r1 != 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r2 + r2
            int r2 = java.lang.Math.max(r2, r5)
            r1.<init>(r2)
        L51:
            r1.append(r7, r3, r4)
            char r2 = r11.d0()
            r1.append(r2)
            int r3 = r11.f30459x
            int r4 = r11.f30460y
            r2 = r3
            goto L8
        L61:
            r5 = 10
            if (r2 != r5) goto L6c
            int r2 = r11.f30461z
            int r2 = r2 + r6
            r11.f30461z = r2
            r11.A = r8
        L6c:
            r2 = r8
            goto L8
        L6e:
            int r4 = r2 - r3
            if (r1 != 0) goto L7e
            int r1 = r4 + r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r8.<init>(r1)
            r1 = r8
        L7e:
            r1.append(r7, r3, r4)
            r11.f30459x = r2
            boolean r2 = r11.w(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.f0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.l2.f(char):java.lang.String");
    }

    public final void f0(String str) {
        throw new IOException(wd0.n(str, M(), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException g0(String str) {
        String str2;
        int c02 = c0();
        StringBuilder q10 = a.q("Expected ", str, " but was ", u0.c(c0()), M());
        q10.append("\nSee ");
        if (c02 == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        q10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(q10.toString());
    }

    public final String h0(boolean z3) {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i10 = this.G;
            if (i < i10) {
                int i11 = this.F[i];
                switch (i11) {
                    case 1:
                    case 2:
                        int i12 = this.I[i];
                        if (z3 && i12 > 0 && i == i10 - 1) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb2.append('.');
                        String str = this.H[i];
                        if (str == null) {
                            break;
                        } else {
                            sb2.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        g5.f(g3.a.g(i11, "Unknown scope value: "));
                        return null;
                }
                i++;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        k();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f30459x
            int r3 = r3 + r2
            int r4 = r6.f30460y
            char[] r5 = r6.f30458w
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.k()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r6.w(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L79
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            int r3 = r6.f30459x
            r1.append(r5, r3, r2)
            int r3 = r6.f30459x
            int r3 = r3 + r2
            r6.f30459x = r3
            r2 = 1
            boolean r2 = r6.w(r2)
            if (r2 != 0) goto L2
        L79:
            int r2 = r6.f30459x
            if (r1 != 0) goto L83
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5, r2, r0)
            goto L8a
        L83:
            r1.append(r5, r2, r0)
            java.lang.String r1 = r1.toString()
        L8a:
            int r2 = r6.f30459x
            int r2 = r2 + r0
            r6.f30459x = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.l2.j():java.lang.String");
    }

    public final void k() {
        if (this.f30457v == 1) {
            return;
        }
        f0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void m(int i) {
        int i10 = this.G;
        if (i10 - 1 < 1280) {
            int[] iArr = this.F;
            if (i10 == iArr.length) {
                int i11 = i10 + i10;
                this.F = Arrays.copyOf(iArr, i11);
                this.I = Arrays.copyOf(this.I, i11);
                this.H = (String[]) Arrays.copyOf(this.H, i11);
            }
            int[] iArr2 = this.F;
            int i12 = this.G;
            this.G = i12 + 1;
            iArr2[i12] = i;
            return;
        }
        throw new IOException("Nesting limit 1280 reached".concat(M()));
    }

    public final void o(char c10) {
        do {
            int i = this.f30459x;
            int i10 = this.f30460y;
            while (i < i10) {
                int i11 = i + 1;
                char c11 = this.f30458w[i];
                if (c11 == c10) {
                    this.f30459x = i11;
                    return;
                }
                if (c11 == '\\') {
                    this.f30459x = i11;
                    d0();
                    i = this.f30459x;
                    i10 = this.f30460y;
                } else {
                    if (c11 == '\n') {
                        this.f30461z++;
                        this.A = i11;
                    }
                    i = i11;
                }
            }
            this.f30459x = i;
        } while (w(1));
        f0("Unterminated string");
        throw null;
    }

    public final void p() {
        char c10;
        do {
            if (this.f30459x < this.f30460y || w(1)) {
                int i = this.f30459x;
                int i10 = i + 1;
                this.f30459x = i10;
                c10 = this.f30458w[i];
                if (c10 == '\n') {
                    this.f30461z++;
                    this.A = i10;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void r() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r4.f30459x
            int r2 = r2 + r1
            int r3 = r4.f30460y
            if (r2 >= r3) goto L50
            char[] r3 = r4.f30458w
            char r2 = r3[r2]
            r3 = 9
            if (r2 == r3) goto L4a
            r3 = 10
            if (r2 == r3) goto L4a
            r3 = 12
            if (r2 == r3) goto L4a
            r3 = 13
            if (r2 == r3) goto L4a
            r3 = 32
            if (r2 == r3) goto L4a
            r3 = 35
            if (r2 == r3) goto L47
            r3 = 44
            if (r2 == r3) goto L4a
            r3 = 47
            if (r2 == r3) goto L47
            r3 = 61
            if (r2 == r3) goto L47
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L4a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L4a
            r3 = 58
            if (r2 == r3) goto L4a
            r3 = 59
            if (r2 == r3) goto L47
            switch(r2) {
                case 91: goto L4a;
                case 92: goto L47;
                case 93: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            r4.k()
        L4a:
            int r0 = r4.f30459x
            int r0 = r0 + r1
            r4.f30459x = r0
            return
        L50:
            r4.f30459x = r2
            r1 = 1
            boolean r1 = r4.w(r1)
            if (r1 == 0) goto L5a
            goto L1
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.l2.r():void");
    }

    public final String toString() {
        return l2.class.getSimpleName().concat(M());
    }

    public final boolean w(int i) {
        int i10;
        int i11 = this.A;
        int i12 = this.f30459x;
        this.A = i11 - i12;
        int i13 = this.f30460y;
        char[] cArr = this.f30458w;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f30460y = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f30460y = 0;
        }
        this.f30459x = 0;
        do {
            int i15 = this.f30460y;
            int read = this.f30456u.read(cArr, i15, 1024 - i15);
            if (read == -1) {
                return false;
            }
            i10 = this.f30460y + read;
            this.f30460y = i10;
            if (this.f30461z == 0 && this.A == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f30459x++;
                this.A = 1;
                i++;
            }
        } while (i10 < i);
        return true;
    }
}
