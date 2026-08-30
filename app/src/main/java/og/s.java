package og;
import f.a;
import f.c;
import t.r;

import java.util.logging.Level;
import java.util.logging.Logger;
import okio.BufferedSource;

/* loaded from: classes.dex */
public final class s implements sg.t {

    /* renamed from: u, reason: collision with root package name */
    public final BufferedSource f22044u;

    /* renamed from: v, reason: collision with root package name */
    public int f22045v;

    /* renamed from: w, reason: collision with root package name */
    public byte f22046w;

    /* renamed from: x, reason: collision with root package name */
    public int f22047x;

    /* renamed from: y, reason: collision with root package name */
    public int f22048y;

    /* renamed from: z, reason: collision with root package name */
    public short f22049z;

    public s(BufferedSource bufferedSource) {
        this.f22044u = bufferedSource;
    }

    @Override // sg.t
    public final sg.v a() {
        return this.f22044u.a();
    }

    @Override // sg.t
    public final long q(sg.f fVar, long j10) {
        int i;
        int readInt;
        do {
            int i10 = this.f22048y;
            BufferedSource bufferedSource = this.f22044u;
            if (i10 == 0) {
                bufferedSource.skip(this.f22049z);
                this.f22049z = (short) 0;
                if ((this.f22046w & 4) == 0) {
                    i = this.f22047x;
                    int r8 = r(bufferedSource);
                    this.f22048y = r8;
                    this.f22045v = r8;
                    byte readByte = (byte) (bufferedSource.readByte() & 255);
                    this.f22046w = (byte) (bufferedSource.readByte() & 255);
                    Logger logger = t.f22050y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(a(true, this.f22047x, this.f22045v, readByte, this.f22046w));
                    }
                    readInt = bufferedSource.readInt() & Integer.MAX_VALUE;
                    this.f22047x = readInt;
                    if (readByte != 9) {
                        c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                }
            } else {
                long q10 = bufferedSource.q(fVar, Math.min(j10, i10));
                if (q10 != -1) {
                    this.f22048y = (int) (this.f22048y - q10);
                    return q10;
                }
            }
            return -1L;
        } while (readInt == i);
        c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
