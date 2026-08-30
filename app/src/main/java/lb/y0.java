package lb;
import p0.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f20308a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f20309b = 0;
    public int e = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f20310c = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20314h = false;

    /* renamed from: f, reason: collision with root package name */
    public int f20312f = 30;

    /* renamed from: d, reason: collision with root package name */
    public long f20311d = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f20313g = -1;
    public String i = null;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if (r3 >= r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        r11.f20308a = java.util.Arrays.copyOf(r11.f20308a, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006c, code lost:
    
        if (r3 < r4) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
        r3 = r3 + r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            r0 = 30
            int r1 = r11.c(r0, r13, r14, r12)
            r2 = -1
            if (r1 == r2) goto L9e
            long r3 = r11.f20310c
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L7e
            byte[] r3 = r11.f20308a
            r4 = 0
            int r5 = lb.a(r3, r4)
            r6 = 2
            int r3 = lb.a(r3, r6)
            int r3 = r3 << 16
            r3 = r3 | r5
            long r5 = (long) r3
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            r11.f20310c = r5
            r9 = 67324752(0x4034b50, double:3.3262847E-316)
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L7b
            r11.f20314h = r4
            byte[] r3 = r11.f20308a
            r4 = 18
            int r4 = lb.a(r3, r4)
            r5 = 20
            int r3 = lb.a(r3, r5)
            int r3 = r3 << 16
            r3 = r3 | r4
            long r3 = (long) r3
            long r3 = r3 & r7
            r11.f20311d = r3
            byte[] r3 = r11.f20308a
            r4 = 8
            int r3 = lb.a(r3, r4)
            r11.f20313g = r3
            byte[] r3 = r11.f20308a
            r4 = 26
            int r3 = lb.a(r3, r4)
            r11.e = r3
            byte[] r3 = r11.f20308a
            r4 = 28
            int r3 = lb.a(r3, r4)
            int r4 = r11.e
            int r4 = r4 + r0
            int r4 = r4 + r3
            r11.f20312f = r4
            byte[] r3 = r11.f20308a
            int r3 = r3.length
            if (r3 >= r4) goto L7e
        L6e:
            int r3 = r3 + r3
            if (r3 >= r4) goto L72
            goto L6e
        L72:
            byte[] r4 = r11.f20308a
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r11.f20308a = r3
            goto L7e
        L7b:
            r3 = 1
            r11.f20314h = r3
        L7e:
            int r3 = r11.f20312f
            int r13 = r13 + r1
            int r14 = r14 - r1
            int r12 = r11.c(r3, r13, r14, r12)
            if (r12 != r2) goto L89
            goto L9e
        L89:
            int r1 = r1 + r12
            boolean r12 = r11.f20314h
            if (r12 != 0) goto L9d
            java.lang.String r12 = r11.i
            if (r12 != 0) goto L9d
            java.lang.String r12 = new java.lang.String
            byte[] r13 = r11.f20308a
            int r14 = r11.e
            r12.<init>(r13, r0, r14)
            r11.i = r12
        L9d:
            return r1
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.a(byte[], int, int):int");
    }

    public final b0 b() {
        int i = this.f20309b;
        int i10 = this.f20312f;
        String str = this.i;
        long j10 = this.f20311d;
        int i11 = this.f20313g;
        if (i < i10) {
            return new b0(str, j10, i11, true, this.f20314h, Arrays.copyOf(this.f20308a, i));
        }
        b0 b0Var = new b0(str, j10, i11, false, this.f20314h, Arrays.copyOf(this.f20308a, i10));
        this.f20309b = 0;
        this.e = -1;
        this.f20310c = -1L;
        this.f20314h = false;
        this.f20312f = 30;
        this.f20311d = -1L;
        this.f20313g = -1;
        this.i = null;
        return b0Var;
    }

    public final int c(int i, int i10, int i11, byte[] bArr) {
        int i12 = this.f20309b;
        if (i12 < i) {
            int min = Math.min(i11, i - i12);
            System.arraycopy(bArr, i10, this.f20308a, this.f20309b, min);
            int i13 = this.f20309b + min;
            this.f20309b = i13;
            if (i13 < i) {
                return -1;
            }
            return min;
        }
        return 0;
    }
}
