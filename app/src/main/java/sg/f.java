package sg;
import p.a;
import p.b;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okio.BufferedSource;
import q.x;
import w7.i1;
import ya.bc;

/* loaded from: classes.dex */
public final class f implements BufferedSource, g, Cloneable, ByteChannel {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f25272w;

    /* renamed from: u, reason: collision with root package name */
    public o f25273u;

    /* renamed from: v, reason: collision with root package name */
    public long f25274v;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(mf.a.f20798a);
        bytes.getClass();
        f25272w = bytes;
    }

    public final o A(int i) {
        if (i >= 1 && i <= 8192) {
            o oVar = this.f25273u;
            if (oVar == null) {
                o b10 = b();
                this.f25273u = b10;
                b10.f25303g = b10;
                b10.f25302f = b10;
                return b10;
            }
            o oVar2 = oVar.f25303g;
            if (oVar2 != null) {
                if (oVar2.f25300c + i <= 8192 && oVar2.e) {
                    return oVar2;
                }
                o b11 = b();
                oVar2.b(b11);
                return b11;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        x.n("unexpected capacity");
        return null;
    }

    public final void B(t tVar) {
        tVar.getClass();
        do {
        } while (tVar.q(this, 8192) != -1);
    }

    @Override // sg.g
    public final /* bridge */ /* synthetic */ g C(long j10) {
        K(j10);
        return this;
    }

    @Override // sg.r
    public final void G(f fVar, long j10) {
        o oVar;
        o b10;
        int i;
        fVar.getClass();
        if (fVar != this) {
            bc.a(fVar.f25274v, 0L, j10);
            while (j10 > 0) {
                o oVar2 = fVar.f25273u;
                if (oVar2 != null) {
                    int i10 = oVar2.f25300c - oVar2.f25299b;
                    int i11 = 0;
                    if (j10 < i10) {
                        o oVar3 = this.f25273u;
                        if (oVar3 != null) {
                            oVar = oVar3.f25303g;
                        } else {
                            oVar = null;
                        }
                        if (oVar != null && oVar.e) {
                            long j11 = oVar.f25300c + j10;
                            if (oVar.f25301d) {
                                i = 0;
                            } else {
                                i = oVar.f25299b;
                            }
                            if (j11 - i <= 8192) {
                                oVar2.d(oVar, (int) j10);
                                fVar.f25274v -= j10;
                                this.f25274v += j10;
                                return;
                            }
                        }
                        int i12 = (int) j10;
                        if (i12 > 0 && i12 <= i10) {
                            if (i12 >= 1024) {
                                b10 = oVar2.c();
                            } else {
                                b10 = b();
                                byte[] bArr = oVar2.f25298a;
                                int i13 = oVar2.f25299b;
                                byte[] bArr2 = b10.f25298a;
                                bArr.getClass();
                                bArr2.getClass();
                                System.arraycopy(bArr, i13, bArr2, 0, i12);
                            }
                            b10.f25300c = b10.f25299b + i12;
                            oVar2.f25299b += i12;
                            o oVar4 = oVar2.f25303g;
                            if (oVar4 != null) {
                                oVar4.b(b10);
                                fVar.f25273u = b10;
                            } else {
                                kotlin.jvm.internal.l.g();
                                throw null;
                            }
                        } else {
                            x.n("byteCount out of range");
                            return;
                        }
                    }
                    o oVar5 = fVar.f25273u;
                    if (oVar5 != null) {
                        long j12 = oVar5.f25300c - oVar5.f25299b;
                        fVar.f25273u = oVar5.a();
                        o oVar6 = this.f25273u;
                        if (oVar6 == null) {
                            this.f25273u = oVar5;
                            oVar5.f25303g = oVar5;
                            oVar5.f25302f = oVar5;
                        } else {
                            o oVar7 = oVar6.f25303g;
                            if (oVar7 != null) {
                                oVar7.b(oVar5);
                                o oVar8 = oVar5.f25303g;
                                if (oVar8 != oVar5) {
                                    if (oVar8 != null) {
                                        if (oVar8.e) {
                                            int i14 = oVar5.f25300c - oVar5.f25299b;
                                            int i15 = 8192 - oVar8.f25300c;
                                            if (!oVar8.f25301d) {
                                                i11 = oVar8.f25299b;
                                            }
                                            if (i14 <= i15 + i11) {
                                                oVar5.d(oVar8, i14);
                                                oVar5.a();
                                                a(oVar5);
                                            }
                                        }
                                    } else {
                                        kotlin.jvm.internal.l.g();
                                        throw null;
                                    }
                                } else {
                                    x.o("cannot compact");
                                    return;
                                }
                            } else {
                                kotlin.jvm.internal.l.g();
                                throw null;
                            }
                        }
                        fVar.f25274v -= j12;
                        this.f25274v += j12;
                        j10 -= j12;
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.l.g();
                    throw null;
                }
            }
            return;
        }
        x.n("source == this");
    }

    public final void H(int i) {
        o A = A(1);
        byte[] bArr = A.f25298a;
        int i10 = A.f25300c;
        A.f25300c = i10 + 1;
        bArr[i10] = (byte) i;
        this.f25274v++;
    }

    @Override // okio.BufferedSource
    public final String I() {
        return t(Long.MAX_VALUE);
    }

    public final void K(long j10) {
        if (j10 == 0) {
            H(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o A = A(numberOfTrailingZeros);
        byte[] bArr = A.f25298a;
        int i = A.f25300c;
        for (int i10 = (i + numberOfTrailingZeros) - 1; i10 >= i; i10--) {
            bArr[i10] = f25272w[(int) (15 & j10)];
            j10 >>>= 4;
        }
        A.f25300c += numberOfTrailingZeros;
        this.f25274v += numberOfTrailingZeros;
    }

    public final void L(int i) {
        o A = A(4);
        byte[] bArr = A.f25298a;
        int i10 = A.f25300c;
        bArr[i10] = (byte) ((i >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i & 255);
        A.f25300c = i10 + 4;
        this.f25274v += 4;
    }

    public final void M(int i) {
        o A = A(2);
        byte[] bArr = A.f25298a;
        int i10 = A.f25300c;
        bArr[i10] = (byte) ((i >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i & 255);
        A.f25300c = i10 + 2;
        this.f25274v += 2;
    }

    public final void N(String str, int i, int i10) {
        char c10;
        str.getClass();
        if (i >= 0) {
            if (i10 >= i) {
                if (i10 <= str.length()) {
                    while (i < i10) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            o A = A(1);
                            byte[] bArr = A.f25298a;
                            int i11 = A.f25300c - i;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i + 1;
                            bArr[i + i11] = (byte) charAt;
                            while (i12 < min) {
                                char charAt2 = str.charAt(i12);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i12 + i11] = (byte) charAt2;
                                i12++;
                            }
                            int i13 = A.f25300c;
                            int i14 = (i11 + i12) - i13;
                            A.f25300c = i13 + i14;
                            this.f25274v += i14;
                            i = i12;
                        } else {
                            if (charAt < 2048) {
                                H((charAt >> 6) | 192);
                                H((charAt & '?') | 128);
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i15 = i + 1;
                                if (i15 < i10) {
                                    c10 = str.charAt(i15);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt <= 56319 && 56320 <= c10 && 57343 >= c10) {
                                    int i16 = (((charAt & 10239) << 10) | (9215 & c10)) + 65536;
                                    H((i16 >> 18) | 240);
                                    H(((i16 >> 12) & 63) | 128);
                                    H(((i16 >> 6) & 63) | 128);
                                    H((i16 & 63) | 128);
                                    i += 2;
                                } else {
                                    H(63);
                                    i = i15;
                                }
                            } else {
                                H((charAt >> '\f') | 224);
                                H(((charAt >> 6) & 63) | 128);
                                H((charAt & '?') | 128);
                            }
                            i++;
                        }
                    }
                    return;
                }
                x.i(str.length(), g3.a.m("endIndex > string.length: ", i10, " > "));
                return;
            }
            x.j(i1.c("endIndex < beginIndex: ", i10, i, " < "));
            return;
        }
        x.j(g3.a.g(i, "beginIndex < 0: "));
    }

    public final void O(int i) {
        if (i < 128) {
            H(i);
            return;
        }
        if (i < 2048) {
            H((i >> 6) | 192);
            H((i & 63) | 128);
            return;
        }
        if (55296 <= i && 57343 >= i) {
            H(63);
            return;
        }
        if (i < 65536) {
            H((i >> 12) | 224);
            H(((i >> 6) & 63) | 128);
            H((i & 63) | 128);
        } else {
            if (i <= 1114111) {
                H((i >> 18) | 240);
                H(((i >> 12) & 63) | 128);
                H(((i >> 6) & 63) | 128);
                H((i & 63) | 128);
                return;
            }
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
    }

    @Override // okio.BufferedSource
    public final void Q(long j10) {
        if (this.f25274v >= j10) {
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[EDGE_INSN: B:41:0x009b->B:38:0x009b BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Type inference failed for: r0v8, types: [sg.f, java.lang.Object] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long S() {
        /*
            r14 = this;
            long r0 = r14.f25274v
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La7
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            sg.o r6 = r14.f25273u
            if (r6 == 0) goto La2
            byte[] r7 = r6.f25298a
            int r8 = r6.f25299b
            int r9 = r6.f25300c
        L15:
            if (r8 >= r9) goto L87
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L26
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L26
            int r11 = r10 - r11
            goto L40
        L26:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L35
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L35
        L30:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L40
        L35:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L6b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L6b
            goto L30
        L40:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L50
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L15
        L50:
            sg.f r0 = new sg.f
            r0.<init>()
            r0.K(r4)
            r0.H(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.r()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6b:
            if (r0 == 0) goto L6f
            r1 = 1
            goto L87
        L6f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = java.lang.Integer.toHexString(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L87:
            if (r8 != r9) goto L93
            sg.o r7 = r6.a()
            r14.f25273u = r7
            sg.a(r6)
            goto L95
        L93:
            r6.f25299b = r8
        L95:
            if (r1 != 0) goto L9b
            sg.o r6 = r14.f25273u
            if (r6 != 0) goto Lb
        L9b:
            long r1 = r14.f25274v
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f25274v = r1
            return r4
        La2:
            kotlin.jvm.internal.l.g()
            r0 = 0
            throw r0
        La7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.f.S():long");
    }

    @Override // okio.BufferedSource
    public final InputStream U() {
        return new e(this, 0);
    }

    @Override // sg.t
    public final v a() {
        return v.f25310d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sg.f, java.lang.Object] */
    public final Object clone() {
        Object obj = new Object();
        if (this.f25274v == 0) {
            return obj;
        }
        o oVar = this.f25273u;
        if (oVar != null) {
            o c10 = oVar.c();
            obj.f25273u = c10;
            c10.f25303g = c10;
            c10.f25302f = c10;
            o oVar2 = this.f25273u;
            if (oVar2 != null) {
                for (o oVar3 = oVar2.f25302f; oVar3 != this.f25273u; oVar3 = oVar3.f25302f) {
                    o oVar4 = obj.f25273u;
                    if (oVar4 != null) {
                        o oVar5 = oVar4.f25303g;
                        if (oVar5 != null) {
                            if (oVar3 != null) {
                                oVar5.b(oVar3.c());
                            } else {
                                kotlin.jvm.internal.l.g();
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.l.g();
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                }
                obj.f25274v = this.f25274v;
                return obj;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        kotlin.jvm.internal.l.g();
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z3 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j10 = this.f25274v;
        f fVar = (f) obj;
        if (j10 != fVar.f25274v) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f25273u;
        if (oVar != null) {
            o oVar2 = fVar.f25273u;
            if (oVar2 != null) {
                int i = oVar.f25299b;
                int i10 = oVar2.f25299b;
                long j11 = 0;
                while (j11 < this.f25274v) {
                    long min = Math.min(oVar.f25300c - i, oVar2.f25300c - i10);
                    long j12 = 0;
                    while (j12 < min) {
                        boolean z9 = z3;
                        int i11 = i + 1;
                        int i12 = i10 + 1;
                        if (oVar.f25298a[i] != oVar2.f25298a[i10]) {
                            return false;
                        }
                        j12++;
                        z3 = z9;
                        i = i11;
                        i10 = i12;
                    }
                    boolean z10 = z3;
                    if (i == oVar.f25300c) {
                        o oVar3 = oVar.f25302f;
                        if (oVar3 != null) {
                            i = oVar3.f25299b;
                            oVar = oVar3;
                        } else {
                            kotlin.jvm.internal.l.g();
                            throw null;
                        }
                    }
                    if (i10 == oVar2.f25300c) {
                        oVar2 = oVar2.f25302f;
                        if (oVar2 != null) {
                            i10 = oVar2.f25299b;
                        } else {
                            kotlin.jvm.internal.l.g();
                            throw null;
                        }
                    }
                    j11 += min;
                    z3 = z10;
                }
                return z3;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        kotlin.jvm.internal.l.g();
        throw null;
    }

    public final void f(f fVar, long j10, long j11) {
        fVar.getClass();
        long j12 = j10;
        long j13 = j11;
        bc.a(this.f25274v, j12, j13);
        if (j13 != 0) {
            fVar.f25274v += j13;
            o oVar = this.f25273u;
            while (oVar != null) {
                long j14 = oVar.f25300c - oVar.f25299b;
                if (j12 >= j14) {
                    j12 -= j14;
                    oVar = oVar.f25302f;
                } else {
                    while (j13 > 0) {
                        if (oVar != null) {
                            o c10 = oVar.c();
                            int i = c10.f25299b + ((int) j12);
                            c10.f25299b = i;
                            c10.f25300c = Math.min(i + ((int) j13), c10.f25300c);
                            o oVar2 = fVar.f25273u;
                            if (oVar2 == null) {
                                c10.f25303g = c10;
                                c10.f25302f = c10;
                                fVar.f25273u = c10;
                            } else {
                                o oVar3 = oVar2.f25303g;
                                if (oVar3 != null) {
                                    oVar3.b(c10);
                                } else {
                                    kotlin.jvm.internal.l.g();
                                    throw null;
                                }
                            }
                            j13 -= c10.f25300c - c10.f25299b;
                            oVar = oVar.f25302f;
                            j12 = 0;
                        } else {
                            kotlin.jvm.internal.l.g();
                            throw null;
                        }
                    }
                    return;
                }
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
    }

    public final int hashCode() {
        o oVar = this.f25273u;
        if (oVar != null) {
            int i = 1;
            do {
                int i10 = oVar.f25300c;
                for (int i11 = oVar.f25299b; i11 < i10; i11++) {
                    i = (i * 31) + oVar.f25298a[i11];
                }
                oVar = oVar.f25302f;
                if (oVar == null) {
                    kotlin.jvm.internal.l.g();
                    throw null;
                }
            } while (oVar != this.f25273u);
            return i;
        }
        return 0;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j() {
        if (this.f25274v == 0) {
            return true;
        }
        return false;
    }

    public final byte k(long j10) {
        bc.a(this.f25274v, j10, 1L);
        o oVar = this.f25273u;
        if (oVar != null) {
            long j11 = this.f25274v;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    oVar = oVar.f25303g;
                    if (oVar != null) {
                        j11 -= oVar.f25300c - oVar.f25299b;
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                }
                return oVar.f25298a[(int) ((oVar.f25299b + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i = oVar.f25300c;
                int i10 = oVar.f25299b;
                long j13 = (i - i10) + j12;
                if (j13 > j10) {
                    return oVar.f25298a[(int) ((i10 + j10) - j12)];
                }
                oVar = oVar.f25302f;
                if (oVar != null) {
                    j12 = j13;
                } else {
                    kotlin.jvm.internal.l.g();
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.l.g();
            throw null;
        }
    }

    @Override // okio.BufferedSource
    public final h l(long j10) {
        return new h(o(j10));
    }

    public final long m(long j10, long j11, byte b10) {
        o oVar;
        long j12 = j10;
        long j13 = j11;
        long j14 = 0;
        if (0 <= j12 && j13 >= j12) {
            long j15 = this.f25274v;
            if (j13 > j15) {
                j13 = j15;
            }
            long j16 = -1;
            if (j12 != j13 && (oVar = this.f25273u) != null) {
                Throwable th = null;
                if (j15 - j12 < j12) {
                    while (j15 > j12) {
                        oVar = oVar.f25303g;
                        if (oVar != null) {
                            j15 -= oVar.f25300c - oVar.f25299b;
                        } else {
                            kotlin.jvm.internal.l.g();
                            throw null;
                        }
                    }
                    while (j15 < j13) {
                        byte[] bArr = oVar.f25298a;
                        long j17 = j16;
                        Throwable th2 = th;
                        int min = (int) Math.min(oVar.f25300c, (oVar.f25299b + j13) - j15);
                        for (int i = (int) ((oVar.f25299b + j12) - j15); i < min; i++) {
                            if (bArr[i] == b10) {
                                return (i - oVar.f25299b) + j15;
                            }
                        }
                        j15 += oVar.f25300c - oVar.f25299b;
                        oVar = oVar.f25302f;
                        if (oVar != null) {
                            j16 = j17;
                            j12 = j15;
                            th = th2;
                        } else {
                            kotlin.jvm.internal.l.g();
                            throw th2;
                        }
                    }
                    return j16;
                }
                while (true) {
                    long j18 = (oVar.f25300c - oVar.f25299b) + j14;
                    if (j18 > j12) {
                        while (j14 < j13) {
                            byte[] bArr2 = oVar.f25298a;
                            int min2 = (int) Math.min(oVar.f25300c, (oVar.f25299b + j13) - j14);
                            for (int i10 = (int) ((oVar.f25299b + j12) - j14); i10 < min2; i10++) {
                                if (bArr2[i10] == b10) {
                                    return (i10 - oVar.f25299b) + j14;
                                }
                            }
                            j14 += oVar.f25300c - oVar.f25299b;
                            oVar = oVar.f25302f;
                            if (oVar != null) {
                                j12 = j14;
                            } else {
                                kotlin.jvm.internal.l.g();
                                throw null;
                            }
                        }
                        return -1L;
                    }
                    oVar = oVar.f25302f;
                    if (oVar != null) {
                        j14 = j18;
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                }
            }
            return -1L;
        }
        StringBuilder sb2 = new StringBuilder("size=");
        sb2.append(this.f25274v);
        g3.a.s(sb2, " fromIndex=", j12, " toIndex=");
        sb2.append(j13);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final byte[] o(long j10) {
        if (j10 >= 0 && j10 <= Integer.MAX_VALUE) {
            if (this.f25274v >= j10) {
                int i = (int) j10;
                byte[] bArr = new byte[i];
                int i10 = 0;
                while (i10 < i) {
                    int read = read(bArr, i10, i - i10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        x.j(g3.a.h(j10, "byteCount: "));
        return null;
    }

    public final String p(long j10, Charset charset) {
        charset.getClass();
        if (j10 >= 0 && j10 <= Integer.MAX_VALUE) {
            if (this.f25274v >= j10) {
                if (j10 == 0) {
                    return "";
                }
                o oVar = this.f25273u;
                if (oVar != null) {
                    int i = oVar.f25299b;
                    if (i + j10 > oVar.f25300c) {
                        return new String(o(j10), charset);
                    }
                    int i10 = (int) j10;
                    String str = new String(oVar.f25298a, i, i10, charset);
                    int i11 = oVar.f25299b + i10;
                    oVar.f25299b = i11;
                    this.f25274v -= j10;
                    if (i11 == oVar.f25300c) {
                        this.f25273u = oVar.a();
                        a(oVar);
                    }
                    return str;
                }
                kotlin.jvm.internal.l.g();
                throw null;
            }
            throw new EOFException();
        }
        x.j(g3.a.h(j10, "byteCount: "));
        return null;
    }

    @Override // sg.t
    public final long q(f fVar, long j10) {
        fVar.getClass();
        if (j10 >= 0) {
            long j11 = this.f25274v;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            fVar.G(this, j10);
            return j10;
        }
        x.j(g3.a.h(j10, "byteCount < 0: "));
        return 0L;
    }

    public final String r() {
        return p(this.f25274v, mf.a.f20798a);
    }

    public final int read(byte[] bArr, int i, int i10) {
        bc.a(bArr.length, i, i10);
        o oVar = this.f25273u;
        if (oVar != null) {
            int min = Math.min(i10, oVar.f25300c - oVar.f25299b);
            System.arraycopy(oVar.f25298a, oVar.f25299b, bArr, i, min);
            int i11 = oVar.f25299b + min;
            oVar.f25299b = i11;
            this.f25274v -= min;
            if (i11 == oVar.f25300c) {
                this.f25273u = oVar.a();
                a(oVar);
            }
            return min;
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        long j10 = this.f25274v;
        if (j10 != 0) {
            o oVar = this.f25273u;
            if (oVar != null) {
                int i = oVar.f25299b;
                int i10 = oVar.f25300c;
                int i11 = i + 1;
                byte b10 = oVar.f25298a[i];
                this.f25274v = j10 - 1;
                if (i11 == i10) {
                    this.f25273u = oVar.a();
                    a(oVar);
                    return b10;
                }
                oVar.f25299b = i11;
                return b10;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public final int readInt() {
        long j10 = this.f25274v;
        if (j10 >= 4) {
            o oVar = this.f25273u;
            if (oVar != null) {
                int i = oVar.f25299b;
                int i10 = oVar.f25300c;
                if (i10 - i < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = oVar.f25298a;
                int i11 = i + 3;
                int i12 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
                int i13 = i + 4;
                int i14 = (bArr[i11] & 255) | i12;
                this.f25274v = j10 - 4;
                if (i13 == i10) {
                    this.f25273u = oVar.a();
                    a(oVar);
                    return i14;
                }
                oVar.f25299b = i13;
                return i14;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public final short readShort() {
        long j10 = this.f25274v;
        if (j10 >= 2) {
            o oVar = this.f25273u;
            if (oVar != null) {
                int i = oVar.f25299b;
                int i10 = oVar.f25300c;
                if (i10 - i < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = oVar.f25298a;
                int i11 = i + 1;
                int i12 = (bArr[i] & 255) << 8;
                int i13 = i + 2;
                int i14 = (bArr[i11] & 255) | i12;
                this.f25274v = j10 - 2;
                if (i13 == i10) {
                    this.f25273u = oVar.a();
                    a(oVar);
                } else {
                    oVar.f25299b = i13;
                }
                return (short) i14;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public final void skip(long j10) {
        while (j10 > 0) {
            o oVar = this.f25273u;
            if (oVar != null) {
                int min = (int) Math.min(j10, oVar.f25300c - oVar.f25299b);
                long j11 = min;
                this.f25274v -= j11;
                j10 -= j11;
                int i = oVar.f25299b + min;
                oVar.f25299b = i;
                if (i == oVar.f25300c) {
                    this.f25273u = oVar.a();
                    a(oVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [sg.f, java.lang.Object] */
    @Override // okio.BufferedSource
    public final String t(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long j12 = j11;
            byte b10 = (byte) 10;
            long m4 = m(0L, j12, b10);
            if (m4 != -1) {
                return w(m4);
            }
            if (j12 < this.f25274v && k(j12 - 1) == ((byte) 13) && k(j12) == b10) {
                return w(j12);
            }
            Object obj = new Object();
            f(obj, 0L, Math.min(32, this.f25274v));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f25274v, j10) + " content=" + new h(obj.o(obj.f25274v)).c() + (char) 8230);
        }
        x.j(g3.a.h(j10, "limit < 0: "));
        return null;
    }

    public final String toString() {
        h qVar;
        long j10 = this.f25274v;
        if (j10 <= Integer.MAX_VALUE) {
            int i = (int) j10;
            if (i == 0) {
                qVar = h.f25276y;
            } else {
                qVar = new q(this, i);
            }
            return qVar.toString();
        }
        throw new IllegalStateException(("size > Integer.MAX_VALUE: " + this.f25274v).toString());
    }

    public final String w(long j10) {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (k(j11) == ((byte) 13)) {
                String p10 = p(j11, mf.a.f20798a);
                skip(2L);
                return p10;
            }
        }
        String p11 = p(j10, mf.a.f20798a);
        skip(1L);
        return p11;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m228write(byte[] bArr, int i, int i10) {
        bArr.getClass();
        long j10 = i10;
        bc.a(bArr.length, i, j10);
        int i11 = i10 + i;
        while (i < i11) {
            o A = A(1);
            int min = Math.min(i11 - i, 8192 - A.f25300c);
            System.arraycopy(bArr, i, A.f25298a, A.f25300c, min);
            i += min;
            A.f25300c += min;
        }
        this.f25274v += j10;
    }

    @Override // sg.g
    public final /* bridge */ /* synthetic */ g writeByte(int i) {
        H(i);
        return this;
    }

    @Override // sg.g
    public final /* bridge */ /* synthetic */ g writeInt(int i) {
        L(i);
        return this;
    }

    @Override // sg.g
    public final /* bridge */ /* synthetic */ g writeShort(int i) {
        M(i);
        return this;
    }

    @Override // sg.g
    public final g x(String str) {
        str.getClass();
        N(str, 0, str.length());
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, sg.r
    public final void close() {
    }

    @Override // sg.g, sg.r, java.io.Flushable
    public final void flush() {
    }

    @Override // sg.g
    public final g write(byte[] bArr) {
        m228write(bArr, 0, bArr.length);
        return this;
    }

    @Override // sg.g
    public final /* bridge */ /* synthetic */ g write(byte[] bArr, int i, int i10) {
        m228write(bArr, i, i10);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            o A = A(1);
            int min = Math.min(i, 8192 - A.f25300c);
            byteBuffer.get(A.f25298a, A.f25300c, min);
            i -= min;
            A.f25300c += min;
        }
        this.f25274v += remaining;
        return remaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        o oVar = this.f25273u;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f25300c - oVar.f25299b);
        byteBuffer.put(oVar.f25298a, oVar.f25299b, min);
        int i = oVar.f25299b + min;
        oVar.f25299b = i;
        this.f25274v -= min;
        if (i == oVar.f25300c) {
            this.f25273u = oVar.a();
            a(oVar);
        }
        return min;
    }
}