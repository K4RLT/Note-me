package n;
import n.a;
import p0.b;
import x.n;
import n.p0;
import n.y;
import p0.a;
import p0.c;
import p0.d;
import q.x;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20959a = p0.f20923a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f20960b = p.f20922a;

    /* renamed from: c, reason: collision with root package name */
    public int[] f20961c = m.f20915a;

    /* renamed from: d, reason: collision with root package name */
    public int f20962d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f20963f;

    public y(int i) {
        if (i >= 0) {
            d(d(i));
        } else {
            x.n("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i10 = this.f20962d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f20959a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final int b(long j10) {
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i10 = i & 127;
        int i11 = this.f20962d;
        int i12 = (i >>> 7) & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20959a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j11 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j12 = (i10 * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i12) & i11;
                if (this.f20960b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int c(long j10) {
        int b10 = b(j10);
        if (b10 >= 0) {
            return this.f20961c[b10];
        }
        l4.a.h(g3.a.h(j10, "Cannot find value for key "));
        return 0;
    }

    public final void d(int i) {
        int i10;
        long[] jArr;
        if (i > 0) {
            i10 = Math.max(7, c(i));
        } else {
            i10 = 0;
        }
        this.f20962d = i10;
        if (i10 == 0) {
            jArr = p0.f20923a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f20959a = jArr;
        int i12 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f20963f = a(this.f20962d) - this.e;
        this.f20960b = new long[i10];
        this.f20961c = new int[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r38.f20963f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (((r38.f20959a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r1 = r38.f20962d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (java.lang.Long.compare((r38.e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r1 = r38.f20959a;
        r2 = r38.f20962d;
        r4 = r38.f20960b;
        r5 = r38.f20961c;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r7 >= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = qe.k.n(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0114, code lost:
    
        if (r6 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012d, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = a(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0171, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0182, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0184, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d5, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b0, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ed, code lost:
    
        r18 = r11;
        r38.f20963f = n.a(r38.f20962d) - r38.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027f, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0283, code lost:
    
        r38.e++;
        r2 = r38.f20963f;
        r3 = r38.f20959a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029b, code lost:
    
        if (((r5 >> r7) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029d, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        r38.f20963f = r2 - r29;
        r2 = r38.f20962d;
        r5 = (r5 & (~(r27 << r7))) | (r31 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fe, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020c, code lost:
    
        r1 = p0.b(r38.f20962d);
        r2 = r38.f20959a;
        r4 = r38.f20960b;
        r5 = r38.f20961c;
        r6 = r38.f20962d;
        d(r1);
        r1 = r38.f20959a;
        r7 = r38.f20960b;
        r8 = r38.f20961c;
        r9 = r38.f20962d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0227, code lost:
    
        if (r10 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0236, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0238, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0279, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0276, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0209, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0099, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r39, long r40) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.y.e(int, long):void");
    }

    public final boolean equals(Object obj) {
        boolean z3;
        long[] jArr;
        boolean z9;
        long[] jArr2;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.e != this.e) {
            return false;
        }
        long[] jArr3 = this.f20960b;
        int[] iArr = this.f20961c;
        long[] jArr4 = this.f20959a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j10 = jArr4[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j10) < 128) {
                        int i12 = (i << 3) + i11;
                        z9 = z10;
                        jArr2 = jArr3;
                        long j11 = jArr2[i12];
                        int i13 = iArr[i12];
                        int b10 = yVar.b(j11);
                        if (b10 < 0 || i13 != yVar.f20961c[b10]) {
                            break loop0;
                        }
                    } else {
                        z9 = z10;
                        jArr2 = jArr3;
                    }
                    j10 >>= 8;
                    i11++;
                    z10 = z9;
                    jArr3 = jArr2;
                }
                z3 = z10;
                jArr = jArr3;
                if (i10 != 8) {
                    return z3;
                }
            } else {
                z3 = z10;
                jArr = jArr3;
            }
            if (i != length) {
                i++;
                z10 = z3;
                jArr3 = jArr;
            } else {
                return z3;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f20960b;
        int[] iArr = this.f20961c;
        long[] jArr2 = this.f20959a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i << 3) + i12;
                        long j11 = jArr[i13];
                        i10 += Integer.hashCode(iArr[i13]) ^ Long.hashCode(j11);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i10;
            }
        }
    }

    public final String toString() {
        int i;
        int i10;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f20960b;
        int[] iArr = this.f20961c;
        long[] jArr2 = this.f20959a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j11 = jArr[i15];
                            int i16 = iArr[i15];
                            sb2.append(j11);
                            sb2.append("=");
                            sb2.append(i16);
                            i12++;
                            if (i12 < this.e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j10 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i17 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i = i17;
                } else {
                    i = i11;
                }
                if (i == length) {
                    break;
                }
                i11 = i + 1;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
