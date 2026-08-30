package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class yu1 implements Function {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yu1 f12972b = new yu1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ yu1 f12973c = new yu1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12974a;

    public /* synthetic */ yu1(int i) {
        this.f12974a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f12974a) {
            case 0:
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
            default:
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
        }
    }
}
