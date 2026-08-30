package pc;

import c7.f0;
import g5.q;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.x;

/* loaded from: classes.dex */
public final class k implements Closeable {
    public static final Logger A = Logger.getLogger(k.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final RandomAccessFile f22666u;

    /* renamed from: v, reason: collision with root package name */
    public int f22667v;

    /* renamed from: w, reason: collision with root package name */
    public int f22668w;

    /* renamed from: x, reason: collision with root package name */
    public h f22669x;

    /* renamed from: y, reason: collision with root package name */
    public h f22670y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f22671z;

    public k(File file) {
        byte[] bArr = new byte[16];
        this.f22671z = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    L(bArr2, i, iArr[i10]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    x.p("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f22666u = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int p10 = p(bArr, 0);
        this.f22667v = p10;
        if (p10 <= randomAccessFile2.length()) {
            this.f22668w = p(bArr, 4);
            int p11 = p(bArr, 8);
            int p12 = p(bArr, 12);
            this.f22669x = o(p11);
            this.f22670y = o(p12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f22667v + ", Actual length: " + randomAccessFile2.length());
    }

    public static void L(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) (i10 >> 24);
        bArr[i + 1] = (byte) (i10 >> 16);
        bArr[i + 2] = (byte) (i10 >> 8);
        bArr[i + 3] = (byte) i10;
    }

    public static int p(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void A(byte[] bArr, int i, int i10) {
        int H = H(i);
        int i11 = H + i10;
        int i12 = this.f22667v;
        RandomAccessFile randomAccessFile = this.f22666u;
        if (i11 <= i12) {
            randomAccessFile.seek(H);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - H;
        randomAccessFile.seek(H);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int B() {
        if (this.f22668w == 0) {
            return 16;
        }
        h hVar = this.f22670y;
        int i = hVar.f22661a;
        int i10 = this.f22669x.f22661a;
        if (i >= i10) {
            return (i - i10) + 4 + hVar.f22662b + 16;
        }
        return (((i + 4) + hVar.f22662b) + this.f22667v) - i10;
    }

    public final int H(int i) {
        int i10 = this.f22667v;
        if (i < i10) {
            return i;
        }
        return (i + 16) - i10;
    }

    public final void K(int i, int i10, int i11, int i12) {
        int[] iArr = {i, i10, i11, i12};
        int i13 = 0;
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f22671z;
            if (i13 < 4) {
                L(bArr, i14, iArr[i13]);
                i14 += 4;
                i13++;
            } else {
                RandomAccessFile randomAccessFile = this.f22666u;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22666u.close();
    }

    public final void f(byte[] bArr) {
        int H;
        int i;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    j(length);
                    boolean m4 = m();
                    if (m4) {
                        H = 16;
                    } else {
                        h hVar = this.f22670y;
                        H = H(hVar.f22661a + 4 + hVar.f22662b);
                    }
                    h hVar2 = new h(H, length);
                    L(this.f22671z, 0, length);
                    A(this.f22671z, H, 4);
                    A(bArr, H + 4, length);
                    if (m4) {
                        i = H;
                    } else {
                        i = this.f22669x.f22661a;
                    }
                    K(this.f22667v, this.f22668w + 1, i, H);
                    this.f22670y = hVar2;
                    this.f22668w++;
                    if (m4) {
                        this.f22669x = hVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void j(int i) {
        int i10 = i + 4;
        int B = this.f22667v - B();
        if (B >= i10) {
            return;
        }
        int i11 = this.f22667v;
        do {
            B += i11;
            i11 <<= 1;
        } while (B < i10);
        RandomAccessFile randomAccessFile = this.f22666u;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f22670y;
        int H = H(hVar.f22661a + 4 + hVar.f22662b);
        if (H < this.f22669x.f22661a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f22667v);
            long j10 = H - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                q.f("Copied insufficient number of bytes!");
                return;
            }
        }
        int i12 = this.f22670y.f22661a;
        int i13 = this.f22669x.f22661a;
        if (i12 < i13) {
            int i14 = (this.f22667v + i12) - 16;
            K(i11, this.f22668w, i13, i14);
            this.f22670y = new h(i14, this.f22670y.f22662b);
        } else {
            K(i11, this.f22668w, i13, i12);
        }
        this.f22667v = i11;
    }

    public final synchronized void k(j jVar) {
        int i = this.f22669x.f22661a;
        for (int i10 = 0; i10 < this.f22668w; i10++) {
            h o10 = o(i);
            jVar.a(new i(this, o10), o10.f22662b);
            i = H(o10.f22661a + 4 + o10.f22662b);
        }
    }

    public final synchronized boolean m() {
        boolean z3;
        if (this.f22668w == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3;
    }

    public final h o(int i) {
        if (i == 0) {
            return h.f22660c;
        }
        RandomAccessFile randomAccessFile = this.f22666u;
        randomAccessFile.seek(i);
        return new h(i, randomAccessFile.readInt());
    }

    public final synchronized void r() {
        if (!m()) {
            if (this.f22668w == 1) {
                synchronized (this) {
                    K(4096, 0, 0, 0);
                    this.f22668w = 0;
                    h hVar = h.f22660c;
                    this.f22669x = hVar;
                    this.f22670y = hVar;
                    if (this.f22667v > 4096) {
                        RandomAccessFile randomAccessFile = this.f22666u;
                        randomAccessFile.setLength(4096);
                        randomAccessFile.getChannel().force(true);
                    }
                    this.f22667v = 4096;
                }
            } else {
                h hVar2 = this.f22669x;
                int H = H(hVar2.f22661a + 4 + hVar2.f22662b);
                w(H, 0, 4, this.f22671z);
                int p10 = p(this.f22671z, 0);
                K(this.f22667v, this.f22668w - 1, H, this.f22670y.f22661a);
                this.f22668w--;
                this.f22669x = new h(H, p10);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f22667v);
        sb2.append(", size=");
        sb2.append(this.f22668w);
        sb2.append(", first=");
        sb2.append(this.f22669x);
        sb2.append(", last=");
        sb2.append(this.f22670y);
        sb2.append(", element lengths=[");
        try {
            k(new f0(sb2));
        } catch (IOException e) {
            A.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final void w(int i, int i10, int i11, byte[] bArr) {
        int H = H(i);
        int i12 = H + i11;
        int i13 = this.f22667v;
        RandomAccessFile randomAccessFile = this.f22666u;
        if (i12 <= i13) {
            randomAccessFile.seek(H);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - H;
        randomAccessFile.seek(H);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }
}
