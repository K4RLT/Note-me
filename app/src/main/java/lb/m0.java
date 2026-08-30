package lb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m0 extends OutputStream {
    public b0 A;

    /* renamed from: u, reason: collision with root package name */
    public final y0 f20202u = new y0();

    /* renamed from: v, reason: collision with root package name */
    public final File f20203v;

    /* renamed from: w, reason: collision with root package name */
    public final l1 f20204w;

    /* renamed from: x, reason: collision with root package name */
    public long f20205x;

    /* renamed from: y, reason: collision with root package name */
    public long f20206y;

    /* renamed from: z, reason: collision with root package name */
    public FileOutputStream f20207z;

    public m0(File file, l1 l1Var) {
        this.f20203v = file;
        this.f20204w = l1Var;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        boolean endsWith;
        int i11;
        int min;
        boolean endsWith2;
        int i12 = i;
        int i13 = i10;
        while (i13 > 0) {
            boolean z3 = false;
            if (this.f20205x == 0 && this.f20206y == 0) {
                y0 y0Var = this.f20202u;
                int a10 = y0Var.a(bArr, i12, i13);
                if (a10 != -1) {
                    i12 += a10;
                    i13 -= a10;
                    b0 b10 = y0Var.b();
                    this.A = b10;
                    boolean z9 = b10.e;
                    l1 l1Var = this.f20204w;
                    if (z9) {
                        this.f20205x = 0L;
                        byte[] bArr2 = b10.f20091f;
                        l1Var.k(bArr2, bArr2.length);
                        this.f20206y = this.A.f20091f.length;
                    } else {
                        if (b10.f20089c == 0) {
                            String str = b10.f20087a;
                            if (str == null) {
                                endsWith2 = false;
                            } else {
                                endsWith2 = str.endsWith("/");
                            }
                            if (!endsWith2) {
                                l1Var.i(this.A.f20091f);
                                File file = new File(this.f20203v, this.A.f20087a);
                                file.getParentFile().mkdirs();
                                this.f20205x = this.A.f20088b;
                                this.f20207z = new FileOutputStream(file);
                            }
                        }
                        byte[] bArr3 = this.A.f20091f;
                        l1Var.k(bArr3, bArr3.length);
                        this.f20205x = this.A.f20088b;
                    }
                } else {
                    return;
                }
            }
            int i14 = i13;
            int i15 = i12;
            String str2 = this.A.f20087a;
            if (str2 == null) {
                endsWith = false;
            } else {
                endsWith = str2.endsWith("/");
            }
            if (!endsWith) {
                long j10 = i14;
                b0 b0Var = this.A;
                if (b0Var.e) {
                    this.f20204w.d(i15, i14, this.f20206y, bArr);
                    i11 = i14;
                    this.f20206y += j10;
                    min = i11;
                } else {
                    i11 = i14;
                    if (b0Var.f20089c == 0) {
                        z3 = true;
                    }
                    long j11 = this.f20205x;
                    if (z3) {
                        min = (int) Math.min(j10, j11);
                        this.f20207z.write(bArr, i15, min);
                        long j12 = this.f20205x - min;
                        this.f20205x = j12;
                        if (j12 == 0) {
                            this.f20207z.close();
                        }
                    } else {
                        min = (int) Math.min(j10, j11);
                        this.f20204w.d(i15, min, (r0.f20091f.length + this.A.f20088b) - this.f20205x, bArr);
                        this.f20205x -= min;
                    }
                }
                i12 = i15 + min;
                i13 = i11 - min;
            } else {
                i12 = i15;
                i13 = i14;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
