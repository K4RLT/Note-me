package com.google.android.gms.internal.ads;
import j6.i;
import m.h;
import m.j;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    public m.j f5118a;

    /* renamed from: b, reason: collision with root package name */
    public m.h f5119b;

    /* renamed from: c, reason: collision with root package name */
    public zr1 f5120c;

    /* renamed from: d, reason: collision with root package name */
    public j6.i f5121d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(so1.a(context));
                    }
                }
            }
        }
        return false;
    }
}
