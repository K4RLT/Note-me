package z6;

import j6.e;
import java.io.EOFException;
import java.io.IOException;
import q.x;
import sg.f;
import sg.h;
import sg.l;
import sg.n;
import sg.o;
import w7.i1;
import ya.dc;

/* loaded from: classes.dex */
public final class b extends a {
    public static final h F;
    public static final h G;
    public static final h H;
    public final f A;
    public int B;
    public long C;
    public int D;
    public String E;

    /* renamed from: z, reason: collision with root package name */
    public final n f31937z;

    static {
        char[] cArr = h.f25275x;
        F = dc.a("'\\");
        G = dc.a("\"\\");
        H = dc.a("{}[]:, \n\t\r\f/\\;#=");
        dc.a("\n\r");
        dc.a("*/");
    }

    public b(n nVar) {
        this.f31934v = new int[32];
        this.f31935w = new String[32];
        this.f31936x = new int[32];
        this.B = 0;
        this.f31937z = nVar;
        this.A = nVar.f25296v;
        K(6);
    }

    @Override // z6.a
    public final int A() {
        String a02;
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 16) {
            long j10 = this.C;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.B = 0;
                int[] iArr = this.f31936x;
                int i11 = this.f31933u - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new ab.b("Expected an int but was " + this.C + " at path " + o(), 22);
        }
        if (i == 17) {
            long j11 = this.D;
            f fVar = this.A;
            fVar.getClass();
            this.E = fVar.p(j11, mf.a.f20798a);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                vd.n.f("Expected an int but was ", i1.l(H()), o());
                return 0;
            }
        } else {
            if (i == 9) {
                a02 = a0(G);
            } else {
                a02 = a0(F);
            }
            this.E = a02;
            try {
                int parseInt = Integer.parseInt(a02);
                this.B = 0;
                int[] iArr2 = this.f31936x;
                int i12 = this.f31933u - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.B = 11;
        try {
            double parseDouble = Double.parseDouble(this.E);
            int i13 = (int) parseDouble;
            if (i13 == parseDouble) {
                this.E = null;
                this.B = 0;
                int[] iArr3 = this.f31936x;
                int i14 = this.f31933u - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            vd.n.f("Expected an int but was ", this.E, o());
            return 0;
        } catch (NumberFormatException unused2) {
            vd.n.f("Expected an int but was ", this.E, o());
            return 0;
        }
    }

    @Override // z6.a
    public final String B() {
        String p10;
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 10) {
            p10 = b0();
        } else if (i == 9) {
            p10 = a0(G);
        } else if (i == 8) {
            p10 = a0(F);
        } else if (i == 11) {
            p10 = this.E;
            this.E = null;
        } else if (i == 16) {
            p10 = Long.toString(this.C);
        } else if (i == 17) {
            long j10 = this.D;
            f fVar = this.A;
            fVar.getClass();
            p10 = fVar.p(j10, mf.a.f20798a);
        } else {
            vd.n.f("Expected a string but was ", i1.l(H()), o());
            return null;
        }
        this.B = 0;
        int[] iArr = this.f31936x;
        int i10 = this.f31933u - 1;
        iArr[i10] = iArr[i10] + 1;
        return p10;
    }

    @Override // z6.a
    public final int H() {
        int i = this.B;
        if (i == 0) {
            i = V();
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // z6.a
    public final int L(e eVar) {
        int i;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13 = this.B;
        if (i13 == 0) {
            i13 = V();
        }
        if (i13 < 12 || i13 > 15) {
            return -1;
        }
        if (i13 == 15) {
            return W(this.E, eVar);
        }
        l lVar = (l) eVar.f18919v;
        n nVar = this.f31937z;
        f fVar = nVar.f25296v;
        if (!nVar.f25295u) {
            while (true) {
                o oVar = fVar.f25273u;
                int i14 = -1;
                if (oVar != null) {
                    byte[] bArr = oVar.f25298a;
                    int i15 = oVar.f25299b;
                    int i16 = oVar.f25300c;
                    int[] iArr = lVar.f25291v;
                    o oVar2 = oVar;
                    i = -1;
                    int i17 = 0;
                    while (true) {
                        int i18 = i17 + 1;
                        int i19 = iArr[i17];
                        int i20 = i17 + 2;
                        int i21 = iArr[i18];
                        if (i21 != i14) {
                            i = i21;
                        }
                        if (oVar2 == null) {
                            break;
                        }
                        if (i19 < 0) {
                            int i22 = (i19 * (-1)) + i20;
                            while (true) {
                                int i23 = i15 + 1;
                                int i24 = i20 + 1;
                                if ((bArr[i15] & 255) != iArr[i20]) {
                                    break;
                                }
                                if (i24 == i22) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i23 == i16) {
                                    if (oVar2 != null) {
                                        o oVar3 = oVar2.f25302f;
                                        if (oVar3 != null) {
                                            i12 = oVar3.f25299b;
                                            byte[] bArr2 = oVar3.f25298a;
                                            i11 = oVar3.f25300c;
                                            if (oVar3 == oVar) {
                                                if (!z3) {
                                                    break;
                                                }
                                                bArr = bArr2;
                                                oVar2 = null;
                                            } else {
                                                oVar2 = oVar3;
                                                bArr = bArr2;
                                            }
                                        } else {
                                            kotlin.jvm.internal.l.g();
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.l.g();
                                        throw null;
                                    }
                                } else {
                                    i11 = i16;
                                    i12 = i23;
                                }
                                if (z3) {
                                    i10 = iArr[i24];
                                    i15 = i12;
                                    i16 = i11;
                                    break;
                                }
                                i15 = i12;
                                i16 = i11;
                                i20 = i24;
                            }
                        } else {
                            int i25 = i15 + 1;
                            int i26 = bArr[i15] & 255;
                            int i27 = i20 + i19;
                            while (i20 != i27) {
                                if (i26 == iArr[i20]) {
                                    int i28 = iArr[i20 + i19];
                                    if (i25 == i16) {
                                        oVar2 = oVar2.f25302f;
                                        if (oVar2 != null) {
                                            i25 = oVar2.f25299b;
                                            bArr = oVar2.f25298a;
                                            i16 = oVar2.f25300c;
                                            if (oVar2 == oVar) {
                                                oVar2 = null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.l.g();
                                            throw null;
                                        }
                                    }
                                    i15 = i25;
                                    i10 = i28;
                                    if (i10 >= 0) {
                                        break;
                                    }
                                    i17 = -i10;
                                    i14 = -1;
                                } else {
                                    i20++;
                                }
                            }
                            break;
                        }
                    }
                }
                i = -2;
                i10 = i;
                if (i10 != -2) {
                    if (i10 != -1) {
                        fVar.skip(lVar.f25290u[i10].b());
                    }
                } else if (nVar.f25297w.q(fVar, 8192) == -1) {
                    break;
                }
            }
            i10 = -1;
            if (i10 != -1) {
                this.B = 0;
                this.f31935w[this.f31933u - 1] = ((String[]) eVar.f18918u)[i10];
                return i10;
            }
            String str = this.f31935w[this.f31933u - 1];
            String Y = Y();
            int W = W(Y, eVar);
            if (W == -1) {
                this.B = 15;
                this.E = Y;
                this.f31935w[this.f31933u - 1] = str;
            }
            return W;
        }
        x.o("closed");
        return 0;
    }

    @Override // z6.a
    public final void M() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 14) {
            long k3 = this.f31937z.k(H);
            f fVar = this.A;
            if (k3 == -1) {
                k3 = fVar.f25274v;
            }
            fVar.skip(k3);
        } else if (i == 13) {
            d0(G);
        } else if (i == 12) {
            d0(F);
        } else if (i != 15) {
            vd.n.f("Expected a name but was ", i1.l(H()), o());
            return;
        }
        this.B = 0;
        this.f31935w[this.f31933u - 1] = "null";
    }

    @Override // z6.a
    public final void N() {
        int i = 0;
        do {
            int i10 = this.B;
            if (i10 == 0) {
                i10 = V();
            }
            if (i10 == 3) {
                K(1);
            } else if (i10 == 1) {
                K(3);
            } else {
                if (i10 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f31933u--;
                    } else {
                        vd.n.f("Expected a value but was ", i1.l(H()), o());
                        return;
                    }
                } else if (i10 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f31933u--;
                    } else {
                        vd.n.f("Expected a value but was ", i1.l(H()), o());
                        return;
                    }
                } else {
                    f fVar = this.A;
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 9 && i10 != 13) {
                            if (i10 != 8 && i10 != 12) {
                                if (i10 == 17) {
                                    fVar.skip(this.D);
                                } else if (i10 == 18) {
                                    vd.n.f("Expected a value but was ", i1.l(H()), o());
                                    return;
                                }
                            } else {
                                d0(F);
                            }
                        } else {
                            d0(G);
                        }
                    } else {
                        long k3 = this.f31937z.k(H);
                        if (k3 == -1) {
                            k3 = fVar.f25274v;
                        }
                        fVar.skip(k3);
                    }
                }
                this.B = 0;
            }
            i++;
            this.B = 0;
        } while (i != 0);
        int[] iArr = this.f31936x;
        int i11 = this.f31933u - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f31935w[i11] = "null";
    }

    public final void R() {
        O("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.D = r2;
        r9 = 17;
        r22.B = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (X(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.C = r8;
        r7.skip(r2);
        r9 = 16;
        r22.B = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int V() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.V():int");
    }

    public final int W(String str, e eVar) {
        int length = ((String[]) eVar.f18918u).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) eVar.f18918u)[i])) {
                this.B = 0;
                this.f31935w[this.f31933u - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean X(int i) {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            R();
            throw null;
        }
        return false;
    }

    public final String Y() {
        String str;
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 14) {
            str = b0();
        } else if (i == 13) {
            str = a0(G);
        } else if (i == 12) {
            str = a0(F);
        } else if (i == 15) {
            str = this.E;
        } else {
            vd.n.f("Expected a name but was ", i1.l(H()), o());
            return null;
        }
        this.B = 0;
        this.f31935w[this.f31933u - 1] = str;
        return str;
    }

    public final int Z(boolean z3) {
        int i = 0;
        while (true) {
            int i10 = i + 1;
            n nVar = this.f31937z;
            if (nVar.p(i10)) {
                long j10 = i;
                f fVar = this.A;
                byte k3 = fVar.k(j10);
                if (k3 != 10 && k3 != 32 && k3 != 13 && k3 != 9) {
                    fVar.skip(j10);
                    if (k3 == 47) {
                        if (nVar.p(2L)) {
                            R();
                            throw null;
                        }
                    } else if (k3 == 35) {
                        R();
                        throw null;
                    }
                    return k3;
                }
                i = i10;
            } else {
                if (!z3) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String a0(h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long k3 = this.f31937z.k(hVar);
            if (k3 != -1) {
                f fVar = this.A;
                if (fVar.k(k3) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(fVar.p(k3, mf.a.f20798a));
                    fVar.readByte();
                    sb2.append(c0());
                } else {
                    if (sb2 == null) {
                        String p10 = fVar.p(k3, mf.a.f20798a);
                        fVar.readByte();
                        return p10;
                    }
                    sb2.append(fVar.p(k3, mf.a.f20798a));
                    fVar.readByte();
                    return sb2.toString();
                }
            } else {
                O("Unterminated string");
                throw null;
            }
        }
    }

    public final String b0() {
        long k3 = this.f31937z.k(H);
        f fVar = this.A;
        if (k3 != -1) {
            fVar.getClass();
            return fVar.p(k3, mf.a.f20798a);
        }
        return fVar.r();
    }

    public final char c0() {
        int i;
        n nVar = this.f31937z;
        if (nVar.p(1L)) {
            f fVar = this.A;
            byte readByte = fVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (nVar.p(4L)) {
                                        char c10 = 0;
                                        for (int i10 = 0; i10 < 4; i10++) {
                                            byte k3 = fVar.k(i10);
                                            char c11 = (char) (c10 << 4);
                                            if (k3 >= 48 && k3 <= 57) {
                                                i = k3 - 48;
                                            } else if (k3 >= 97 && k3 <= 102) {
                                                i = k3 - 87;
                                            } else {
                                                if (k3 < 65 || k3 > 70) {
                                                    O("\\u".concat(fVar.p(4L, mf.a.f20798a)));
                                                    throw null;
                                                }
                                                i = k3 - 55;
                                            }
                                            c10 = (char) (i + c11);
                                        }
                                        fVar.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path ".concat(o()));
                                }
                                O("Invalid escape sequence: \\" + ((char) readByte));
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
            return (char) readByte;
        }
        O("Unterminated escape sequence");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = 0;
        this.f31934v[0] = 8;
        this.f31933u = 1;
        f fVar = this.A;
        fVar.skip(fVar.f25274v);
        this.f31937z.close();
    }

    public final void d0(h hVar) {
        while (true) {
            long k3 = this.f31937z.k(hVar);
            if (k3 != -1) {
                f fVar = this.A;
                if (fVar.k(k3) == 92) {
                    fVar.skip(k3 + 1);
                    c0();
                } else {
                    fVar.skip(k3 + 1);
                    return;
                }
            } else {
                O("Unterminated string");
                throw null;
            }
        }
    }

    @Override // z6.a
    public final void f() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 3) {
            K(1);
            this.f31936x[this.f31933u - 1] = 0;
            this.B = 0;
            return;
        }
        vd.n.f("Expected BEGIN_ARRAY but was ", i1.l(H()), o());
    }

    @Override // z6.a
    public final void j() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 1) {
            K(3);
            this.B = 0;
        } else {
            vd.n.f("Expected BEGIN_OBJECT but was ", i1.l(H()), o());
        }
    }

    @Override // z6.a
    public final void k() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 4) {
            int i10 = this.f31933u;
            this.f31933u = i10 - 1;
            int[] iArr = this.f31936x;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.B = 0;
            return;
        }
        vd.n.f("Expected END_ARRAY but was ", i1.l(H()), o());
    }

    @Override // z6.a
    public final void m() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 2) {
            int i10 = this.f31933u;
            int i11 = i10 - 1;
            this.f31933u = i11;
            this.f31935w[i11] = null;
            int[] iArr = this.f31936x;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.B = 0;
            return;
        }
        vd.n.f("Expected END_OBJECT but was ", i1.l(H()), o());
    }

    @Override // z6.a
    public final boolean p() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    @Override // z6.a
    public final boolean r() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 5) {
            this.B = 0;
            int[] iArr = this.f31936x;
            int i10 = this.f31933u - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i == 6) {
            this.B = 0;
            int[] iArr2 = this.f31936x;
            int i11 = this.f31933u - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        vd.n.f("Expected a boolean but was ", i1.l(H()), o());
        return false;
    }

    public final String toString() {
        return "JsonReader(" + this.f31937z + ")";
    }

    @Override // z6.a
    public final double w() {
        int i = this.B;
        if (i == 0) {
            i = V();
        }
        if (i == 16) {
            this.B = 0;
            int[] iArr = this.f31936x;
            int i10 = this.f31933u - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.C;
        }
        if (i == 17) {
            long j10 = this.D;
            f fVar = this.A;
            fVar.getClass();
            this.E = fVar.p(j10, mf.a.f20798a);
        } else if (i == 9) {
            this.E = a0(G);
        } else if (i == 8) {
            this.E = a0(F);
        } else if (i == 10) {
            this.E = b0();
        } else if (i != 11) {
            vd.n.f("Expected a double but was ", i1.l(H()), o());
            return 0.0d;
        }
        this.B = 11;
        try {
            double parseDouble = Double.parseDouble(this.E);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.E = null;
                this.B = 0;
                int[] iArr2 = this.f31936x;
                int i11 = this.f31933u - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + o());
        } catch (NumberFormatException unused) {
            vd.n.f("Expected a double but was ", this.E, o());
            return 0.0d;
        }
    }
}
