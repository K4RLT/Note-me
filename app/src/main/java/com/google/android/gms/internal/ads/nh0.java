package com.google.android.gms.internal.ads;
import c2.b;
import k9.c0;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class nh0 extends c2.b {
    public static final SparseArray i;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8714d;
    public final i60 e;

    /* renamed from: f, reason: collision with root package name */
    public final TelephonyManager f8715f;

    /* renamed from: g, reason: collision with root package name */
    public final lh0 f8716g;

    /* renamed from: h, reason: collision with root package name */
    public int f8717h;

    static {
        SparseArray sparseArray = new SparseArray();
        i = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), tj.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        tj tjVar = tj.CONNECTING;
        sparseArray.put(ordinal, tjVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), tjVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), tjVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), tj.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        tj tjVar2 = tj.DISCONNECTED;
        sparseArray.put(ordinal2, tjVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), tjVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), tjVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), tjVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), tjVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), tj.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), tjVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), tjVar);
    }

    public nh0(Context context, i60 i60Var, lh0 lh0Var, com.google.android.gms.internal.measurement.e4 e4Var, k9.c0 c0Var) {
        super(e4Var, c0Var);
        this.f8714d = context;
        this.e = i60Var;
        this.f8716g = lh0Var;
        this.f8715f = (TelephonyManager) context.getSystemService("phone");
    }
}
