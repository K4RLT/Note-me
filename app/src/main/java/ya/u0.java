package ya;
import x.p;
import g3.a;
import lb.m0;
import lb.x;
import mb.d;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class u0 {
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0030. Please report as an issue. */
    public static void a(x xVar, InputStream inputStream, m0 m0Var, long j10) {
        m0 m0Var2;
        DataInputStream dataInputStream;
        x xVar2;
        int readUnsignedShort;
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream2.readInt();
        if (readInt == -771763713) {
            int read = dataInputStream2.read();
            if (read == 4) {
                long j11 = 0;
                while (true) {
                    long j12 = j10 - j11;
                    try {
                        int read2 = dataInputStream2.read();
                        if (read2 != -1) {
                            if (read2 != 0) {
                                switch (read2) {
                                    case 247:
                                        m0Var2 = m0Var;
                                        read2 = dataInputStream2.readUnsignedShort();
                                        c(bArr, dataInputStream2, m0Var2, read2, j12);
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    case 248:
                                        m0Var2 = m0Var;
                                        read2 = dataInputStream2.readInt();
                                        c(bArr, dataInputStream2, m0Var2, read2, j12);
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    case 249:
                                        m0Var2 = m0Var;
                                        DataInputStream dataInputStream3 = dataInputStream2;
                                        x xVar3 = xVar;
                                        long readUnsignedShort2 = dataInputStream3.readUnsignedShort();
                                        int read3 = dataInputStream3.read();
                                        if (read3 != -1) {
                                            b(bArr, xVar3, m0Var2, readUnsignedShort2, read3, j12);
                                            xVar = xVar3;
                                            dataInputStream2 = dataInputStream3;
                                            read2 = read3;
                                            j11 += read2;
                                            m0Var = m0Var2;
                                        } else {
                                            throw new IOException("Unexpected end of patch");
                                        }
                                    case 250:
                                        m0Var2 = m0Var;
                                        dataInputStream = dataInputStream2;
                                        xVar2 = xVar;
                                        long readUnsignedShort3 = dataInputStream.readUnsignedShort();
                                        readUnsignedShort = dataInputStream.readUnsignedShort();
                                        b(bArr, xVar2, m0Var2, readUnsignedShort3, readUnsignedShort, j12);
                                        xVar = xVar2;
                                        read2 = readUnsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    case 251:
                                        m0Var2 = m0Var;
                                        dataInputStream = dataInputStream2;
                                        xVar2 = xVar;
                                        long readUnsignedShort4 = dataInputStream.readUnsignedShort();
                                        readUnsignedShort = dataInputStream.readInt();
                                        b(bArr, xVar2, m0Var2, readUnsignedShort4, readUnsignedShort, j12);
                                        xVar = xVar2;
                                        read2 = readUnsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    case 252:
                                        m0Var2 = m0Var;
                                        dataInputStream = dataInputStream2;
                                        xVar2 = xVar;
                                        long readInt2 = dataInputStream.readInt();
                                        readUnsignedShort = dataInputStream.read();
                                        if (readUnsignedShort != -1) {
                                            b(bArr, xVar2, m0Var2, readInt2, readUnsignedShort, j12);
                                            xVar = xVar2;
                                            read2 = readUnsignedShort;
                                            dataInputStream2 = dataInputStream;
                                            j11 += read2;
                                            m0Var = m0Var2;
                                        } else {
                                            throw new IOException("Unexpected end of patch");
                                        }
                                    case 253:
                                        m0Var2 = m0Var;
                                        dataInputStream = dataInputStream2;
                                        xVar2 = xVar;
                                        long readInt3 = dataInputStream.readInt();
                                        readUnsignedShort = dataInputStream.readUnsignedShort();
                                        b(bArr, xVar2, m0Var2, readInt3, readUnsignedShort, j12);
                                        xVar = xVar2;
                                        read2 = readUnsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    case 254:
                                        m0Var2 = m0Var;
                                        dataInputStream = dataInputStream2;
                                        xVar2 = xVar;
                                        long readInt4 = dataInputStream.readInt();
                                        readUnsignedShort = dataInputStream.readInt();
                                        b(bArr, xVar2, m0Var2, readInt4, readUnsignedShort, j12);
                                        xVar = xVar2;
                                        read2 = readUnsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    case 255:
                                        m0Var2 = m0Var;
                                        dataInputStream = dataInputStream2;
                                        long readLong = dataInputStream.readLong();
                                        readUnsignedShort = dataInputStream.readInt();
                                        xVar2 = xVar;
                                        b(bArr, xVar2, m0Var2, readLong, readUnsignedShort, j12);
                                        xVar = xVar2;
                                        read2 = readUnsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j11 += read2;
                                        m0Var = m0Var2;
                                    default:
                                        m0Var2 = m0Var;
                                        try {
                                            c(bArr, dataInputStream2, m0Var2, read2, j12);
                                            dataInputStream = dataInputStream2;
                                            dataInputStream2 = dataInputStream;
                                            j11 += read2;
                                            m0Var = m0Var2;
                                        } catch (Throwable th) {
                                            th = th;
                                            Throwable th2 = th;
                                            m0Var2.flush();
                                            throw th2;
                                        }
                                }
                            } else {
                                m0Var.flush();
                                return;
                            }
                        } else {
                            throw new IOException("Patch file overrun");
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        m0Var2 = m0Var;
                    }
                }
            } else {
                throw new IOException(a.g(read, "Unexpected version="));
            }
        } else {
            throw new IOException("Unexpected magic=".concat(String.format("%x", Integer.valueOf(readInt))));
        }
    }

    public static void b(byte[] bArr, x xVar, m0 m0Var, long j10, int i, long j11) {
        InputStream k3;
        if (i >= 0) {
            if (j10 >= 0) {
                long j12 = i;
                if (j12 <= j11) {
                    try {
                        d dVar = new d(xVar, j10, j12);
                        synchronized (dVar) {
                            k3 = dVar.k(0L, dVar.f20770w - dVar.f20769v);
                        }
                        int i10 = i;
                        while (i10 > 0) {
                            try {
                                int min = Math.min(i10, 16384);
                                int i11 = 0;
                                while (i11 < min) {
                                    int read = k3.read(bArr, i11, min - i11);
                                    if (read != -1) {
                                        i11 += read;
                                    } else {
                                        throw new IOException("truncated input stream");
                                    }
                                }
                                m0Var.write(bArr, 0, min);
                                i10 -= min;
                            } finally {
                            }
                        }
                        k3.close();
                        return;
                    } catch (EOFException e) {
                        throw new IOException("patch underrun", e);
                    }
                }
                x.p("Output length overrun");
                return;
            }
            x.p("inputOffset negative");
            return;
        }
        x.p("copyLength negative");
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, m0 m0Var, int i, long j10) {
        if (i >= 0) {
            if (i <= j10) {
                while (i > 0) {
                    try {
                        int min = Math.min(i, 16384);
                        dataInputStream.readFully(bArr, 0, min);
                        m0Var.write(bArr, 0, min);
                        i -= min;
                    } catch (EOFException unused) {
                        x.p("patch underrun");
                        return;
                    }
                }
                return;
            }
            x.p("Output length overrun");
            return;
        }
        x.p("copyLength negative");
    }
}
