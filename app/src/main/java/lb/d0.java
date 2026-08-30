package lb;
import d0.f;
import r0.e;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d0 extends FilterInputStream {

    /* renamed from: u, reason: collision with root package name */
    public final y0 f20107u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f20108v;

    /* renamed from: w, reason: collision with root package name */
    public long f20109w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20110x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20111y;

    public d0(InputStream inputStream) {
        super(inputStream);
        this.f20107u = new y0();
        this.f20108v = new byte[4096];
        this.f20110x = false;
        this.f20111y = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r10.f20111y == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r0 = j(30);
        r2 = r10.f20107u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r10.f20110x = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (e == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r10.f20111y = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r0.f20088b == 4294967295L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r0 = r2.f20312f - 30;
        r3 = r10.f20108v.length;
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r6 <= r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r3 = r3 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r3 < r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r10.f20108v = java.util.Arrays.copyOf(r10.f20108v, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0006, code lost:
    
        if (r10.f20109w > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (j(r0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r10.f20110x = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        return r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        r0 = r2.b();
        r10.f20109w = r0.f20088b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw new lb.k0("Files bigger than 4GiB are not supported.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        return new lb.b0(null, -1, -1, false, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r0 = r10.f20108v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (read(r0, 0, r0.length) != (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r10.f20110x != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lb.b0 f() {
        /*
            r10 = this;
            long r0 = r10.f20109w
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L13
        L8:
            byte[] r0 = r10.f20108v
            int r1 = r0.length
            r2 = 0
            int r0 = r10.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto L8
        L13:
            boolean r0 = r10.f20110x
            if (r0 != 0) goto L7d
            boolean r0 = r10.f20111y
            if (r0 == 0) goto L1c
            goto L7d
        L1c:
            r0 = 30
            boolean r0 = r10.j(r0)
            r1 = 1
            lb.y0 r2 = r10.f20107u
            if (r0 != 0) goto L2e
            r10.f20110x = r1
            lb.b0 r0 = r2.b()
            return r0
        L2e:
            lb.b0 r0 = r2.b()
            boolean r3 = e
            if (r3 == 0) goto L39
            r10.f20111y = r1
            return r0
        L39:
            long r3 = r0.f20088b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L75
            int r0 = r2.f20312f
            int r0 = r0 + (-30)
            byte[] r3 = r10.f20108v
            int r3 = r3.length
            long r4 = (long) r3
            long r6 = (long) r0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5f
        L51:
            int r3 = r3 + r3
            long r4 = (long) r3
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L51
            byte[] r4 = r10.f20108v
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r10.f20108v = r3
        L5f:
            boolean r0 = r10.j(r0)
            if (r0 != 0) goto L6c
            r10.f20110x = r1
            lb.b0 r0 = r2.b()
            return r0
        L6c:
            lb.b0 r0 = r2.b()
            long r1 = r0.f20088b
            r10.f20109w = r1
            return r0
        L75:
            lb.k0 r0 = new lb.k0
            java.lang.String r1 = "Files bigger than 4GiB are not supported."
            r0.<init>(r1)
            throw r0
        L7d:
            lb.b0 r2 = new lb.b0
            r8 = 0
            r9 = 0
            r3 = 0
            r4 = -1
            r6 = -1
            r7 = 0
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.f():lb.b0");
    }

    public final boolean j(int i) {
        int max = Math.max(0, super.read(this.f20108v, 0, i));
        y0 y0Var = this.f20107u;
        if (max != i) {
            int i10 = i - max;
            if (Math.max(0, super.read(this.f20108v, max, i10)) != i10) {
                y0Var.a(this.f20108v, 0, max);
                return false;
            }
        }
        y0Var.a(this.f20108v, 0, i);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        long j10 = this.f20109w;
        if (j10 > 0 && !this.f20110x) {
            int max = Math.max(0, super.read(bArr, i, (int) Math.min(j10, i10)));
            this.f20109w -= max;
            if (max == 0) {
                this.f20110x = true;
                return 0;
            }
            return max;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
