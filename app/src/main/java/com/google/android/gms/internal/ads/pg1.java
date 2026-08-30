package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public class pg1 extends IOException {

    /* renamed from: u, reason: collision with root package name */
    public final int f9520u;

    public pg1() {
        this.f9520u = AdError.REMOTE_ADS_SERVICE_ERROR;
    }

    public pg1(String str, int i) {
        super(str);
        this.f9520u = i;
    }

    public pg1(String str, Exception exc, int i) {
        super(str, exc);
        this.f9520u = i;
    }

    public pg1(int i, Exception exc) {
        super(exc);
        this.f9520u = i;
    }
}
