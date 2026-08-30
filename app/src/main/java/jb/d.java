package jb;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d implements kb.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19104u;

    /* renamed from: v, reason: collision with root package name */
    public final z5.h f19105v;

    public /* synthetic */ d(z5.h hVar, int i) {
        this.f19104u = i;
        this.f19105v = hVar;
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public final Object mo207zza() {
        switch (this.f19104u) {
            case 0:
                Context context = ((f) this.f19105v.f31922v).f19108a;
                g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat("AppUpdateListenerRegistry");
                new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
                Object obj = new Object();
                new HashSet();
                context.getApplicationContext();
                return obj;
            default:
                return new j(((f) this.f19105v.f31922v).f19108a);
        }
    }
}
