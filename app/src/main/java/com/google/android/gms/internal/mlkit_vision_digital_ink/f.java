package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.h;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends d0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f14287v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f14288u;

    public f(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        boolean z3;
        this.f14288u = arrayList;
        if (outputStream != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        pa.h(z3, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f14288u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((g0) obj).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        ArrayList arrayList = this.f14288u;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).f(1);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.d0, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        ArrayList arrayList = this.f14288u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((g0) obj).f(bArr.length);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.d0, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        ((FilterOutputStream) this).out.write(bArr, i, i10);
        ArrayList arrayList = this.f14288u;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((g0) obj).f(i10);
        }
    }
}
