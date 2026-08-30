package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kg {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f7733a;

    /* renamed from: b, reason: collision with root package name */
    public long f7734b;

    /* renamed from: c, reason: collision with root package name */
    public long f7735c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7736d;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.ads.kg] */
    public static kg a(Context context, Executor executor) {
        String[] strArr = e;
        Object obj = new Object();
        obj.f7733a = 0L;
        obj.f7734b = 0L;
        obj.f7735c = -1L;
        obj.f7736d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new jg(0, obj));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return obj;
    }
}