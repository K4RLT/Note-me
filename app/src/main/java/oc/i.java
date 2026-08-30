package oc;

import android.util.Log;
import b0.e0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final h f21883d = new h(0);
    public static final e0 e = new e0(6);

    /* renamed from: a, reason: collision with root package name */
    public final tc.c f21884a;

    /* renamed from: b, reason: collision with root package name */
    public String f21885b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f21886c = null;

    public i(tc.c cVar) {
        this.f21884a = cVar;
    }

    public static void a(tc.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.d(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e8) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e8);
            }
        }
    }
}
