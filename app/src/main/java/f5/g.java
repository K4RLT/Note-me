package f5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f16747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16748b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16749c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16750d;

    public g(long j10, long j11, int i, int i10) {
        this.f16747a = i;
        this.f16748b = i10;
        this.f16749c = j10;
        this.f16750d = j11;
    }

    public static g a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f16747a);
            dataOutputStream.writeInt(this.f16748b);
            dataOutputStream.writeLong(this.f16749c);
            dataOutputStream.writeLong(this.f16750d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f16748b == gVar.f16748b && this.f16749c == gVar.f16749c && this.f16747a == gVar.f16747a && this.f16750d == gVar.f16750d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16748b), Long.valueOf(this.f16749c), Integer.valueOf(this.f16747a), Long.valueOf(this.f16750d));
    }
}
