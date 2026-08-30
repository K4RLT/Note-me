package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class uz implements xe1, ky0 {

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f11758u;

    public /* synthetic */ uz(byte[] bArr) {
        this.f11758u = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ky0
    public /* synthetic */ Object c() {
        return this.f11758u;
    }

    @Override // com.google.android.gms.internal.ads.ky0
    public /* synthetic */ void d(Object obj, FileOutputStream fileOutputStream) {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.ky0
    public Object e(FileInputStream fileInputStream) {
        try {
            return t61.a(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Cannot read bytes.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.xe1
    /* renamed from: zza */
    public /* synthetic */ pf1 mo210zza() {
        AtomicInteger atomicInteger = wz.O;
        return new yc1(this.f11758u);
    }
}
