package ub;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import ib.h;

/* loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f27148u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, h hVar) {
        super(handler);
        this.f27148u = hVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f27148u.d(null);
    }
}
