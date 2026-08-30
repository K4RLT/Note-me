package sg;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface g extends r, WritableByteChannel {
    g C(long j10);

    @Override // sg.r, java.io.Flushable
    void flush();

    g write(byte[] bArr);

    g write(byte[] bArr, int i, int i10);

    g writeByte(int i);

    g writeInt(int i);

    g writeShort(int i);

    g x(String str);
}
