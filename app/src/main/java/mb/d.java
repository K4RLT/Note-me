package mb;

import ig.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;
import lb.k0;
import lb.w;
import lb.x;
import lb.x0;

/* loaded from: classes.dex */
public final class d extends y {

    /* renamed from: u, reason: collision with root package name */
    public final x f20768u;

    /* renamed from: v, reason: collision with root package name */
    public final long f20769v;

    /* renamed from: w, reason: collision with root package name */
    public final long f20770w;

    public d(x xVar, long j10, long j11) {
        this.f20768u = xVar;
        long m4 = m(j10);
        this.f20769v = m4;
        this.f20770w = m(m4 + j11);
    }

    public final InputStream k(long j10, long j11) {
        long m4 = m(this.f20769v);
        long m10 = m(j11 + m4) - m4;
        x xVar = this.f20768u;
        TreeMap treeMap = xVar.f20301u;
        if (m4 >= 0 && m10 >= 0) {
            long j12 = m4 + m10;
            if (j12 <= xVar.k()) {
                Long l10 = (Long) treeMap.floorKey(Long.valueOf(m4));
                Long l11 = (Long) treeMap.floorKey(Long.valueOf(j12));
                if (l10.equals(l11)) {
                    return new w(xVar.m(m4, l10), m10);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(xVar.m(m4, l10));
                Collection values = treeMap.subMap(l10, false, l11, false).values();
                if (!values.isEmpty()) {
                    arrayList.add(new x0(Collections.enumeration(values)));
                }
                arrayList.add(new w(new FileInputStream((File) treeMap.get(l11)), m10 - (l11.longValue() - m4)));
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
            throw new k0("Trying to access archive out of bounds. Archive ends at: " + xVar.k() + ". Tried accessing: " + j12);
        }
        throw new k0("Invalid input parameters " + m4 + ", " + m10);
    }

    public final long m(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        x xVar = this.f20768u;
        if (j10 > xVar.k()) {
            return xVar.k();
        }
        return j10;
    }

    @Override // ig.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
