package lb;
import n1.a;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class x extends ig.y {

    /* renamed from: u, reason: collision with root package name */
    public final TreeMap f20301u = new TreeMap();

    public x(File file, File file2) {
        ArrayList a10 = a(file, file2);
        if (!a10.isEmpty()) {
            int size = a10.size();
            int i = 0;
            long j10 = 0;
            while (i < size) {
                Object obj = a10.get(i);
                i++;
                File file3 = (File) obj;
                this.f20301u.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new k0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    public final long k() {
        Map.Entry lastEntry = this.f20301u.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    public final FileInputStream m(long j10, Long l10) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f20301u.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new k0("Virtualized slice archive corrupt, could not skip in file with key " + l10);
    }

    @Override // ig.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
