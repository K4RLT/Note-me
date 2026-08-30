package t8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j.i0;
import java.util.Objects;
import n8.i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.c f25672u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f25673v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f25674w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Runnable f25675x;

    public /* synthetic */ d(com.google.android.gms.internal.consent_sdk.c cVar, i iVar, int i, Runnable runnable) {
        this.f25672u = cVar;
        this.f25673v = iVar;
        this.f25674w = i;
        this.f25675x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final i iVar = this.f25673v;
        final int i = this.f25674w;
        Runnable runnable = this.f25675x;
        final com.google.android.gms.internal.consent_sdk.c cVar = this.f25672u;
        u8.f fVar = (u8.f) cVar.A;
        try {
            try {
                u8.f fVar2 = (u8.f) cVar.f13373x;
                Objects.requireNonNull(fVar2);
                fVar.p(new e(fVar2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f13371v).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.a(iVar, i);
                } else {
                    fVar.p(new v8.b() { // from class: t8.f
                        @Override // v8.b
                        public final Object execute() {
                            ((i0) com.google.android.gms.internal.consent_sdk.c.this.f13374y).C(iVar, i + 1, false);
                            return null;
                        }
                    });
                }
                runnable.run();
            } catch (v8.a unused) {
                ((i0) cVar.f13374y).C(iVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
