package com.google.android.gms.internal.ads;
import ac.b;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final /* synthetic */ class fg0 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv f6061b;

    public /* synthetic */ fg0(dv dvVar, int i) {
        this.f6060a = i;
        this.f6061b = dvVar;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final /* synthetic */ b l(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f6060a) {
            case 0:
                return ed1.e(new wg0(inputStream, this.f6061b));
            case 1:
                return ed1.e(new wg0(inputStream, this.f6061b));
            default:
                String str = new String(t61.a(inputStream), StandardCharsets.UTF_8);
                dv dvVar = this.f6061b;
                dvVar.D = str;
                return ed1.e(dvVar);
        }
    }
}
