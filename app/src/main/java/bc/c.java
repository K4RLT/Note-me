package bc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import g9.n;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements gd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3170c;

    public /* synthetic */ c(Context context, String str) {
        this.f3168a = 1;
        this.f3169b = context;
        this.f3170c = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ld.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pd.c] */
    @Override // gd.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f3168a) {
            case 0:
                g gVar = (g) this.f3170c;
                Context context = (Context) this.f3169b;
                String d2 = gVar.d();
                Object obj = new Object();
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(d2), 0);
                boolean z3 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z3 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z3 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f20329a = z3;
                return obj;
            case 1:
                Context context2 = (Context) this.f3169b;
                String str = (String) this.f3170c;
                Object obj2 = new Object();
                obj2.f22681u = context2.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
                return obj2;
            default:
                ic.g gVar2 = (ic.g) this.f3170c;
                ic.a aVar = (ic.a) this.f3169b;
                return aVar.f18390f.e(new n(aVar, gVar2));
        }
    }

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f3168a = i;
        this.f3170c = obj;
        this.f3169b = obj2;
    }
}