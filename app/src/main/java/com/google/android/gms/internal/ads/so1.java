package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class so1 {

    /* renamed from: a, reason: collision with root package name */
    public static String f11085a;

    public static String a(Context context) {
        String str;
        String str2 = f11085a;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            str = resolveActivity.activityInfo.packageName;
        } else {
            str = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f11085a = null;
        } else if (arrayList.size() == 1) {
            f11085a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str)) {
                    f11085a = str;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f11085a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f11085a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f11085a = "com.chrome.dev";
            }
        }
        return f11085a;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b10 : bArr) {
            if (b10 != 34) {
                if (b10 != 39) {
                    if (b10 != 92) {
                        switch (b10) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (b10 >= 32 && b10 <= 126) {
                                    sb2.append((char) b10);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((b10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((b10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((b10 & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
