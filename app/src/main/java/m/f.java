package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import java.util.ArrayList;
import q.x;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f20412a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f20413b;

    public f(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.f20412a = iCustomTabsService;
        this.f20413b = componentName;
    }

    public static void a(Context context, String str, i iVar) {
        iVar.f20414u = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!str.isEmpty()) {
            intent.setPackage(str);
            context.bindService(intent, iVar, 33);
        } else {
            x.n("Service Intents must be explicit");
        }
    }

    public static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    public final j c(a aVar) {
        ICustomTabsService iCustomTabsService = this.f20412a;
        e eVar = new e(aVar);
        try {
            if (!iCustomTabsService.newSession(eVar)) {
                return null;
            }
            return new j(iCustomTabsService, eVar, this.f20413b);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
