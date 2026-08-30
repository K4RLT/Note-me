package oc;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f21916b;

    public /* synthetic */ p(q qVar, int i) {
        this.f21915a = i;
        this.f21916b = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21915a) {
            case 0:
                try {
                    i0.m mVar = this.f21916b.e;
                    tc.c cVar = (tc.c) mVar.f18054v;
                    String str = (String) mVar.f18055w;
                    cVar.getClass();
                    boolean delete = new File((File) cVar.f25699w, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f21916b.f21922g;
                i0.m mVar2 = nVar.f21901c;
                tc.c cVar2 = (tc.c) mVar2.f18054v;
                String str2 = (String) mVar2.f18055w;
                cVar2.getClass();
                boolean z3 = true;
                if (!new File((File) cVar2.f25699w, str2).exists()) {
                    if (nVar.e() == null || !nVar.f21906j.c()) {
                        z3 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    tc.c cVar3 = (tc.c) mVar2.f18054v;
                    cVar3.getClass();
                    new File((File) cVar3.f25699w, str2).delete();
                }
                return Boolean.valueOf(z3);
        }
    }
}
