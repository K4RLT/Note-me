package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements i31 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ u2 f11516v = new u2(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u2 f11517w = new u2(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ u2 f11518x = new u2(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ u2 f11519y = new u2(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ u2 f11520z = new u2(4);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11521u;

    public /* synthetic */ u2(int i) {
        this.f11521u = i;
    }

    @Override // com.google.android.gms.internal.ads.i31
    public final /* synthetic */ boolean l(Object obj) {
        switch (this.f11521u) {
            case 0:
                a5 a5Var = (a5) obj;
                if (!a5Var.f4360b.equals("com.apple.iTunes") || !a5Var.f4361c.equals("iTunSMPB")) {
                    return false;
                }
                return true;
            case 1:
                return ((v4) obj).f11795c.equals("iTunSMPB");
            case 2:
                int i = r6.G;
                return !(((q7) obj) instanceof k4);
            case 3:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            default:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
        }
    }
}
