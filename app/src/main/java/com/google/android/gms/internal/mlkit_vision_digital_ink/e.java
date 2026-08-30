package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends c0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f14228v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f14229u;

    public e(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f14229u = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f14229u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                g5.q.b();
                return;
            } else {
                try {
                    throw null;
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.f14229u.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                g5.q.b();
                return 0;
            }
            return read;
        }
        return read;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c0, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read == -1) {
            return read;
        }
        Iterator it = this.f14229u.iterator();
        if (!it.hasNext()) {
            return read;
        }
        it.next().getClass();
        g5.q.b();
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i10);
        if (read == -1) {
            return read;
        }
        Iterator it = this.f14229u.iterator();
        if (!it.hasNext()) {
            return read;
        }
        it.next().getClass();
        g5.q.b();
        return 0;
    }
}
