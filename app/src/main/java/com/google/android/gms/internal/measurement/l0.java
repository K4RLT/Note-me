package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13830a = 0;

    static {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" skipChecks");
        }
        q.x.o("Missing required properties:".concat(String.valueOf(sb2)));
    }
}
